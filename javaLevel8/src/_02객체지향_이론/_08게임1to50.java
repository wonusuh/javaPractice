package _02객체지향_이론;

import java.util.ArrayList;
import java.util.Random;

class Node2 {
	private int num;

	/**
	 * @return the num
	 */
	public int getNum() {
		return num;
	}

	/**
	 * @param num the num to set
	 */
	public void setNum(int num) {
		this.num = num;
	}
}

class Game1to50 {
	ArrayList<ArrayList<Node2>> list;
	private final int SIZE = 25;
	private int cnt = 1;

	private void init() {
		Random rn = new Random();
		int[] arr25 = new int[SIZE];
		int num = 1;
		for (int i = 0; i < SIZE; i += 1) {
			arr25[i] = num++;
		}
		for (int i = 0; i < 5000; i += 1) {
			int rnNum = rn.nextInt((arr25.length - 1) - 0 + 1) + 0;
			int temp = arr25[0];
			arr25[0] = arr25[rnNum];
			arr25[rnNum] = temp;
		}
		list = new ArrayList<ArrayList<Node2>>();
		for (int i = 0; i < 5; i += 1) {
			list.add(new ArrayList<Node2>());
			for (int j = 0; j < 5; j += 1) {
				Node2 n = new Node2();
				n.setNum(arr25[(i * 5) + j]);
				list.get(i).add(n);
			}
		}
	}

	private void printGame() {
		for (ArrayList<Node2> i : list) {
			for (Node2 j : i) {
				if (j.getNum() == 0) {
					System.out.print("[  ]");
				} else {
					System.out.printf("[%-2d]", j.getNum());
				}
			}
			System.out.println();
		}
		System.out.println("------------------------------");
	}

	private void write() {
		for (ArrayList<Node2> i : list) {
			for (Node2 j : i) {
				if (j.getNum() == cnt) {
					int num = j.getNum() + 25;
					if (num > 50)
						num = 0;
					j.setNum(num);
					cnt += 1;
					return;
				}
			}
		}
	}

	public void run() {
		init();
		while (true) {
			printGame();
			if (cnt >= 51)
				break;
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			write();
		}
	}
}

public class _08게임1to50 {
	public static void main(String[] args) {
		Game1to50 game = new Game1to50();
		game.run();
	}
}
