package test_6_class;

public class Test_String3 {
	public static void main(String[] args) {
		String s = "Welcome to Java World£¡";
		String s1 = " sun java ";
		System.out.println(s.startsWith("Welcome"));
		System.out.println(s.endsWith("World"));
		String sL = s.toUpperCase();
		String sU = s.toLowerCase();
		System.out.println(sL);
		System.out.println(sU);
		String subS = s.substring(11);
		System.out.println(subS);
		String st = s1.trim();
		System.out.println(st);
	}
}
