package 클래스_문제;

public class _14클배_학생_과목2 {

	public static void main(String[] args) {

		String studentSample = "1001/이만수\n";
		studentSample += "1002/김철만\n";
		studentSample += "1003/오수정\n";

		String subjectSample = "";
		subjectSample += "1001/국어/100/0\n";
		subjectSample += "1001/수학/32/0\n";
		subjectSample += "1002/국어/23/0\n";
		subjectSample += "1002/수학/35/0\n";
		subjectSample += "1002/영어/46/0\n";
		subjectSample += "1003/수학/60/0";

		// 문제1) 위 샘플문자열들을 각각 해당하는 클래스배열에 저장 후 출력.
		System.out.println("----------문제1----------");

		String[] splitedStu = studentSample.split("\n");
		Student[] s = new Student[splitedStu.length];

		for (int i = 0; i < s.length; i += 1) {

			String[] temp = splitedStu[i].split("/");
			Student tempS = new Student();

			tempS.number = Integer.parseInt(temp[0]);
			tempS.name = temp[1];

			s[i] = tempS;
			System.out.printf("%d %s", s[i].number, s[i].name);
			System.out.println();
		}
		System.out.println("------------------------");
		String[] splitedSub = subjectSample.split("\n");
		Subject[] sub = new Subject[splitedSub.length];

		for (int i = 0; i < sub.length; i += 1) {

			String[] temp = splitedSub[i].split("/");
			Subject tempSub = new Subject();

			tempSub.stuNum = Integer.parseInt(temp[0]);
			tempSub.name = temp[1];
			tempSub.score = Integer.parseInt(temp[2]);
			tempSub.rank = Integer.parseInt(temp[3]);

			sub[i] = tempSub;
		}

		// 출력
		for (Subject subSub : sub) {
			System.out.printf("%d %s %d %d", subSub.stuNum, subSub.name, subSub.score, subSub.rank);
			System.out.println();
		}
		// 문제2) 점수가 59점이하인 과목은 전부 삭제 후 다시 문자열로 저장 후 출력
		System.out.println("----------문제2----------");
		for (int i = 0; i < sub.length; i += 1) {

			if (sub[i].score <= 59) {
				sub[i] = null;
			}
		}

		// String subjectSample 다시 만들기
		subjectSample = "";
		for (Subject subSub : sub) {

			if (subSub == null) {
				continue;
			}

			subjectSample += subSub.stuNum + "/" + subSub.name + "/" + subSub.score + "/" + subSub.rank + "\n";
		}
		System.out.println(subjectSample);
	}
}
