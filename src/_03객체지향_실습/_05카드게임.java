package _03객체지향_실습;

import java.util.Arrays;
import java.util.Random;

class Card {
	private int num;
	private String shape;
	public static String[] shapes = { "♡", "◇", "♣", "♠" };

//	private static int garoSize = 150;
//	private static int seroSize = 200;
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

	/**
	 * @return the shape
	 */
	public String getShape() {
		return shape;
	}

	/**
	 * @param shape the shape to set
	 */
	public void setShape(String shape) {
		this.shape = shape;
	}
}

class Player1 {
	private String name;
	private Card card1, card2;

	/**
	 * @return the card1
	 */
	public Card getCard1() {
		return card1;
	}

	/**
	 * @param card1 the card1 to set
	 */
	public void setCard1(Card card1) {
		this.card1 = card1;
	}

	/**
	 * @return the card2
	 */
	public Card getCard2() {
		return card2;
	}

	/**
	 * @param card2 the card2 to set
	 */
	public void setCard2(Card card2) {
		this.card2 = card2;
	}

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
}

class GameManager {
	Card[] deck = new Card[40];
	Player1 p3, p4;
	Player1 winner;

	private void createPlayers() {
		p3 = new Player1();
		p4 = new Player1();
		p3.setName("p3");
		p4.setName("p4");
	}

	private void createCards() {
		for (int i = 0; i <= 9; i += 1) {
			Card c = new Card();
			c.setNum(i + 1);
			c.setShape(Card.shapes[0]);
			deck[i] = c;
		}
		for (int i = 10; i <= 19; i += 1) {
			Card c = new Card();
			c.setNum(i + 1 - 10);
			c.setShape(Card.shapes[1]);
			deck[i] = c;
		}
		for (int i = 20; i <= 29; i += 1) {
			Card c = new Card();
			c.setNum(i + 1 - 20);
			c.setShape(Card.shapes[2]);
			deck[i] = c;
		}
		for (int i = 30; i <= 39; i += 1) {
			Card c = new Card();
			c.setNum(i + 1 - 30);
			c.setShape(Card.shapes[3]);
			deck[i] = c;
		}
	}

	private void shuffleTheDeck() {
		Random rn = new Random();
		for (int i = 0; i < 40 * 40; i += 1) {
			int num = rn.nextInt((deck.length - 1) - 0 + 1) + 0;
			Card temp = deck[0];
			deck[0] = deck[num];
			deck[num] = temp;
		}
		for (Card c : deck) {
			System.out.printf("%s%d ", c.getShape(), c.getNum());
		}
	}

	private void give2cardsToEachPlayer() {
		p3.setCard1(deck[0]);
		p4.setCard1(deck[1]);
		p3.setCard2(deck[2]);
		p4.setCard2(deck[3]);
	}

	private void showTheirCards() {

		// 테스트용 "♡", "◇", "♣", "♠"
		p3.getCard1().setNum(8);
		p4.getCard1().setNum(8);
		p3.getCard2().setNum(1);
		p4.getCard2().setNum(1);
		p3.getCard1().setShape("♡");
		p4.getCard1().setShape("◇");
		p3.getCard2().setShape("♠");
		p4.getCard2().setShape("♣");
		// 테스트용

		System.out.println();
		System.out.println("==========");
		System.out.printf("%s(%s:%d %s:%d)\n", p3.getName(), p3.getCard1().getShape(), p3.getCard1().getNum(),
				p3.getCard2().getShape(), p3.getCard2().getNum());
		System.out.printf("%s(%s:%d %s:%d)\n", p4.getName(), p4.getCard1().getShape(), p4.getCard1().getNum(),
				p4.getCard2().getShape(), p4.getCard2().getNum());
		System.out.println("==========");
	}

	private Player1 compareTheShape(Player1 p3, Player1 p4) {
		System.out.println("모양비교");
		int[] p3c1p3c2p4c1p4c2 = new int[4];
		for (int i = 0; i < Card.shapes.length; i += 1) {
			if (p3.getCard1().getShape().equals(Card.shapes[i])) {
				p3c1p3c2p4c1p4c2[0] = i + 1;
				break;
			}
		}
		for (int i = 0; i < Card.shapes.length; i += 1) {
			if (p4.getCard1().getShape().equals(Card.shapes[i])) {
				p3c1p3c2p4c1p4c2[1] = i + 1;
				break;
			}
		}
		for (int i = 0; i < Card.shapes.length; i += 1) {
			if (p3.getCard2().getShape().equals(Card.shapes[i])) {
				p3c1p3c2p4c1p4c2[2] = i + 1;
				break;
			}
		}
		for (int i = 0; i < Card.shapes.length; i += 1) {
			if (p4.getCard2().getShape().equals(Card.shapes[i])) {
				p3c1p3c2p4c1p4c2[3] = i + 1;
				break;
			}
		}
		System.out.println("test " + Arrays.toString(p3c1p3c2p4c1p4c2));
		int max = 0, idx = -1;
		for (int i = 0; i < p3c1p3c2p4c1p4c2.length; i += 1) {
			if (p3c1p3c2p4c1p4c2[i] > max) {
				max = p3c1p3c2p4c1p4c2[i];
				idx = i;
			}
		}
		if (idx == 0 || idx == 2) {
			return p3;
		} else {
			return p4;
		}
	}

	private Player1 findMax(Player1 p3, Player1 p4) {
		System.out.println("숫자비교");
		int max = 0, idx = -1;
		for (int i = 0; i < 4; i += 1) {
			if (deck[i].getNum() > max) {
				max = deck[i].getNum();
				idx = i;
			}
		}
		if (idx == 0 || idx == 2) {
			return p3;
		} else {
			return p4;
		}
	}

	private void letKnowTheWinner() {
		if (p3.getCard1().getNum() + p3.getCard2().getNum() == p4.getCard1().getNum() + p4.getCard2().getNum()) {
			if (p3.getCard1().getNum() != p3.getCard2().getNum() && p3.getCard2().getNum() != p4.getCard1().getNum()
					&& p4.getCard1().getNum() != p4.getCard2().getNum()
					&& p4.getCard2().getNum() != p3.getCard1().getNum()) {
				winner = findMax(p3, p4);
			} else {
				winner = compareTheShape(p3, p4);
			}
		} else {
			if (p3.getCard1().getNum() + p3.getCard2().getNum() > p4.getCard1().getNum() + p4.getCard2().getNum()) {
				winner = p3;
			} else {
				winner = p4;
			}
		}
		System.out.printf("%s 이 승리\n", winner.getName());
		System.out.println("==========");
	}

	public void run() {
		while (true) {
			createPlayers();
			createCards();
			shuffleTheDeck();
			give2cardsToEachPlayer();
			showTheirCards();
			letKnowTheWinner();
			if (p3.getCard1().getNum() + p3.getCard2().getNum() == p4.getCard1().getNum() + p4.getCard2().getNum())
				break;
		}
	}
}

public class _05카드게임 {
	public static void main(String[] args) {
		GameManager gm = new GameManager();
		gm.run();
	}
}
