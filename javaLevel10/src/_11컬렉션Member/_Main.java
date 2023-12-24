package _11컬렉션Member;

public class _Main {
	public static void main(String[] args) {
		Controller con = Controller.getInstance();
		while (true) {
			System.out.println("===============메뉴===============");
			System.out.println("1) 추가");
			System.out.println("2) 삭제");
			System.out.println("3) 수정");
			System.out.println("4) 출력 (id 이름순으로 출력)");
			System.out.println("5) 저장");
			System.out.println("6) 로드");
			System.out.println("0) 종료");
			int sel = Util.sc.nextInt();
			if (sel == 0) { // 종료
				Util.sc.close();
				break;
			} else if (sel == 1) { // 추가
				con.getAction("insert").excute();
			} else if (sel == 2) { // 삭제
				con.getAction("delete").excute();
			} else if (sel == 3) { // 수정
				con.getAction("modify").excute();
			} else if (sel == 4) { // 출력
				con.getAction("show").excute();
			} else if (sel == 5) { // 저장
				Util.save();
			} else if (sel == 6) { // 로드
				Util.load();
			}
		}
	}
}
