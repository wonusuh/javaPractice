package _12함수형프로그래밍;

import java.util.ArrayList;
import java.util.List;

public class _04기타 {
	public static int getSum(int... nums) { // 매개변수의 갯수를 모를 때 사용한다
		int sum = 0;
		for (int i = 0; i < nums.length; i += 1) {
			sum += nums[i];
		}
		return sum;
	}

	public static void main(String[] args) {
		int sum = getSum(10, 20, 30, 40);
		System.out.println(sum);
		List<String> list = new ArrayList<String>();
		list.add("강아지");
		list.add("고양이");
		list.add("토끼");
	}
}
