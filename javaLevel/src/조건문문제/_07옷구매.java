package 조건문문제;

public class _07옷구매 {
	public static void main(String[] args) {
//		[문제] 
//			철수는 상점에서 24600원짜리 옷을 구매했다.
//			500원짜리 동전으로만 옷값을 낸다면,
//			동전이 몇 개 필요한지 구하시오.
//		[정답]
//			50개

		int clothesPrice = 24600;
		int coin500 = 500;

		// 필요한 동전 갯수
		int coins = clothesPrice / coin500;

//		// 옷 가격 / 500원 을 했을 때 나머지가 0이 아니라면 필요한 동전 갯수를 하나 더 더한다.
		if (clothesPrice % coin500 != 0) {
			coins = coins + 1;
			System.out.println("필요한 동전 갯수 : " + coins);
		}
	}
}
