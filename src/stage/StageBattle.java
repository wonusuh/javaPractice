package stage;

import java.util.ArrayList;

import controller.GameManager;
import unit.Player;
import unit.Unit;
import unit.UnitBat;
import unit.UnitHealer;
import unit.UnitMage;
import unit.UnitManager;
import unit.UnitOrc;
import unit.UnitWarrior;
import unit.UnitWolf;

public class StageBattle implements Stage {
	private UnitManager unitManager = new UnitManager();
	private ArrayList<Player> playerList = null;
	private ArrayList<Unit> monList = null;
	private int monDead = 0, playerDead = 0;

	public void init() {
		unitManager.mon_list.clear();
		unitManager.monster_rand_set(4);
		playerList = null;
		playerList = unitManager.player_list;
		monList = null;
		monList = unitManager.mon_list;
		monDead = monList.size();
		playerDead = playerList.size();
	}

	private void print_character() {
		System.out.println("======[BATTLE]======");
//		System.out.println(playerSize + " " + monSize);
		System.out.println("======[PLAYER]======");
		for (int i = 0; i < playerList.size(); i++) {
			playerList.get(i).printData();
		}
		System.out.println("======[MONSTER]======");
		for (int i = 0; i < monList.size(); i++) {
			monList.get(i).printData();
		}
	}

	private void player_attack(int index) {
		Player p = playerList.get(index);
		if (p.getCurhp() <= 0)
			return;
		if (p.getState().equals("기절")) {
			System.out.println(p.getName() + " 은 기절이라 아무 행동도 할 수 없습니다.");
			p.setState("노말");
			return;
		}
		System.out.println("======[메뉴 선택]=====");
		System.out.println("[" + p.getName() + "] [1.어택] [2.스킬]");
		if (p.getState().equals("침묵"))
			System.out.println(p.getName() + " 은 침묵중이라 스킬을 사용할 수 없습니다.");
		int sel = GameManager.sc.nextInt();
		if (p.getState().equals("침묵")) {
			if (sel == 2) {
				sel = 1;
				p.setState("노말");
			}
		}
		if (sel == 1) {
			while (true) {
				int idx = GameManager.rn.nextInt(monList.size());
				if (monList.get(idx).getCurhp() > 0) {
					p.attack(monList.get(idx));
					break;
				}
			}
		} else if (sel == 2) {
			if (p instanceof UnitWarrior) {
				UnitWarrior warrior = (UnitWarrior) p;
				while (true) {
					int idx = GameManager.rn.nextInt(monList.size());
					if (monList.get(idx).getCurhp() > 0) {
						warrior.skill(monList.get(idx));
						break;
					}
				}
			} else if (p instanceof UnitMage) {
				UnitMage mage = (UnitMage) p;
				mage.skill(monList);
			} else if (p instanceof UnitHealer) {
				UnitHealer healer = (UnitHealer) p;
				healer.skill(playerList);
			}
		}
	}

	private void monster_attack(int index) {
		Unit m = monList.get(index);
		if (m.getCurhp() <= 0)
			return;
		while (true) {
			int idx = GameManager.rn.nextInt(playerList.size());
			if (playerList.get(idx).getCurhp() > 0) {
				int ran = GameManager.rn.nextInt(2);
				if (ran == 0) {
					m.attack(playerList.get(idx));
				} else if (ran == 1) {
					if (m instanceof UnitOrc) {
						UnitOrc orc = (UnitOrc) m;
						orc.skill(playerList.get(idx));
					} else if (m instanceof UnitWolf) {
						UnitWolf wolf = (UnitWolf) m;
						wolf.skill(playerList);
					} else if (m instanceof UnitBat) {
						UnitBat bat = (UnitBat) m;
						bat.skill(playerList.get(idx));
					}
				}
				break;
			}
		}
	}

	private void check_live() {
		int num = 0;
		for (int i = 0; i < playerList.size(); i++) {
			if (playerList.get(i).getCurhp() <= 0) {
				num += 1;
			}
		}
		playerDead = playerList.size() - num;
		num = 0;
		for (int i = 0; i < monList.size(); i++) {
			if (monList.get(i).getCurhp() <= 0) {
				num += 1;
			}
		}
		monDead = monList.size() - num;
	}

	public boolean update() {
		boolean run = true;
		int p_index = 0;
		int m_index = 0;
		boolean turn = true;
		while (run) {
			// print_character();
			if (turn) {
				print_character();
				if (p_index < playerList.size()) {
					player_attack(p_index);
					p_index += 1;
				} else {
					turn = !turn;
					p_index = 0;
				}
			} else if (!turn) {
				if (m_index < monList.size()) {
					monster_attack(m_index);
					m_index += 1;
				} else {
					turn = !turn;
					m_index = 0;
				}
			}
			check_live();
			if (monDead <= 0 || playerDead <= 0)
				break;
		}
		GameManager.nextStage = "LOBBY";
		return false;
	}
}
