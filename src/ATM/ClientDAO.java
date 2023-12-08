package ATM;

public class ClientDAO {
	Client[] clients;
	int clientNo = 1000; // 회원이 추가될 때 마다 1씩 증가시킵니다.

	void putTheDataIn(String data) { // 데이터를 배열에 넣습니다.
		String[] datas = data.split("\n");
		clients = new Client[datas.length];
		int idx = 0;
		for (String str : datas) {
			String[] splitted = str.split("/");
			Client temp = new Client();
			temp.setClientNo(++this.clientNo);
			temp.setId(splitted[1]);
			temp.setPw(splitted[2]);
			temp.setName(splitted[3]);
			clients[idx++] = temp;
		}
	}

	void showAllClients() { // 고객들의 모든 정보를 출력합니다.
		for (Client c : clients) {
			System.out.printf("%d %s %s %s 보유계좌%d개\n", c.getClientNo(), c.getId(), c.getPw(), c.getName(),
					c.getAmountOfAccounts());
			for (Account ac : c.accounts) {
				if (ac == null)
					continue;
				System.out.print("[" + ac.getAccNumber() + "]" + " ");
			}
			System.out.println();
			System.out.println("==============================");
		}
	}

	void setAccountsToEachPerson(Account[] accounts) { // accounts배열의 계좌번호를 해당하는 고객의 계좌배열에 넣습니다.
		for (Account ac : accounts) {
			for (Client cl : clients) {
				if (ac.getId().equals(cl.getId())) {
					cl.accounts[cl.amountOfAccounts++] = ac;
				}
			}
		}
	}
}
