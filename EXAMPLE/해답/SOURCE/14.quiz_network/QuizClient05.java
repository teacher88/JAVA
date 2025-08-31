package network08.Quiz;

import java.io.IOException;
import java.io.OutputStream;
import java.io.BufferedOutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class QuizClient05 {
	public static void main(String[] args) {
		OutputStream is=null;
		BufferedOutputStream bos=null;
		Socket socket=null;
			
		try{
			socket=new Socket("localhost", 777);
			is=socket.getOutputStream();
			bos=new BufferedOutputStream(is, 514);
			
			byte[] array=new byte[]{'A', 'B', 'C', 'D', 'E', 'F'};
			bos.write(array);
			bos.flush();
			System.out.println("���� �Ϸ�");
			
		}catch(UnknownHostException e){
			System.out.println("ȣ��Ʈ�� �������� �ʽ��ϴ�." + e);
		}catch(IOException e){
			System.out.println("��Ʈ��ũ ����½� ������ �߻��Ͽ����ϴ�." + e);
		}finally{
			try{
				if(socket !=null) socket.close();
				if(is !=null) socket.close();
				if(bos !=null) socket.close();
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}
}
