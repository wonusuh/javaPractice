package 기초2문제;

/*
[개념] 거리
[문제1] 철수는 자전거를 타고 2시간에 65040 미터를 간다. 
       30분에는 	몇 미터를 가는가? 
       
 [정답] 16260미터
*/
public class _01거리 {
	public static void main(String[] args) {
		// 풀이
		// 2시간 = 4 * 30분
		// 65040 / 4
		int 두시간거리 = 65040;
		int 거리30분 = 두시간거리 / 4;
		System.out.println(거리30분 + "미터");
	}
}
