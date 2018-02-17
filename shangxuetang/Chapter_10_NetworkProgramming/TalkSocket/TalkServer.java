import java.net.*;
import java.io.*;
public class TalkServer {
	public static void main(String[] args) {
		try {
			ServerSocket server = new ServerSocket(4700);
			Socket socket = server.accept();
			String line;
			BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			PrintWriter pw = new PrintWriter(socket.getOutputStream());
			BufferedReader sbr = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Client :" + br.readLine());
			line = sbr.readLine();
			while(!line.equals("bye")) {
				br.close();
				pw.close();
				socket.close();
				server.close();
			}
		} catch(Exception e) {
			System.out.println("Error:" + e);
		}
	}
}