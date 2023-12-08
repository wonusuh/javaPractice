package ATM;

public class Client {
	int clientNo, amountOfAccounts; // clientNo : 1001부터 자동증가

	int getAmountOfAccounts() {
		return amountOfAccounts;
	}

	void setAmountOfAccounts(int amountOfAccounts) {
		this.amountOfAccounts = amountOfAccounts;
	}

	String id, pw, name;
	Account[] accounts = new Account[3];

	int getClientNo() {
		return clientNo;
	}

	void setClientNo(int clientNo) {
		this.clientNo = clientNo;
	}

	String getId() {
		return id;
	}

	void setId(String id) {
		this.id = id;
	}

	String getPw() {
		return pw;
	}

	void setPw(String pw) {
		this.pw = pw;
	}

	String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}

	Account[] getAccounts() {
		return accounts;
	}

	void setAccounts(Account[] accounts) {
		this.accounts = accounts;
	}
}
