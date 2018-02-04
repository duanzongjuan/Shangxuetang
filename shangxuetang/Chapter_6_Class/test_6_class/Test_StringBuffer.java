package test_6_class;

public class Test_StringBuffer {
	public static void main(String[] args) {
		String s = "Microsoft";
		char[] a = {'a','b','c'};
		StringBuffer sb1 = new StringBuffer(s);
		sb1.append("/").append("IBM").append("/").append("Oracle");
		System.out.println(sb1);
		StringBuffer sb2 = new StringBuffer("����");
		for(int i=0;i<=9;i++) {
			sb2.append(i);
		}
		System.out.println(sb2);
		sb2.delete(8, sb2.length()).insert(0, a);
		System.out.println(sb2);
		sb2.reverse();
		System.out.println(sb2);
	}
}
