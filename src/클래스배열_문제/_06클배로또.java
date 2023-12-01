package 클래스배열_문제;

import java.util.Random;

class Lotto {
	int[] data = new int[8];
	boolean win = false;

	int[] getData() {
		return data;
	}

	void setData(int[] data) {
		this.data = data;
	}

	boolean isWin() {
		return win;
	}

	void setWin(boolean win) {
		this.win = win;
	}

	void showValues() {
		for (int i = 0; i < data.length; i += 1) {
			System.out.print(data[i] + " ");
		}
		System.out.println(win);
	}
}

class LottoSet {
	Random rn = new Random();
	Lotto[] set = new Lotto[5];

	Lotto makeALotto() {
		boolean win = false;
		int sevenCnt = 0;
		int[] tempArr = new int[8];
		for (int i = 0; i < tempArr.length; i += 1) {
			int num = rn.nextInt(1 - 0 + 1) + 0;
			if (num == 0) {
				num = 1;
			} else {
				num = 7;
			}
			if (num == 7) {
				sevenCnt += 1;
			} else {
				sevenCnt = 0;
			}
			if (sevenCnt >= 3) {
				win = true;
			}
			tempArr[i] = num;
		}
		Lotto l = new Lotto();
		l.setData(tempArr);
		l.setWin(win);
		return l;
	}

	Lotto[] makeFive() {
		Lotto[] lottoSet = new Lotto[5];
		for (int i = 0; i < 5; i += 1) {
			lottoSet[i] = makeALotto();
		}
		return lottoSet;
	}

	boolean checkOnlyOne(Lotto[] set) {
		boolean check = false;
		int cnt = 0;
		for (Lotto l : set) {
			l.showValues();

			if (l.isWin()) {
				cnt += 1;
			}
		}
		System.out.println();
		if (cnt == 1) {
			check = true;
		}
		return check;
	}

	void run() {
		while (true) {
			Lotto[] set = makeFive();
			if (checkOnlyOne(set)) {
				System.out.println("종료");
				break;
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class _06클배로또 {// 1개 게임만 당첨인 5개짜리 로또세트 완성
	public static void main(String[] args) {
		LottoSet game = new LottoSet();
		game.run();
	}
}
