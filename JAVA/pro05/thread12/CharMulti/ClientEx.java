package thread12.CharMulti;

import java.io.IOException;
import java.net.Socket;

public class ClientEx {
	public static void main(String[] args){
//		if(args.length !=1){
//			System.out.println("�̸��ϳ��� �Է�");
//			return ;
//		}
		
		try {
			Socket socket=new Socket("211.63.89.125", 1234);	
			
			Sender s=new Sender(socket, "����");		
			s.start();
			
			Receiver r=new Receiver(socket);
			r.start();
		} catch (IOException e) {
			System.out.println("MyClient Error");
			e.printStackTrace();
		}
	}
}
