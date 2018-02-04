import java.io.*;
public class TestFileReader {
	public static void main(String[] args) {
		FileReader fr = null;
		int b = 0;

		try {
			fr = new FileReader("F:/shangxuetang/Chapter_8_IO/TestFileReader/TestFileReader.java");
			while((b=fr.read())!=-1) {
				System.out.print((char)b);
			}
			fr.close();

		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
			System.out.println("未找到指定文件!");
			System.exit(0);
		} catch(IOException e2) {
			System.out.println("文件读取错误!");
			System.exit(0);
		}
	}
}