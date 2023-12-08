package ATM;

public class Controller {
	final String bankName = "우리은행";
	Util util;
	ClientDAO clientDAO;
	AccountDAO accountDAO;

	Controller() { // 생성자
		clientDAO = new ClientDAO();
		accountDAO = new AccountDAO();
		util = new Util(this);
		clientDAO.setAccountsToEachPerson(accountDAO.accounts);
	}

	void printBankName() { // 은행이름을 출력합니다.
		System.out.println("=========");
		System.out.printf("[ %s ]\n", bankName);
		System.out.println("=========");
	}

	void printMenu() { // 시작메뉴를 출력합니다.
		System.out.println("[1]관리자 [2]사용자 [0]종료");
	}

	void printAdminMenu() { // 관리자메뉴를 출력합니다.
		System.out.println("[1]회원 목록 [2]회원 수정 [3]회원 삭제 [4]데이터 저장 [5]데이터 로드 [0]뒤로가기");
	}
	// [1]관리자 [2]사용자 [0]종료

	// 관리자
	// [1]회원목록[2]회원수정[3]회원삭제 4데이터저장 5데이터 로드

	// 회원수정 : 회원 아이디 검색 비밀번호, 이름 수정가능
	// 회원삭제 회원아이디검색

	// 사용자메뉴
	// 1 회원가입 2로그인 0뒤로가기
	// 1계좌추가 2계좌삭제 3입금 4출금 5이체 6탈퇴 7마이페이지 0로그아웃
	// 이체 본인 계좌도 이체 가능, 하지만 계좌 A에서 계좌A로 불가능
	// 마이페이지 : 내 계좌 목록 (잔고까지)
	void run() {
		while (true) {
			printBankName();
			printMenu();
			int sel = util.getValue(0, 2);
			if (sel == 1) { // 관리자
				printAdminMenu();
				int choice = util.getValue(0, 5);
				if (choice == 0) { // 관리자메뉴에서 뒤로가기
					break;
				} else if (choice == 1) { // 회원 목록
					clientDAO.showAllClients();
				} else if (choice == 2) { // 회원 수정
				} else if (choice == 3) { // 회원 삭제
				} else if (choice == 4) { // 데이터 저장
					util.save(clientDAO.clients, accountDAO.accounts);
				} else if (choice == 5) { // 데이터 로드
					util.loadClients();
					util.loadAccounts();
				}
			} else if (sel == 2) { // 사용자
			} else if (sel == 0) { // 프로그램 종료
				break;
			}
		}
	}
}
