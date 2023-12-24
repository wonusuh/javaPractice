package 배열_개념;

// heap 메모리방에 생성되는 값들은 자동 초기값을 가진다
// 숫자 =>0
// 논리 =>false
// 그 외 => null
public class _03배열종류 {
	public static void main(String[] args) {
		int[] arr1 = new int[5]; // 0 0 0 0 0
		double[] arr2 = new double[3]; // 0.0 0.0 0.0 0.0 0.0
		boolean[] arr3 = new boolean[2]; // false false
		char[] arr4 = new char[4]; // '\u0000' => null 문자열 => 숫자로 표기하면 0

		for (int i = 0; i < arr1.length; i += 1) {
			System.out.print(arr1[i] + " ");
		}
		System.out.println();
		for (int i = 0; i < arr2.length; i += 1) {
			System.out.print(arr2[i] + " ");
		}
		System.out.println();
		for (int i = 0; i < arr3.length; i += 1) {
			System.out.print(arr3[i] + " ");
		}
		System.out.println();
		for (int i = 0; i < arr4.length; i += 1) {
			System.out.print((int) arr4[i] + " ");
		}
		System.out.println();

		char[] name = { '박', '연', '미' };
		System.out.println(name);

		String myName = "박연미";
		System.out.println(myName);
	}
}
