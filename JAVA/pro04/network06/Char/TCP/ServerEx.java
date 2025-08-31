package network06.Char.TCP;

import java.net.Socket;
import java.net.ServerSocket;

import java.io.OutputStreamWriter;
import java.io.BufferedWriter;
import java.io.PrintWriter;
import java.util.Scanner;

import java.io.InputStreamReader;
import java.io.BufferedReader;

import java.io.IOException;

public class ServerEx {
	public static void main(String[] ar){
		ServerSocket serverSocket=null;
		Socket socket=null;
	
		// 입력	
		BufferedReader br=null;

		// 출력
		BufferedWriter bw=null;
		PrintWriter pw=null;
		Scanner sc=null;
		
		try{
			serverSocket=new ServerSocket(1234);				
			System.out.println("서버준비중입니다.");
			socket=serverSocket.accept();
			
			// 입력
			br=new BufferedReader(new InputStreamReader(socket.getInputStream()), 512);
			
			// 출력
			bw=new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()), 512);
			pw=new PrintWriter(bw);
			sc=new Scanner(System.in);
				
			String inputMsg=null, outputMsg=null;
			while(true){
				inputMsg=br.readLine();
				if(inputMsg.equalsIgnoreCase("Q")) break;
				System.out.println(inputMsg);
		
				outputMsg=sc.nextLine();
				pw.println("서버>>" + outputMsg);
				pw.flush();
			}
			
		}catch(IOException e){
			e.printStackTrace();
		}finally{
			try{
				if(br !=null) br.close();
				if(pw !=null) pw.close();
				if(bw !=null) bw.close();
				
				if(socket !=null) socket.close();
				if(serverSocket !=null) serverSocket.close();
			}catch(Exception e){
				e.printStackTrace();
			}
			
			// ch15.chat 1:1 챗팅 해보기
		}
	}
}










