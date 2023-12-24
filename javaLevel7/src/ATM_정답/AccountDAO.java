package ATM_정답;

public class AccountDAO {
	Util sc;
	int cnt;
	Account[] accList;
	AccountDAO(){
		sc = new Util();
		
	}
	boolean checkAccValue(String data) {
		String num = "0123456789";
		if (data.length() != 14) {
			return false;
		}
		for (int i = 0; i < data.length(); i += 1) {
			if (i!=4 && i!= 9 && num.contains(data.charAt(i)+"")) {
			} else if (i == 4 || i == 9) {
				if (data.charAt(i) != '-') {
					return false;
				}
			} else {
				return false;
			}
		}
		return true;
	}
	
	String getAccountValue() {
		while(true) {
			String accNum = sc.getValue("계좌");
			if(!checkAccValue(accNum)) {
				System.out.println("1111-1111-1111 형태로 계좌번호 입력해주세요");
				continue;
			}
			return accNum;
		}
	}
	
	void addDatasFromFile(String data) {
		String[] temp = data.split("\n");
		accList = new Account[temp.length];
		for(int i =0; i < temp.length;i+=1) {
			String[] info = temp[i].split("/");
			Account Account = new Account(info[0],info[1],Integer.parseInt(info[2]));
			addAccount(Account);
		}
	}
	
	void addAccount(Account Account) {
		if (cnt == 0) {
			accList = new Account[cnt + 1];
		} else {
			Account[] temp = accList;
			accList = new Account[cnt + 1];
			for (int i = 0; i < cnt; i += 1) {
				accList[i] = temp[i];
			}
		}
		accList[cnt] = Account;
		cnt += 1;
	}

	void printAllAcc() {
		if(cnt ==0) return;
		for(Account acc : accList) {
			System.out.println(acc);
		}
	}
	
	void addClientAccount(Client client) {
		Account[] list = getAccListOneClient(client.id);
		if(list.length == 3) {
			System.out.println("최대 3개 계좌만 생성 가능합니다");
			return;
		}
		String acc = getAccountValue();
		if(getAccByAccNum(acc)!= null) {
			System.out.println("이미 존재하는 계좌번호 있습니다");
			return;
		}
		
		addAccount(new Account(client.id,acc,0));
		System.out.println(acc);
		System.out.println("[계좌 추가 완료 ]");
	}
	

	Account[] getAccListOneClient(String id) {
		if(this.cnt == 0) return null;
		int cnt = 0;
		for(Account acc : accList) {
			if(acc.clientId.equals(id)) {
				cnt+=1;
			}
		}
		
		Account[] list = new Account[cnt];
		int idx = 0;
		for(Account acc : accList) {
			if(acc.clientId.equals(id)) {
				list[idx++] = acc;
			}
		}
		return list;
	}
	
	void printClientAccount(Client client) {
		Account[] list = getAccListOneClient(client.id);
		if(list.length == 0) return;
		for(Account acc : list) {
			System.out.println(acc);
		}
	}
	
	
	Account getAccByAccNum(String accNum) {
		for(Account acc : accList) {
			if(acc.accNumber.equals(accNum)) {
				return acc;
			}
		}
		return null;
	}
	
	Account getLogAccount(String id) {
		Account[] list = getAccListOneClient(id);
		if(list.length == 0) {
			System.out.println("계좌가 존재하지않습니다");
			return null;
		}
		while(true) {
			String accNum = getAccountValue();
			Account acc = getAccByAccNum(accNum);
			if(acc == null) {
				System.out.println("해당 계좌번호가 없습니다");
				continue;
			}
			if(!isMyAccountAcc(accNum, list)) {
				System.out.println("본인 계좌번호만 가능합니다");
				continue;
			}
			return acc;
		}
	}
	void deleteClientAcount(Client client) {
		
		Account acc = getLogAccount(client.id);
		removeAccount(getAccIdxByAcc(acc));
		
		System.out.println("[계좌 삭제 완료 ]");
	}
	boolean isMyAccountAcc(String accNum , Account[] list) {
		for(Account acc : list) {
			if(acc.accNumber.equals(accNum)) {
				return true;
			}
		}
		return false;
	}
	
	
	void deleteAllAccountOfOneClient(Client client) {
		Account[] list = getAccListOneClient(client.id);
		
		for(Account acc : list) {
			int idx = getAccIdxByAcc(acc);
			removeAccount(idx);
		}
		
	}
	
	int getAccIdxByAcc(Account acc) {
		for(int i =0; i < cnt;i+=1) {
			if(acc == accList[i]) {
				return i;
			}
		}
		return -1;
	}
	void removeAccount(int delIdx) {
		if (cnt == 1) {
			accList = null;
			return;
		}

		Account[] temp = accList;
		accList = new Account[cnt - 1];
		int idx = 0;
		for (int i = 0; i < cnt; i += 1) {
			if (delIdx != i)
				accList[idx++] = temp[i];
		}
		cnt -= 1;
	}

	
	void depositMoney(Client client) {

		Account acc = getLogAccount(client.id);
		if(acc == null) return;
		int money = sc.getValue("[입금]", 100, 1000000);
	
		acc.money += money;
		System.out.println(acc);
		System.out.println("입금 완료");
	}
	void withdrawMoney(Client client) {
		Account acc = getLogAccount(client.id);
		if(acc == null) return;
		int money = sc.getValue("[출금]", 100, acc.money);
		if(acc.money-money < 0) {
			System.out.println("잔액부족");
			return;
		}
		acc.money -= money;
		System.out.println(acc);
		System.out.println("출금 완료");
	}
	void transferMoney(Client client) {
		Account myAcc = getLogAccount(client.id);
		if(myAcc == null) return;
		Account yourAcc = getAccByAccNum(getAccountValue());
		if(yourAcc == null) {
			System.out.println("존재하지 않는 계좌번호 ");
			return;
		
		}
		if(myAcc == yourAcc) {
			System.out.println("본인계좌 이체 불가능");
			return;
		}
		
		int money = sc.getValue("[이체]", 100, myAcc.money);
		if(myAcc.money-money < 0) {
			System.out.println("잔액부족");
			return;
		}
		myAcc.money-=money;
		yourAcc.money+=money;
		System.out.println(myAcc);
		System.out.println(yourAcc);
		System.out.println("이체 완료 ");

	}
	
	void showLogAccount(Client client) {
		Account[] list = getAccListOneClient(client.id);
		System.out.println("================================");
		System.out.println("회원번호\t      계좌번호       잔액");
		System.out.println("--------------------------------");
		for(Account acc : list) {
			System.out.println(acc);
		}
	}
	
	
	String saveAsFileData() {
		if (cnt == 0)
			return "";
		String data = "";
		for (Account a : accList) {
			data += a.saveToData();
		}
		return data;
	}
	
	
}
