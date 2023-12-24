package _03객체지향_실습;

import java.util.ArrayList;
import java.util.Random;

class Monster {
	public static final int DEFAULT = 10; // final + static 붙으면 기울어진 굵은체로 표시
	private String name; // 몬스터 이름
	private int num; // 몬스터 번호
	private int hp; // 몬스터 채력
	public static int cnt; // 몬스터 갯수
	private boolean dead;

	public Monster(String name, int num) {
		this.name = name;
		this.num = num;
		this.hp = DEFAULT;
//		this.cnt += 1;
	}

	public void getDamaged(int damage) {
		System.out.printf("%s 가 [-%d] %n", this, damage);
		if (!dead)
			this.hp -= damage;
		if (this.hp <= 0) {
			this.hp = 0;
			dead = true;
			cnt -= 1;
			System.out.println(this + " 사망");
		}
	}

	// boolean 값을 리턴할때는 보통 is , has + 형용사/동사 붙여서 표시한다
	public boolean isDead() {
		return this.dead;
	}

	@Override
	public String toString() {
		return "(%d) %s(%d/%d)".formatted(num, name, hp, DEFAULT);
	}

	public static void printMonsterCnt() {
		// return this.cnt; this 인스턴스 주소
		// System.out.println(this.hp);
		System.out.println(cnt + "마리");
	}
}

public class _07스태틱2 {
	public static void main(String[] args) {
		Random rd = new Random();
		Monster orc1 = new Monster("오크", 1);
		Monster.cnt += 1;
		Monster.printMonsterCnt();
		Monster orc2 = new Monster("오크", 2);
		Monster.cnt += 1;
//		orc2.printMonsterCnt();
		Monster.printMonsterCnt();
		Monster orc3 = new Monster("오크", 3);
		Monster.cnt += 1;
//		orc3.printMonsterCnt();
		Monster.printMonsterCnt();
		ArrayList<Monster> list = new ArrayList<Monster>();
		list.add(orc1);
		list.add(orc2);
		list.add(orc3);
		while (!orc1.isDead()) {
			for (Monster orc : list) {
				if (orc.isDead() && orc == orc1)
					break;
				if (orc.isDead()) {
					continue;
				}
				int damage = rd.nextInt(3); // 0-2
				orc.getDamaged(damage);
			}
		}
		System.out.println("==== 공격 종료 ==== ");
		for (Monster orc : list) {
			System.out.println(orc);
		}
		Monster.printMonsterCnt();
	}
}
