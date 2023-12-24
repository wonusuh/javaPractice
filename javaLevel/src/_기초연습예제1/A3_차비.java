package _기초연습예제1;

public class A3_차비 {
	public static void main(String[] args) {
//		[문제]
//				철수는 집에서 학교까지 버스를 타고 다닌다.
//				철수의 버스비는 1,200원이다.
//				
//				철수는 학교가 끝나면 바로 학원을 간다.
//				학원을 갈때는 지하철을 이용한다.
//				지하철 요금은 1,100원이다.
//				
//				철수가 학원에서 집으로 바로 올때는 1,300원의 차비가 든다.
//				철수가 학교에서 집으로 바로 올때는 1,200원의 차비가 든다.
//				
//				학교는 월화수목금 매일 다닌다.
//				학원은 월수금만 다닌다.
//				
//				이번 달에 철수는 4주 동안 학교와 학원을 다녔다.
//				이번 달 필요한 총 차비를 구하시오.
//			[정답]
//				62,400원

		int homeToSchool = 1200;
		int schoolToAcademy = 1100;

		int acToHome = 1300;
		int schoolToHome = 1200;

		int onlySchoolDays = (homeToSchool + schoolToHome) * 2;
		int acDays = (homeToSchool + schoolToAcademy + acToHome) * 3;

		int weeks = 4;

		int result = (onlySchoolDays + acDays) * weeks;
		System.out.println(result + "원");
	}
}
