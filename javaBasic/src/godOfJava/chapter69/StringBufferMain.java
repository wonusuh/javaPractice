package godOfJava.chapter69;

public class StringBufferMain {
	private static String x; // 클래스변수 (객체변수아님)

	public static void main(String[] args) {
		// sb 생성
		StringBuffer sb1 = new StringBuffer();
		sb1.append("안녕하세요.").append("또만나요.").append("기다려봐.");
		System.out.println(sb1.toString() + sb1.hashCode());
		// System.out.println(sb1);

		// 수정
		sb1.replace(0, 2, "운동");
		System.out.println(sb1.toString() + sb1.hashCode());

		// reverse
		sb1.reverse();
		System.out.println(sb1.toString() + sb1.hashCode());

		// delete
		sb1.delete(10, 15);
		System.out.println(sb1.toString() + sb1.hashCode());

		//

		System.out.println(x);
	}
}
