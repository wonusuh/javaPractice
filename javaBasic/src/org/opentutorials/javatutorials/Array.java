/**
 * 
 */
package org.opentutorials.javatutorials;

/**
 * @author YONSAI
 *
 */
public class Array {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] classGroup = { "최진혁", "최유빈", "한이람", "이고잉" };
		System.out.println(classGroup[0]);
		System.out.println(classGroup[1]);
		System.out.println(classGroup[2]);
		System.out.println(classGroup[3]);

		String[] secondClassGroup = new String[4];
		secondClassGroup[0] = "최진혁";
		System.out.println(secondClassGroup.length);
		secondClassGroup[1] = "최유빈";
		System.out.println(secondClassGroup.length);
		secondClassGroup[2] = "한이람";
		System.out.println(secondClassGroup.length);
		secondClassGroup[3] = "이고잉";
		System.out.println(secondClassGroup.length);

//		반복문을 이용한 배열의 원소의 순회
		String[] members = { "최진혁", "최유빈", "한이람" };
		for (int i = 0; i < members.length; i++) {
			String member = members[i];
			System.out.println(member + "이 상담을 받았습니다.");
		}

//		for-each
		String[] secondMembers = { "최진혁", "최유빈", "한이람" };
		for (String e : secondMembers) {
			System.out.println(e + "이 상담을 받았습니다.");
		}

//		배열의 오류와 한계
//		System.out.println(secondMembers[3]);
		String[] thirdMembers = new String[3];
		thirdMembers[0] = "최진혁";
		thirdMembers[1] = "최유빈";
		thirdMembers[2] = "한이람";
//		thirdMembers[3] = "이고잉";

	}

}
