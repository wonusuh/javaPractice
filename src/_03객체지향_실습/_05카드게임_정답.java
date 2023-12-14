//// 객체 
//// static 변수(클래스변수) : 공통 속성 
//// non-static 변수(인스턴스변수) : 개별속성
//
//import java.util.Random;
//
//// 7 + 3 (승리)
//// 5 + 5 
////♡ 5 + ◇ 5
////♣ 5 + ♠ 5 (승리)
//
//class Card {
//	// 포커카드
//	// 개별적인 속성
//	private int num;
//	private String shape;
//
//	// 공통적인 속성 // new String[4];
//	private static String[] shapes = { "♡", "◇", "♣", "♠" };
//	private static int garoSize = 150;
//	private static int seroSize = 200;
//
//	public Card(String shape, int num) {
//		this.num = num;
//		this.shape = shape;
//	}
//
//	public int getNum() {
//		return num;
//	}
//
//	public String getShape() {
//		return shape;
//	}
//
//	public static String getShape(int idx) {
//		if (idx < 0 || idx >= shapes.length)
//			idx = 0;
//		return shapes[idx];
//	}
//
//	public int getShapeIdx() {
//		for (int i = 0; i < shapes.length; i += 1) {
//			if (shape.equals(shapes[i])) {
//				return i;
//			}
//		}
//		return 0;
//	}
//
//	@Override
//	public String toString() {
//		return "%s %d".formatted(shape, num);
//	}
//
//}
//
//class Player1 {
//	private String name;
//	private Card c1;
//	private Card c2;
//
//	public Player1(String name, Card c1, Card c2) {
//		this.name = name;
//		this.c1 = c1;
//		this.c2 = c2;
//	}
//
//	public String getName() {
//		return name;
//	}
//
//	public Card getCard1() {
//		return c1;
//	}
//
//	public Card getCard2() {
//		return c2;
//	}
//
//	@Override
//	public String toString() {
//		return "%s (%s : %s )".formatted(name, c1, c2);
//	}
//
//	public int getCardsSum() {
//		return c1.getNum() + c2.getNum();
//	}
//
//	public Card getAHighCard() {
//		Card card = c1.getNum() > c2.getNum() ? c1 : c2;
//		return card;
//	}
//
//	public int getAHighShape() {
//		int idx = c1.getShapeIdx() > c2.getShapeIdx() ? c1.getShapeIdx() : c2.getShapeIdx();
//		return idx;
//	}
//
//}
//
//class GameManager {
//
//	private Card[] deck = new Card[40]; // 1-10 카드
//	private Player1 p1;
//	private Player1 p2;
//	private Player1 winner;
//
//	private void createDeck() {
//		int idx = 0;
//		for (int i = 0; i < 4; i += 1) {
//			for (int k = 1; k <= 10; k += 1) {
//				Card c = new Card(Card.getShape(i), k);
//				deck[idx++] = c;
//			}
//		}
//	}
//
//	private void printDeck() {
//		for (Card c : deck) {
//			System.out.println(c);
//		}
//	}
//
//	private void setPlayers() {
//		p1 = new Player1("p1", deck[0], deck[1]);
//		p2 = new Player1("p2", deck[2], deck[3]);
//	}
//
//	private void suffleDeck() {
//		Random rd = new Random();
//		for (int i = 0; i < 1000; i += 1) {
//			int rIdx = rd.nextInt(deck.length);
//
//			Card temp = deck[0];
//			deck[0] = deck[rIdx];
//			deck[rIdx] = temp;
//		}
//	}
//
//	private void checkWin() {
//		winner = p1.getCardsSum() > p2.getCardsSum() ? p1 : p2;
//
//		if (p1.getCardsSum() == p2.getCardsSum()) {
//
//			Card p1Card = p1.getAHighCard();
//			Card p2Card = p2.getAHighCard();
//
//			winner = p1Card.getNum() > p2Card.getNum() ? p1 : p2;
//
//			if (p1Card.getNum() == p2Card.getNum()) {
//				winner = p1.getAHighShape() > p2.getAHighShape() ? p1 : p2;
//			}
//
//		}
//
//	}
//
//	private void setTempPlayer() {
//		Card card1 = new Card(Card.getShape(3), 5);
//		Card card2 = new Card(Card.getShape(1), 5);
//		Card card3 = new Card(Card.getShape(0), 5);
//		Card card4 = new Card(Card.getShape(2), 5);
//
//		p1 = new Player1("p3", card1, card2);
//		p2 = new Player1("p4", card3, card4);
//	}
//
//	private void printPlayers() {
//		System.out.println("==========");
//		System.out.println(p1);
//		System.out.println(p2);
//		System.out.println("==========");
//	}
//
//	private void printWinner() {
//		System.out.println(winner.getName() + " 승리!!!");
//	}
//
//	public void playGame() {
//		createDeck();
//		suffleDeck();
//		printDeck();
//		setPlayers();
//		setTempPlayer();
//		printPlayers();
//		checkWin();
//		printWinner();
//	}
//}
//
//public class _05카드게임_정답 {
//	public static void main(String[] args) {
//		GameManager gm = new GameManager();
//		gm.playGame();
//	}
//}
