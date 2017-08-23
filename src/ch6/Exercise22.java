package ch6;

public class Exercise22 {
	static boolean isNumber(String str) {

		int count = str.length();

		if (str == null || str.equals(""))
			return false;

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) >= '0' && str.charAt(i) <= '9')
				count--;
		}

		if (count == 0)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		String str = "123";
		System.out.println(isNumber(str));

		str = "1234o";
		System.out.println(isNumber(str));

		System.out.println(isNumber(""));
	}

}
