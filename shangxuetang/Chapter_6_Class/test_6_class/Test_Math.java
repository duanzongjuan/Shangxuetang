package test_6_class;

public class Test_Math {
	public static void main(String[] args) {
		double a = Math.random();
		double b = Math.random();
		System.out.println(Math.sqrt(a * a + b * b));
		System.out.println(Math.pow(a, 8));
		System.out.println(Math.round(b));
		System.out.println(Math.log(Math.pow(Math.E,15)));
		double d = 60.0, r = Math.PI/4;
		System.out.println(Math.toDegrees(d));
		System.out.println(Math.toRadians(r));
	}
}
