import java.net.*;
import java.io.*;
public class TestUDPClient {
	public static void main(String[] args) {
		try {
			long n = 10000L;
		    ByteArrayOutputStream baos = new ByteArrayOutputStream();
			DataOutputStream dos = new DataOutputStream(baos);
			dos.writeLong(n);

			byte[] buf = baos.toByteArray();
			DatagramPacket dp = new DatagramPacket(buf,buf.length,new InetSocketAddress("127.0.0.1",5678));
			DatagramSocket ds = new DatagramSocket(9999);
			ds.send(dp);
			ds.close();
		} catch(SocketException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
}