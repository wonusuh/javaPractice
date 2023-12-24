package 문자열기본_문제;

import java.util.Arrays;
import java.util.Scanner;

public class _02끝말잇기 {
	public static void main(String[] args) {
//		문제
//			1. 3글자 단어
//			2. "끝" 을 입력하면 종료
//			3. 끝말잇기에 실패했을 때 종료
//			4. 기러기 기러기 기러기 : 안됨.

//			끝말잇기 게임을 만들어보시오

//			제시어 : 자전거
//			입력 : 거미줄
//			
//			제시어 : 거미줄
//			입력 : 줄넘기
		String str = "기러기";

		Scanner sc = new Scanner(System.in);

		int dupCnt = 1;
		String[] duplicated = { str };

		while (true) {
			System.out.println(Arrays.toString(duplicated));
			System.out.print(str + " : ");

			String answer = sc.nextLine();

			if (answer.length() != 3) {
				System.out.println("세 글자가 아닙니다.");
				continue;
			}

			boolean check = false;
			for (int i = 0; i < duplicated.length; i += 1) {
				if (answer.equals(duplicated[i])) {
					check = true;
					break;
				}
			}

			if (!check) {

				if (str.charAt(2) == answer.charAt(0)) {
					System.out.println("정답");

					String[] copy = duplicated;
					duplicated = new String[dupCnt + 1];

					for (int i = 0; i < dupCnt; i += 1) {
						duplicated[i] = copy[i];
					}
					duplicated[dupCnt] = answer;
					dupCnt += 1;
					str = answer;
				}
			} else {
				System.out.println("이미 사용 된 단어입니다.");
				break;
			}
		}
		sc.close();
	}
}
