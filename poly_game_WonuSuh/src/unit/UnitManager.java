package unit;

import java.util.ArrayList;
import java.util.Random;

public class UnitManager {
	public ArrayList<Player> player_list = new ArrayList<>();
	public ArrayList<Unit> mon_list = new ArrayList<>();
	private String path = Unit.class.getPackageName() + ".";
	String mons[] = { "UnitWolf", "UnitBat", "UnitOrc" };
	Random ran = new Random();

	public UnitManager() {
		player_list.add(new UnitWarrior("전사", 1000, 45));
		player_list.add(new UnitMage("마법사", 800, 60));
		player_list.add(new UnitHealer("힐러", 500, 70));
	}

	public void monster_rand_set(int size) {
		for (int i = 0; i < size; i++) {
			int num = ran.nextInt(mons.length);
			try {
				Class<?> clazz = Class.forName(path + mons[num]);
				Object obj = clazz.getDeclaredConstructor().newInstance(); // clazz.newInstance();
				Unit temp = (Unit) obj;
				int hp = ran.nextInt(1000) + 1000;
				int pow = ran.nextInt(10) + 10;
				temp.init(hp, pow);
				mon_list.add(temp);
			} catch (Exception e) {
				e.printStackTrace();
			}
			// System.out.println(mon_list.get(i).name);
		}
	}

}