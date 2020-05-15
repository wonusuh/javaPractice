package godOfJava.chapter62;

public class FormatTryCatch {

	public static void main(String[] args) {
		String sNum = "123";
		String nNum = "h";
		int a = Integer.parseInt(nNum); // NumberFormatException 발생
		System.out.println(a);
		try {
		} catch (NumberFormatException ee) {
			System.out.println("int인지 확인!");
			System.out.println(ee.getMessage());
		} catch (Exception ee) {
			System.out.println("오류 출력");
		} finally {
			System.out.println("항상 실행");

		}

		System.out.println(sNum);

	}

}
