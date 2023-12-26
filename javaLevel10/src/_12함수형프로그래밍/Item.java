package _12함수형프로그래밍;

public class Item implements Comparable<Item> {
	private int num, price;
	private String category, name;

	/**
	 * @param num
	 * @param name
	 * @param category
	 * @param price
	 */
	public Item(int num, String category, String name, int price) {
		super();
		this.num = num;
		this.price = price;
		this.category = category;
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
	 * @return the category
	 */
	public String getCategory() {
		return category;
	}

	/**
	 * @param category the category to set
	 */
	public void setCategory(String category) {
		this.category = category;
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
		return "Item [num=" + num + ", price=" + price + ", category=" + category + ", name=" + name + "]";
	}

	@Override
	public int compareTo(Item o) {
		if (this.num < o.num)
			return -1;
		else if (this.num > o.num)
			return 1;
		return 0;
	}

	@Override
	public boolean equals(Object o) {
		if (this.num == ((Item) o).num)
			return true;
		return false;
	}

	@Override
	public int hashCode() {
		return num;
	}
}
