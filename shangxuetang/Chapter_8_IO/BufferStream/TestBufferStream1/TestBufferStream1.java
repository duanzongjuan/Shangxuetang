import java.io.*;
public class TestBufferStream1 {
	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("f:/shangxuetang/Chapter_8_IO/TestBufferStream/TestBufferStream1/TestBufferStream1.java");
			BufferedInputStream bis = new BufferedInputStream(fis);

			int c = 0;
			System.out.println(bis.read());
			System.out.println(bis.read());

			bis.mark(100);
			for(int i=0;i<=10 && ((c=bis.read())!=-1);i++) {
				System.out.print(c+" ");
				System.out.print((char)c+" ");
			}
			System.out.println();
			bis.reset();
			for(int i=0;i<=10 && (c=bis.read())!=-1;i++) {
				System.out.print(c+" ");
				System.out.print((char)c+" ");
			}

			bis.close();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
}