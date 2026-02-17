public class StringUtils {

	public static String Reverse(String s) {
		StringBuilder sb = new StringBuilder();
		for (int i = s.length() - 1; i >= 0; i--) {
			char c = s.charAt(i);
			sb.append(c);
		}

		return sb.toString();
	}

	public static String Explode(String s) {
		int count = 0;
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < s.length(); i++) {
			for (int j = 0; j <= count; j++) {
				char c = s.charAt(j);
				sb.append(c);
			}
			count++;
		}
		return sb.toString();
	}

	public static String Sort(String s) {
		s = s.toLowerCase();
		char[] chars = s.toCharArray();

		for (int i = 0; i < chars.length - 1; i++) {
			for (int j = 0; j < chars.length - i - 1; j++) {
				if (chars[j] > chars[j + 1]) {
					char temp = chars[j];
					chars[j] = chars[j + 1];
					chars[j + 1] = temp;
				}
			}
		}
		return new String(chars);
	}

	public static boolean Anagram(String s1, String s2) {
		s1 = s1.toLowerCase();
		s2 = s2.toLowerCase();

		char[] chars1 = s1.toCharArray();
		char[] chars2 = s2.toCharArray();

		java.util.Arrays.sort(chars1);
		java.util.Arrays.sort(chars2);

		return new String(chars1).equals(new String(chars2)) ? true : false;
	}

	public static void main(String[] args) {
		System.out.println(Reverse("Hello, World!"));
		System.out.println(Explode("Baku"));
		System.out.println(Sort("Baku"));
		System.out.println(Anagram("listen", "silent"));
	}
}