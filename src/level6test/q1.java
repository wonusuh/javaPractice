package level6test;

class Employee {
	int no; // 사원번호
	String name; // 사원명
	String title; // 직책
	int supNo; // 관리자 사원번호
	String date; // 생년월일
	int salary; // 월급
	int com; // 커미션
	int deNo; // 부서코드
}

class Department {

	int no; // 부서코드
	String name; // 부서이름
	String location; // 부서 위치
}

public class q1 {

	public static void main(String[] args) {

		String[][] deData = {

				{ "10", "ACCOUNTING", "NEW YORK" },

				{ "20", "RESEARCH", "DALLAS" },

				{ "30", "SALES", "CHICAGO" },

				{ "40", "OPERATIONS", "BOSTON" } };
		String[][] emData = {

				{ "7369", "SMITH", "CLERK", "7902", "17-12-1980", "800", "0", "20" },

				{ "7499", "ALLEN", "SALESMAN", "7698", "20-2-1981", "1600", "300", "30" },

				{ "7521", "WARD", "SALESMAN", "7698", "22-2-1981", "1250", "500", "30" },

				{ "7566", "JONES", "MANAGER", "7839", "2-4-1981", "2975", "0", "20" },

				{ "7654", "MARTIN", "SALESMAN", "7698", "28-9-1981", "1250", "1400", "30" },

				{ "7698", "BLAKE", "MANAGER", "7839", "1-5-1981", "2850", "0", "30" },

				{ "7782", "CLARK", "MANAGER", "7839", "9-6-1981", "2450", "0", "10" },

				{ "7788", "SCOTT", "ANALYST", "7566", "13-7-1987", "3000", "0", "20" },

				{ "7839", "KING", "PRESIDENT", "NULL", "17-11-1981", "5000", "1000", "10" },

				{ "7844", "TURNER", "SALESMAN", "7698", "8-9-1981", "1500", "0", "30" },

				{ "7876", "ADAMS", "CLERK", "7788", "13-7-1987", "1100", "0", "20" },

				{ "7900", "JAMES", "CLERK", "7698", "3-12-1981", "950", "0", "30" },

				{ "7902", "FORD", "ANALYST", "7566", "3-12-1981", "3000", "0", "20" },

				{ "7934", "MILLER", "CLERK", "7782", "23-1-1982", "1300", "0", "10" } };

		// 급여는 커미션을 제외해서 걔산한다
		Employee[] eList = new Employee[emData.length];
		Department[] dList = new Department[deData.length];

		// 클래스배열에 데이터 넣기
		for (int i = 0; i < deData.length; i += 1) {

			Department temp = new Department();

			temp.no = Integer.parseInt(deData[i][0]);
			temp.name = deData[i][1];
			temp.location = deData[i][2];
			dList[i] = temp;
		}

		for (int i = 0; i < emData.length; i += 1) {

			Employee temp = new Employee();

			temp.no = Integer.parseInt(emData[i][0]);
			temp.name = emData[i][1];
			temp.title = emData[i][2];

			if (emData[i][3].equals("NULL")) {
				temp.supNo = 0;
			} else {
				temp.supNo = Integer.parseInt(emData[i][3]);
			}
			temp.date = emData[i][4];
			temp.salary = Integer.parseInt(emData[i][5]);
			temp.com = Integer.parseInt(emData[i][6]);
			temp.deNo = Integer.parseInt(emData[i][7]);
			eList[i] = temp;
		}

		// [문제 1] 부서별 평균월급여
		System.out.println("=====q1=====");

		int[] cnt = new int[deData.length];
		double[] sum = new double[deData.length];

		for (Employee e : eList) {

			for (int j = 0; j < dList.length; j += 1) {

				if (e.deNo == dList[j].no) {
					cnt[j] += 1;
					sum[j] += e.salary;
				}
			}
		}

		double max = 0;
		int idx = -1;

		for (int i = 0; i < sum.length; i += 1) {

			if (sum[i] / cnt[i] > max) {
				max = sum[i] / cnt[i];
				idx = i;
			}
		}
		System.out.printf("부서 : %s, 평균월급여 : %f\n", dList[idx].name, max);

		// [문제 2] 부서별 전체 사원수와 커미션을 받는 사원들의 수
		System.out.println("=====q2=====");

		cnt = new int[dList.length];
		int[] withCom = new int[dList.length];

		for (Employee e : eList) {

			for (int j = 0; j < dList.length; j += 1) {

				if (e.deNo == dList[j].no) {
					cnt[j] += 1;

					if (e.com != 0) {
						withCom[j] += 1;
					}
				}
			}
		}

		for (int i = 0; i < withCom.length; i += 1) {
			System.out.printf("%s : 사원수 %d명, 커미션을받는사원수 %d명\n", dList[i].name, cnt[i], withCom[i]);
		}

		// [문제 3] 부서별 최대 급여와 최소 급여
		System.out.println("=====q3=====");

		for (int i = 0; i < dList.length; i += 1) {
			System.out.print(dList[i].name);

			max = 0;
			String maxPerson = "";
			int min = 10000;
			String minPerson = "";

			for (int j = 0; j < eList.length; j += 1) {

				if (dList[i].no == eList[j].deNo) {

					if (eList[j].salary > max) {
						max = eList[j].salary;
						maxPerson = eList[j].name;
					}

					if (eList[j].salary < min) {
						min = eList[j].salary;
						minPerson = eList[j].name;
					}
				}
			}
			System.out.printf(" : 최대급여 %s, 최소급여 %s\n", maxPerson, minPerson);
		}

		// [문제 4] 부서번호가 30번인 사원들의 이름, 직급, 부서번호, 부서위치를 조회하시오.
		System.out.println("=====q4=====");

		for (Employee e : eList) {

			if (e.deNo == 30) {

				String loc = "";

				for (Department d : dList) {

					if (e.deNo == d.no) {
						loc = d.location;
					}
				}
				System.out.printf("%s %s %d %s\n", e.name, e.title, e.deNo, loc);
			}
		}

		// [문제 5] 커미션을 받는 사원의 이름, 커미션, 부서이름,부서위치를 조회하시오.
		System.out.println("=====q5=====");

		for (Employee e : eList) {

			if (e.com != 0) {

				String dep = "";
				String loc = "";

				for (Department d : dList) {

					if (e.deNo == d.no) {
						dep = d.name;
						loc = d.location;
					}
				}
				System.out.printf("%s %d %s %s\n", e.name, e.com, dep, loc);
			}
		}

		// [문제 6] 급여가 높은 순으로 조회하되 급여가 같을 경우 이름의 철자가 빠른 사원순으로 사번,이름,월급여를 조회하시오.
		System.out.println("=====q6=====");

		Employee[] copy = eList;

		for (int i = 0; i < copy.length; i += 1) {

			max = 0;
			idx = -1;
			String name = "";

			for (int j = i; j < copy.length; j += 1) {

				if (copy[j].salary > max) {
					max = copy[j].salary;
					idx = j;
					name = copy[j].name;
				} else if (copy[j].salary == max) {

					if (copy[j].name.compareTo(name) < 0) {
						idx = j;
					}
				}
			}

			Employee temp = copy[i];

			copy[i] = copy[idx];
			copy[idx] = temp;
		}

		// 출력
		for (Employee e : copy) {
			System.out.printf("사번 %d, 이름 %s, 월급여 %s\n", e.no, e.name, e.salary);
		}

		// [문제 7] DALLAS에서 근무하는 사원의 이름,직급,부서번호,부서명을 조회하시오.
		System.out.println("=====q7=====");

		String depName = "DALLAS";
		int tempTemp = -1;
		idx = -1;

		for (int i = 0; i < dList.length; i += 1) {
			if (dList[i].location.equals(depName)) {
				tempTemp = dList[i].no;
				idx = i;
			}
		}
		System.out.println(tempTemp);

		for (Employee e : eList) {

			if (e.deNo == tempTemp) {
				System.out.printf("%s %s %d %s\n", e.name, e.title, e.deNo, dList[idx].name);
			}
		}

		// [문제 8] 이름에 A 가 들어가는 사원의 이름,부서명을 조회하시오.
		System.out.println("=====q8=====");

		String a = "A";

		for (Employee e : eList) {

			for (int j = 0; j < e.name.length(); j += 1) {

				if (e.name.substring(j, j + 1).equals(a)) {

					String deName = "";

					for (Department d : dList) {

						if (e.deNo == d.no) {
							deName = d.name;
						}
					}
					System.out.printf("%s %s\n", e.name, deName);
					break;
				}
			}
		}

		// [문제 9] ALLEN과 같은 부서에 근무하는 사원의 이름, 부서번호를 조회하시오.
		System.out.println("=====q9=====");

		// Allen 의 부서 찾기
		String Allen = "ALLEN";
		int de = 0;

		for (Employee e : eList) {

			if (e.name.equals(Allen)) {
				de = e.deNo;
				break;
			}
		}

		for (Employee e : eList) {

			if (e.deNo == de) {
				System.out.printf("%s %d\n", e.name, e.deNo);
			}
		}

		// [문제 10] 10번 부서에서 근무하는 사원의 이름과 10번 부서의 부서명을 조회하시오.
		System.out.println("=====q10=====");
		int ten = 10;

		for (Employee e : eList) {

			String temp = "";

			for (Department d : dList) {

				if (d.no == ten) {
					temp = d.name;
				}
			}

			if (e.deNo == ten) {
				System.out.printf("%s %s\n", e.name, temp);
			}
		}

		// [문제 11] 전체 평균 월급여보다 더 많은 월급여를 받은 사원의 사원번호,이름,월급여 조회하시오.
		System.out.println("=====q11=====");

		double total = 0.0;
		int workers = 0;

		// 평균 구하기
		for (Employee e : eList) {
			total += e.salary;
			workers += 1;
		}

		double average = total / workers;

		// 평균보다 높은 사람 조회하기
		for (Employee e : eList) {

			if (e.salary > average) {
				System.out.printf("%d %s %d\n", e.no, e.name, e.salary);
			}
		}

		// [문제 12] 부서번호가 20인 사원중에서 최대급여를 받는 사원과 동일한 급여를 받는 사원의 사원번호, 이름을 조회하시오.
		System.out.println("=====q12=====");
		max = 0;

		// 최대 급여 구하기
		for (Employee e : eList) {

			if (e.deNo == 20) {

				if (e.salary > max) {
					max = e.salary;
				}
			}
		}

		// 최대급여와 같은 사람들 조회하기
		for (Employee e : eList) {

			if (e.salary == max) {
				System.out.printf("%d %s %d\n", e.no, e.name, e.salary);
			}
		}

		// [문제 13] 사원 테이블에서 사원명과 해당 사원의 관리자명을 검색하시오
		System.out.println("=====q13=====");

		System.out.println("사원이름     관리자 이름");
		for (Employee e : eList) {

			String supervisor = "";

			for (Employee su : eList) {

				if (e.supNo == su.no) {
					supervisor = su.name;
				}
			}
			System.out.printf("%-10s %-10s\n", e.name, supervisor);
		}

		// [문제 14] 사원 테이블에서 부서별 최대 급여를 받는 사원들의 사번, 이름, 부서코드, 급여를 검색하시오.
		System.out.println("=====q14=====");

		for (Department d : dList) {

			Employee temp = new Employee();
			max = 0;

			for (Employee e : eList) {
				if (d.no == e.deNo) {

					if (e.salary > max) {
						max = e.salary;
						temp = e;
					}
				}
			}

			if (temp.name == null) {
				continue;
			}
			System.out.print(d.name + " : ");
			System.out.printf("%d %s %d %d\n", temp.no, temp.name, temp.deNo, temp.salary);
		}
	}
}
