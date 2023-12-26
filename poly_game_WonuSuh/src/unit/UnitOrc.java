package unit;

public class UnitOrc extends Unit {
	protected UnitOrc() {
		setName("오크");
	}

	public void skill(Player target) {
		target.setState("기절");
		target.setCurhp(target.getCurhp() - power * 2);
		System.out.println("[" + getName() + "] 이 " + "[" + target.getName() + "] 를 기절시켰습니다. " + target.getName()
				+ " 에게 " + power * 2 + "의 데미지를 입힙니다. ");
		if (target.getCurhp() <= 0) {
			System.out.println("[" + target.getName() + "] 을 쳐치했습니다.");
			target.setCurhp(0);
		}
	}
}
