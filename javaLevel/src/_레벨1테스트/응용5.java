//		Scanner sc = new Scanner(System.in);
//		System.out.println("키를 입력하세요 : ");
//		int height = sc.nextInt();
//		System.out.println("부모님과 함께 오셨나요?(yes:1, no:0)");
//		int parents = sc.nextInt();
//
//		boolean heightCheck = height >= 120;
//		boolean parentsCheck = parents == 1;
//
//		if (heightCheck) {
//			System.out.println("놀이기구 이용가능");
//		} else if (parentsCheck) {
//			System.out.println("부모님과 함께 이용 가능");
//		} else {
//			System.out.println("120미만은 부모님과 함께 이용할 수 있습니다.");
//		}
//		sc.close();

package _레벨1테스트;

import java.util.Scanner;

public class 응용5 {

	public static void main(String[] args) {
//		[문제 5]
//				
//			    놀이기구 이용제한
//			   1. 키를 입력받는다.
//			   2. 입력받은 키가 120 이상이면, 놀이기구를 이용할 수 있다.
//			   3. 키가 120 미만이면, 놀이기구를 이용할 수 없다.
//			   4. 단, 부모님과 함께 온 경우 놀이기구 이용이 가능하다.
//			     예) 부모님과 함께 오셨나요?(yes:1, no:0)
//			응용5번 키가 120이하일때만 부모님 함께 오신지 물어봐주세요
//			그냥 부모님이랑 같이오시는지 물어보시지마시고

		Scanner sc = new Scanner(System.in);
		System.out.println("키를 입력하세요(cm)");
		int height = sc.nextInt();
		if (height >= 120) {
			System.out.println("놀이기구 이용 가능");
		} else if (height < 120) {
			System.out.println("부모님과 함께 오셨나요?(yes:1, no:0)");
			int parentsCheck = sc.nextInt();
			if (parentsCheck < 0 || parentsCheck > 1) {
				System.out.println("다시 입력해주세요. 부모님과 함께 오셨나요?(yes:1, no:0)");
			} else if (parentsCheck == 1) {
				System.out.println("놀이기구 이용가능");
			} else {
				System.out.println("120미만은 부모님과 함께 이용할 수 있습니다.");
			}
		}
		sc.close();
	}
}
