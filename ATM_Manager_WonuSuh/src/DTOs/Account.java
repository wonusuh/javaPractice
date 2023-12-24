package DTOs;

public class Account {
	private int money;
	private String id, accNumber;

	/**
	 * @return the money
	 */
	public int getMoney() {
		return money;
	}

	/**
	 * @param money the money to set
	 */
	public void setMoney(int money) {
		this.money = money;
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
	 * @return the accNumber
	 */
	public String getAccNumber() {
		return accNumber;
	}

	/**
	 * @param accNumber the accNumber to set
	 */
	public void setAccNumber(String accNumber) {
		this.accNumber = accNumber;
	}
}
