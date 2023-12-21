package _11컬렉션Member;

import java.util.Collections;
import java.util.List;

public class ActionShow implements Action {

	@Override
	public void excute() { // 회원정보를 id 이름순으로 정렬한다음 출력하는 페이지
		System.out.println("[ 회원정보를 id순으로 출력합니다. ]");
		MemberDAO dao = MemberDAO.getInstance();
		if (dao.getMemberList().size() == 0) {
			System.out.println("회원이 아무도 없습니다.");
			return;
		}
		List<Member> temp = dao.getMemberList();
		Collections.sort(temp);
		for (Member m : temp) {
			System.out.println(m.toString());
		}
	}
}
