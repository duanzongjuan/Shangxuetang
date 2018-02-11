import java.util.Date;
public class TestInterrupt {
	public static void main(String[] args) {
		MyThread thread = new MyThread();
		thread.start();
		try {
			thread.sleep(10000);
		} catch (InterruptedException e) {

		}
		thread.interrupt();    //尽量不要使用interrupt,stop.
	}
}

class MyThread extends Thread {  //尽量使用implements Runnable,继承只能单继承,实现可以多个,并且可以继承别的类
	public void run() {    //异常不能抛出,因为run()重写了,子类不能抛出父类没有抛出的异常
		while(true) {
			System.out.println("===" + new Date() + "===");
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				return;
			}
		}
	}
}