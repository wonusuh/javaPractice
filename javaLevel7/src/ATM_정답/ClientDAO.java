package ATM_정답;

public class ClientDAO {

	Util sc;
	Client[] cList;
	int cnt;
	int maxNo;
	Client log;
	ClientDAO(){
		sc = new Util();
		maxNo = 100; 
	}
	void addDatasFromFile(String data) {
		String[] temp = data.split("\n");
		cList = new Client[temp.length];
		for(int i =0; i < temp.length;i+=1) {
			String[] info = temp[i].split("/");
			Client client = new Client(Integer.parseInt(info[0]),info[1],info[2],info[3]);
			addClient(client);
		}
	}
	void addClient(Client client) {
		if (cnt == 0) {
			cList = new Client[cnt + 1];
		} else {
			Client[] temp = cList;
			cList = new Client[cnt + 1];
			for (int i = 0; i < cnt; i += 1) {
				cList[i] = temp[i];
			}
		}
		cList[cnt] = client;
		cnt += 1;
	}
	
	void printAllClient() {
		if(cnt ==0 ) return;
		for(Client client : cList) {
			System.out.println(client);
		}
	}

	boolean hasData() {
		if(cnt ==0) {
			System.out.println("데이터가 없습니다");
			return false;
		}
		return true;
	}
	
	void showAllClient() {
		if(!hasData()) return;
		System.out.println("=============================");
		System.out.println(" No\t  id\t pw\tname");
		System.out.println("-----------------------------");
		for(Client c : cList) {
			System.out.println(c.toString());
		}
		System.out.println("=============================");
	}
	
	void modifyClient() {
		if(!hasData()) return;
		String id = sc.getValue("아이디");
		Client c = getClientByClientId(id);
		if(c == null) {
			System.out.println("아이디가 존재하지 않습니다");
			return;
		}
		System.out.println("[1] 비밀번호 수정");
		System.out.println("[2] 이름 수정");
		int sel = sc.getValue("메뉴", 1, 2);
		if (sel == 1) {
			modifyPw(c);
		} else if (sel == 2) {
			modifyName(c);
		}

	}
	
	void modifyPw(Client c) {
		while (true) {
			String pw = sc.getValue("변경할 비밀번호");
			if (c.pw.equals(pw)) {
				System.out.println("다른 비밀번호 입력");
				continue;
			}
			c.pw= pw;
			System.out.println(c);
			System.out.println("[비밀번호 변경완료]");
			
			return;
		}
	}
	
	void modifyName(Client c) {
		while (true) {
			String name = sc.getValue("변경할 이름");
			if (c.name.equals(name)) {
				System.out.println("다른 이름 입력");
				continue;
			}
			c.name = name;
			System.out.println(c);
			System.out.println("[이름 변경완료]");
			return;
		}
	}
	
	int getIdxByClient(Client c) {
		for(int i =0; i < cnt;i+=1) {
			if(c == cList[i]) {
				return i;
			}
		}
		return -1;
	}
	
	Client getClientByClientId(String id) {
		if(cnt == 0) return null;
		for(Client c : cList) {
			if(c.id.equals(id)) {
				return c;
			}
		}
		return null;
	}
	
	void deleteClient(AccountDAO aDAO) {
		if(!hasData()) return;
		String id = sc.getValue("아이디");
		Client c = getClientByClientId(id);
		if(c == null) {
			System.out.println("아이디가 존재하지않습니다");
			return;
		}
		int delIdx = getIdxByClient(c);
		aDAO.deleteAllAccountOfOneClient(c);
		removeClient(delIdx);
		System.out.println(c +" \n [회원 삭제 완료]");
	}
	
	void removeClient(int delIdx) {
		if (cnt == 1) {
			cList = null;
			return;
		}

		Client[] temp = cList;
		cList = new Client[cnt - 1];
		int idx = 0;
		for (int i = 0; i < cnt; i += 1) {
			if (delIdx != i)
				cList[idx++] = temp[i];
		}
		cnt -= 1;
	}

	void joinClient() {
		String id=sc.getValue("가입 아이디");
		if(getClientByClientId(id)!=null) {
			System.err.println("이미 존재하는 아이디");
			return;
		}
			String pw=sc.getValue("비밀번호");
			String name=sc.getValue("이름");
			Client c =new Client(maxNo++, id, pw, name);
			addClient(c);
			System.out.println("["+name+"님 회원가입 완료]");
		
	}
	
	boolean loginClient() {
		if(!hasData()) return false;
		String id=sc.getValue("로그인 아이디");
		Client c = getClientByClientId(id);
		if(c==null) {
			System.err.println("없는 아이디 입니다");
			return false;
		}
		String pw = sc.getValue("로그인 비번");
		if(pw.equals(c.pw)) {
			System.out.println("로그인 성공 ");
			log = c;
			return true;
		}else {
			System.out.println("로그인 실패");
			return false;
		}
	}
	
	boolean deleteLogClident(AccountDAO aDAO) {
		String pw = sc.getValue("비밀번호");
		if(!log.pw.equals(pw)) {
			System.out.println("비밀번호가 일치하지 않습니다");
			return false;
		}
		int delIdx = getIdxByClient(log);
		removeClient(delIdx);
		
		aDAO.deleteAllAccountOfOneClient(log);
		
		System.out.println(log +" \n [회원 삭제 완료]");
		log = null;
		return true;
	}
	
	
	String saveAsFileData() {
		if (cnt == 0)
			return "";
		String data = "";
		for (Client c : cList) {
			data += c.saveToData();
		}
		return data;
	}
	void updateMaxNum() {
		if (cnt == 0) return;
		int maxNo = 0;
		Client client = null;
		for (Client c : cList) {
			if (maxNo < c.clientNo) {
				maxNo = c.clientNo;
				client = c;
			}
		}
		this.maxNo = client.clientNo;
	}

	
	
	
	
}
