package _level7test;

class Node4 {
	int number;
	String name;
	String address;
	int[] scoreList = new int[3];
	int total;
	double avg;
	int rank;
}

class Return4 {
// 따로 전역변수 인스턴스 만들지 안습니다 
// 메서드로만 해결하세요 
//		[문제] 아래 순서대로 전체 학생 정보를 저장해
//		리턴해주는 메서드를 구현하시오.
//		[학생번호] [이름] [지역] [국어] [수학] [영어] [총합] [평균] [등수]
	Node4[] setData(String[][] student, String[][] score) {

		Node4[] nodeList = new Node4[student.length];

		for (int i = 0; i < nodeList.length; i += 1) {// 번호 이름 지역
			Node4 n = new Node4();
			n.number = Integer.parseInt(student[i][2]);
			n.name = student[i][0];
			n.address = student[i][1];
			nodeList[i] = n;
		}

		for (String[] s : score) {// 점수 넣기
			for (int j = 0; j < nodeList.length; j += 1) {
				if (s[0].equals("" + nodeList[j].number)) {
					nodeList[j].scoreList[0] = Integer.parseInt(s[1]);// 국
					nodeList[j].scoreList[1] = Integer.parseInt(s[2]);// 수
					nodeList[j].scoreList[2] = Integer.parseInt(s[3]);// 영
					nodeList[j].total += Integer.parseInt(s[1]) + Integer.parseInt(s[2]) + Integer.parseInt(s[3]);
				}
			}
		}
		return nodeList;
	}

	void setAvg(Node4[] nodeList) {
		for (Node4 n : nodeList) {
			n.avg = (n.total * 1.0) / (n.scoreList.length * 1.0);
		}
	}

	void setRank(Node4[] nodeList) {
		boolean[] check = new boolean[nodeList.length];
		int rank = 1;
		for (int i = 0; i < nodeList.length; i += 1) {
			int max = 0, idx = -1;
			for (int j = 0; j < nodeList.length; j += 1) {
				if (!check[j]) {
					if (nodeList[j].total > max) {
						max = nodeList[j].total;
						idx = j;
					}
				}
			}
			check[idx] = true;
			nodeList[idx].rank = rank++;
		}
	}
}

public class q1 {
	public static void main(String[] args) {
		String[][] student = {

				{ "이만수", "신촌", "1001" },

				{ "김철민", "강남", "1002" },

				{ "심장호", "대치", "1003" },

				{ "유재석", "강동", "1004" } };
		String[][] score = {

				{ "1001", "10", "60", "60" },

				{ "1002", "100", "20", "30" },

				{ "1003", "23", "63", "31" },

				{ "1004", "45", "30", "35" } };
		Return4 re = new Return4();
		Node4[] nodeList = re.setData(student, score);
		re.setAvg(nodeList);
		re.setRank(nodeList);
		for (Node4 n : nodeList) {// 출력
			System.out.printf("%d %s %s 국%d 수%d 영%d %d %.2f %d\n", n.number, n.name, n.address, n.scoreList[0],
					n.scoreList[1], n.scoreList[2], n.total, n.avg, n.rank);
		}
	}
}
