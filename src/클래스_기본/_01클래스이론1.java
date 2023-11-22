package 클래스_기본;

// 클래스는 내가 직접 설정한 자료형 배열이다.
class Member {
	int no;
	String id;
	String pw;
	String name;
	boolean isMan;
}

public class _01클래스이론1 {

	public static void main(String[] args) {
//		배열의 한계 1. => 같은 자료형만 들어간다.
//		배열의 한계 2. => 인덱스로만 접근 가능하다.

		// 클래스 사용 전
		String[] data = { "1", "qwer", "1234", "김철수" };
		System.out.println("번호 = " + Integer.parseInt(data[0]));

		Member m = new Member();
		System.out.println(m);
	}
}
