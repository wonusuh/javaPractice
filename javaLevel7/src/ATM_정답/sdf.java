package ATM_정답;

public class sdf {

	public static boolean checkValue(String data) {
		String num = "0123456789";
		if (data.length() != 14) {
			return false;
		}
		for (int i = 0; i < data.length(); i += 1) {
			System.out.println(data.charAt(i));
			if (i!=4 && i!= 9 && num.contains(data.charAt(i)+"")) {
			} else if (i == 4 || i == 9) {
				if (data.charAt(i) != '-') {
					return false;
				}
			} else {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {

		System.out.println(checkValue("1234-1234-1234"));
		System.out.println(checkValue("1234-1234-123"));
		System.out.println(checkValue("1234a12341;123"));
		System.out.println(checkValue("12341123421123"));
	}

}
