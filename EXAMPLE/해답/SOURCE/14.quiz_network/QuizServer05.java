package network08.Quiz;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.net.ServerSocket;

public class QuizServer05 {
	public static void main(String[] ar){
		InputStream is=null;
		BufferedInputStream bis=null;
		Socket soc=null;
		ServerSocket ss=null;
		
		try{
			ss=new ServerSocket(777);				
			System.out.println("���� �غ� ���Դϴ�.");
			soc=ss.accept();							
			is=soc.getInputStream();
			bis=new BufferedInputStream(is, 512);
			
			while(true){
				int cnt=bis.read();
				if(cnt==-1) break;
				System.out.print((char) cnt + "\t");
			}
		
		}catch(IOException e){
			System.out.println("��Ʈ��ũ ����½� ������ �߻��Ͽ����ϴ�");
			e.printStackTrace();
		}finally{
			try{
				if(bis !=null) bis.close();
				if(is !=null) is.close();
				if(soc !=null) soc.close();
				if(ss !=null) ss.close();
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}
}



