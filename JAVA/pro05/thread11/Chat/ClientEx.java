package thread11.Chat;

import java.io.IOException;
import java.net.Socket;

public class ClientEx {
	public static void main(String[] args){
//		if(args.length !=1){
//			System.out.println("닉네임 하나만 입력하세요.");
//			return ;
//		}
	
		Socket socket=null;
		try {
			socket=new Socket("127.0.0.1", 9999);		
			
			ClientSender s=new ClientSender(socket,  "선생님");			// 보내기
			s.start();

			ClientReceiver r=new ClientReceiver(socket);				    	// 받기
			r.start();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}





