package network03.Byte.TCP;

import java.net.InetSocketAddress;
import java.net.Socket;

import java.io.OutputStream;
import java.io.BufferedOutputStream;
import java.util.Scanner;
import java.io.IOException;

public class ClientEx {
	public static void main(String[] args) {
		Socket socket=null;
		OutputStream os=null;
		BufferedOutputStream bos=null;
		Scanner sc=null;
		
		try{		
			InetSocketAddress isa=new InetSocketAddress("211.238.142.124", 1234);
			socket=new Socket();				   
			socket.connect(isa);	
			os=socket.getOutputStream();
			
			bos=new BufferedOutputStream(os, 512);
			sc=new Scanner(System.in);
			
			System.out.print("전송할 문자:");
			String msg=sc.nextLine();
			
			bos.write(msg.getBytes("utf-8"));
			bos.flush();
			
		}catch(IOException e){
			e.printStackTrace();
		}finally{	
			try {
				if(sc !=null) sc.close();
				if(bos !=null) bos.close();
				if(os !=null) os.close();
				if(!socket.isClosed()) socket.close();						
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
