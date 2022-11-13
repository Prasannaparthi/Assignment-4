package Assignment_4;

public class Palindrome {
	public static void main(String[] args) {
		String s1 = "2552";
		String s2 = "";
		for (int i = s1.length() - 1; i >= 0; i--) {
			s2 = s2 + s1.charAt(i);
		}
		System.out.println("Statement1 = " + s1);
		System.out.println("Statement2 = " + s2);
		if (s1.equals(s2)) {
			System.out.println("This is Palindrome");
		} else
			System.out.println("This is Not a Palindrome");
	}
}
