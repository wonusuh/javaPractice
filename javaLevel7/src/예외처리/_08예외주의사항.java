package 예외처리;

public class _08예외주의사항 {

	public static void main(String[] args) {

		try {

			Exception e = new Exception("error~");

			throw e;
//			throw new Exception("error!");
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("종료");
	}
}
