
package test_6_class;

public class Test_Count {
	public static void main(String[] args) {
		String s ="aAAKKiiduieKKJJ78398@@@dfdADK";
		count1(s);
		System.out.println();
		count2(s);
		System.out.println();
		count3(s);
	}
	
	public static void count1(String s) {
		int lCount = 0, uCount = 0, oCount = 0;
		for(int i=0;i<s.length();i++) {
			char c = s.charAt(i);
			if(c <= 'z' && c >= 'a') {
				lCount++;
			} else if(c <= 'Z' && c >= 'A') {
				uCount++;
			} else {
				oCount++;
			}
		}
		System.out.print(lCount+" "+uCount+" "+oCount);
	}
	
	public static void count2(String s) {
		int lCount = 0, uCount = 0, oCount = 0;
		String ls = "abcdefghijklmnoprstuvwxyz";
		String us = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		for(int i=0;i<s.length();i++) {
			char c = s.charAt(i);
			if(ls.indexOf(c) != -1) {
				lCount++;
			} else if(us.indexOf(c) != -1) {
				uCount++;
			} else {
				oCount++;
			}
		}
		System.out.print(lCount+" "+uCount+" "+oCount);
	}
	
	public static void count3(String s) {
		int lCount = 0, uCount = 0, oCount = 0;
		for(int i=0;i<s.length();i++) {
			char c = s.charAt(i);
			if(Character.isLowerCase(c)) {
				lCount++;
			} else if(Character.isUpperCase(c)) {
				uCount++;
			} else {
				oCount++;
			}
		}
		System.out.print(lCount+" "+uCount+" "+oCount);
	}
}
