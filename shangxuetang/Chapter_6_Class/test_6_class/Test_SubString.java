package test_6_class;

public class Test_SubString {
	public static void main(String[] args) {
		String s ="sunjavaphpjavajspjavaaakkjavajava";
		String toFind = "java";
		int count = 0;
		int index = -1;
		while((index = s.indexOf(toFind)) != -1) {
			s = s.substring(index + toFind.length());
			count++;
		}
		System.out.println(count);
	}
}
