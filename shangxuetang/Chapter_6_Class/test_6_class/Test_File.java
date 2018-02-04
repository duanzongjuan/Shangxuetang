package test_6_class;

import java.io.File;
import java.io.IOException;

public class Test_File {
	public static void main(String[] args) {
		String separator = File.separator;
		String filename = "myfile.txt";
		String directory = "mkdir1" + separator + "mkdir2";
	  //String directory = "mkdir1/mkdir2";
		File f = new File(directory,filename);
		if(f.exists()) {
			System.out.println("文件名:" + f.getAbsolutePath());
			System.out.println("文件大小:" + f.length());
		} else {
			f.getParentFile().mkdirs();
			try {
				f.createNewFile();
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
}
