package network06.Char.TCP;

import java.net.Socket;
import java.io.OutputStreamWriter;
import java.io.BufferedWriter;
import java.io.PrintWriter;
import java.util.Scanner;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class ClientEx {
	public static void main(String[] ar){
		Socket socket=null;		
		BufferedWriter bw=null;
		PrintWriter pw=null;
		Scanner sc=null;
		
		BufferedReader br=null;

		try{
			// 출력
			socket=new Socket("localhost", 1234);
			
			bw=new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()), 512);
			pw=new PrintWriter(bw);
			sc=new Scanner(System.in);
			
			// 입력			
			br=new BufferedReader(new InputStreamReader(socket.getInputStream()), 512);
			
			String outputMsg=null, inputMsg=null;
			while(true){
				outputMsg=sc.nextLine();
				
				if(outputMsg.equalsIgnoreCase("Q")){
					pw.println("나만 종료할수 있다.");
					pw.flush();
					break;
				}
				pw.println("클라이언트>>" + outputMsg);
				pw.flush();
				
				inputMsg=br.readLine();
				System.out.println(inputMsg);
			}
		}catch(IOException e){
			e.printStackTrace();
		}finally{
			try{
				if(pw !=null) pw.close();
				if(bw !=null) bw.close();	
				if(br !=null) br.close();		
				
				if(socket !=null) socket.close();
				if(sc !=null) sc.close();
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}
}





