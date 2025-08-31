package network04.Char.TCP;

import java.net.Socket;
import java.net.InetSocketAddress;

import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.BufferedWriter;
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
		
		try{		
			InetSocketAddress isa=new InetSocketAddress("192.168.30.17", 7890);
			socket=new Socket();				   
			socket.connect(isa);	
			os=socket.getOutputStream();
			
			osw=new OutputStreamWriter(os);
			bw=new BufferedWriter(osw, 512);
			pw=new PrintWriter(bw);
			sc=new Scanner(System.in);
			
			System.out.print("������ ����:");
			String msg=sc.nextLine();
			
			pw.write(msg);
			pw.flush();
			
		}catch(UnknownHostException e){
			System.out.println("ȣ��Ʈ�� �������� �ʽ��ϴ�.");
			e.printStackTrace();
		}catch(IOException e){
			System.out.println("��Ʈ��ũ ����½� ������ �߻��Ͽ����ϴ�.");
			e.printStackTrace();
		}finally{	
			try {
				if(sc !=null) sc.close();
				if(bw !=null) bw.close();
				if(osw !=null) osw.close();
				if(os !=null) os.close();
				if(!socket.isClosed()) socket.close();						
			} catch (IOException e) {
				e.printStackTrace();
			}
	}
	}
}
