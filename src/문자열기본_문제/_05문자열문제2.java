package 문자열기본_문제;

public class _05문자열문제2 {
	public static void main(String[] args) {
//		문제
//			userData 안에 user의 값이 있는지 검사하시오
//		정답
//			true
		String userData = "1001,1002,1003,1004";
		int user = 1003;

		String[] temp = userData.split(",");
		int size = temp.length;
		boolean check = false;

		for (int i = 0; i < size; i += 1) {

			if (user == Integer.parseInt(temp[i])) {
				check = true;
			}
		}
		System.out.println(check);
	}
}
