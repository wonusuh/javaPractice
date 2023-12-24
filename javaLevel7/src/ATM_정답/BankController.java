package ATM_정답;

public class BankController {
	 AccountDAO aDAO;
	 ClientDAO cDAO;
	 Util util;
	 final String NAME="우리은행";
	BankController() {
		aDAO=new AccountDAO();
		cDAO=new ClientDAO();
		util=new Util();
		//util.tempData(cDAO, aDAO);
		//cDAO.printAllClient();
		//aDAO.printAllAcc();
		mainMenu();
	}
	void mainMenu() {
		while (true) {
			System.out.println("==["+NAME+" ATM]==");
			System.out.println("[1] 관리자");
			System.out.println("[2] 사용자");
			System.out.println("[0] 종료");
			int sel = util.getValue("메뉴", 0, 2);
			if (sel == 0) {
				System.err.println("["+NAME+" ATM 종료]");
				return;
			} else if (sel == 1) {
				adminMenu();
			} else if (sel == 2){
				userMenu();
			}
		}
	}
	void adminMenu() {
		while (true) {
			System.out.println("==[" + NAME + " 관리자]==");
			System.out.println("[1] 회원목록");
			System.out.println("[2] 회원정보 수정");
			System.out.println("[3] 회원정보 삭제");
			System.out.println("[4] 은행 데이터 저장");
			System.out.println("[5] 은행 데이터 불러오기");
			System.out.println("[6] 전체계좌목록");
			System.out.println("[0] 뒤로가기");
			int sel = util.getValue("", 0, 6);
			if (sel == 0) {
				return;
			} else if (sel == 1) {
				System.out.println("[회원목록]");
				cDAO.showAllClient();
			} else if (sel == 2) {
				System.out.println("[회원정보 수정]");
				cDAO.modifyClient();
			} else if (sel == 3) {
				System.out.println("[회원정보 삭제]");
				cDAO.deleteClient(aDAO);
			} else if (sel == 4) {
				System.out.println("[은행 데이터 저장]");
				util.saveToFile(cDAO, aDAO);
			} else if (sel == 5) {
				System.out.println("[은행 데이터 불러오기]");
				util.loadFromFile(cDAO, aDAO);
			} else if(sel == 6) {
				System.out.println("[전체 계좌 목록]");
				aDAO.printAllAcc();
			}
		}
	}
	 void userMenu() {
		while(true) {
			System.out.println("==["+NAME+" 사용자]==");
			System.out.println("[1] 회원가입");
			System.out.println("[2] 로그인");
			System.out.println("[0] 뒤로가기");
			int sel=util.getValue("",0,2);
			if(sel==0) {
				return;
			}else if(sel==1) {
				System.out.println("[회원가입]");
				cDAO.joinClient();
			}else if(sel==2) {
				System.out.println("[로그인]");
				if(cDAO.loginClient()) {
					loginUserMenu();
				}
			}
		}
	}
	 void loginUserMenu() {
		while(true) {
			System.out.println("==["+NAME+" ATM]==");
			aDAO.printClientAccount(cDAO.log);
			System.out.println("[1] 계좌 추가");
			System.out.println("[2] 계좌 삭제");
			System.out.println("[3] 입금");
			System.out.println("[4] 출금");
			System.out.println("[5] 이체");
			System.out.println("[6] 탈퇴 ");
			System.out.println("[7] 마이페이지");
			System.out.println("[0] 로그아웃");
			int sel=util.getValue("",0,7);
			if(sel==0) {
				cDAO.log=null;
				return;
			}else if(sel==1) {
				System.out.println("[ 계좌 추가 ]");
				aDAO.addClientAccount(cDAO.log);
			}else if(sel==2) {
				System.out.println("[ 계좌 삭제 ]");
				aDAO.deleteClientAcount(cDAO.log);
			}else if(sel==3) {
				System.out.println("[ 입 금 ]");
				aDAO.depositMoney(cDAO.log);
			}else if(sel==4) {
				System.out.println("[ 출 금 ]");
				aDAO.withdrawMoney(cDAO.log);
			}else if(sel==5) {
				System.out.println("[ 이 체 ]");
				aDAO.transferMoney(cDAO.log);
			}else if(sel==6) {
				System.out.println("[ 탈 퇴 ]");
				if(cDAO.deleteLogClident(aDAO))return;
			}else if(sel==7) {
				System.out.println("[ 마이페이지 ]");
				aDAO.showLogAccount(cDAO.log);
			}
		}
	}

	
	
}
