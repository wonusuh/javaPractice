package 배열심화_문제3;

public class _14사원정보 {

	public static void main(String[] args) {
		// [부서정보]
		// [부서번호,부서명,지역]
		int deNo1 = 0;
		int deName = 1;
		int loc = 2;
		String[][] deData = {
				// 부서코드
				{ "10", "ACCOUNTING", "NEW YORK" },

				{ "20", "RESEARCH", "DALLAS" },

				{ "30", "SALES", "CHICAGO" },

				{ "40", "OPERATIONS", "BOSTON" } };

//		int num = 0;
		int name = 1;
		int job = 2;
//		int supervisor = 3;
		int date = 4;
		int sal = 5;
//		int com = 6;f
		int deNo2 = 7;
		String[][] emData = {
				// 사원번호, 이름, 직책, 상사번호, 입사일, 급여, 커미션, 부서번호
				{ "7369", "SMITH", "CLERK", "7902", "17-12-1980", "800", "0", "20" },

				{ "7499", "ALLEN", "SALESMAN", "7698", "20-2-1981", "1600", "300", "30" },

				{ "7521", "WARD", "SALESMAN", "7698", "22-2-1981", "1250", "500", "30" },

				{ "7566", "JONES", "MANAGER", "7839", "2-4-1981", "2975", "0", "20" },

				{ "7654", "MARTIN", "SALESMAN", "7698", "28-9-1981", "1250", "1400", "30" },

				{ "7698", "BLAKE", "MANAGER", "7839", "1-5-1981", "2850", "0", "30" },

				{ "7782", "CLARK", "MANAGER", "7839", "9-6-1981", "2450", "0", "10" },

				{ "7788", "SCOTT", "ANALYST", "7566", "13-7-1987", "3000", "0", "20" },

				{ "7839", "KING", "PRESIDENT", "NULL", "17-11-1981", "5000", "0", "10" },

				{ "7844", "TURNER", "SALESMAN", "7698", "8-9-1981", "1500", "0", "30" },

				{ "7876", "ADAMS", "CLERK", "7788", "13-7-1987", "1100", "0", "20" },

				{ "7900", "JAMES", "CLERK", "7698", "3-12-1981", "950", "0", "30" },

				{ "7902", "FORD", "ANALYST", "7566", "3-12-1981", "3000", "0", "20" },

				{ "7934", "MILLER", "CLERK", "7782", "23-1-1982", "1300", "0", "10" } };
//문제 1) DALLAS에서 근무하는 사원의 이름, 직급, 부서번호, 부서명을 조회하시오.
		String input = "DALLAS";

		System.out.println("=====문제1=====");

		String location = "";
		int idx = -1;
		for (int i = 0; i < deData.length; i += 1) {

			if (input.equals(deData[i][2])) {
				idx = i;
				location = deData[i][0];
			}
		}

		for (int i = 0; i < emData.length; i += 1) {

			if (location.equals(emData[i][7])) {
				// 이름1 직급2 부서번호7 부서명 deData[idx][1]
				System.out.printf("%s %s %s %s\n", emData[i][1], emData[i][2], emData[i][7], deData[idx][1]);
			}
		}

//문제 2) ALLEN과 같은 부서에 근무하는 사원의 이름1, 부서번호를7 조회하시오.
		System.out.println("=====문제2=====");
		input = "ALLEN";
		String deCode = "";

		for (int i = 0; i < emData.length; i += 1) {

			if (emData[i][name].equals(input)) {
				deCode = emData[i][deNo2];
				break;
			}
		}

		for (int j = 0; j < emData.length; j += 1) {

			if (deCode.equals(emData[j][deNo2])) {
				System.out.printf("%s %s\n", emData[j][name], emData[j][deNo2]);
			}
		}

//문제 3) 부서별 최대 급여와 최소 급여를 구하시오.
		System.out.println("=====문제3=====");
		for (int i = 0; i < deData.length; i += 1) {
			System.out.print(deData[i][deName] + " : ");

			int max = 0;
			int min = 10000;
			boolean check = false;

			for (int j = 0; j < emData.length; j += 1) {

				if (deData[i][deNo1].equals(emData[j][deNo2])) {

					check = true;

					if (Integer.parseInt(emData[j][sal]) > max) {
						max = Integer.parseInt(emData[j][sal]);
					}

					if (Integer.parseInt(emData[j][sal]) < min) {
						min = Integer.parseInt(emData[j][sal]);
					}
				}
			}

			if (check) {
				System.out.printf("최대%d 최소%d\n", max, min);
			} else {
				System.out.print("no data");
			}
		}
		System.out.println();

//문제 4) 부서별로 급여 평균 (단, 부서별 급여 평균이 2000이상만)
		System.out.println("=====문제4=====");
		for (int i = 0; i < deData.length; i += 1) {

			int total = 0;
			int employees = 0;
			double avg = 0.0;

			for (int j = 0; j < emData.length; j += 1) {

				if (deData[i][deNo1].equals(emData[j][deNo2])) {
					total += Integer.parseInt(emData[j][sal]);
					employees += 1;
				}
			}

			avg = total * 1.0 / employees;
			if (avg > 2000) {
				System.out.print(deData[i][deName] + " : ");
				System.out.printf("%.2f\n", total * 1.0 / employees);
			}
		}
		System.out.println();

//문제 5) 부서번호가 30번인 사원들의 이름, 직급, 부서번호, 부서위치를 조회하시오.
		System.out.println("=====문제5=====");
		input = "30";
		String locLoc = "";
		for (int i = 0; i < deData.length; i += 1) {

			if (input.equals(deData[i][deNo1])) {
				locLoc = deData[i][loc];
				break;
			}
		}

		for (int i = 0; i < emData.length; i += 1) {

			if (input.equals(emData[i][deNo2])) {
				System.out.printf("이름%s 직급%s 부서번호%s 부서위치%s\n", emData[i][name], emData[i][job], emData[i][deNo2],
						locLoc);
			}
		}

//문제 6) 이름에 A가 들어가는 사원의 이름, 부서명을 조회하시오.
		System.out.println("=====문제6=====");
		input = "A";

		for (int i = 0; i < emData.length; i += 1) {

			String de = "test";
			boolean check = false;

			for (int j = 0; j < emData[i][name].length(); j += 1) {
				if (input.equals(emData[i][name].substring(j, j + 1))) {
//					System.out.println(emData[i][name].substring(j, j + 1));
					check = true;
					break;
				}
			}
//			System.out.println(check);
			if (check) {

				for (int k = 0; k < deData.length; k += 1) {

					if (emData[i][deNo2].equals(deData[k][deNo1])) {
						de = deData[k][deName];
					}
				}
				System.out.printf("이름 : %s, 부서 : %s\n", emData[i][name], de);
			}
		}

//문제 7) 사원명 "JONES"가 속한 부서명을 조회하시오.
		System.out.println("=====문제7=====");
		input = "JONES";

		for (int i = 0; i < emData.length; i += 1) {

			if (input.equals(emData[i][name])) {

				for (int j = 0; j < deData.length; j += 1) {

					if (emData[i][deNo2].equals(deData[j][deNo1])) {
						System.out.println(deData[j][deName]);
					}
				}
			}
		}

//문제 8) 10번 부서에 근무하는 사원의 이름과 10번 부서의 부서명을 조회하시오.
		System.out.println("=====문제8=====");
		input = "10";

		for (int i = 0; i < emData.length; i += 1) {

			String deDeName = "";

			if (input.equals(emData[i][deNo2])) {

				for (int j = 0; j < deData.length; j += 1) {

					if (emData[i][deNo2].equals(deData[j][deNo1])) {
						deDeName = deData[j][deName] + i;
					}
				}
				System.out.printf("이름%s, 부서%s\n", emData[i][name], deDeName);
			}
		}

//문제 9) 1987년생의 사원의 이름과 직책과 부서위치를 조회하시오.
		System.out.println("=====문제9=====");
		input = "1987";

		for (int i = 0; i < emData.length; i += 1) {

			String[] temp = new String[3];
			String tempTemp = "";

			temp = emData[i][date].split("-");

			if (temp[2].equals(input)) {

				for (int j = 0; j < deData.length; j += 1) {

					if (emData[i][deNo2].equals(deData[j][deNo1])) {
						tempTemp = deData[j][loc] + i;
					}
				}
				System.out.printf("이름%s 직책%s 부서위치%s\n", emData[i][name], emData[i][job], tempTemp);
			}
		}
	}
}
