package DAOs;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import DTOs.Account;
import DTOs.Client;
import utilities.Util;

public class ClientDAO {
	public Client[] clients;
	protected int clientNo = 1000; // 회원이 추가될 때 마다 1씩 증가시킵니다.
	private Util util;

	public ClientDAO() {
		util = Util.getInstance();
	}

	public void putTheDataIn(String data) { // 데이터를 배열에 넣습니다.
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

	public void showAllClients() { // 고객들의 모든 정보를 출력합니다.
		for (Client c : clients) {
			System.out.printf("%d %s %s %s 보유계좌%d개\n", c.getClientNo(), c.getId(), c.getPw(), c.getName(),
					c.getNumberOfAccounts());
			for (Account ac : c.getAccounts()) {
				if (ac == null)
					break;
				System.out.printf("[ %s ] 잔고 %d원\n", ac.getAccNumber(), ac.getMoney());
			}
			System.out.println("==============================");
		}
	}

	public void setAccountsToEachPerson(Account[] accounts) { // 해당 고객의 계좌배열에 계좌를 넣습니다.
		for (Account ac : accounts) {
			for (Client cl : clients) {
				if (ac.getId().equals(cl.getId()))
					cl.accounts[cl.numberOfAccounts++] = ac;
			}
		}
	}

	public Client findAClientById(String id) { // id로 검색해서 객체의 주소를 리턴합니다.
		for (Client c : clients) {
			if (id.equals(c.getId()))
				return c;
		}
		System.err.println("존재하지 않는 id입니다.");
		return null;
	}

	public int getIdxById(String id) { // id로 검색해서 인덱스를 리턴합니다.
		for (int i = 0; i < clients.length; i += 1) {
			if (id.equals(clients[i].getId()))
				return i;
		}
		System.err.println("존재하지 않는 id입니다.");
		return -1;
	}

	public void deleteAClientFromList(String id) { // 고객 한 명을 삭제하고 배열의 크기를 한 개 줄입니다.
		int idx = getIdxById(id);
		if (idx == -1)
			return;
		for (int i = idx; i < clients.length - 1; i += 1) {
			clients[i] = clients[i + 1];
		}
		Client[] copy = clients;
		clients = new Client[copy.length - 1];
		for (int i = 0; i < clients.length; i += 1) {
			clients[i] = copy[i];
		}
		System.out.println("고객을 삭제했습니다.");
	}

	public void signUp() { // 배열을 한 개 늘리고 고객 객체를 한 명 추가합니다.
		while (true) {
			System.out.println("[ 회원가입 ]");
			System.out.println("아이디는 대소문자 알파벳과 숫자만 사용할 수 있습니다.");
			System.out.println("아이디의 길이는 4글자 이상 10글자 이하여야합니다.");
			System.out.println("가입할 id를 입력하세요 . >> ");
			String id = util.sc.next();
			util.sc.nextLine();
			Pattern p = Pattern.compile("^[a-zA-Z0-9]{4,10}$");
			Matcher m = p.matcher(id);
			if (!m.matches())
				continue;
			if (getIdxById(id) != -1) {
				System.err.println("이미 사용중인 id입니다.");
				continue;
			}
			System.out.println("비밀번호는 공백을 포함할 수 없으며, 4~10글자입니다");
			System.out.println("pw를 입력해주세요. >> ");
			String pw = util.sc.next();
			util.sc.nextLine();
			p = Pattern.compile("^[^ ]{4,10}$");
			m = p.matcher(pw);
			if (!m.matches()) {
				System.out.println("비밀번호 양식을 확인하세요.");
				continue;
			}
			System.out.println("name을 입력해주세요. >> ");
			String name = util.sc.next();
			util.sc.nextLine();
			Client c = new Client();
			c.setClientNo(++this.clientNo);
			c.setId(id);
			c.setPw(pw);
			c.setName(name);
			Client[] copy = clients;
			clients = new Client[copy.length + 1];
			for (int i = 0; i < copy.length; i += 1) {
				clients[i] = copy[i];
			}
			clients[clients.length - 1] = c;
			System.out.println("회원가입에 성공했습니다.");
			break;
		}
	}

	public Account findAnAccountByAccNum(String ac) { // 계좌를 검색해서 리턴합니다.
		for (Client c : clients) {
			for (Account a : c.accounts) {
				if (a == null)
					break;
				if (a.getAccNumber().equals(ac)) {
					System.out.println("계좌를 찾았습니다.");
					return a;
				}
			}
		}
		return null;
	}

	public String deleteAnAccount(Client cl) { // 계좌를 검색해서 삭제하고 배열을 한 칸씩 당깁니다.
		System.out.println("삭제할 계좌를 입력하세요. >>");
		String delAc = util.sc.next();
		util.sc.nextLine();
		boolean found = false;
		for (int i = 0; i < cl.numberOfAccounts; i += 1) {
			if (delAc.equals(cl.accounts[i].getAccNumber())) {
				found = true;
				for (int j = i; j < cl.numberOfAccounts - 1; j += 1) {
					cl.accounts[j] = cl.accounts[j + 1];
					cl.accounts[j + 1] = null;
				}
				System.out.println("계좌를 삭제했습니다.");
				cl.numberOfAccounts -= 1;
				System.out.println(Arrays.toString(cl.accounts));
			}
		}
		if (!found) {
			System.out.println("계좌를 찾을 수 없습니다.");
			return null;
		}
		return delAc;
	}
}
