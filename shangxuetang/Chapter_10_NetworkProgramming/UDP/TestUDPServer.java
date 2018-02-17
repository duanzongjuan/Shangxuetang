import java.net.*;
import java.io.*;
public class TestUDPServer {
	public static void main(String[] args) {
		byte[] buf = new byte[1024];
		DatagramPacket dp = new DatagramPacket(buf,buf.length);
		try {
			DatagramSocket ds = new DatagramSocket(5678);
			while(true) {
				ds.receive(dp);
				System.out.println(new String(buf,0,dp.getLength()));
			}
		} catch(SocketException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
}