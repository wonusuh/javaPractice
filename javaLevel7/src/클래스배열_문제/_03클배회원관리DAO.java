package 클래스배열_문제;

import java.util.Scanner;

class Client {
	String id, name;

	String getId() {
		return id;
	}

	void setId(String id) {
		this.id = id;
	}

	String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}
}

class ClientDAO {
	int count, size = 5;
	Client[] cList;
	Scanner sc = new Scanner(System.in);

	void init() {
		cList = new Client[size];
		for (int i = 0; i < cList.length; i += 1) {
			cList[i] = new Client();
		}
	}

	void showMenu() {
		System.out.print("[1]추가 [2]삭제(아이디 입력) [3]출력 [0]종료");
	}

	int findId(String id) {
		int idx = -1;
		for (int i = 0; i < cList.length; i += 1) {
			if (id.equals(cList[i].id)) {
				idx = i;
			}
		}
		return idx;
	}

	void join() {
		String id;
		while (true) {
			if (count == size) {
				System.err.println("더이상 가입할 수 없습니다.");
				return;
			}
			System.out.println("=====추가=====");
			System.out.println("아이디를 입력하세요. >> ");
			id = sc.next();
			sc.nextLine();
			if (findId(id) != -1) {
				System.err.println("중복 된 아이디입니다.");
				continue;
			}
			break;
		}
		System.out.print("이름을 입력하세요. >> ");
		String name = sc.next();
		sc.nextLine();
		cList[count].setId(id);
		cList[count++].setName(name);
	}

	void del() {
		System.out.print("삭제할 id를 입력하세요. >> ");
		String id = sc.next();
		sc.nextLine();
		int idx = findId(id);
		if (idx != -1) {
			for (int i = idx; i < cList.length - 1; i += 1) {
				cList[i] = cList[i + 1];
				cList[i + 1] = new Client();
			}
			cList[size - 1] = new Client();
			System.err.println("회원을 삭제했습니다.");
			count -= 1;
		} else {
			System.err.println("존재하지 않는 아이디입니다.");
		}
	}

	void showAll() {
		System.out.printf("%-10s%-10s\n", "아이디", "이름");
		for (int i = 0; i < count; i += 1) {
			System.out.printf("%-10s%-10s\n", cList[i].getId(), cList[i].getName());
		}
	}

	void run() {
		init();
		while (true) {
			showMenu();
			int sel = sc.nextInt();
			if (sel == 0) {// 종료
				break;
			} else if (sel == 1) {// 추가
				join();
			} else if (sel == 2) {// 삭제(아이디입력)
				del();
			} else if (sel == 3) {// 출력
				showAll();
			}
		}
	}
}

public class _03클배회원관리DAO {
	public static void main(String[] args) {
		ClientDAO dao = new ClientDAO();
		dao.run();
		dao.sc.close();
	}
}
