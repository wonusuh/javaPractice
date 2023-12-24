package _03추상클래스1;

import java.util.ArrayList;

public class _Main {
	public static void main(String[] args) {
		PizzaService ps = new PizzaService();
		ArrayList<Pizza> orderList = new ArrayList<Pizza>();
		orderList.add(new BulgogiPizza(12000, "도미노"));
		ps.orderPizzas(orderList);
	}
}
