package unit;

public abstract class Unit {
	private int curhp, maxhp;
	protected int power;
	private String name;
	private String state = "노말";

	/**
	 * @return the curhp
	 */
	public int getCurhp() {
		return curhp;
	}

	/**
	 * @param curhp the curhp to set
	 */
	public void setCurhp(int curhp) {
		this.curhp = curhp;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the maxhp
	 */
	public int getMaxhp() {
		return maxhp;
	}

	/**
	 * @param maxhp the maxhp to set
	 */
	public void setMaxhp(int maxhp) {
		this.maxhp = maxhp;
	}

	/**
	 * @return the power
	 */
	public int getPower() {
		return power;
	}

	/**
	 * @param power the power to set
	 */
	public void setPower(int power) {
		this.power = power;
	}

	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}

	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}

	protected Unit() {
	}

	protected Unit(String na, int max, int pw) {
		setName(na);
		maxhp = max;
		setCurhp(max);
		power = pw;
	};

	public void init(int max, int pw) {
		maxhp = max;
		setCurhp(max);
		power = pw;
	};

	void init(String na, int max, int pw) {
		setName(na);
		maxhp = max;
		setCurhp(max);
		power = pw;
	}

	public void attack(Unit target) {
		target.setCurhp(target.getCurhp() - power);
		System.out.println("[" + getName() + "] 이 " + "[" + target.getName() + "] 에게 " + power + "의 데미지를 입힙니다. ");
		if (target.getCurhp() <= 0) {
			System.out.println("[" + target.getName() + "] 을 쳐치했습니다.");
			target.setCurhp(0);
		}
	}

	public void printData() {
		System.out.println("[" + getName() + "] [" + getCurhp() + "/" + maxhp + "] [" + power + "] [" + state + "]");
	}
}
