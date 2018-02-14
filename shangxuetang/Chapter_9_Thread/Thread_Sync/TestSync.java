public class TestSync implements Runnable {
	int b = 100;

	public synchronized void m1() throws Exception { //执行m1时,b被锁定,只是在方法m1中被锁定,在m2中仍可以访问
		b = 10000;
		Thread.sleep(5000);
		System.out.println("b = " + b);
	}

	public void m2() {
		System.out.println(b);
	}

	public void run() {
		try {
			m1();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) throws Exception {
		TestSync ts = new TestSync();
		Thread t = new Thread(ts);
		t.start();

		Thread.sleep(1000);
		//Thread.sleep(1000);
		ts.m2();
	}
}