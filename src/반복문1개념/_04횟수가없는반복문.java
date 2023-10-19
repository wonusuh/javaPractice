package 반복문1개념;

// 횟수가 있는 반복문 => 초기값, 조건식, 증감식 필요
// 횟수가 없는 반복문 => 들어가는 조건식, 나가는 조건식
public class _04횟수가없는반복문 {
	public static void main(String[] args) {
		// 횠수가 없느 반복문 1형태 => 다음 반복문에서 종료
		int num = 1;
		boolean run = true;
		while (run) {
			System.out.println("num : " + num);
			if (num >= 10) {
				run = false;
			}
			num += 1;
		}
		System.out.println("num final : " + num);
		System.out.println("=====");

		// 형태2
		num = 1;
		while (true) {
			System.out.println("num : " + num);
			if (num >= 10) {
				break; // 반복문을 즉시 나간다
			}
			// break 밑에 있는 코드가 실행되지 않는다
			num += 1;
		}
		System.out.println("num final : " + num);
		System.out.println("=====");
	}
}
