package test_6_class;

import java.io.File;
import java.util.Scanner;

public class Test_ListFile2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入文件名:");
		String s = sc.next();
		File f = new File(s);
		System.out.println(f);
		tree(f,1);
		}
	
	public static void tree(File f,int level) {
		String preStr="";
		for(int i=0;i<level;i++) {
			preStr += "    ";
		}
		File[] childs = f.listFiles();
		for(int i=0;i<childs.length;i++) {
			System.out.println(preStr+childs[i].getName());
			if(childs[i].isDirectory()) {
				tree(childs[i],level+1);
			}
		}
	}
}
