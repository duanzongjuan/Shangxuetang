package test_6_class;

import java.io.File;

public class Test_ListFile1 {
	public static void main(String[] args) {
		File f = new File("D:/eclipse-workspaces/shangxuetang/A");
		System.out.println("A");
		tree(f,1);
	}
	
	private static void tree(File f,int level) {
		String preStr="";
		for(int i=0;i<level;i++) {
			preStr += "    ";
		}
		File[] childs = f.listFiles();
		for(int i=0;i<childs.length;i++) {
			System.out.println(preStr + childs[i].getName());
			if(childs[i].isDirectory()) {
				tree(childs[i],level + 1);
			}
		}
	}
}
