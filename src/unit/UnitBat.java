package unit;

public class UnitBat extends Unit {
	protected UnitBat() {
		setName("박쥐");
	}

	public void skill(Player target) {
		System.out.println("적 한명에게 침묵 시전 ");
		target.setState("침묵");
		System.out.println("[" + getName() + "] 이 " + "[" + target.getName() + "] 에게 침묵을 시전했습니다.");
	}
}
