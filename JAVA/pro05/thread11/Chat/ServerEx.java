package thread11.Chat;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerEx {
	public static void main(String[] args) {
		ServerSocket serverSocket=null;	
		Socket socket=null;
		
		try {
			serverSocket=new ServerSocket(9999);
			System.out.println("서버 챗팅 준비중....");
			
			socket=serverSocket.accept();
			
			ServerReceiver r=new ServerReceiver(socket);
			r.start();
			
			ServerSender s=new ServerSender(socket);		
			s.start();
			
		} catch (IOException e) {
			e.printStackTrace();
		}finally{		
			try {
				if(serverSocket != null) serverSocket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
