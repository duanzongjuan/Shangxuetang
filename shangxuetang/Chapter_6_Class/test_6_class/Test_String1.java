package test_6_class;

public class Test_String1 {
	public static void main(String[] args) {
		String s1 = "hello";
		String s2 = "world";
		String s3 = "hello";
		System.out.println(s1==s3);
		System.out.println(s1.equals(s3));
		
		String s4 = new String("hello");
		String s5 = new String("hello");
		System.out.println(s4 == s5);
		System.out.println(s4.equals(s5));
		
		char[] c= {'s','u','n',' ','j','a','v','a'};
		String s6 = new String(c);
		String s7 = new String(c,4,4);
		System.out.println(s6);
		System.out.println(s7);
	}
}
