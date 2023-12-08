package ATM;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Util {
	Scanner sc;
	final String CUR_PATH = System.getProperty("user.dir") + "//src//ATM//", CLIENTS_FILE = "client.txt",
			ACCOUNTS_FILE = "account.txt";

	Util(Controller ctr) { // 생성자
		sc = new Scanner(System.in);
		tempData(ctr);
	}

	int getValue(int start, int end) { // 정수 이외의 값을 입력하면 예외처리합니다.
		while (true) {
			System.out.printf("메뉴(%d ~ %d) >> ", start, end);
			try {
				int input = sc.nextInt();
				if (input < start || input > end)
					continue;
				return input;
			} catch (Exception e) {
				System.err.println("정수를 입력하세요.");
				sc.nextLine();
			}
		}
	}

	void tempData(Controller ctr) { // 아래의 데이터를 DAO로 보냅니다.
		String userData = "1001/test01/pw1/김철수\n";
		userData += "1002/test02/pw2/이영희\n";
		userData += "1003/test03/pw3/신민수\n";
		userData += "1004/test04/pw4/최상민";
		String accountData = "test01/1111-1111-1111/8000\n";
		accountData += "test02/2222-2222-2222/5000\n";
		accountData += "test01/3333-3333-3333/11000\n";
		accountData += "test03/4444-4444-4444/9000\n";
		accountData += "test01/5555-5555-5555/5400\n";
		accountData += "test02/6666-6666-6666/1000\n";
		accountData += "test03/7777-7777-7777/1000\n";
		accountData += "test04/8888-8888-8888/1000\n";
		ctr.clientDAO.putTheDataIn(userData);
		ctr.accountDAO.putTheDataIn(accountData);
	}

	void save(Client[] clients, Account[] accounts) { // 두 배열의 데이터를 파일에 저장합니다.
		try (FileWriter fw = new FileWriter(CUR_PATH + CLIENTS_FILE);
				FileWriter fw2 = new FileWriter(CUR_PATH + ACCOUNTS_FILE)) {
			String data = "";
			String data2 = "";
			for (int i = 0; i < clients.length; i += 1) {
				data += clients[i].getClientNo() + "/" + clients[i].getId() + "/" + clients[i].getPw() + "/"
						+ clients[i].getName();
				if (i != clients.length - 1) {
					data += "\n";
				}
			}
			for (int i = 0; i < accounts.length; i += 1) {
				data2 += accounts[i].getId() + "/" + accounts[i].getAccNumber() + "/" + accounts[i].getMoney();
				if (i != accounts.length - 1) {
					data2 += "\n";
				}
			}
			fw.write(data);
			System.out.printf("%s 에 저장했습니다.\n", CLIENTS_FILE);
			fw2.write(data2);
			System.out.printf("%s 에 저장했습니다.\n", ACCOUNTS_FILE);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	void load() { // client.txt 파일에있는 데이터를 배열에 저장하고 리턴합니다.
		File file1 = new File(CUR_PATH + CLIENTS_FILE);
		if (!file1.exists()) {
			System.err.printf("%s 이 존재해야합니다.", CLIENTS_FILE);
			return;
		}
		try (FileReader fr1 = new FileReader(file1); BufferedReader br1 = new BufferedReader(fr1)) {
			int cnt = 0;
			String data = br1.readLine();
			while (true) {
				System.out.println(data);
				if (data == null) {
					break;
				}
				cnt += 1;
			}
			Client[] temp = new Client[cnt];
			for (int i = 0; i < temp.length; i += 1) {
				System.out.println(data);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
