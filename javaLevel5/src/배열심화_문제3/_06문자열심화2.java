package 배열심화_문제3;

public class _06문자열심화2 {

	public static void main(String[] args) {
		String data = "10001/김철수/600\n";
		data += "10002/이영희/800\n";
		data += "10001/김철수/1400\n";
		data += "10003/유재석/780\n";
		data += "10002/이영희/950\n";
		data += "10004/박명수/330\n";
		data += "10001/김철수/670\n";
		data += "10003/유재석/3300\n";
		data += "10002/이영희/200\n";
		data += "10004/박명수/6800";
//		문제) 위 데이터는 각각의 회원이 물건을 구입했을때마다 기록한 내용이다.
//				데이터를 아래와 같이 출력하시오.(각 회원별 구입 총합)
//		============================
//				10001 김철수 2670
//				10002 이영희 1950
//				10003 유재석 4080
//				10004 박명수 7130
//		============================
		String[] dataTemp = data.split("\n");
//		System.out.println(Arrays.toString(dataTemp));

		String[][] people = new String[dataTemp.length][];

		for (int i = 0; i < dataTemp.length; i += 1) {

			String[] temp = new String[3];

			temp = dataTemp[i].split("/");
			people[i] = temp;
		}
//		System.out.println(Arrays.deepToString(people));

		// 중복된 사람을 제외하고 만들 방의 개수를 알아내기
		String[][] temp = new String[people.length][];
		int cnt = 0;

		for (int i = 0; i < people.length; i += 1) {

			boolean duplicated = false;

			for (int j = 0; j < i; j += 1) {

				if (temp[j] == null) {
					break;
				}

				if (temp[j][0].equals(people[i][0])) {
					duplicated = true;
					break;
				}
			}

			if (!duplicated) {
				temp[cnt] = people[i];
				cnt += 1;
			}
		}

		int[][] numName = new int[cnt][];

		for (int i = 0; i < cnt; i += 1) {

			int[] tempTemp = new int[2];

			tempTemp[0] = Integer.parseInt(temp[i][0]);
			tempTemp[1] = 0;
			numName[i] = tempTemp;
		}
//		System.out.println(Arrays.deepToString(numName));

		// people 배열을 parsing해서 int 배열로 만들기
		int[][] peopleResult = new int[people.length][];

		for (int i = 0; i < people.length; i += 1) {

			int[] tempTempTemp = new int[2];

			tempTempTemp[0] = Integer.parseInt(people[i][0]);
			tempTempTemp[1] = Integer.parseInt(people[i][2]);

			peopleResult[i] = tempTempTemp;
		}
//		System.out.println(Arrays.deepToString(peopleResult));

		// 반복문으로 result에 값 저장하기
		for (int i = 0; i < peopleResult.length; i += 1) {

			// 회원번호로 검색해서 numName 배열에 값 넣기
			for (int j = 0; j < numName.length; j += 1) {

				if (peopleResult[i][0] == numName[j][0]) {
					numName[j][1] += peopleResult[i][1];
				}
			}
		}

		// 결과 출력하기
		for (int i = 0; i < numName.length; i += 1) {

			int idx = -1;

			for (int j = 0; j < people.length; j += 1) {

				if (numName[i][0] == Integer.parseInt(people[j][0])) {
					idx = j;
					break;
				}
			}
			System.out.printf("%d%s%d\n", numName[i][0], people[idx][1], numName[i][1]);
		}
	}
}
