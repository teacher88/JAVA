package network05.Char.TCP;

import java.net.Socket;
import java.net.InetSocketAddress;

import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.BufferedWriter;
import java.io.PrintWriter;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.Scanner;

import java.io.IOException;
import java.net.UnknownHostException;

public class ClientEx {
	public static void main(String[] args) {
		Socket socket=null;
		
		OutputStream os=null;
		OutputStreamWriter osw=null;
		BufferedWriter bw=null;
		PrintWriter pw=null;
		Scanner sc=null;
		
		BufferedReader br=null;
	
		try{		
			InetSocketAddress isa=new InetSocketAddress("localhost", 5656);
			socket=new Socket();				   
			socket.connect(isa);	
			
			// ���
			os=socket.getOutputStream();
			osw=new OutputStreamWriter(os);
			bw=new BufferedWriter(osw, 512);
			pw=new PrintWriter(bw);
			sc=new Scanner(System.in);
			
			System.out.print("������ ����:");
			String msg=sc.nextLine();			
			pw.println(msg);
			pw.flush();
			
			// �Է� : ��ü ���� �ٿ���~~
			br=new BufferedReader(new InputStreamReader(socket.getInputStream()), 512);

			String reply=br.readLine();
			System.out.println("���� ������ �亯 :" + reply);
			
		}catch(UnknownHostException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}finally{	
			try {
				if(sc !=null) sc.close();
				if(os !=null) os.close();
				if(osw !=null) osw.close();
				if(bw !=null) bw.close();
				if(pw !=null) pw.close();

				if(br !=null) br.close();
				if(!socket.isClosed()) socket.close();					
			} catch (IOException e) {
				e.printStackTrace();
			}
	}
	}
}
