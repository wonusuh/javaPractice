package 클래스배열_문제;

class Node1 {

	int number, price;
	String name;

	void init(int number, String name, int price) {
		this.number = number;
		this.name = name;
		this.price = price;
	}

	void printInfo() {
		System.out.println(number + " " + name + " " + price);
	}

	void putMoneyIn(int money) {
		this.price += money;
	}
}

class Return1 {
//메서드를 통해서 메인에 값을 리턴(이 클래스에 전역변수 없음)

//문제1
//result 배열에 아래와같은 형태로
//데이터를 저장해 리턴하는 메서드를 구현하시오.
//	10001 김철수 2670
//	10002 이영희 1950
//	10003 유재석 4080
//	10004 박명수 7130
	Node1[] makeList(String data) {

		String[] datas = data.split("\n");
		int cnt = 0;
		Node1[] temp = new Node1[cnt];

		for (int i = 0; i < datas.length; i += 1) {

			String[] iSplited = datas[i].split("/");
			boolean dupl = false;

			for (int j = 0; j < i; j += 1) {

				String[] jSplited = datas[j].split("/");

				if (iSplited[0].equals(jSplited[0])) {
					dupl = true;
					break;
				}
			}

			if (!dupl) {

				Node1[] copy = temp;
				temp = new Node1[cnt + 1];

				for (int j = 0; j < copy.length; j += 1) {
					temp[j] = copy[j];
				}

				Node1 n = new Node1();

				n.init(Integer.parseInt(iSplited[0]), iSplited[1], 0);
				temp[cnt++] = n;
			}
		}

		for (int i = 0; i < datas.length; i += 1) {

			String[] tempTemp = datas[i].split("/");

			for (int j = 0; j < temp.length; j += 1) {

				if (tempTemp[1].equals(temp[j].name)) {
					temp[j].putMoneyIn(Integer.parseInt(tempTemp[2]));

					for (int k = 0; k < temp.length; k += 1) {
						temp[k].printInfo();
					}
					System.out.println();
				}
			}
		}
		return temp;
	}

//문제2
//판매금액이 1등인 회원정보만을 리턴하는 메서드를 구현하시오.
	Node1 getFirst(Node1[] list) {

		Node1 temp = new Node1();
		int max = 0;

		for (Node1 n : list) {

			if (n.price > max) {

				temp = new Node1();

				max = n.price;
				temp = n;
			}
		}
		return temp;
	}
}

public class _04클배연습문제1 {

	public static void main(String[] args) {

		String data = "";
		data += "10001/김철수/600\n";
		data += "10002/이영희/800\n";
		data += "10001/김철수/1400\n";
		data += "10003/유재석/780\n";
		data += "10002/이영희/950\n";
		data += "10004/박명수/330\n";
		data += "10001/김철수/670\n";
		data += "10003/유재석/3300\n";
		data += "10002/이영희/200\n";
		data += "10004/박명수/6800\n";

		Return1 re = new Return1();
		Node1[] list = re.makeList(data);

		System.out.println("=====문제1=====");
		for (int i = 0; i < list.length; i += 1) {
			list[i].printInfo();
		}

		System.out.println("=====문제2=====");
		Node1 n = re.getFirst(list);
		n.printInfo();
	}
}
