package gugudan;

public class Dan extends Gugu implements Multi, Add {
	private int dan;

	public Dan(int dan) {
		super();
		this.dan = dan;
	}

	public int getDan() {
		return dan;
	}

	public void setDan(int dan) {
		this.dan = dan;
	}

	@Override
	public void multi() {
		StringBuffer sb = new StringBuffer();
		sb.append("=== " + dan + "단(곱셈) ===");
		for (int i = 0; i < this.nums.length; i++) {
			sb.append("\n" + this.dan + " * " + this.nums[i] + " = " + (this.dan * this.nums[i]));
		}
		System.out.println(sb.toString());
	}

	@Override
	public void add() {
		StringBuffer sb = new StringBuffer();
		sb.append("=== " + dan + "단(덧셈) ===");
		for (int i = 0; i < this.nums.length; i++) {
			sb.append("\n" + this.dan + " + " + this.nums[i] + " = " + (this.dan + this.nums[i]));
		}
		System.out.println(sb.toString());
	}
}
