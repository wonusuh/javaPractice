package _06Zombie;
//보스인지 아닌지 구분해서 공격 

//히어로는 체력 포션으로 100 체력 회복할 수 있고 체력 포션이 없으면 체력 회복이 안된다 
//외부의 적은 보스인지 아닌지 구별해서 공격 해야한다 
//보스이면 보호막을 가지고 있다 먼저 보호막을 다 뚫어야지만 직접 보스를 공격할 수 있다. 
//일반 적은 보호막 가지고 있지 않음 
public class Hero extends Unit {
	int power;
	int count;

	public Hero(int pos, int hp, int max, int count) {
		super(pos, hp, max);
		this.count = count;
	}

	@Override
	public String toString() {
		return "Hero [남은포션 = " + count + ", hp = " + getHp() + "]";
	}

	public void drinkPotion(Hero hero) {
		if (count == 0) {
			System.out.println("포션이 없습니다.");
			return;
		}
		count -= 1;
		hero.setHp(hero.getHp() + 100);
		System.out.println("hp를 100회복했습니다. " + hero.getHp());
	}

	@Override
	void attack(Unit unit) {
		if (unit instanceof Boss) {
			Boss boss = (Boss) unit;
			power = Unit.rd.nextInt(max - 1 + 1) + 1;
			if (boss.getShield() > 0) {
				boss.setShield(boss.getShield() - power);
				System.out.printf("%s 가 %d 의 피해를 가했습니다.\n", "hero", this.power);
				return;
			}
			boss.setShield(0);
			boss.setHp(boss.getHp() - power);
			System.out.printf("%s 가 %d 의 피해를 가했습니다.\n", "hero", this.power);
			if (boss.getHp() <= 0) {
				boss.setHp(0);
				boss.setDead(true);
			}
		} else {
			power = Unit.rd.nextInt(max - 1 + 1) + 1;
			unit.setHp(unit.getHp() - power);
			System.out.printf("%s 가 %d 의 피해를 가했습니다.\n", "hero", this.power);
			if (unit.getHp() <= 0) {
				unit.setHp(0);
				unit.setDead(true);
			}
		}
	}
}
