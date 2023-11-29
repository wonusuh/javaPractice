package 메서드_문제;

import java.util.Arrays;
import java.util.Scanner;

class Bank {
	Scanner scan = new Scanner(System.in);
	String name = "";
	String[] arAcc = { "1111", "2222", "3333", "", "" }, arPw = { "1234", "2345", "3456", "", "" };
	int[] arMoney = { 87000, 34000, 17500, 0, 0 };
	int count = 3, log = -1;

	void signUp() {
		while (true) {
			if (this.count >= 5) { // 회원수 제한
				System.err.println("회원수가 최대입니다. 더이상 가입할 수 없습니다.");
				break;
			}
			System.out.println("=====회원가입=====");
			System.out.println("id를 입력하세요. >> ");
			String id = this.scan.next();
			this.scan.nextLine();
			boolean idCheck = false;
			for (int i = 0; i < arAcc.length; i += 1) { // 중복된 아이디인지 체크하기
				if (arAcc[i].equals(id)) {
					idCheck = true;
					log = i;
				}
			}
			if (idCheck) {
				System.err.println("이미 사용중인 id입니다.");
				continue;
			}
			System.out.println("pw를 입력하세요. >> ");
			String pw = this.scan.next();
			this.scan.nextLine();
			this.arAcc[this.count] = id;
			this.arPw[this.count++] = pw;
			System.out.println(Arrays.toString(arAcc));
			System.out.println(Arrays.toString(arPw));
			break;
		}
	}

	void del() {
		for (int i = this.log; i < this.count; i += 1) {
			arAcc[i] = arAcc[i + 1];
			arPw[i] = arPw[i + 1];
			arAcc[i + 1] = "";
			arPw[i + 1] = "";
		}
		this.count -= 1;
		this.log = -1;
		System.out.println("탈퇴 완료되었습니다.");
		System.out.println(Arrays.toString(arAcc));
		System.out.println(Arrays.toString(arPw));
	}

	void signIn() {
		while (true) {
			System.out.println("=====로그인=====");
			System.out.print("id를 입력하세요. >> ");
			String id = this.scan.next();
			this.scan.nextLine();
			System.out.print("pw를 입력하세요. >> ");
			String pw = this.scan.next();
			this.scan.nextLine();
			boolean idCheck = false;
			int log = -1;
			for (int i = 0; i < arAcc.length; i += 1) { // 계좌가 존재하는지 확인하기.
				if (arAcc[i].equals(id)) {
					idCheck = true;
					log = i;
				}
			}
			boolean pwCheck = false; // 비밀번호가 맞는지 확인하기.
			if (pw.equals(arPw[log])) {
				pwCheck = true;
			}
			if (!idCheck || !pwCheck) {
				System.err.println("id와 pw를 확인하세요.");
				continue;
			}
			this.log = log;
			break;
		}
	}

	void signOut() {
		this.log = -1;
		System.out.println("로그아웃 되었습니다.");
	}

	void deposit() {
		while (true) {
			System.out.println("=====입금하기=====");
			System.out.print("입금할 금액을 입력하세요. >> ");
			int howMuch = this.scan.nextInt();
			if (howMuch <= 0) { // 0이하 입금 불가능
				System.err.println("1원 이상만 입금할 수 있습니다.");
				continue;
			}
			this.arMoney[this.log] += howMuch;
			System.out.println(Arrays.toString(arMoney));
			break;
		}
	}

	void transfer() {
		while (true) {
			System.out.print("이체받을 사람의 계좌를 입력하세요. >> ");
			String id = this.scan.next();
			this.scan.nextLine();
			if (id.equals(arAcc[this.log])) {
				System.err.println("자신에게 이체할 수 없습니다.");
				continue;
			}
			int idx = -1; // 이체받을 사람의 계좌가 있는지 없는지
			for (int i = 0; i < this.arAcc.length; i += 1) {
				if (this.arAcc[i].equals(id)) {
					idx = i;
					break;
				}
			}
			if (idx == -1) {
				System.err.println("존재하지 않는 계좌입니다.");
				continue;
			}
			System.out.print("이체할 금액을 입력하세요. >> ");
			int howMuch = this.scan.nextInt();
			if (howMuch > this.arMoney[this.log]) {
				System.err.println("잔액부족");
				continue;
			}
			this.arMoney[this.log] -= howMuch;
			this.arMoney[idx] += howMuch;
			System.out.println(Arrays.toString(arMoney));
			break;
		}
	}

	void run() {
		while (true) {
			System.out.println("=====" + this.name + "=====");
			if (this.log == -1) {
				System.out.println("1.회원가입");
				System.out.println("3.로그인");
			} else {
				System.out.printf("[ %s ] 로그인 중\n", this.arPw[this.log]);
				System.out.println("2.회원탈퇴");
				System.out.println("4.로그아웃");
				System.out.println("5.입금하기");
				System.out.println("6.이체하기");
			}
			System.out.print("0.종료 ");
			int sel = this.scan.nextInt();
			if (sel == 0) { // 종료
				break;
			} else if (sel == 1 && this.log == -1) { // 회원가입
				signUp();
			} else if (sel == 2 && this.log != -1) { // 회원탈퇴
				del();
			} else if (sel == 3 && this.log == -1) { // 로그인
				signIn();
			} else if (sel == 4 && this.log != -1) { // 로그아웃
				signOut();
			} else if (sel == 5 && this.log != -1) { // 입금하기
				deposit();
			} else if (sel == 6 && this.log != -1) { // 이체하기
				transfer();
			}
		}
	}
}

public class _10메서드ATM {
	public static void main(String[] args) {
		Bank bank = new Bank();
		bank.name = "더조은은행";
		bank.run();
		bank.scan.close();
	}
}
