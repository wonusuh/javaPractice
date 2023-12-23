package _Main;

import controller.GameManager;

public class _MainGame {
	public static void main(String[] args) {
		GameManager gameManager = GameManager.getInstance();
		boolean run = true;
		while (true) {
			run = gameManager.changeStage();
			if (!run)
				break;
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("게임 오버");
	}
}
