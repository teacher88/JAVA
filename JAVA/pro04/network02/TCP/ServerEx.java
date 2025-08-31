package network02.TCP;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
* @Data : 
* @Author : ����
* @Description :  ���� ���
* 					C:> cd ��� �̵�
*                   C:> javac ServerEx.java
*                   C:> java ServerEx 
*/

public class ServerEx {
	public static void main(String[] args) {
		ServerSocket serverSocket=null;
		Socket socket=null;
		
		try {
			InetSocketAddress isa=new InetSocketAddress(5001);
			serverSocket=new ServerSocket();		// ServerSocket ����
			serverSocket.bind(isa);						// ��Ʈ�� ���� ������
			
			System.out.println("������ ������ ��ٸ��� �ֽ��ϴ�.");
			socket=serverSocket.accept();			// ������, Ŭ���̾�Ʈ ������ ���� ����
			
			InetAddress ia=socket.getInetAddress();
			String addr=ia.getHostAddress();
			System.out.println(socket.getInetAddress().getHostAddress() + "\t\t" +  addr);
			
		} catch (IOException e) {
			System.out.println("��Ʈ��ũ ����½� ������ �߻��Ͽ����ϴ�");
			e.printStackTrace();
		}finally{
			try{
				if(!socket.isClosed()) socket.close();
				if(!serverSocket.isClosed()) serverSocket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
