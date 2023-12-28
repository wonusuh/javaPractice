package _15쓰레드;

class Thread1 extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 20; i += 1) {
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.print(1);
		}
	}
}

class myRunnable implements Runnable {
	@Override
	public void run() {
		for (int i = 0; i < 20; i += 1) {
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.print(2);
		}
	}
}

public class _01쓰레드이론1 {
	// 동기적 : 메모리 호출 순서로 순차적으로 실행
	// 비동기적 : 호출 될 때 다론곳에서 실행, 현재 실행하는 것은 멈추지 않음
	public static void main(String[] args) {
		// 프로세스 vs 쓰레드
		// 멀티태스킹(멀티프로세스) vs 멀티쓰레드
		System.out.println("메인 쓰레드 영역");
		Thread thread1 = new Thread1(); // 쓰레드를 상속받았을 때
		Thread thread2 = new Thread(new myRunnable()); // runnable 구현했을때
//		thread1.run(); // 동기적
//		thread2.run(); // 동기적
//		thread1.start();
//		thread2.start();

		// runnalble 익명 클래스 생성
		Thread thread3 = new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 20; i += 1) {
					try {
						Thread.sleep(300);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.print(3);
				}
			}
		});
		Thread thread4 = new Thread(() -> {
			for (int i = 0; i < 20; i += 1) {
				try {
					Thread.sleep(300);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.print(4);
			}
		});
		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
		for (int i = 0; i < 20; i += 1) {
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.print('M');
		}
	}
}
