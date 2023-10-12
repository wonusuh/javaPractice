package 기초4문제;

public class _07옷구매 {
	public static void main(String[] args) {
		// 철수는 24600원짜리 옷을 구매했다.
		// 500원짜리 동전으로만 옷값을 낸다면, 동전이 몇 개필요한가?
		// 정답 50개
		int clothPrice = 24600;
		int coin500 = 500;

		int coins = clothPrice / coin500;
		if (clothPrice % coin500 != 0) {
			coins++;
		}
		System.out.println(coins);
	}
}
