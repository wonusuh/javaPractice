package 기초1문제1;

/*
[문제]
	철수와 영희는 가위바위보 게임을 하고 있다. 
	규칙은 아래와 같다.	
	
	이기면 계단을 3칸 올라간다.
	지면   계단을 2칸 내려간다.
	비기면 아무일도 생기지 않는다. 
	계단은 총 100계단이다. 
	
	50번째 계단에서 게임을 시작한다.
	
	철수는 4번 이기고 2번 졌다.
	철수의 현재 위치를 구하시오.		
[정답] 
	58
*/
public class _05계단위치 {
	public static void main(String[] args) {
		System.out.println(50 + (4 * 3) - (2 * 2));
	}
}
