package network02.TCP;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
* @Data : 
* @Author : 강사
* @Description :  실행 방법
* 					C:> cd 경로 이동
*                   C:> javac ServerEx.java
*                   C:> java ServerEx 
*/

public class ServerEx {
	public static void main(String[] args) {
		ServerSocket serverSocket=null;
		Socket socket=null;
		
		try {
			InetSocketAddress isa=new InetSocketAddress(5001);
			serverSocket=new ServerSocket();		// ServerSocket 생성
			serverSocket.bind(isa);						// 포트를 물고 있으면
			
			System.out.println("서버가 연결을 기다리고 있습니다.");
			socket=serverSocket.accept();			// 대기상태, 클라이언트 접속후 연결 수락
			
			InetAddress ia=socket.getInetAddress();
			String addr=ia.getHostAddress();
			System.out.println(socket.getInetAddress().getHostAddress() + "\t\t" +  addr);
			
		} catch (IOException e) {
			System.out.println("네트워크 입출력시 에러가 발생하였습니다");
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
