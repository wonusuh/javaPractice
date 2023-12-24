package ploy_game;

public class _MainGame {
	public static void main(String[] args) {
		GameManager gameManager = new GameManager();
		boolean run = true;
		while (true) {
			run = gameManager.changeStage();
			if (run == false)
				break;
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("게임오버");
	}
}
