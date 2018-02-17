import java.net.*;
import java.io.*;
public class TalkClient {
	public static void main(String[] args) {
		try {
			Socket socket = new Socket("127.0.0.1",4700);
			BufferedReader sbr = new BufferedReader(new InputStreamReader(System.in));
			PrintWriter pw = new PrintWriter(socket.getOutputStream());
			BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			String line = sbr.readLine();
			while(!line.equals("bye")) {
				pw.println(line);
				pw.flush();
				System.out.println("Client: " + line);
				System.out.println("Server: " + br.readLine());
				line = sbr.readLine();
			}
			pw.close();
			br.close();
			socket.close();
		} catch(Exception e) {
			System.out.println("Error:" + e);
		}
	}
}