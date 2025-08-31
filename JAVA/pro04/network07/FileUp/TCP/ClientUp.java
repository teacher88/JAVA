package network07.FileUp.TCP;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.Socket;

public class ClientUp {
	public static void main(String[] args) {	
		FileInputStream fis=null;
		BufferedInputStream bis=null;
		
		Socket socket=null;
		BufferedOutputStream bos=null;

		try{
			File file=new File("C:\\MyDir\\pengsu.jpg");
			
			if(file.exists() && file.isFile()) {		
				fis=new FileInputStream(file);
				bis=new BufferedInputStream(fis, 512);
				
				socket=new Socket("localhost", 5001);
				bos=new BufferedOutputStream(socket.getOutputStream(), 512);
				
				while(true){
					int count=bis.read();
					if(count == -1) break;
					bos.write(count);
				}
				bos.flush();
				
				System.out.println("파일보내기 완료");
				
			}
			
		
		}catch(IOException e){
			e.printStackTrace();
		}finally{
			try{
				if(fis !=null) fis.close();
				if(bis !=null) bis.close();
				if(bos !=null) bos.close();
				if(!socket.isClosed()) socket.close();
			}catch(IOException e){
				e.printStackTrace();
			}
		}
	}
}
