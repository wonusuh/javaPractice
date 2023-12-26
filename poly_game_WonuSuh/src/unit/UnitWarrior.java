package unit;

public class UnitWarrior extends Player {
	public UnitWarrior(String na, int max, int pow) {
		super(na, max, pow);
	}

	public void skill(Unit target) {
		System.out.println("적 한 명에게 3배의 피해");
		target.setCurhp(target.getCurhp() - power * 3);
		System.out.println("[" + getName() + "] 이 " + "[" + target.getName() + "] 에게 " + power * 3 + "의 데미지를 입힙니다. ");
		if (target.getCurhp() <= 0) {
			System.out.println("[" + target.getName() + "] 을 쳐치했습니다.");
			target.setCurhp(0);
		}
	}
}
