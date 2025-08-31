package network08.Quiz;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.net.UnknownHostException;
import java.io.IOException;
import java.util.StringTokenizer;

public class QuizServer06 {
	public static void main(String[] ar){
		DatagramPacket dp=null;
		DatagramSocket soc=null;
		InetSocketAddress isa=null;
		
		try{
			System.out.println("���� �غ���....");
			
			// Ŭ���̾�Ʈ ����Ÿ �ޱ�
			isa=new InetSocketAddress(7878);
			soc=new DatagramSocket(isa);
			
			byte[] by=new byte[65508];
			dp=new DatagramPacket(by, by.length);
			
			soc.receive(dp);
			
			String str=new String(dp.getData(), 0, dp.getLength());
			StringTokenizer token=new StringTokenizer(str, ","); 
			
			int su=Integer.parseInt(token.nextToken());
			char buho=token.nextToken().charAt(0);
			int value=Integer.parseInt(token.nextToken());
			
			double result=0.0f;
			String data="";
			if(buho=='+'){
				result=su+value;
				data=new Double(result).toString();
			}else if(buho=='-'){
				result=su-value;
				data=new Double(result).toString();
			}else if(buho=='*'){
				result=su*value;
				data=new Double(result).toString();
			}else if(buho=='/'){
				result=(float) su/value;
				data=new Double(result).toString();
			}else{
				data="�߸� �Է��ϼ̽��ϴ�.";
			}
		
			// Ŭ���̾�Ʈ ������ ������
			isa=new InetSocketAddress(dp.getAddress(), 9090);
			dp=new DatagramPacket(data.getBytes(), data.getBytes().length, isa);
			soc.send(dp);
		}catch(UnknownHostException e){
			System.out.println("ȣ��Ʈ�� �������� �ʽ��ϴ�.");
			e.printStackTrace();
		}catch(IOException e){
			System.out.println("��Ʈ��ũ ����½� ������ �߻��Ͽ����ϴ�.");
			e.printStackTrace();
		}finally{
			if(!soc.isClosed() || soc !=null) soc.close();
		}
	}
}








