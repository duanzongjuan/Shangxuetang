package test_6_class;

public class Test_Split {
	public static void main(String[] args) {
		int j = 1234567;
		String s = String.valueOf(j);
		System.out.println("jÊÇ"+s.length()+"Î»Êý!");
		String ss ="juan,1996,xiaozeng" ;
		String[] s1 = ss.split(",");
		for(int i=0;i<s1.length;i++) {
			System.out.println(s1[i]);
		}
	}
}
