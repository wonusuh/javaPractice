package controller;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

import stage.Stage;
import stage.StageBattle;
import stage.StageLobby;
import stage.StageTitle;

public class GameManager {
	public static Scanner sc = new Scanner(System.in);
	public static Random rn = new Random();
	public static String nextStage = "";
	private String curStage = "";
	private Map<String, Stage> stageList;

	private GameManager() {
		stageList = new HashMap<String, Stage>();
		stageList.put("TITLE", new StageTitle());
		stageList.put("LOBBY", new StageLobby());
		stageList.put("BATTLE", new StageBattle());
		nextStage = "TITLE";
	}

	private static GameManager instance = new GameManager();

	public static GameManager getInstance() {
		return instance;
	}

	public boolean changeStage() {
		System.out.println("curStage : " + curStage);
		System.out.println("nextStage : " + nextStage);
		if (curStage.equals(nextStage))
			return true;
		curStage = nextStage;
		Stage stage = stageList.get(curStage);
		stage.init();
		boolean run = true;
		while (true) {
			run = stage.update();
			if (!run)
				break;
		}
		if (nextStage.equals(""))
			return false;
		else
			return true;
	}
}
