package _기초연습예제1;

public class A3_계단2 {
	public static void main(String[] args) {
//		[문제]
//				철수와 영희는 가위바위보 게임을 하고있다. 
//				규칙은 아래와같다.	
//				
//				이기면 계단을 3칸 올라간다.
//				지면  계단을 2칸 내려간다.
//				비기면 계단을 1칸 올라간다. 
//				
//				철수는 4번이기고, 2번비기고, 3번졌다.
//				50번째 계단에서 시작했을때 철수는 어디있는지 구하시오.
//			[정답]
//				58

		int win = 3;
		int lose = -2;
		int tie = 1;

		int firstStair = 50;

		int result = firstStair + (win * 4 + tie * 2 + lose * 3);
		System.out.println(result);
	}
}
