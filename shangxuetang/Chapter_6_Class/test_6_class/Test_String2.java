package test_6_class;

public class Test_String2 {
	public static void main(String[] args) {
		String s1 = "sun java";
		String s2 = "sun Java";
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		System.out.println(s1.charAt(1));
		System.out.println(s2.length());
		System.out.println(s1.indexOf("java"));
		System.out.println(s1.indexOf("Java"));
		System.out.println(s2.equalsIgnoreCase(s2));
		
		String s = "���ǳ���Ա,����ѧϰjava!";
		String sr = s.replace("��", "��");
		System.out.println(sr);
	}
}
