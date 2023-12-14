package _02객체지향_이론;

import java.util.ArrayList;
import java.util.Scanner;

class Node3 {
	private String mark;

	/**
	 * @return the mark
	 */
	public String getMark() {
		return mark;
	}

	/**
	 * @param mark the mark to set
	 */
	public void setMark(String mark) {
		this.mark = mark;
	}
}

class Player {
	private String name, mark;

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the mark
	 */
	public String getMark() {
		return mark;
	}

	/**
	 * @param mark the mark to set
	 */
	public void setMark(String mark) {
		this.mark = mark;
	}
}

class TicTacToe {
	private ArrayList<Player> pList; // 2개
	private ArrayList<ArrayList<Node3>> list; // 3칸짜리 3개
	private Player player; // 현재 플레이어 정보
	private Scanner sc;
	private final int SIZE = 3;
	private int cnt;
	private String condition;

	public TicTacToe() {
		pList = new ArrayList<Player>();
		sc = new Scanner(System.in);
		condition = "";
	}

	private void init() {
		pList.add(new Player());
		pList.add(new Player());
		pList.get(0).setName("p1");
		pList.get(0).setMark("[O]");
		pList.get(1).setName("p2");
		pList.get(1).setMark("[X]");
		this.player = pList.get(0);
		list = new ArrayList<ArrayList<Node3>>();
		for (int i = 0; i < SIZE; i += 1) {
			list.add(new ArrayList<Node3>());
			for (int j = 0; j < SIZE; j += 1) {
				Node3 n = new Node3();
				n.setMark("[ ]");
				list.get(i).add(n);
			}
		}
	}

	private void printGame() {
		for (ArrayList<Node3> i : list) {
			for (Node3 j : i) {
				System.out.print(j.getMark());
			}
			System.out.println();
		}
	}

	private void printCurPlayer() {
		System.out.printf("[%s]의 턴 입니다.\n", player.getName());
	}

	private void writeOX() {
		System.out.println("y좌표를 입력하세요.(1~3) >> ");
		int y = sc.nextInt() - 1;
		System.out.println("x좌표를 입력하세요.(1~3) >> ");
		int x = sc.nextInt() - 1;
		if (y < 0 || x < 0 || y > SIZE - 1 || x > SIZE - 1) {
			System.err.println("좌표의 범위를 확인하세요.");
			return;
		}
		if (!list.get(y).get(x).getMark().equals("[ ]")) {
			System.out.println("이미 표기된 자리입니다.");
			return;
		}
		list.get(y).get(x).setMark(player.getMark());
		cnt += 1;
	}

	private void changeTurn() {
		if (player.getName().equals("p1")) {
			player = pList.get(1);
		} else {
			player = pList.get(0);
		}
	}

	private boolean checkBackSlash() {
		if (!list.get(0).get(0).getMark().equals("[ ]")
				&& list.get(0).get(0).getMark().equals(list.get(1).get(1).getMark())
				&& list.get(1).get(1).getMark().equals(list.get(2).get(2).getMark())) {
			condition = "\\";
			return true;
		}
		return false;
	}

	private boolean checkSlash() {
		if (!list.get(0).get(2).getMark().equals("[ ]")
				&& list.get(0).get(2).getMark().equals(list.get(1).get(1).getMark())
				&& list.get(1).get(1).getMark().equals(list.get(2).get(0).getMark())) {
			condition = "/";
			return true;
		}
		return false;
	}

	private boolean checkHorizon() {
		for (int i = 0; i < SIZE; i += 1) {
			if (!list.get(i).get(0).getMark().equals("[ ]")
					&& list.get(i).get(0).getMark().equals(list.get(i).get(1).getMark())
					&& list.get(i).get(1).getMark().equals(list.get(i).get(2).getMark())) {
				condition = "가로";
				return true;
			}
		}
		return false;
	}

	private boolean checkVertical() {
		for (int i = 0; i < SIZE; i += 1) {
			if (!list.get(0).get(i).getMark().equals("[ ]")
					&& list.get(0).get(i).getMark().equals(list.get(1).get(i).getMark())
					&& list.get(1).get(i).getMark().equals(list.get(2).get(i).getMark())) {
				condition = "세로";
				return true;
			}
		}
		return false;
	}

	public void run() {
		init();
		while (true) {
			printGame();
			if (checkBackSlash() || checkSlash() || checkHorizon() || checkVertical()) {
				changeTurn();
				System.out.printf("%s 이 %s 의 조건으로 승리했습니다.", player.getName(), condition);
				break;
			}
			if (cnt >= 9) {
				System.out.println("비겼습니다.");
				break;
			}
			printCurPlayer();
			writeOX();
			changeTurn();
		}
		sc.close();
	}
}

public class _09틱택토 {
	public static void main(String[] args) {
		TicTacToe ttt = new TicTacToe();
		ttt.run();
	}
}
