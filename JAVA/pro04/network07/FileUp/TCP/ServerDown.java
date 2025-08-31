package network07.FileUp.TCP;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDown {
	public static void main(String[] args) {
		ServerSocket serverSocket=null;
		Socket socket=null;
		BufferedInputStream bis=null;
		
		FileOutputStream fos=null;
		BufferedOutputStream bos=null;
		
		try {
			serverSocket=new ServerSocket(5001);		
			System.out.println("������ ������ ��ٸ��� �ֽ��ϴ�.");
			socket=serverSocket.accept();		
			
			bis=new BufferedInputStream(socket.getInputStream(), 512);
			
			File file=new File("D:\\teacher\\java\\network.jpg");
			fos=new FileOutputStream(file);
			bos=new BufferedOutputStream(fos, 512);
			
			while(true){
				int count=bis.read();
				if(count == -1) break;
				bos.write(count);
			}
			
			bos.flush();
			System.out.println("���� �ޱ� �Ϸ�");
			
			if(file.isFile()){
				System.out.println(file.getName() + "\t\t" + file.getAbsolutePath() + "\t\t" + file.length());
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			try{
				if(fos!=null) fos.close();
				if(bis !=null) bis.close();
				if(!socket.isClosed()) socket.close();
				if(!serverSocket.isClosed()) serverSocket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
