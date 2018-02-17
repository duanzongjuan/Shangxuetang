import java.net.*;
import java.io.*;
public class TestUDPClient {
	public static void main(String[] args) {
		byte[] buf = (new String("hello")).getBytes();
		DatagramPacket dp = new DatagramPacket(buf,buf.length,new InetSocketAddress("127.0.0.1",5678));
		try {
			DatagramSocket ds = new DatagramSocket(9999);
			ds.send(dp);
			ds.close();
		} catch (SocketException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
}