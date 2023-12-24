package 클래스_문제;

public class _15클배_판매사원 {

	public static void main(String[] args) {

		String data1 = "1001/3,1002/1,1001/3,1003/5,1004/1,1002/2";
		String data2 = "1001/이만수,1002/김철수,1003/신민아,1004/박상아";

		// data1 은 사원번호와 판매실적이다.
		// data2 는 사원번호와 사원의 이름이다.
		// 판매실적이 4 이상인 사원은 isBestdp true를 저장하세요.
		Employee[] eList = null;
		String[] data1splited = data1.split(",");
		String[] data2splited = data2.split(",");
		eList = new Employee[data2splited.length];

//		문제1) 위 데이터를 참고하여 Employee 클래스 배열을 완성 후 전체 출력해보세요.
		System.out.println("=====전체사원=====");
		for (int i = 0; i < eList.length; i += 1) {

			String[] temp = data2splited[i].split("/");
			Employee e = new Employee();

			e.no = Integer.parseInt(temp[0]);
			e.name = temp[1];

			eList[i] = e;
		}

		for (int i = 0; i < data1splited.length; i += 1) {

			String[] tempTemp = data1splited[i].split("/");

			for (int j = 0; j < eList.length; j += 1) {

				if (Integer.parseInt(tempTemp[0]) == eList[j].no) {
					eList[j].point += Integer.parseInt(tempTemp[1]);
				}
			}
		}

		// 출력
		for (Employee e : eList) {
			System.out.printf("%d %s %d", e.no, e.name, e.point);
			System.out.println();
		}
//		문제2) 판매실적이 best인 사원의 이름을 출력하세요
		System.out.println("=====문제2=====");
		for (Employee e : eList) {

			if (e.point >= 4) {
				e.isBest = true;
			}
		}
		for (Employee e : eList) {

			if (e.isBest) {
				System.out.printf(e.name);
				System.out.println();
			}
		}
	}
}
