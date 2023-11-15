package 배열심화_문제3;

import java.util.Arrays;

public class _19도서연체 {

	public static void main(String[] args) {

		// 윤년은 신경쓰지 않는다.
		int[] monthList = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		String today = "2023-11-14";

		String rentalData = "";
		rentalData += "책번호/책제목/대여날짜/회원번호\n";
		rentalData += "20122/연필로쓰기/2023-11-05/1001\n";
		rentalData += "40143/외국어 공부의 감각/2023-10-27/1003\n";
		rentalData += "54321/컴퓨터활용능력/2023-11-07/1041\n";
		rentalData += "26543/아무튼,외국어/2023-11-11/1034";

		String userData = "";
		userData += "회원번호/책번호/대여일수(day)\n";
		userData += "1001/20122/10\n";
		userData += "1003/40143/8\n";
		userData += "1041/54321/5\n";
		userData += "1034/26543/2";

		String[] rental = rentalData.split("\n");
		String[] user = userData.split("\n");

//		int bookNum1 = 0;
		int bookName = 1;
		int rentDate = 2;
//		int peosonal1 = 3;
		String[][] rentals = new String[rental.length][4];

		for (int i = 0; i < rentals.length; i += 1) {

			String[] temp = rental[i].split("/");

			rentals[i][0] = temp[0];
			rentals[i][1] = temp[1];
			rentals[i][2] = temp[2];
			rentals[i][3] = temp[3];
		}

		int personal2 = 0;
//		int bookNum2 = 1;
		int days = 2;
		String[][] users = new String[user.length][3];

		for (int i = 0; i < user.length; i += 1) {

			String[] temp = user[i].split("/");

			users[i][0] = temp[0];
			users[i][1] = temp[1];
			users[i][2] = temp[2];
		}
//		System.out.println("rental" + Arrays.deepToString(rental));
//		System.out.println("user" + Arrays.deepToString(user));
		System.out.println("rentals" + Arrays.deepToString(rentals));
		System.out.println();
		System.out.println("users" + Arrays.deepToString(users));

		System.out.println();
		System.out.printf(
				String.format("%-10s %-10s %-10s %-10s %-10s %-10s\n", "회원번호", "도서이름", "연체된일수", "빌린날짜", "빌린일", "대여일수"));
		for (int i = 1; i < rentals.length; i += 1) {

			int todayY = Integer.parseInt(today.substring(0, 4));
			int todayM = Integer.parseInt(today.substring(5, 7));
			int todayD = Integer.parseInt(today.substring(8));
			int year = Integer.parseInt(rentals[i][2].substring(0, 4));
			int month = Integer.parseInt(rentals[i][2].substring(5, 7));
			int date = Integer.parseInt(rentals[i][2].substring(8));
//			System.out.printf("%d %d %d\n", year, month, date);

			// today랑 같은날이 될 때 까지 cnt
			int cnt = 0;

			while (true) {
				cnt += 1;
				date += 1;
//				System.out.printf("%d %d %d %d\n", i, year, month, date);

				// 마지막날에 다음달로 넘어가기
				if (date >= monthList[month - 1]) {
					month += 1;
					date = 0;
				}

				// 마지막달에 다음해로 넘어가기
				if (month > 12) {
					year += 1;
					month = 1;
				}

				if (year == todayY && month == todayM && date == todayD) {
					break;
				}
			}

			// cnt가 대여일수를 초과하는 사람만 출력
//			System.out.println("cnt" + cnt);
			if (cnt > Integer.parseInt(users[i][days])) {
				System.out.printf(String.format("%-10s %-10s %-10d %-10s %-10d %-10s\n", users[i][personal2],
						rentals[i][bookName], cnt - Integer.parseInt(users[i][days]), rentals[i][rentDate], cnt,
						users[i][days]));
			}
		}
	}
}
