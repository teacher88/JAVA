package thread11.Chat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.SocketException;

public class ClientReceiver extends Thread{
		private Socket socket;
		
		public ClientReceiver(Socket socket){
			this.socket=socket;
		}	
		
		public void run(){
			BufferedReader br=null;	
			
			try{	
				br=new BufferedReader(new InputStreamReader(socket.getInputStream()), 512);	
				
				while(true){				
					String inputMsg=br.readLine();
					
					if(inputMsg.equalsIgnoreCase("Q")){
						System.out.println("ê�� ���� �����̽��ϴ�.");
						break;						
					}
					
					System.out.println(inputMsg);
				}
				
			}catch(NullPointerException | SocketException e){      // soc.close() null ��ȯ�ǹǷ�
				System.out.println("ä���� ���� �Ǿ����ϴ�.");
			}catch(Exception e){
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
