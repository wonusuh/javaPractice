package ATM;

public class Client {
	private int clientNo; // clientNo : 1001부터 자동증가
	protected int numberOfAccounts;
	private String id, pw, name;
	protected Account[] accounts;

	protected Client() {
		this.accounts = new Account[3];
	}

	/**
	 * @return the clientNo
	 */
	protected int getClientNo() {
		return clientNo;
	}

	/**
	 * @param clientNo the clientNo to set
	 */
	protected void setClientNo(int clientNo) {
		this.clientNo = clientNo;
	}

	/**
	 * @return the numberOfAccounts
	 */
	protected int getNumberOfAccounts() {
		return numberOfAccounts;
	}

	/**
	 * @param numberOfAccounts the numberOfAccounts to set
	 */
	protected void setNumberOfAccounts(int numberOfAccounts) {
		this.numberOfAccounts = numberOfAccounts;
	}

	/**
	 * @return the id
	 */
	protected String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	protected void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the pw
	 */
	protected String getPw() {
		return pw;
	}

	/**
	 * @param pw the pw to set
	 */
	protected void setPw(String pw) {
		this.pw = pw;
	}

	/**
	 * @return the name
	 */
	protected String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	protected void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the accounts
	 */
	protected Account[] getAccounts() {
		return accounts;
	}

	/**
	 * @param accounts the accounts to set
	 */
	protected void setAccounts(Account[] accounts) {
		this.accounts = accounts;
	}
}
