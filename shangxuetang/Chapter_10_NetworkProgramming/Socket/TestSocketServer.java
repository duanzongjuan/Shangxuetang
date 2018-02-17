import java.net.*;
import java.io.*;
public class TestSocketServer {
	public static void main(String[] args) {
		InputStream  in = null;
		OutputStream out = null;
		try {
			ServerSocket ss = new ServerSocket(5888);
			Socket s = ss.accept();
			in = s.getInputStream();
			out = s.getOutputStream();
			DataOutputStream dos = new DataOutputStream(out);
			DataInputStream dis = new DataInputStream(in);

			String s1 = null;
			if((s1 = dis.readUTF()) != null) {
				System.out.println(s1);
				System.out.println("from: " + s.getInetAddress());
				System.out.println("port: " + s.getPort());
			}
			dos.writeUTF("hi,hello");
			dis.close();
			dos.close();
			s.close();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
}