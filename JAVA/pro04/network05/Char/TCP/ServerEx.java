package network05.Char.TCP;

import java.net.ServerSocket;
import java.net.Socket;
import java.net.InetSocketAddress;

import java.io.OutputStreamWriter;
import java.io.BufferedWriter;
import java.io.PrintWriter;
import java.util.Scanner;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;

import java.io.IOException;

public class ServerEx {
	public static void main(String[] args) {
		ServerSocket serverSocket=null;
		Socket socket=null;
		
		InputStream is=null;
		InputStreamReader isr=null;
		BufferedReader br=null;

		BufferedWriter bw=null;
		PrintWriter pw=null;
		Scanner sc=null;
		
		try {
			InetSocketAddress isa=new InetSocketAddress(5656);
			serverSocket=new ServerSocket();		
			serverSocket.bind(isa);							
			System.out.println("������ ������ ��ٸ��� �ֽ��ϴ�.");
			
			// �Է�
			socket=serverSocket.accept();	
			is=socket.getInputStream();
			isr=new InputStreamReader(is);
			br=new BufferedReader(isr, 512);
			
			String msg=br.readLine();
			System.out.println("[ " +  socket.getInetAddress().getHostName() + "]: ");
			System.out.println("Ŭ���̾�Ʈ �޽���:" + msg + "\n\n");
		
			// ���   ��ü ���� �ٿ���~~
			bw=new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()), 512);
			pw=new PrintWriter(bw);
			sc=new Scanner(System.in);
			
			System.out.print("�亯 ����:");
			String reply=sc.nextLine();
			
			pw.println(reply);
			pw.flush();
			
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			try{				
				if(is !=null) is.close();
				if(isr !=null) isr.close();
				if(br !=null) br.close();
				
				if(sc !=null) sc.close();
				if(bw !=null) bw.close();
				if(pw !=null) pw.close();
				
				if(!socket.isClosed()) socket.close();
				if(!serverSocket.isClosed()) serverSocket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
