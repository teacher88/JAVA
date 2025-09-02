package thread12.CharMulti;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.SocketException;

public class Receiver extends Thread{
		private Socket socket;

		public Receiver(Socket socket){
			this.socket=socket;
		}	

		@Override
		public void run(){
			BufferedReader br=null;	
			
			try{
				br=new BufferedReader(new InputStreamReader(socket.getInputStream()), 512);		

				while(true){				
					String inputMsg=br.readLine();
					
					if(inputMsg.equalsIgnoreCase("Q")) break;
					System.out.println(inputMsg);
				}
			
			}catch(SocketException | NullPointerException e){
				System.out.println("채팅이 종료 되었습니다.");		
			}catch(IOException e){
				e.printStackTrace();
			}finally{
				try {
					if(br !=null) br.close();
					if(!socket.isClosed() || socket !=null) socket.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
}
