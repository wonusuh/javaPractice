package _02객체지향_이론;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

class Node {
	private String front, back;

	/**
	 * @return the front
	 */
	public String getFront() {
		return front;
	}

	/**
	 * @param front the front to set
	 */
	public void setFront(String front) {
		this.front = front;
	}

	/**
	 * @return the back
	 */
	public String getBack() {
		return back;
	}

	/**
	 * @param back the back to set
	 */
	public void setBack(String back) {
		this.back = back;
	}
}

class MemoryGame {
	private ArrayList<Node> list;
	final private int SIZE;
	Scanner sc = new Scanner(System.in);
	Random rn = new Random();
	int cnt;

	public MemoryGame(int size) {
		this.SIZE = size;
	}

	private void makeAList() {
		list = new ArrayList<Node>();
		for (int i = 0; i < SIZE / 2; i += 1) {
			Node temp = new Node();
			temp.setFront((i + 1) + "");
			temp.setBack(" ");
			list.add(temp);
			list.add(temp);
		}
	}

	private void shuffleTheList() {
		for (int i = 0; i < 1000; i += 1) {
			int num = rn.nextInt((list.size() - 1) - 0 + 1) + 0;
			Node temp = list.get(0);
			list.set(0, list.get(num));
			list.set(num, temp);
		}
	}

	private void showCheat() {
		for (Node n : list) {
			System.out.printf("[%s]", n.getFront());
		}
		System.out.println();
	}

	private void printList() {
		for (Node n : list) {
			System.out.printf("[%s]", n.getBack());
		}
		System.out.println();
	}

	private boolean guess() {
		System.out.print("인덱스1 을 입력하세요. (0~9) >> ");
		int idx1 = sc.nextInt();
		System.out.print("인덱스2 를 입력하세요. (0~9) >> ");
		int idx2 = sc.nextInt();
		if (idx1 < 0 || idx1 > 9 || idx2 < 0 || idx2 > 9) {
			System.out.println("존재하지 않는 인덱스입니다.");
			return true;
		}
		if (idx1 == idx2) {
			System.out.println("같은 인덱스를 입력할 수 없습니다.");
			return true;
		}
		if (!list.get(idx1).getBack().equals(" ") || !list.get(idx2).getBack().equals(" ")) {
			System.out.println("이미 뒤집은 카드입니다.");
			return true;
		}
		String num1 = list.get(idx1).getFront();
		String num2 = list.get(idx2).getFront();
		list.get(idx1).setBack(num1);
		list.get(idx2).setBack(num2);
		if (num1.equals(num2)) {
			System.out.println("정답입니다.");
			cnt += 1;
			return true;
		} else {
			System.out.println("오답입니다.");
			printList();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			list.get(idx1).setBack(" ");
			list.get(idx2).setBack(" ");
			return false;
		}
	}

	public void run() {
		makeAList();
		shuffleTheList();
		while (true) {
			System.out.println("------------------------------------------------------------------");
			printList();
			if (cnt == 5)
				break;
			showCheat();
			guess();
		}
	}
}

public class _05기억력게임 {
	public static void main(String[] args) {
		MemoryGame mg = new MemoryGame(10);
		mg.run();
		mg.sc.close();
	}
}
