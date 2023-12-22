package _11컬렉션Member;

public class ActionInsert implements Action {
	@Override
	public void excute() { // 멤버 추가하는 페이지입니다.
		System.out.println("[ 멤버를 추가합니다. ]");
		MemberDAO dao = MemberDAO.getInstance();
		System.out.println("아이디입력");
		String id = Util.sc.next();
		System.out.println("비밀번호 입력 >> ");
		String pw = Util.sc.next();
		dao.insertMember(id, pw);
	}
}
