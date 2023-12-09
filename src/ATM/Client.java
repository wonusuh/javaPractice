package ATM;

public class Client {
	int clientNo, numberOfAccounts; // clientNo : 1001부터 자동증가
	String id, pw, name;
	Account[] accounts;

	Client() {
		this.accounts = new Account[3];
	}

	/**
	 * @return the numberOfAccounts
	 */
	public int getNumberOfAccounts() {
		return numberOfAccounts;
	}

	/**
	 * @param numberOfAccounts the numberOfAccounts to set
	 */
	public void setNumberOfAccounts(int numberOfAccounts) {
		this.numberOfAccounts = numberOfAccounts;
	}

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
