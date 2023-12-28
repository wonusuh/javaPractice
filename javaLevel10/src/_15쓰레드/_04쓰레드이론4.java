package _15쓰레드;

import java.util.Scanner;

class SingASong implements Runnable {
	int max;

	public SingASong(int max) {
		this.max = max;
	}

	@Override
	public void run() {
		String lyric = "%s : %d + %d는 귀여미";
		for (int i = 0; i <= max; i += 1) {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.printf(" %s %n", lyric.formatted(Thread.currentThread().getName(), i, i));
		}
	}
}

public class _04쓰레드이론4 {
	public static void main(String[] args) {

		Thread singASong = new Thread(new SingASong(10));
		singASong.setName("귀여미송");

		singASong.start();

		try (Scanner sc = new Scanner(System.in)) {
			while (sc.hasNext()) {
				String command = sc.nextLine();
				if (command.equals("check")) {
					System.out.println(" 노래 끝났니?");
					System.out.println(singASong.isAlive() ? "아니" : "응 끝났어");
				}
				if (command.equals("join")) {
					System.out.println("나도 껴줘");
					try {
						singASong.join();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}
	}
}
