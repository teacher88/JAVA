package thread11.Chat;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class ClientSender extends Thread{
	public Socket socket;	
	private String nickName;
	
	public ClientSender(Socket socket, String nickName){
		this.socket=socket;
		this.nickName=nickName;
		
		System.out.println("챗팅 시작입니다.");
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
				
				if(outputMsg.equalsIgnoreCase("Q")){
					pw.println(outputMsg);
					pw.flush();	
					break;
				}
				
				pw.println(nickName + ">>" + outputMsg);
				pw.flush();
			}		
		}catch(IOException e){
			e.printStackTrace();
		}finally{
			try{
				if(sc !=null) sc.close();
				if(pw !=null) pw.close();
				if(bw !=null) bw.close();
				if(!socket.isClosed() || socket !=null) socket.close();
			}catch(IOException e){
				e.printStackTrace();
			}
		}
	}
}
