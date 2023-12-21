package _11컬렉션Member;

import java.util.ArrayList;

public class MemberDAO {
	private MemberDAO() {
		init();
	}

	private static MemberDAO instance = new MemberDAO();

	public static MemberDAO getInstance() {
		return instance;
	}

	private ArrayList<Member> memberList;

	private void init() {
		memberList = new ArrayList<Member>();
	}

	public void insertMember(String id, String pw) {
		if (!isValidId(id)) {
			System.out.println("이미 사용중인 아이디입니다.");
			return;
		}
		Member m = new Member(id, pw);
		memberList.add(m);
		System.out.println(m + " 추가 완료");
	}

	public boolean isValidId(String id) {
		if (memberList.size() == 0)
			return true;
		for (Member member : memberList) {
			if (member.getId().equals(id))
				return false;
		}
		return true;
	}

	/**
	 * @return the memberList
	 */
	public ArrayList<Member> getMemberList() {
		return memberList;
	}

	public void deleteMember(String id, String pw) {
		if (isValidId(id)) {
			System.out.println("존재하지 않는 id입니다.");
			return;
		}
		Member member = findTheMemberById(id);
		System.out.println(member.toString() + " 삭제했습니다.");
		memberList.remove(member);
	}

	private Member findTheMemberById(String id) { // 해당하는 id를 가지는 인스턴스를 리턴합니다.
		for (Member m : memberList) {
			if (id.equals(m.getId()))
				return m;
		}
		return null;
	}

	public void modifyMember(String id, String pw) {
		Member theMember = findTheMemberById(id);
		if (theMember != null) {
			if (pw.equals(theMember.getPw())) {
				System.out.println("수정할 pw를 입력하세요. >> ");
				String afterPw = Util.sc.next();
				theMember.setPw(afterPw);
				System.out.println(theMember.getId() + " 의 pw를 " + afterPw + " 로 변경했습니다.");
			} else {
				System.out.println("pw를 확인하세요.");
			}
		} else {
			System.out.println("존재하지 않는 id입니다.");
			return;
		}
	}
}
