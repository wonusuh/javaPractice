/**
 * 
 */
package org.opentutorials.javatutorialssecond.packages.example2;

import org.opentutorials.javatutorialssecond.packages.example1.A;

/**
 * @author user
 *
 */
public class B {
	public static void main(String[] args) {
		// 클래스 A가 다른 패키지에 있기때문에 로드할 수 없음
		A a = new A();
	}
}
