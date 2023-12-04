package _level7test;

import java.util.Random;

class Horse {
	// 경주마 한 마리
	String name = "";
	int pos = 0;
	int rank = 0;
	boolean win = false;
}

class Racing {
	// 게임 구현
	int size = 4, cntForRank = 1;
	Horse[] horses = new Horse[size];
	int line = 20;
	int track[][] = new int[size][line];
	Random rn = new Random();

	void init() {
		Horse h = new Horse();
		h.name = "a";
		horses[0] = h;

		h = new Horse();
		h.name = "b";
		horses[1] = h;

		h = new Horse();
		h.name = "c";
		horses[2] = h;

		h = new Horse();
		h.name = "d";
		horses[3] = h;

		for (int[] i : track) {// 출발선에 말들을 세우기
			i[0] = 1;
		}
	}

	void setRank(int idx, int tempRank) {
		horses[idx].rank = tempRank;
		this.cntForRank++;
	}

	void showTrack() {
		for (int i = 0; i < track.length; i += 1) {
			for (int j = 0; j < track[i].length; j += 1) {
				if (track[i][j] == 0) {
					System.out.print("[ ]");
				} else {
					System.out.printf("[%s]", horses[i].name);
				}
			}
			if (horses[i].win) {
				System.out.printf("(%d등)", horses[i].rank);
			}
			System.out.println();
		}
	}

	void moveHorses() {
		int tempRank = this.cntForRank;
		for (int i = 0; i < horses.length; i += 1) {
			int prePos = horses[i].pos;
			if (horses[i].win) {
				continue;
			}
			horses[i].pos = prePos + rn.nextInt(4 - 1 + 1) + 1;
			if (horses[i].pos >= 19) {
				horses[i].pos = 19;
				horses[i].win = true;
				setRank(i, tempRank);
			}
			track[i][horses[i].pos] = 1;
			track[i][prePos] = 0;
		}
	}

	void run() {
		init();
		while (true) {
			showTrack();
			if (this.cntForRank == 5) {
				return;
			}
			moveHorses();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class q2 {
	public static void main(String[] args) {
		Racing game = new Racing();
		game.run();
	}
}
