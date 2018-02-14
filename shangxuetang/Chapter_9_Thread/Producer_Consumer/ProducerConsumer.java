/**
 *生产者与消费者
 *@author juanjuan
 *@version 2018-2-13
 *
 * 重点:wait()与sleep()的区别,notify()的使用,synchronized的理解
 */

public class ProducerConsumer {
	public static void main(String[] args) {
		SyncStack ss = new SyncStack();
		Producer p = new Producer(ss);
		Consumer c = new Consumer(ss);
		new Thread(p).start();
		new Thread(c).start();
	}
}

class WoTou { //馒头
	int id;
	WoTou(int id) {
		this.id = id;
	}

	public String toString() {
		return "WoTou : " + id;
	}
}

class SyncStack {
	int index = 0;
	WoTou[] arrWT = new WoTou[6];

	public synchronized void push(WoTou wt) {
		while(index == arrWT.length) {
			try {
				this.wait();  //wait()必须锁定才能使用,wait()时,锁解开,notify()后重新锁定
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		this.notify();

		arrWT[index] = wt;
		index++;
	}

	public synchronized WoTou pop() {
		while(index == 0) {
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		this.notify();

		index--;
		return arrWT[index];
	}
}

class Producer implements Runnable {
	SyncStack ss = null;
	Producer(SyncStack ss) {
		this.ss = ss;
	}

	public void run() {
		for(int i=0; i<20; i++) {
			WoTou wt = new WoTou(i);
			ss.push(wt);
			System.out.println("产生了：" + wt);
			try {
				Thread.sleep((int)(Math.random()*1000));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class Consumer implements Runnable {
	SyncStack ss = null;
	Consumer(SyncStack ss) {
		this.ss = ss;
	}

	public void run() {
		for(int i=0; i<20; i++) {
			WoTou wt = ss.pop();
			System.out.println("消费了：" + wt);
			try {
				Thread.sleep((int)(Math.random()*1000));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}