package _06Zombie;

//Boss 클래스는 Zombie 클래스를 상속받는다.
//Boss 클래스는 보호막 shield 멤버변수를 가진다.
//공격 메소드 void attack( Unit enemy ) 
//일반공격 : 1~공격력(max) 사이의 랜덤 값을 공격력으로 사용하여 enemy의 체력 감소시킴 (출력 예 : “보스가 15 의 공격력으로 일반 공격 : 현재 Hero의 hp는 25”)
//필살기 : 25%의 확률로 1~max 사이의 공격력의 2배 만큼으로 상대를 공격하는 기능 (출력 예 : “보스가 30 의 공격력으로 필살기 공격 : 현재 Hero의 hp는 25”)
//Boss 클래스는 생성자를 가짐(현재위치, 체력,공격력, 보호막)
public class Boss extends Zombie {
	private int shield;

	/**
	 * @return the shield
	 */
	protected int getShield() {
		return shield;
	}

	/**
	 * @param shield the shield to set
	 */
	protected void setShield(int shield) {
		this.shield = shield;
	}

	public Boss(int pos, int hp, int max, int shield) {
		super(pos, hp, max);
		this.shield = shield;
	}

	@Override
	void attack(Unit unit) {
		power = Unit.rd.nextInt(max - 1 + 1) + 1;
		int chance = Unit.rd.nextInt(4);
		if (chance == 0) {
			System.err.println("보스가 필살기를 사용헀다!");
			power *= 2;
		}
		unit.setHp(unit.getHp() - power);
		System.out.printf("%s 가 %d 의 피해를 가했습니다.\n", "Boss", this.power);
		int heal = power / 2;
		this.setHp(this.getHp() + heal);
		System.out.printf("보스가 %d 만큼 회복했습니다.\n", heal);
		if (unit.getHp() <= 0) {
			unit.setHp(0);
			unit.setDead(true);
		}
	}

	@Override
	public String toString() {
		return "Boss [hp = " + getHp() + ", shield = " + this.shield + "]";
	}
}
