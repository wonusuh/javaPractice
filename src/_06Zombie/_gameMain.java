package _06Zombie;

import java.util.Scanner;

public class _gameMain {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
//		Random r = new Random();
		Hero hero = new Hero(1, 200, 100, 10);
		Zombie zombi = new Zombie(5, 100, 10);

		// pos,hp,max,shield
		Boss boss = new Boss(9, 300, 20, 100);

		int pos = 1;
		// hero.setPos(pos);
		boolean run = true;
		while (run) {
			System.out.println("현재 위치 = " + hero.getPos());

			System.out.print("앞으로 이동하기(1),종료하기(2) ");

			int move = s.nextInt();

			if (move == 1) {
				hero.setPos(++pos);

				if (hero.getPos() == zombi.getPos()) {

					System.out.print("좀비를 만났습니다. 공격모드로 바뀝니다. ");

					while (true) {

						System.out.print("공격하기(1),포션마시기(2): ");
						int sel = s.nextInt();
						if (sel == 1) {
							System.out.println(hero.toString());
							System.out.println(zombi.toString());
							hero.attack(zombi);
							zombi.attack(hero);
							System.out.println(hero.toString());
							System.out.println(zombi.toString());
						} else if (sel == 2) {
							hero.drinkPotion(hero);
						}
						if (hero.isDead()) {
							System.out.println("hero가 죽었습니다.");
							run = false;
							break;
						}
						if (zombi.isDead()) {
							System.out.println("좀비를 쓰러뜨렸습니다.");
							break;
						}
					}
				}
				if (hero.getPos() == boss.getPos()) {

					System.out.print("보스를 만났습니다. 공격모드로 바뀝니다. ");
					while (true) {

						System.out.print("공격하기(1),포션마시기(2): ");
						int d = s.nextInt();
						if (d == 1) {
							System.out.println(hero.toString());
							System.out.println(boss.toString());
							hero.attack(boss);
							boss.attack(hero);
							System.out.println(hero.toString());
							System.out.println(boss.toString());
						} else if (d == 2) {
							hero.drinkPotion(hero);
						}
						if (hero.isDead()) {
							System.out.println("hero가 죽었습니다.");
							run = false;
							break;
						}
						if (boss.isDead()) {
							System.out.println("보스를 쓰러뜨렸습니다.");
							break;
						}
					}

					if (hero.getPos() <= 10) {
						System.out.println("게임에서 승리했습니다. 종료합니다.");
						break;
					}
				} else if (move == 2) {
					break;
				}
			}
		}
		s.close();
	}
}
