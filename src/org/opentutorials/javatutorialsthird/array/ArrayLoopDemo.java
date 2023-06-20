package org.opentutorials.javatutorialsthird.array;

public class ArrayLoopDemo {
	public static void main(String[] args) {
		String[] classGroup = { "최진혁", "최유빈", "한이람", "이고잉" };
		for (int consultationEnd = 0; consultationEnd < classGroup.length; consultationEnd++) {
			System.out.println(classGroup[consultationEnd] + " 상담 완료");
		}
		System.out.println("모든 학생 상담 완료");
	}
}
