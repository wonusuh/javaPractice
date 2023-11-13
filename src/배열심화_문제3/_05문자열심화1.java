package 배열심화_문제3;

import java.util.Arrays;

public class _05문자열심화1 {

	public static void main(String[] args) {
		String nameData = "";
		nameData += "100001/이만수";
		nameData += "\n";
		nameData += "100002/이영희";
		nameData += "\n";
		nameData += "100003/유재석";
		nameData += "\n";
		nameData += "100004/박명수";
		nameData += "\n";
		nameData += "100005/차은우";
		nameData += "\n";
		nameData += "100006/박연미";

		String moneyData = "";
		moneyData += "100001/600";
		moneyData += "\n";
		moneyData += "100003/7000";
		moneyData += "\n";
		moneyData += "100001/100";
		moneyData += "\n";
		moneyData += "100002/400";
		moneyData += "\n";
		moneyData += "100001/600";
		moneyData += "\n";
		moneyData += "100004/900";
		moneyData += "\n";
		moneyData += "100001/130";
		moneyData += "\n";
		moneyData += "100003/200";
		moneyData += "\n";
		moneyData += "100002/700";
		moneyData += "\n";
		moneyData += "100002/900";
		moneyData += "\n";
		moneyData += "100004/800";
//		문제) moneyData와 nameData 를 조합해서 아래와같이 만들어보세요.
		String userData = "";
//		100001/이만수/600
//		100003/유재석/7000
//		100001/이만수/100
//		100002/이영희/400
//		100001/이만수/600
//		100004/박명수/900
//		100001/이만수/130
//		100003/유재석/200
//		100002/이영희/700
//		100002/이영희/900
//		100004/박명수/800

		String[] numName = nameData.split("\n");
		String[] numMoney = moneyData.split("\n");

		String[][] name = new String[numName.length][];
		String[][] money = new String[numMoney.length][];

		for (int i = 0; i < name.length; i += 1) {
			name[i] = numName[i].split("/");
		}

		for (int i = 0; i < money.length; i += 1) {
			money[i] = numMoney[i].split("/");
		}

		System.out.println("name " + Arrays.deepToString(name));
		System.out.println("money " + Arrays.deepToString(money));

		for (int i = 0; i < money.length; i += 1) {

			for (int j = 0; j < name.length; j += 1) {

				if (money[i][0].equals(name[j][0])) {
//					System.out.println(money[i][0]);
					userData += money[i][0] + "/" + name[j][1] + "/" + money[i][1] + "\n";
				}
			}
		}
		System.out.println(userData);
	}
}
