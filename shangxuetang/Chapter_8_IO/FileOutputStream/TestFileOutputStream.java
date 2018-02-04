import java.io.*;
public class TestFileOutputStream {
	public static void main(String[] args) {
		FileInputStream in = null;
		FileOutputStream out = null;
		int b = 0;

		try {
			in = new FileInputStream("F:/shangxuetang/Chapter_8_IO/TestFileInputStream/TestFileInputStream.java");
			out = new FileOutputStream("F:/shangxuetang/Chapter_8_IO/juanjuan.java");

			while((b=in.read())!=-1) {
				out.write(b);
			}
			in.close();
			out.close();
		} catch (FileNotFoundException e1) {
			System.out.println("找不到指定文件!");
			System.exit(-1);
		} catch(IOException e2) {
			System.out.println("文件复制错误!");
			System.exit(-1);
		}
		System.out.println("文件已经复制完成!");
	}
}