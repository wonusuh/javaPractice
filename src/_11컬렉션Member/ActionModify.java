package _11컬렉션Member;

public class ActionModify implements Action {
	@Override
	public void excute() { // 멤버정보를 수정하는 페이지 입니다.
		System.out.println("[ 멤버의 pw를 수정합니다. ]");
		MemberDAO dao = MemberDAO.getInstance();
		if (dao.getMemberList().size() == 0) {
			System.out.println("멤버가 존재하지 않습니다.");
			return;
		}
		System.out.println("id를 입력하세요. >> ");
		String id = Util.sc.next();
		System.out.println("pw를 입력하세요. >> ");
		String pw = Util.sc.next();
		dao.modifyMember(id, pw);
	}
}
