package org.opentutorials.javatutorialsfifth.array;

public class ArrayLoopDemo {
	public static void main(String[] args) {
		String[] classGroup = { "최진혁", "최유빈", "한이람" };
		for (String e : classGroup) {
			System.out.println(e + " 상담 받았습니다.");
		}
		System.out.println("모든 학생이 상담을 받았습니다.");
	}
}
