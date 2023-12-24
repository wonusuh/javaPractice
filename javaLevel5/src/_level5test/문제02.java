package _level5test;

import java.util.Arrays;

public class 문제02 {

	public static void main(String[] args) {
		String data = "123+46";
		String regex = "+";

		// test cast: String data 변수를 아래와 변경해도 똑같이 계산할 수 있는지 해보세요
		// 123+46+1
		// 1+2+3+4+5
		String[] tempo = new String[10];
		int cnt = 0;

		for (int i = 0; i < data.length(); i += 1) {

			if (data.substring(i, i + 1).equals(regex)) {
				cnt += 1;
				continue;
			}
			System.out.println(data.substring(i, i + 1));

			if (tempo[cnt] == null) {
				tempo[cnt] = "";
			}

			tempo[cnt] += data.substring(i, i + 1);

			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(Arrays.toString(tempo));

		// 위 수의 합을 구하시오
		// split() 메서드의 원리 직접 만들어보기
		int sum = 0;
		for (int i = 0; i < tempo.length; i += 1) {

			if (tempo[i] == null) {
				break;
			}
			sum += Integer.parseInt(tempo[i]);
		}
		System.out.println("sum " + sum);
	}
}
