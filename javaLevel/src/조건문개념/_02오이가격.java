package 조건문개념;

public class _02오이가격 {
	public static void main(String[] args) {
		// 마트에서 오이를 3개씩 묶어서 1500원에 판매한다
		// 오이가 14개 필요하다면,
		// 필요한 금액을 출력하시오.
		// 단, 오이는 묶음으로만 판매한다

		// 오이를 총 15개 사야한다
		// 정답) 7500
		int 오이묶음 = 3;
		int 오이가격 = 1500;
		int 필요오이 = 14;

		int 오이세트 = 필요오이 / 오이묶음;
		if (필요오이 % 오이묶음 > 0) {
			오이세트++;
		}
		int 구매가격 = 오이세트 * 오이가격;
		System.out.println(구매가격);
	}
}
