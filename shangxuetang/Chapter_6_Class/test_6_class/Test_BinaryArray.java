package test_6_class;

public class Test_BinaryArray {
	public static void main(String[] args) {
		double[][] d;
		String s = "1,2;3,4,5;6,7,8";
		String[] split1 = s.split(";");
		d = new double[split1.length][];
		for(int i=0;i<split1.length;i++) {
			String[] split2 = split1[i].split(",");
			d[i] = new double[split2.length];
			for(int j=0;j<split2.length;j++) {
				d[i][j] = Double.parseDouble(split2[j]);
			}
		}
		
		for(int i=0;i<d.length;i++) {
			for(int j=0;j<d[i].length;j++) {
				System.out.print(d[i][j]+" ");
			}
			System.out.println();
		}
	}
}
