package 클래스_문제;

import java.util.Arrays;

class Test {
	int num, size;
	char[] data;
}

public class _12클래스배열기본문제4 {

	public static void main(String[] args) {

		String data = "";
		data += "0/2/a/b\n";
		data += "1/3/a/b/c\n";
		data += "2/5/a/b/c/d/e\n";
		data += "3/4/a/b/c/d\n";
		data += "4/3/a/b/c\n";
		data += "5/1/a";
//		System.out.println(data);

		String[] datas = data.split("\n");

		Test[] t;
		// data의 정보를 클래스배열에 저장.
		t = new Test[datas.length];

		for (int i = 0; i < t.length; i += 1) {

			String[] temp = datas[i].split("/");
			Test te = new Test();

			char[] tempTemp = new char[temp.length - 2];

			for (int j = 2; j < temp.length; j += 1) {
				tempTemp[j - 2] = temp[j].charAt(0);
			}
//			System.out.println(Arrays.toString(tempTemp));

			te.num = Integer.parseInt(temp[0]);
			te.size = Integer.parseInt(temp[1]);
			te.data = tempTemp;

			t[i] = te;
		}

		// 출력
		for (int i = 0; i < t.length; i += 1) {
			System.out.printf("%d %d ", t[i].num, t[i].size);
			System.out.println(Arrays.toString(t[i].data));
		}
	}
}
