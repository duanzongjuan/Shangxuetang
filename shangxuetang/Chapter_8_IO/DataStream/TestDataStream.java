import java.io.*;

public class TestDataStream {
	public static void main(String[] args) {
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		DataOutputStream dos = new DataOutputStream(baos);
		try {
			dos.writeDouble(Math.random());
			dos.writeBoolean(true);
			ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
			System.out.println(bais.available());
			DataInputStream dis = new DataInputStream(bais);
			System.out.println(dis.readDouble());
			System.out.println(dis.readBoolean());  //先写的先读
			dos.close();
			dis.close(); //先打开的先关闭
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}