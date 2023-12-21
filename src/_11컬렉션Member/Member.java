package _11컬렉션Member;

public class Member implements Comparable<Member> {
	private String id, pw;

	public Member(String id, String pw) {
		super();
		this.id = id;
		this.pw = pw;
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the pw
	 */
	public String getPw() {
		return pw;
	}

	/**
	 * @param pw the pw to set
	 */
	public void setPw(String pw) {
		this.pw = pw;
	}

	@Override
	public String toString() {
		return "Member [id=" + id + ", pw=" + pw + "]";
	}

	@Override
	public int compareTo(Member o) {
		return this.getId().compareTo(o.getId());
	}
}
