package 조건문문제;

import java.util.Scanner;

public class _22지하철요금 {
	public static void main(String[] args) {
//		지하철 요금 계산
//		1. 이용할 정거장 수를 입력받는다.
//		2. 다음과 같이 정거장 수에 따라 요금이 정산된다
//		3. 요금표
//		1~5 : 500원
//		6~10 : 600원
//		11, 12 : 650원    
//		13, 14 : 700원
//		15, 16 : 750원
//		17, 18 : 800원
//		19, 20 : 850원
//		~ 10정거장 이후는 2정거장마다 50원추가
		Scanner sc = new Scanner(System.in);
		System.out.println("이용할 정류장 수를 입력하세요. => ");
		int stations = sc.nextInt();
		System.out.println("stations : " + stations);
		double fee = 0;

		boolean error = stations <= 0;

		if (error) {
			System.out.println("이용할 수 있는 정류장의 갯수는 1이상이어야합니다. 종료합니다.");
		}
		if (!error) {
		if (stations >= 1 && stations < 6) {
			fee = 500;
		} else if (stations >= 6 && stations < 11) {
			fee = 600;
		} else {
			int count = (stations - 11) / 2;
			System.out.println("count : " + count);
			fee = 650 + (count * 50);
		}
		System.out.println("요금은 : " + fee);
	}
		sc.close();
	}
}
