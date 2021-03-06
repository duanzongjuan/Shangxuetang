public class TestJoin {
	public static void main(String[] args) {
		MyThread t1 = new MyThread("t1");
		t1.start();

		try {
			t1.join();
		} catch (InterruptedException e) {

		}
		
		for(int i=0; i<=10; i++) {
			System.out.println("I am main thread");
		}
	}
}

class MyThread extends Thread {
	public MyThread(String s) {
		super(s);
	}

	public void run() {
		for(int i=0; i<=10; i++) {
			System.out.println("I am " + getName());
		}

		try {
			sleep(1000);
		} catch (InterruptedException e) {
			return;
		}
	}
}