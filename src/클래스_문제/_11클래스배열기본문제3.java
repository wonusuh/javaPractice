package 클래스_문제;

import java.util.Arrays;

public class _11클래스배열기본문제3 {

	public static void main(String[] args) {

		String data = "";
		data += "김영희/30\n";
		data += "이만수/40\n";
		data += "이철민/60";

		System.out.println(data);

		Student[] studentList;
//		문제1) data에 있는 내용을 잘라서 studentList에 저장한 후 전체 출력
		String[] datas = data.split("\n");
		studentList = new Student[datas.length];

		for (int i = 0; i < datas.length; i += 1) {

			String[] temp = datas[i].split("/");

			Student st = new Student();

			st.name = temp[0];
			st.score = Integer.parseInt(temp[1]);

			studentList[i] = st;
		}

		for (int i = 0; i < studentList.length; i += 1) {
			System.out.printf("%s %d", studentList[i].name, studentList[i].score);
			System.out.println();
		}

		System.out.println("===================================");
//		문제2) 꼴등 삭제 후 다시 data에 저장
		int min = 100;
		int idx = -1;

		for (int i = 0; i < studentList.length; i += 1) {

			if (studentList[i].score < min) {
				min = studentList[i].score;
				idx = i;
			}
		}

		studentList[idx] = null;
		System.out.println(Arrays.toString(studentList));

		data = "";
		for (int i = 0; i < studentList.length; i += 1) {

			if (studentList[i] == null) {
				continue;
			}

			data += studentList[i].name + "/" + studentList[i].score + "\n";
		}
		System.out.println(data);
	}
}
