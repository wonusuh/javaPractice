package _06Zombie;

//좀비는 히어로 공격 가능하고 한턴이 지날때마다 현재 체력의 50%를 회복하는 능력을 가지고 있다 
public class Zombie extends Unit {
	int power;

	public Zombie(int pos, int hp, int max) {
		super(pos, hp, max);
	}

	@Override
	void attack(Unit unit) {
		power = Unit.rd.nextInt(max - 1 + 1) + 1;
		unit.setHp(unit.getHp() - power);
		System.out.printf("%s 가 %d 의 피해를 가했습니다.\n", "zombie", this.power);
		int heal = power / 2;
		this.setHp(this.getHp() + heal);
		System.out.printf("좀비가 %d 만큼 회복했습니다.\n", heal);
		if (unit.getHp() <= 0) {
			unit.setHp(0);
			unit.setDead(true);
		}
	}

	@Override
	public String toString() {
		return "zombie [hp = " + getHp() + "]";
	}
}
