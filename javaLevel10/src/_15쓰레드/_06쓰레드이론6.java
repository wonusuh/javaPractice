package _15쓰레드;

public class _06쓰레드이론6 {
	static boolean stop = false;

	public static void main(String[] args) {
		new Thread(() -> {
			int i = 0;
			while (!stop) {
				i++;
				System.out.println(i);
			}
			System.out.println("-----쓰레드 종료-----");
		}).start();
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		stop = true;
	}
}
