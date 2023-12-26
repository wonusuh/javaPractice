package unit;

import java.util.ArrayList;

public class UnitHealer extends Player {
	public UnitHealer(String na, int max, int pow) {
		super(na, max, pow);
	}

	public void skill(ArrayList<Player> targets) {
		System.out.println("아군 전체를 공격력의 2배 만큼 회복시킵니다.");
		for (Player target : targets) {
			if (target.getCurhp() <= 0)
				continue;
			target.setCurhp(target.getCurhp() + power * 2);
			System.out.println("[" + getName() + "] 이 " + "[" + target.getName() + "] 를 " + power * 2 + " 회복시킵니다. ");
			if (target.getCurhp() >= target.getMaxhp()) {
				target.setCurhp(target.getMaxhp());
			}
		}
	}
}
