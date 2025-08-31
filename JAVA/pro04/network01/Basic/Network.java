package network01.Basic;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Network {
	public static void main(String[] args) throws UnknownHostException {
	
		InetAddress campus=InetAddress.getByName("www.acorncampus.co.kr");
		System.out.println("IP 주소:" + campus.getHostAddress());						 // ip 주소  192.168.30.17
		System.out.println("도메인 네임:" +campus.getHostName());					     // 도메인네임 www.sist.co.kr
		System.out.println();
				
		InetAddress[] naver=InetAddress.getAllByName("www.naver.com");            // www.google.co.kr
		for(int i=0;i<naver.length;i++){
			System.out.println("IP 주소:" + naver[i].getHostAddress());
			System.out.println("도메인 네임:" + naver[i].getHostName());
		}
		System.out.println();
		
		InetAddress a=InetAddress.getLocalHost();
		System.out.println("IP 주소:" + a.getHostAddress());	             
		System.out.println("도메인 네임:" + a.getHostName());         
		
	}
}


