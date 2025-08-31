package network02.TCP;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;

public class ClientEx {
	public static void main(String[] args) {
		Socket socket=null;
		
		try{
			InetSocketAddress isa=new InetSocketAddress("localhost", 5001);  // 0~65535
			
			socket=new Socket();							// Socket ����
			socket.connect(isa);						        // �����û
			
			System.out.println("Ŭ���̾�Ʈ�� ������ ��û�մϴ�.");
			
		}catch(IOException e){
			System.out.println("��Ʈ��ũ ����½� ������ �߻��Ͽ����ϴ�.");
			e.printStackTrace();
		}finally{
			if(!socket.isClosed() || socket !=null){						// ������ �Ǿ� ���� ���
				try {
					socket.close();									    // ���� ����
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}





