package 배열심화_문제3;

import java.util.Arrays;

public class _25문자심화1 {

	public static void main(String[] args) {
//		아주 긴 수는 변수에 저장할 수 없다. int나 long에 넣지 않고 합을 구하라.
//		정답 212345678012344

		String data1 = "123456789123456";
		String data2 = "88888888888888";

		String[] temp1 = null;
		String[] temp2 = null;

		int size = data1.length() - data2.length();
		if (size < 0) {
			size *= -1;
		}

		if (data1.length() > data2.length()) {
			temp1 = data1.split("");
			temp2 = data2.split("");
		} else {
			temp1 = data2.split("");
			temp2 = data1.split("");
		}

		int[] temp1int = new int[temp1.length];
		int[] temp2int = new int[temp1.length];

		for (int i = 0; i < temp1.length; i += 1) {
			temp1int[i] = Integer.parseInt(temp1[i]);
		}

		for (int i = temp2.length - 1; i >= 0; i -= 1) {

			temp2int[i + size] = Integer.parseInt(temp2[i]);
			System.out.println(Arrays.toString(temp2int));
		}
//		for (int i = 0; i < temp2.length; i += 1) {
//			temp2int[i + size] = Integer.parseInt(temp2[i]);
//		}

		int[] data = new int[temp1.length];

		for (int i = 0; i < temp1int.length; i += 1) {
			data[i] = temp2int[i] + temp1int[i];
		}
		System.out.println(Arrays.toString(temp1int) + " temp1int");
		System.out.println(Arrays.toString(temp2int) + " temp2int");
		System.out.println(Arrays.toString(data) + " data");
		System.out.println();

		for (int i = data.length - 1; i > 0; i -= 1) {

			if (data[i] >= 10) {
				data[i] -= 10;
				data[i - 1] += 1;
				i += 1;

				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println(Arrays.toString(data));
		}
		String result = "";

		for (int i = 0; i < data.length; i += 1) {
			result += data[i];
		}
		System.out.println(result);
	}
}
