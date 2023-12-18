package ATM;

public class Account {
	private int money;
	private String id, accNumber;

	/**
	 * @return the money
	 */
	protected int getMoney() {
		return money;
	}

	/**
	 * @param money the money to set
	 */
	protected void setMoney(int money) {
		this.money = money;
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
	 * @return the accNumber
	 */
	protected String getAccNumber() {
		return accNumber;
	}

	/**
	 * @param accNumber the accNumber to set
	 */
	protected void setAccNumber(String accNumber) {
		this.accNumber = accNumber;
	}
}
