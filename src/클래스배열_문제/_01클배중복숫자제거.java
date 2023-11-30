package 클래스배열_문제;

import java.util.Random;
//랜덤 값 1: 
//0 1 0 1 0 => 배열에 들어가는 check 0 false 1 true
//3 1 0 0 0

//VO(value object) ,, DTO (data transfer object) : 실제로 데이터를 가지고 있는 클래스
class RandNum { // 사용자 정의 자료형 클래스
	int num; // 무작위 숫자
	boolean check; // 해당 번째 숫자 이미 사용 했나 안했나
}

//DAO : data access object : access 데이터 접근 => 추가 삭제 수정 생성 출력  
class RandNumDAO {
	Random rd = new Random();
	RandNum[] numList = new RandNum[5]; // RandNum 클래스의 방만 만들었지 RandNum 클래스 객체 만든것 아님!

	// 초기화 값
	void init() {
		for (int i = 0; i < numList.length; i++) {
			numList[i] = new RandNum();
		}

		for (int i = 0; i < numList.length;) {
			System.out.println(i);
			if (createNum(i))
				i += 1;
		}
	}

	// 랜덤 숫자 생성
	boolean createNum(int idx) {
		int rdNum = rd.nextInt(numList.length); // 0 ~ 4
		if (!numList[rdNum].check) {
			numList[idx].num = rdNum + 1;
			numList[rdNum].check = true;
			return true;

		}
		return false;
	}

	void printArr() {
		for (RandNum rn : numList) {
			System.out.print(rn.num + " ");
		}
	}

	// 전체 출력
	void run() {
		init();
		printArr();
	}
}

public class _01클배중복숫자제거 {
	public static void main(String[] args) {
		RandNumDAO e = new RandNumDAO();
		e.run();
	}
}
