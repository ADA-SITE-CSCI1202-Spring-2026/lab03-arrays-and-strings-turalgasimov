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

	public static void main(String[] args) {
		System.out.println(Reverse("Hello, World!"));
		System.out.println(Explode("Baku"));
	}
}