package movie;

public class Seat {

	String userId;
	int number;
	boolean check;

	String getUserId() {
		return userId;
	}

	void setUserId(String userId) {
		this.userId = userId;
	}

	int getNumber() {
		return number;
	}

	void setNumber(int number) {
		this.number = number;
	}

	boolean isCheck() {
		return check;
	}

	void setCheck(boolean check) {
		this.check = check;
	}
}
