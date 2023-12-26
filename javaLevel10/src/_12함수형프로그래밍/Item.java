package _12함수형프로그래밍;

public class Item {
	private int num, price;
	private String catrgory, name;

	/**
	 * @param num
	 * @param price
	 * @param catrgory
	 * @param name
	 */
	public Item(int num, int price, String catrgory, String name) {
		super();
		this.num = num;
		this.price = price;
		this.catrgory = catrgory;
		this.name = name;
	}

	/**
	 * @return the num
	 */
	public int getNum() {
		return num;
	}

	/**
	 * @param num the num to set
	 */
	public void setNum(int num) {
		this.num = num;
	}

	/**
	 * @return the price
	 */
	public int getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(int price) {
		this.price = price;
	}

	/**
	 * @return the catrgory
	 */
	public String getCatrgory() {
		return catrgory;
	}

	/**
	 * @param catrgory the catrgory to set
	 */
	public void setCatrgory(String catrgory) {
		this.catrgory = catrgory;
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

	@Override
	public String toString() {
		return "Item [num=" + num + ", price=" + price + ", catrgory=" + catrgory + ", name=" + name + ", getNum()="
				+ getNum() + ", getPrice()=" + getPrice() + ", getCatrgory()=" + getCatrgory() + ", getName()="
				+ getName() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
}
