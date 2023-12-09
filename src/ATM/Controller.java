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
		System.out.println("===========");
		System.out.printf("[ %s ]\n", bankName);
		System.out.println("===========");
	}

	void printMenu() { // 시작메뉴를 출력합니다.
		System.out.println("[1]관리자 [2]사용자 [0]종료");
	}

	void printAdminMenu() { // 관리자메뉴를 출력합니다.
		System.out.println("[ 관리자 메뉴 ]");
		System.out.println("[1]회원 목록 [2]회원 수정 [3]회원 삭제 [4]데이터 저장 [5]데이터 로드 [0]뒤로가기");
	}

	void modifyAClient() { // 고객 한 명의 정보를 수정합니다.
		if (clientDAO.clients == null) {
			System.out.println("고객정보가 존재하지 않습니다.");
			return;
		}
		System.out.println("수정할 고객의 id를 입력하세요. >> ");
		Client client = clientDAO.findAClientById(util.sc.next());
		if (client != null) {
			System.out.printf("(id : %s) (pw : %s) (name : %s)\n", client.getId(), client.getPw(), client.getName());
			System.out.println("수정할 pw >> ");
			client.setPw(util.sc.next());
			System.out.println("수정할 name >> ");
			client.setName(util.sc.next());
			System.out.println("수정했습니다.");
			System.out.printf("(id : %s) (pw : %s) (name : %s)\n", client.getId(), client.getPw(), client.getName());
		}
	}

	void deleteAClient() { // 고객 한 명을 삭제합니다.
		if (clientDAO.clients == null) {
			System.out.println("고객정보가 존재하지 않습니다.");
			return;
		}
		System.out.println("삭제할 고객의 id를 입력하세요. >> ");
		String id = util.sc.next();
		util.sc.nextLine();
		if (clientDAO.getIdxById(id) != -1) {
			clientDAO.deleteAClientFromList(id);
			accountDAO.deleteAccountsFromList(id);
		}
	}

	void printClientMenu() { // 고객용 메뉴를 출력합니다.
		System.out.println("[ 고객 메뉴 ]");
		System.out.println("[1]회원가입 [2]로그인 [0]뒤로가기");
	}

	Client signIn() { // id와 pw를 입력받아 해당 객체를 리턴합니다.
		System.out.println("[ 로그인 ]");
		System.out.println("id를 입력하세요. >> ");
		Client c = clientDAO.findAClientById(util.sc.next());
		if (c != null) {
			System.out.println("pw를 입력하세요. >> ");
			String pw = util.sc.next();
			util.sc.nextLine();
			if (pw.equals(c.getPw())) {
				System.out.println("로그인에 성공했습니다.");
				return c;
			} else {
				System.out.println("로그인에 실패했습니다.");
				return null;
			}
		} else {
			System.out.println("로그인에 실패했습니다.");
			return null;
		}
	}

	void showLoginMenu(Client c) { // 로그인중일 때의 메뉴를 출력합니다.
		System.out.printf("[ %s 로그인 중 ]\n", c.getName());
		System.out.println("[1]계좌추가 [2]계좌삭제 [3]입금 [4]출금 [5]이체 [6]탈퇴 [7] 마이페이지 [0]로그아웃");
	}

	void addAnAccount(Client cl) { // 해당 객체에 계좌를 한 개 추가합니다.
		System.out.println("[ 계좌 추가하기 ]");
		System.out.println("다음과 같은 양식으로 계좌번호를 입력하세요.");
		System.out.println("nnnn-nnnn-nnnn (총 12숫자)");
		System.out.print(">> ");
		String ac = util.sc.next();
		util.sc.nextLine();
		Account foundAc = clientDAO.findAnAccountByAccNum(ac);
		if (foundAc == null) {
			if (ac.length() != 14) {
				System.out.println("계좌는 -를 포함해서 14자리 여야합니다.");
				return;
			}
			if (!ac.substring(4, 5).equals("-") || !ac.substring(9, 10).equals("-")) {
				System.out.println("-의 위치를 확인하세요.");
				return;
			}
			String part1 = ac.substring(0, 4);
			String part2 = ac.substring(5, 9);
			String part3 = ac.substring(10, 14);
			try {
				Integer.parseInt(part1);
				Integer.parseInt(part2);
				Integer.parseInt(part3);
				if (cl.getNumberOfAccounts() >= 3) {
					System.out.println("계좌는 3개를 초과할 수 없습니다.");
					return;
				}
				Account newAc = new Account();
				newAc.setId(cl.getId());
				newAc.setAccNumber(ac);
				newAc.setMoney(1000);
				cl.getAccounts()[cl.numberOfAccounts++] = newAc;
				System.out.printf("계좌 추가 성공 %s \n", ac);
			} catch (NumberFormatException e) {
				System.out.println("숫자를 입력하세요.");
			}
		} else {
			System.err.println("이미 사용중인 계좌입니다.");
		}
	}

	void deposit(Client c) { // 로그인중인 고객의 계좌에 입금합니다.
		System.out.println("입금할 계좌를 입력하세요. >> ");
		String acNum = util.sc.next();
		util.sc.nextLine();
		Account ac = clientDAO.findAnAccountByAccNum(acNum);
		if (ac != null) {
			System.out.print("입금할 금액을 입력하세요.(100원 이상) >> ");
			int money = util.sc.nextInt();
			if (money < 100) {
				System.out.println("100원 이상 입금하세요.");
				return;
			}
			ac.money += money;
			System.out.println("입금했습니다");
			System.out.printf("%s 잔고 : %d\n", ac.getAccNumber(), ac.getMoney());
		} else {
			System.out.println("찾는 계좌가 없습니다.");
		}
	}

	void withdraw(Client c) { // 로그인중인 고객의 계좌에서 출금합니다.
		System.out.println("출금할 계좌를 입력하세요. >> ");
		String acNum = util.sc.next();
		util.sc.nextLine();
		Account ac = clientDAO.findAnAccountByAccNum(acNum);
		if (ac != null) {
			System.out.print("출금할 금액을 입력하세요.(100원 이상) >> ");
			int money = util.sc.nextInt();
			if (money < 100) {
				System.out.println("100원 이상 입력하세요.");
				return;
			}
			if (money > ac.getMoney()) {
				System.out.println("잔액이 부족합니다.");
				return;
			}
			ac.money -= money;
			System.out.println("출금했습니다");
			System.out.printf("%s 잔고 : %d\n", ac.getAccNumber(), ac.getMoney());
		} else {
			System.out.println("찾는 계좌가 없습니다.");
		}
	}

	void transfer(Client c) { // 로그인중인 고객의 계좌중에서 다른 계좌로 이체합니다.
		System.out.println("이체를할 나의 계좌를 입력하세요. >> ");
		String accNum = util.sc.next();
		util.sc.nextLine();
		Account transferFrom = clientDAO.findAnAccountByAccNum(accNum);
		if (transferFrom == null) {
			System.out.println("이체할 계좌가 존재하지 않습니다.");
			return;
		}
		System.out.println("이체받을 계좌를 입력하세요. >> ");
		accNum = util.sc.next();
		util.sc.nextLine();
		Account transferTo = accountDAO.findAnAccountByAccNum(accNum);
		if (transferTo == null) {
			System.out.println("이체받을 계좌가 존재하지 않습니다.");
			return;
		}
		System.out.println(transferFrom);
		System.out.println(transferTo);
		if (transferFrom == transferTo) {
			System.out.println("이체할 계좌와 이체받을 계좌가 같을 수 없습니다.");
			return;
		}
		System.out.println("이체할 금액을 입력하세요. >> ");
		int money = util.sc.nextInt();
		if (money < 100) {
			System.out.println("100원 이상 이체할 수 있습니다.");
			return;
		}
		if (money > transferFrom.getMoney()) {
			System.out.println("잔액이 부족합니다.");
			return;
		}
		transferFrom.setMoney(transferFrom.getMoney() - money);
		transferTo.setMoney(transferTo.getMoney() + money);
		System.out.println("이체 성공");
		System.out.printf("[ %s ] 잔액 : %d\n", transferTo.getAccNumber(), transferTo.getMoney());
		System.out.printf("[ %s ] 잔액 : %d\n", transferFrom.getAccNumber(), transferFrom.getMoney());
	}

	boolean leave(Client c) { // pw를 입력받아 탈퇴합니다.
		System.out.println("pw를 입력하세요 >> ");
		String pw = util.sc.next();
		util.sc.nextLine();
		if (c.getPw().equals(pw)) {
			clientDAO.deleteAClientFromList(c.getId());
			accountDAO.deleteAccountsFromList(c.getId());
			return true;
		}
		System.out.println("pw를 확인하세요.");
		return false;
	}
	// 관리자
	// [1] 회원목록 [2]회원 수정 [3]회원 삭제 [4]데이터 저장 [5] 데이터 불러오기

	// 회원 수정 : 회원 아이디 검색 비밀번호 , 이름 수정가능
	// 회원삭제 : 회원아이디 검색
	// 데이터 저장 : account.txt , client.txt

	// 사용자메뉴
	// [1]회원가입 [2]로그인 [0] 뒤로가기

	// 회원가입 : 회원 아이디 중복 확인

	// 로그인 메뉴
	// [1]계좌추가 [2]계좌삭제 [3]입금 [4]출금 [5]이체 [6]탈퇴 [7] 마이페이지 [0]로그아웃

	// 계좌 추가 ( 숫자4개-숫자4개-숫자4개 ) 일치할때 추가 가능 : 중복확인
	// 계좌 삭제 : 본인 회원 계좌만 가능

	// 입금 : accList 에 계좌가 있을때만 입금 가능 : 100원이상 입금/이체/출금 : 계좌 잔고만큼만
	// 이체 : 이체할 계좌랑 이체받을 계좌만 일치 안하면 됨

	// 탈퇴 : 패스워드 다시 입력 -> 탈퇴 가능

	// 마이페이지 : 내계좌 목록(+ 잔고 ) 확인
	void run() {
		while (true) {
			printBankName();
			printMenu();
			int sel = util.getValue(0, 2);
			if (sel == 1) { // 관리자
				while (true) {
					printAdminMenu();
					int choice = util.getValue(0, 5);
					if (choice == 0) { // 관리자메뉴에서 뒤로가기
						break;
					} else if (choice == 1) { // 회원 목록
						clientDAO.showAllClients();
					} else if (choice == 2) { // 회원 수정
						modifyAClient();
					} else if (choice == 3) { // 회원 삭제
						deleteAClient();
					} else if (choice == 4) { // 데이터 저장
						util.save(clientDAO.clients, accountDAO.accounts);
					} else if (choice == 5) { // 데이터 로드
						String clientData = util.loadClients();
						if (clientData != null && !clientData.equals(""))
							clientDAO.putTheDataIn(clientData);
						String accountData = util.loadAccounts();
						if (accountData != null && !accountData.equals("")) {
							accountDAO.putTheDataIn(accountData);
							clientDAO.setAccountsToEachPerson(accountDAO.accounts);
						}
					}
				}
			} else if (sel == 2) { // 사용자
				while (true) {
					printClientMenu();
					int choice = util.getValue(0, 2);
					if (choice == 0) { // 종료
						break;
					} else if (choice == 1) { // 회원가입
						clientDAO.signUp();
					} else if (choice == 2) { // 로그인
						Client c = signIn();
						if (c != null) {
							while (true) {
								showLoginMenu(c);
								int input = util.getValue(0, 7);
								if (input == 0) { // 로그아웃
									break;
								} else if (input == 1) { // 계좌추가
									addAnAccount(c);
								} else if (input == 2) { // 계좌삭제
									String delAc = clientDAO.deleteAnAccount(c);
									if (delAc != null)
										accountDAO.deleteAnAccount(delAc);
								} else if (input == 3) { // 입금
									deposit(c);
								} else if (input == 4) { // 출금
									withdraw(c);
								} else if (input == 5) { // 이체
									transfer(c);
								} else if (input == 6) { // 탈퇴
									if (!leave(c)) {
										continue;
									}
									break;
								} else if (input == 7) { // 마이페이지
									accountDAO.showMyAccounts(c.getId());
								}
							}
						}
					}
				}
			} else if (sel == 0) { // 프로그램 종료
				break;
			}
		}
	}
}
