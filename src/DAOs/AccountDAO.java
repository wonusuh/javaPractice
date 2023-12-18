package DAOs;

import DTOs.Account;
import utilities.Util;

public class AccountDAO {
	public Account[] accounts;
	protected Util util;

	public AccountDAO() {
		util = Util.getInstance();
	}

	public void putTheDataIn(String data) { // 데이터를 배열에 넣습니다.
		String[] datas = data.split("\n");
		accounts = new Account[datas.length];
		int idx = 0;
		for (String str : datas) {
			String[] splitted = str.split("/");
			Account temp = new Account();
			temp.setId(splitted[0]);
			temp.setAccNumber(splitted[1]);
			temp.setMoney(Integer.parseInt(splitted[2]));
			accounts[idx++] = temp;
		}
	}

	public void deleteAccountsFromList(String id) { // 해당하는 id의 계좌들을 전부 삭제합니다.
		int size = accounts.length;
		for (int i = 0; i < accounts.length; i += 1) {
			if (id.equals(accounts[i].getId())) {
				for (int j = i; j < accounts.length - 1; j += 1) {
					accounts[j] = accounts[j + 1];
				}
				i -= 1;
				size -= 1;
				System.out.println("size " + size);
			}
		}
		Account[] copy = accounts;
		accounts = new Account[size];
		for (int i = 0; i < accounts.length; i += 1) {
			accounts[i] = copy[i];
		}
		System.out.println("해당 고객의 계좌를 모두 삭제했습니다.");
	}

	public void deleteAnAccount(String delAc) { // 계좌를 검색해서 삭제하고 배열의 크기를 1 줄입니다.
		for (int i = 0; i < accounts.length; i += 1) {
			if (accounts[i].getAccNumber().equals(delAc)) {
				for (int j = i; j < accounts.length - 1; j += 1) {
					accounts[j] = accounts[j + 1];
				}
			}
		}
		Account[] copy = accounts;
		accounts = new Account[copy.length - 1];
		for (int i = 0; i < accounts.length; i += 1) {
			accounts[i] = copy[i];
		}
	}

	public Account findAnAccountByAccNum(String accNum) { // 계좌번호로 검색해서 해당 계좌를 리턴합니다.
		for (Account ac : accounts) {
			if (ac.getAccNumber().equals(accNum))
				return ac;
		}
		return null;
	}

	public void showMyAccounts(String id) {
		for (Account ac : accounts) {
			if (ac.getId().equals(id)) {
				System.out.printf("[ %s ] 잔고 : %d원\n", ac.getAccNumber(), ac.getMoney());
			}
		}
	}
}
