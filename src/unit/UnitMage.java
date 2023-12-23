package unit;

import java.util.ArrayList;

public class UnitMage extends Player {

	public UnitMage(String na, int max, int pow) {
		super(na, max, pow);
	}

	public void skill(ArrayList<Unit> monList) {
		System.out.println("모두에게 공격력의 2배의 피해");
		for (Unit target : monList) {
			if (target.getCurhp() == 0)
				continue;
			target.setCurhp(target.getCurhp() - power * 2);
			System.out
					.println("[" + getName() + "] 이 " + "[" + target.getName() + "] 에게 " + power * 2 + "의 데미지를 입힙니다. ");
			if (target.getCurhp() <= 0) {
				System.out.println("[" + target.getName() + "] 을 쳐치했습니다.");
				target.setCurhp(0);
			}
		}
	}
}
