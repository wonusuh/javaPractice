package DTOs;

public class Client {
	private int clientNo; // clientNo : 1001부터 자동증가
	public int numberOfAccounts;
	private String id, pw, name;
	public Account[] accounts;

	public Client() {
		this.accounts = new Account[3];
	}

	/**
	 * @return the clientNo
	 */
	public int getClientNo() {
		return clientNo;
	}

	/**
	 * @param clientNo the clientNo to set
	 */
	public void setClientNo(int clientNo) {
		this.clientNo = clientNo;
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
	protected void setNumberOfAccounts(int numberOfAccounts) {
		this.numberOfAccounts = numberOfAccounts;
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the pw
	 */
	public String getPw() {
		return pw;
	}

	/**
	 * @param pw the pw to set
	 */
	public void setPw(String pw) {
		this.pw = pw;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the accounts
	 */
	public Account[] getAccounts() {
		return accounts;
	}

	/**
	 * @param accounts the accounts to set
	 */
	public void setAccounts(Account[] accounts) {
		this.accounts = accounts;
	}
}
