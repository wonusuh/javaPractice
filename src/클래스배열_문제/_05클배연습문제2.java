package 클래스배열_문제;

class Node2 {
	int number, score;

	void print() {
		System.out.println(number + ", " + score);
	}

	int getNumber() {
		return this.number;
	}

	void setNumber(int number) {
		this.number = number;
	}

	int getScore() {
		return this.score;
	}

	void setScore(int score) {
		this.score = score;
	}

}

class Return2 {
//	메서드로만 풀기

//	문제1
//	점수가 60점 이상이면, 합격이다.
//	합격생들의 정보를 result에 저장후 리턴하는
//	메서드를 완성하시오
	Node2[] setData(String[][] data) {

		Node2[] list = init(data);
		int cnt = 0;
		Node2[] temp = new Node2[cnt];

		for (int i = 0; i < list.length; i += 1) {

			if (list[i].getScore() >= 60) {

				Node2[] copy = temp;
				temp = new Node2[cnt + 1];

				for (int j = 0; j < copy.length; j += 1) {
					temp[j] = copy[j];
				}

				Node2 n = new Node2();
				n.setNumber(list[i].getNumber());
				n.setScore(list[i].getScore());
				temp[cnt++] = n;
			}
		}
		return temp;
	}

//	문제2
//	전체 학생 중 꼴등 학생 한명의 데이터를
//	리턴하는 메서드 완성하시오
	Node2 getLastOne(String[][] data) {

		Node2[] list = init(data);
		Node2 result = new Node2();
		int min = 101;

		for (int i = 0; i < list.length; i += 1) {
			if (list[i].getScore() < min) {
				min = list[i].getScore();
				result = list[i];
			}
		}
		return result;
	}

	Node2[] init(String[][] data) {

		Node2[] temp = new Node2[data.length];

		for (int i = 0; i < data.length; i += 1) {

			Node2 n = new Node2();

			n.setNumber(Integer.parseInt(data[i][0]));
			n.setScore(Integer.parseInt(data[i][1]));
			temp[i] = n;
		}
		return temp;
	}
}

public class _05클배연습문제2 {
	public static void main(String[] args) {
		String[][] data = {

				{ "1001", "34" },

				{ "1002", "46" },

				{ "1003", "81" },

				{ "1004", "10" } };
		Return2 re = new Return2();
		re.init(data);

		System.out.println("=====문제1=====");
		Node2[] list = re.setData(data);
		for (Node2 n : list) {
			n.print();
		}

		System.out.println("=====문제2=====");
		Node2 theLastOne = re.getLastOne(data);
		theLastOne.print();
	}
}
