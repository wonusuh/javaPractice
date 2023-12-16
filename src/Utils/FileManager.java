package Utils;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import dao.CartDAO;
import dao.ItemDAO;
import dao.UserDAO;

public class FileManager {
	// cart.txt
	// user.txt
	// item.txt
	private static final FileManager INSTANCE = new FileManager();
	private final String CUR_PATH;
	private final String ITEM_FILE;
	private final String USER_FILE;
	private final String CART_FILE;

	private FileManager() { // 싱글턴패턴의 생성자 입니다.
		CUR_PATH = System.getProperty("user.dir") + "//src//data//";
		ITEM_FILE = "item.txt";
		USER_FILE = "user.txt";
		CART_FILE = "cart.txt";
	}

	public static FileManager getInstance() { // 인스턴스는 단 하나만 존재하며, 그 인스턴스의 주소를 리턴합니다.
		return INSTANCE;
	}

	public void loadData(ItemDAO itemDAO, UserDAO userDAO, CartDAO cartDAO) { // 파일들을 읽어서 data를 각각의 DAO로 보냅니다.
		String itemData = readTxtFile(ITEM_FILE);
		String userData = readTxtFile(USER_FILE);
		String cartData = readTxtFile(CART_FILE);
		itemDAO.putDataIn(itemData);
		userDAO.putDataIn(userData);
		cartDAO.putDataIn(cartData);
	}

	private String readTxtFile(String fileName) { // 파일을 읽어서 String으로 리턴합니다.
		String data = "";
		try (FileReader fr = new FileReader(CUR_PATH + fileName); BufferedReader br = new BufferedReader(fr)) {
			while (true) {
				String oneLine = br.readLine();
				if (oneLine == null) {
					break;
				}
				data += oneLine + "\n";
			}
			data = data.substring(0, data.length() - 1);
//			System.out.println(fileName + " 로드했습니다.");
		} catch (FileNotFoundException e) {
			System.out.printf("%s 파일이 존재하지 않습니다.\n", fileName);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return data;
	}
}
