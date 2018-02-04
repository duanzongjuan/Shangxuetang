import java.io.*;
public class TestEx {
	public static void main(String[] args) {
		int[] arr={1,2,3};
		try {
			System.out.println(arr[2]);
		} catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}

		FileInputStream in=null;
		try {
			in=new FileInputStream("my.txt");
			int b=in.read();
			while(b!=-1) {
				System.out.println((char)b);
				b=in.read();
			}
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				in.close();
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
}