package thread11.Chat;

import java.io.IOException;
import java.net.Socket;

public class ClientEx {
	public static void main(String[] args){
//		if(args.length !=1){
//			System.out.println("�г��� �ϳ��� �Է��ϼ���.");
//			return ;
//		}
	
		Socket socket=null;
		try {
			socket=new Socket("127.0.0.1", 9999);		
			
			ClientSender s=new ClientSender(socket,  "������");			// ������
			s.start();

			ClientReceiver r=new ClientReceiver(socket);				    	// �ޱ�
			r.start();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}





