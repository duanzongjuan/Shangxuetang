import java.net.*;
import java.io.*;
public class TestSocketClient {
	public static void main(String[] args) {
		InputStream is = null;
		OutputStream os = null;
		try {
			Socket s = new Socket("localhost",5888);
			is = s.getInputStream();
			os = s.getOutputStream();
			DataOutputStream dos = new DataOutputStream(os);
			DataInputStream dis = new DataInputStream(is);
			dos.writeUTF("hey");

			String ss = null;
			if((ss = dis.readUTF()) != null) {
				System.out.println(ss);
			}

			dos.close();
			dis.close();
			s.close();
		} catch(UnknownHostException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
}