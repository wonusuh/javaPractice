package 기초3문제;

/*
[문제] 
	철수는 국어 80점, 수학 29점을 받았다.
	민수는 국어 76점, 수학 40점을 받았다. 
	두 학생의 점수 차이는 7이거나 -7이다. 

	위 식을 논리연산자로 표현하시오.
	true
*/
public class _06점수차이 {
	public static void main(String[] args) {
		double cs = 80.0 + 29.0;
		double ms = 76.0 + 40.0;
		double diff = cs - ms;
		System.out.println(diff == 7 || diff == -7);
	}
}
