package test_6_class;

public class Test_Enum {
	public enum MyColor {red,green,blue};
	public static void main(String[] args) {
		MyColor mycolor = MyColor.red;
		switch(mycolor) {
		case red:
			System.out.println("red");
			break;
		case green:
			System.out.println("green");
			break;
		case blue:
			System.out.println("blue");
			break;
		default:
			System.out.println(" ‰»Î¥ÌŒÛ");
		}
		System.out.println(mycolor);
	}
}
