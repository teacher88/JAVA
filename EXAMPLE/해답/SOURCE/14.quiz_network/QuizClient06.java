package network08.Quiz;

import java.net.InetSocketAddress;
import java.net.UnknownHostException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

import java.io.IOException;
import java.util.Scanner;

public class QuizClient06 {
	public static void main(String[] ar){
			DatagramSocket soc=null;
			DatagramPacket dp=null;
			Scanner sc=null;
			
			try{
				// ������ ������
				sc=new Scanner(System.in);
				
				System.out.print("ù��° �� �Է�:");
				int su=sc.nextInt();
				
				System.out.print("��ȣ�Է�:");
				char bunho=(char) System.in.read();
				System.in.read();
				System.in.read();
				
				System.out.print("�ι�° �� �Է�:");
				int value=sc.nextInt();
				
				String data=su + "," +  bunho + "," +  value;
				
				InetSocketAddress isa=new InetSocketAddress("127.0.0.1", 7878);
				dp=new DatagramPacket(data.getBytes(), data.getBytes().length, isa);
				soc=new DatagramSocket(9090);
				soc.send(dp);
				
				// ������ �ޱ�
				byte[] by=new byte[65508];
				dp=new DatagramPacket(by, by.length);
				soc.receive(dp);
				String str=new String(dp.getData(), 0, dp.getLength());
				System.out.println("��Ģ���� ���:" + str);
							
		}catch(UnknownHostException e){
			System.out.println("ȣ��Ʈ�� �������� �ʽ��ϴ�.");
			e.printStackTrace();
		}catch(IOException e){
			System.out.println("��Ʈ��ũ ����½� ������ �߻��Ͽ����ϴ�.");
			e.printStackTrace();
		}finally{
			if(!soc.isClosed() || soc !=null) soc.close();
			if(sc !=null) sc.close();
		}
	}
}





