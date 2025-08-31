package network02.TCP;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;

public class ClientEx {
	public static void main(String[] args) {
		Socket socket=null;
		
		try{
			InetSocketAddress isa=new InetSocketAddress("localhost", 5001);  // 0~65535
			
			socket=new Socket();							// Socket 생성
			socket.connect(isa);						        // 연결요청
			
			System.out.println("클라이언트가 연결을 요청합니다.");
			
		}catch(IOException e){
			System.out.println("네트워크 입출력시 에러가 발생하였습니다.");
			e.printStackTrace();
		}finally{
			if(!socket.isClosed() || socket !=null){						// 연결이 되어 있을 경우
				try {
					socket.close();									    // 연결 끊기
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}





