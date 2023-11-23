package 클래스_문제;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class _10클래스배열기본문제2 {

	public static void main(String[] args) {

		int max = 10;
		Student[] stList = new Student[max];
		int cnt = 0; // 현재 생성한 학생숫자
		Scanner sc = new Scanner(System.in);
		int num = 1001;
		Random rn = new Random();

		while (true) {
			System.out.println(Arrays.deepToString(stList));

			System.out.print("[1]학생추가 [2]학생삭제 [3]점수수정 [4]이름검색 [5]전체출력 [0]종료");

			int sel = sc.nextInt();
			if (sel == 0) {
				break;
			} else if (sel == 1) {
				// 추가
				// 맨 처음 학번은 1001
				// 최대학번 +1 로 자동으로 학번값 넣어주기 : 학번을 입력받지 않는다.
				// 동명이인 허용, 아이디 중복금지, 비번, 점수(30~100)랜덤
				System.out.print("이름을 입력하세요 >> ");
				String name = sc.next();
				sc.nextLine();

				System.out.print("id를 입력하세요 >> ");
				String id = sc.next();
				sc.nextLine();
				boolean dupl = false;
				for (int i = 0; i < stList.length; i += 1) {

					if (stList[i] == null) {
						break;
					}

					if (stList[i].id.equals(id)) {
						System.err.println("이미 존재하는 아이디 입니다.");
						dupl = true;
					}
				}

				if (dupl) {
					continue;
				}

				System.out.print("pw를 입력하세요 >> ");
				String pw = sc.next();
				sc.nextLine();

				Student temp = new Student();

				temp.number = num;
				num += 1;

				temp.score = rn.nextInt(100 - 30 + 1) + 30;

				temp.id = id;

				temp.pw = pw;

				temp.name = name;

				stList[cnt] = temp;
				cnt += 1;
			} else if (sel == 2) {
				// 삭제 아이디로 검색해서 삭제
				System.out.print("삭제할 id를 입력하세요. >> ");
				String id = sc.next();
				sc.nextLine();

				int idx = -1;
				for (int i = 0; i < cnt; i += 1) {

					if (stList[i].id.equals(id)) {
						idx = i;
					}
				}

				for (int j = idx; j < cnt; j += 1) {

					if (stList[j] == null) {
						break;
					}
					stList[j] = stList[j + 1];
				}
				cnt -= 1;
			} else if (sel == 3) {
				// 수정 학번으로 검색해서 점수 수정
				System.out.print("점수를 수정할 학생의 학번을 입력하세요. >> ");
				int hakbun = sc.nextInt();

				boolean found = false;
				int idx = -1;

				for (int i = 0; i < cnt; i += 1) {

					if (hakbun == stList[i].number) {
						idx = i;
						found = true;
					}
				}

				if (found) {
					System.out.print("수정할 점수를 입력하세요 >> ");
					int modyfing = sc.nextInt();
					stList[idx].score = modyfing;
				} else {
					System.err.println("존재하지 않는 학번입니다.");
					continue;
				}
			} else if (sel == 4) {
				// 검색 이름으로 검색해서 학번과 점수를 출력(동명이인들 모두 출력)
				System.out.print("검색할 이름을 입력하세요. >> ");
				String finding = sc.next();
				sc.nextLine();

				for (int i = 0; i < cnt; i += 1) {

					if (finding.equals(stList[i].name)) {
						System.out.printf("학번%d 점수%d\n", stList[i].number, stList[i].score);
					}
				}
			} else if (sel == 5) {

				for (int i = 0; i < cnt; i += 1) {
					System.out.printf("학번:%d ", stList[i].number);
					System.out.printf("점수:%d ", stList[i].score);
					System.out.printf("id:%s ", stList[i].id);
					System.out.printf("pw:%s ", stList[i].pw);
					System.out.printf("이름:%s ", stList[i].name);
					System.out.println();
				}
			}
		}
		sc.close();
	}
}
