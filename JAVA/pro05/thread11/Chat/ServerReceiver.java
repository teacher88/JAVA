package thread11.Chat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.SocketException;

public class ServerReceiver extends Thread{
		private Socket socket;
		
		public ServerReceiver(Socket socket){
			this.socket=socket;
		}	

		public void run(){
			BufferedReader br=null;		
			
			try{
				br=new BufferedReader(new InputStreamReader(socket.getInputStream()), 512);		

				while(true){				
					String inputMsg=br.readLine();		
					
					if(inputMsg.equalsIgnoreCase("Q")) {
						System.out.println("챗팅 방을 나가셨습니다.");
						break;										
					}
					
					System.out.println(inputMsg);
				}
				
			}catch(NullPointerException | SocketException e){            // soc close null 반환			
				System.out.println("챗팅이 종료 되었습니다.");
			}catch(IOException e){
				e.printStackTrace();
			}finally{
				try {	
					if(br !=null) br.close();
					if(socket !=null) socket.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
}
