package network04.Char.TCP;

import java.net.ServerSocket;
import java.net.Socket;
import java.net.InetSocketAddress;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;


public class ServerEx {
	public static void main(String[] args) {
		ServerSocket serverSocket=null;
		Socket socket=null;
		
		InputStream is=null;
		InputStreamReader isr=null;
		BufferedReader br=null;
		
		try {
			InetSocketAddress isa=new InetSocketAddress(7890);
			serverSocket=new ServerSocket();		
			serverSocket.bind(isa);					
			
			System.out.println("���� ���� ��ٸ� ���Դϴ�.");				
			socket=serverSocket.accept();		

			is=socket.getInputStream();
			isr=new InputStreamReader(is);
			br=new BufferedReader(isr, 512);
		
			String msg=br.readLine();
			System.out.println("[ " +  socket.getInetAddress().getHostName() + "]: " + msg);

		} catch (IOException e) {
			System.out.println("��Ʈ��ũ ����½� ������ �߻��Ͽ����ϴ�");
			e.printStackTrace();
		}finally{
			try{
				if(br !=null) br.close();
				if(isr !=null) br.close();
				if(is !=null) is.close();
				if(!socket.isClosed()) socket.close();
				if(!serverSocket.isClosed()) serverSocket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
