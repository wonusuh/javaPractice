package unit;

import java.util.ArrayList;

public class UnitWolf extends Unit {
	protected UnitWolf() {
		setName("늑대");
	}

	public void skill(ArrayList<Player> targets) {
		System.out.println("적 전체에게 공격력의 절반 데미지 ");
		for (Player target : targets) {
			if (target.getCurhp() <= 0)
				continue;
			target.setCurhp(target.getCurhp() - power / 2);
			System.out
					.println("[" + getName() + "] 이 " + "[" + target.getName() + "] 에게 " + power / 2 + "의 데미지를 입힙니다. ");
			if (target.getCurhp() <= 0) {
				System.out.println("[" + target.getName() + "] 을 쳐치했습니다.");
				target.setCurhp(0);
			}
		}
	}
}
