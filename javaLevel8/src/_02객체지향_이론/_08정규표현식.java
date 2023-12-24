package _02객체지향_이론;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _08정규표현식 {
	public static void main(String[] args) {
		String acc = "1111-1111-1111";
		Pattern p = Pattern.compile("^\\d{4}-\\d{4}-\\d{4}$");
		Matcher m = p.matcher(acc);
		m.matches();
		System.out.println(m.matches());
	}
}
