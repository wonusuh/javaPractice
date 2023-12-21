package _11컬렉션Member;

import java.util.HashMap;
import java.util.Map;

public class Controller { // 화면 -> url DAO 연결해주는 클래스
	private Controller() {
		init();
	}

	private static Controller instance = new Controller();

	public static Controller getInstance() {
		return instance;
	}

	private Map<String, Action> mapList;

	private void init() {
		mapList = new HashMap<String, Action>();
		mapList.put("insert", new ActionInsert());
		mapList.put("delete", new ActionDelete());
		mapList.put("modify", new ActionModify());
		mapList.put("show", new ActionShow());
	}

	public Action getAction(String key) {
		return mapList.get(key);
	}
}
