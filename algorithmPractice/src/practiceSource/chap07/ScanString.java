// 문자열을 1 문자씩 스캔하여 표시
package practicesource.chap07;

import java.util.Scanner;

class ScanString {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("문자열 s : ");
        String s = stdIn.next();

        for (int i = 0; i < s.length(); i++)
            System.out.println("s[" + i + "] = " + s.charAt(i));
    }
}
