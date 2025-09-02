package thread11.Chat;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class ServerSender extends Thread{
	private Socket socket;	
	
	public ServerSender(Socket socket){
		this.socket=socket;
	}
	
	public void run(){
		BufferedWriter bw=null;
		PrintWriter pw=null;		
		Scanner sc=null;	
		
		try{
			bw=new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()), 512);
			pw=new PrintWriter(bw);
			sc=new Scanner(System.in);
			
			while(true){
				// System.out.println("입력");
				String outputMsg=sc.nextLine();
				
				if(outputMsg.equalsIgnoreCase("Q")) {    
					pw.println(outputMsg);
					pw.flush();
					break;
				}
				
				pw.println("서버 >>" + outputMsg);
				pw.flush();
			}
		}catch(IOException e){
			System.out.println("ServerSender Error");
			e.printStackTrace();
		}finally{
			try {
				if(sc !=null) sc.close();
				if(pw !=null) pw.close();
				if(bw !=null) bw.close();
				if(!socket.isClosed() || socket !=null) socket.close();
			}catch (IOException e) { }
		}
	}
}
