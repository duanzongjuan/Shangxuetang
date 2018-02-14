public class TestSync1  implements Runnable {
	int b = 100;

	public synchronized void m1()  throws Exception {
		b = 10000;
		Thread.sleep(5000);
		System.out.println("b = " + b);
	}

	/*public void m2() throws Exception {
		Thread.sleep(2500);
		b = 2000;
	}*/

	public synchronized void m2() throws Exception {  //m1(),m2()都加锁,m2()对b的改变影响不了m1()中的b.
		Thread.sleep(2500);
		b = 2000;
	}

	public void run() {
		try {
			m1();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) throws Exception {
		TestSync1 ts1 = new TestSync1();
		Thread t = new Thread(ts1);

		t.start();

		ts1.m2();

		System.out.println(ts1.b);
	}

}