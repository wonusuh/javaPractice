package 배열심화_문제3;

import java.util.Arrays;

public class _25문자심화1 {

	public static void main(String[] args) {
//		아주 긴 수는 변수에 저장할 수 없다. int나 long에 넣지 않고 합을 구하라.
		String data1 = "123456789123456";
		String data2 = "88888888888888";
//		정답 212345678012344
		String[] temp1 = data1.split("");
		String[] temp2 = data2.split("");
		int[] temp1int = new int[temp1.length];
		int[] temp2int = new int[temp2.length];
		for (int i = 0; i < temp1.length; i += 1) {
			temp1int[i] = Integer.parseInt(temp1[i]);
		}
		for (int i = 0; i < temp2.length; i += 1) {
			temp2int[i] = Integer.parseInt(temp2[i]);
		}

		int[] data = new int[14];

		System.out.println("temp1int " + Arrays.toString(temp1int));
		System.out.println("  temp1int " + Arrays.toString(temp2int));
		System.out.println("      data " + Arrays.toString(data));
		System.out.println();
		for (int i = temp2int.length - 1; i >= 0; i -= 1) {

			if (temp2int[i] + temp1int[i] > 10) {
				temp1int[i] += 1;
				data[i] = temp2int[i] + temp1int[i] - 10;
			}
			System.out.println("temp1int " + Arrays.toString(temp1int));
			System.out.println("  temp1int " + Arrays.toString(temp2int));
			System.out.println("      data " + Arrays.toString(data));
			System.out.println();
		}
	}
}
