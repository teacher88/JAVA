package thread12.CharMulti;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerEx {
	public static void main(String[] args) {
		ServerSocket serverSocket=null;	
		
		try {
			serverSocket=new ServerSocket(1234);
			System.out.println("ÃªÆÃ ÁØºñÁß....");
			
			while(true){
				Socket socket=serverSocket.accept();
				
				ServerArr arr=new ServerArr(socket);
				arr.start();
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			try{
				if(!serverSocket.isClosed() || serverSocket !=null) serverSocket.close();			
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}
}
