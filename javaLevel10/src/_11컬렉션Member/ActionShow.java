package _11컬렉션Member;

public class ActionShow implements Action {
	@Override
	public void excute() { // 회원정보를 id 이름순으로 정렬한다음 출력하는 페이지
		System.out.println("[ 회원정보를 id순으로 출력합니다. ]");
		MemberDAO dao = MemberDAO.getInstance();
		if (dao.getMemberList().size() == 0) {
			System.out.println("멤버가 존재하지 않습니다.");
			return;
		}
		dao.showAllMember();
	}
}
