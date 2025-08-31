package network03.Byte.TCP;

import java.net.ServerSocket;
import java.net.Socket;
import java.net.InetSocketAddress;

import java.io.InputStream;
import java.io.BufferedInputStream;
import java.io.IOException;

public class ServerEx {
	public static void main(String[] args) {
		ServerSocket serverSocket=null;
		Socket socket=null;
		InputStream is=null;
		BufferedInputStream bis=null;
		
		try {
			InetSocketAddress isa=new InetSocketAddress(1234);
			serverSocket=new ServerSocket();		
			serverSocket.bind(isa);					
			System.out.println("서버가 연결을 기다리고 있습니다.");
			
			socket=serverSocket.accept();		
			is=socket.getInputStream();
			bis=new BufferedInputStream(is);
			
			byte[] msgByte=new byte[100];
			int byteCount=bis.read(msgByte);
			
			String msg=new String(msgByte, 0, byteCount, "utf-8");
			System.out.println("[ " +  socket.getInetAddress().getHostName() + "]: " + msg);				

		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			try{
				if(bis !=null) bis.close();
				if(is !=null) is.close();
				if(!socket.isClosed()) socket.close();
				if(!serverSocket.isClosed()) serverSocket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
