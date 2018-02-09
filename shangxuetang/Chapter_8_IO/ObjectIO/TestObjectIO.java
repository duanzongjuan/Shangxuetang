import java.io.*;
public class TestObjectIO {
	public static void main(String[] args) throws Exception{
		T t = new T();
		t.k = 8;
		FileOutputStream fos = new FileOutputStream("F:/shangxuetang/Chapter_8_IO/ObjectIO/TestObjectIO.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(t);
		oos.flush();
		oos.close();

		FileInputStream fis = new FileInputStream("F:/shangxuetang/Chapter_8_IO/ObjectIO/TestObjectIO.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		T tReaded =(T)ois.readObject();
		System.out.println(tReaded.i + " " + tReaded.j + " " + tReaded.d + " "+ tReaded.k);
	}
}

class T implements Serializable{  //可序列化的
	int i = 10;
	int j = 9;
	double d = 2.3;
	int k = 15;  
	// transient int k = 15; 透明的
}