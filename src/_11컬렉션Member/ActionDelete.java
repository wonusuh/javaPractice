package _11컬렉션Member;

public class ActionDelete implements Action {
	@Override
	public void excute() { // 멤버를 삭제하는 페이지입니다.
		System.out.println("[ 멤버를 삭제합니다. ]");
		MemberDAO c = MemberDAO.getInstance();
		System.out.println("삭제할 id를 입력하세요. >> ");
		String id = Util.sc.next();
		System.out.println("pw를 입력하세요. >> ");
		String pw = Util.sc.next();
		c.deleteMember(id, pw);
	}
}
