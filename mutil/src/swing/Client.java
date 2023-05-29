package swing;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Client {
	public static void main(String[] args) throws IOException {
		
		Socket socket = new Socket("10.50.62.231",8642);
//		socket.setSoTimeout(10000);
		System.out.println("LOL2");
		DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());
		
		DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("LOL");
		String string="", string2="";
//		while (true) {
//			string = reader.readLine();
//			dataOutputStream.writeUTF(string);
//			dataOutputStream.flush();
//			string2 = dataInputStream.readUTF();
//			System.out.println("Server say: "+string2);
//			if(string.equals("stop")) {
//				System.out.println(":trc break");
//				break;
//			}
//		}
		
		do {
			string = reader.readLine();
			dataOutputStream.writeUTF(string);
			dataOutputStream.flush();
			string2 = dataInputStream.readUTF();
			System.out.println("Server say: "+string2);
		} while (!string.equals("stop"));
		
		System.exit(0);
		dataOutputStream.close();
		System.out.println("FALSe");
		socket.close();
	}
}
