package network01.Basic;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Network {
	public static void main(String[] args) throws UnknownHostException {
	
		InetAddress campus=InetAddress.getByName("www.acorncampus.co.kr");
		System.out.println("IP �ּ�:" + campus.getHostAddress());						 // ip �ּ�  192.168.30.17
		System.out.println("������ ����:" +campus.getHostName());					     // �����γ��� www.sist.co.kr
		System.out.println();
				
		InetAddress[] naver=InetAddress.getAllByName("www.naver.com");            // www.google.co.kr
		for(int i=0;i<naver.length;i++){
			System.out.println("IP �ּ�:" + naver[i].getHostAddress());
			System.out.println("������ ����:" + naver[i].getHostName());
		}
		System.out.println();
		
		InetAddress a=InetAddress.getLocalHost();
		System.out.println("IP �ּ�:" + a.getHostAddress());	             
		System.out.println("������ ����:" + a.getHostName());         
		
	}
}


