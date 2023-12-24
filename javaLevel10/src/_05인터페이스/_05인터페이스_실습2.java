package _05인터페이스;

//damage() 메소드를 가진
//interface Damageable 를 정의하고
//최하위 유닛들(모든) 에게 Damageable 상속
//main에서 각각의 유닛을 손상시킨 후 -> repair() 돌려보기
interface Repairable { // 마크 인터페이스 : 안에 구현부는 없고 클래스를 구분하기위해서 사용하는 인터페이스
}

interface Damageable {
	void damage(Unit target);
}

class Unit { // 모든 유닛의 최고 조상클래스
	protected final int MAX_HP, ATT;
	protected int hp;
	protected String name;

	public Unit(int hp, int att) {
		MAX_HP = hp;
		this.hp = hp;
		ATT = att;
	}

	@Override
	public String toString() {
		return "%s [%d / %d] (att : %d)".formatted(name, hp, MAX_HP, ATT);
	}
}

abstract class GroundUnit extends Unit {
	public GroundUnit(int hp, int att) {
		super(hp, att);
	}
}

abstract class AirUnit extends Unit {
	public AirUnit(int hp, int att) {
		super(hp, att);
	}
}

class Marine extends GroundUnit implements Damageable {
	public Marine() {
		super(70, 30);
		name = "Marine";
		System.out.println(this);
	}

	@Override
	public void damage(Unit target) {
		target.hp -= this.ATT;
		System.out.println(this.name + " 이 " + target.name + " 에게 " + this.ATT + " 만큼 피해를 줬습니다.");
	}
}

class Tank extends GroundUnit implements Repairable, Damageable {
	public Tank() {
		super(150, 60);
		name = "Tank";
		System.out.println(this);
	}

	@Override
	public void damage(Unit target) {
		target.hp -= this.ATT;
		System.out.println(this.name + " 이 " + target.name + " 에게 " + this.ATT + " 만큼 피해를 줬습니다.");
	}
}

class DropShip extends AirUnit implements Repairable {
	public DropShip() {
		super(120, 0);
		name = "DropShip";
		System.out.println(this);
	}
}

class SCV extends GroundUnit implements Repairable, Damageable {
	public SCV() {
		super(100, 15);
		name = "SCV";
		System.out.println(this);
	}

	public void repair(Repairable repairUnit) {
		Unit unit = (Unit) repairUnit;
		unit.hp += 30;
		if (unit.hp > unit.MAX_HP)
			unit.hp = unit.MAX_HP;
		System.out.println(unit + " 수리완료.");
	}

	@Override
	public void damage(Unit target) {
		target.hp -= this.ATT;
		System.out.println(this.name + " 이 " + target.name + " 에게 " + this.ATT + " 만큼 피해를 줬습니다.");
	}
}

public class _05인터페이스_실습2 {
	public static void main(String[] args) {
		Tank tank = new Tank();
		SCV scv = new SCV();
		Marine marine = new Marine();
		DropShip dropship = new DropShip();
		System.out.println("----------------------------------------------------");
		tank.damage(dropship);
		scv.damage(tank);
		marine.damage(tank);
		tank.damage(tank);
		System.out.println(dropship.toString());
		System.out.println(tank.toString());
		System.out.println("----------------------------------------------------");
		scv.repair(dropship);
		scv.repair(tank);
	}
}
