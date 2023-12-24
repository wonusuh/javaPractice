package 문자열기본_문제;

public class _04문자열문제1 {
	public static void main(String[] args) {
//		문제
//			id 배열은 아이디를 저장해놓은 것이다
//			find 변수는 로그인 할 아이디 이다
//			find 의 값이 id 배열에 있으면 "로그인 성공"
//			없으면 "로그인 실패" 를 출력하시오.
		String[] id = { "qwer", "asdf", "zxc" };
		String find = "asdf";
		int size = id.length;
		boolean check = false;

		for (int i = 0; i < size; i += 1) {

			if (find.equals(id[i])) {
				System.out.println("로그인 성공");
				check = true;
				break;
			}
		}

		if (!check) {
			System.out.println("로그인 실패");
		}
	}
}
