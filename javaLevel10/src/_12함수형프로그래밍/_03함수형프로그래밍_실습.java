package _12함수형프로그래밍;

import java.util.function.BinaryOperator;

@FunctionalInterface
interface Cal {
	int getResult(int a, int b);
}

public class _03함수형프로그래밍_실습 {
	public static void main(String[] args) {
		Cal add = (a, b) -> {
			return a + b;
		};
		Cal sub = (a, b) -> {
			return a - b;
		};
		Cal mul = (a, b) -> {
			return a * b;
		};
		System.out.println(add.getResult(10, 20));
		System.out.println(sub.getResult(10, 20));
		System.out.println(mul.getResult(10, 20));
		BinaryOperator<Integer> add2 = (a, b) -> a + b;
		System.out.println(add2.apply(10, 20));
	}
}
