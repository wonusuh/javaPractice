package 클래스_문제;

public class _09클래스배열기본문제1 {

	public static void main(String[] args) {

		String data = "";
		data += "1001,qwer,1234,김철민,10\n";
		data += "1002,asdf,2345,우중현,3\n";
		data += "1003,zxcv,3456,이만수,30";

		String[] datas = data.split("\n");
//		System.out.println(Arrays.toString(datas));

		// 위 데이터를 클래스 배열에 넣고 1등의 이름을 출력
		Student[] stList = null;
		stList = new Student[datas.length];

		for (int i = 0; i < datas.length; i += 1) {

			String[] temp = datas[i].split(",");

			Student s = new Student();
			s.number = Integer.parseInt(temp[0]);
			s.id = temp[1];
			s.pw = temp[2];
			s.name = temp[3];
			s.score = Integer.parseInt(temp[4]);

			stList[i] = s;
		}

		int max = 0;
		String name = "";

		for (int i = 0; i < stList.length; i += 1) {

			if (stList[i].score > max) {
				max = stList[i].score;
				name = stList[i].name;
			}
		}
		System.out.printf("%s %d", name, max);
	}
}
