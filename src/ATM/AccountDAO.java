package ATM;

public class AccountDAO {
	Account[] accounts;

	void putTheDataIn(String data) { // 데이터를 배열에 넣습니다.
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
}
