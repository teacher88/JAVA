package io04.Console;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * @Data : 
 * @Author : 강사
 * @Description :      
 */

public class Console01 {
	public static void main(String[] args) throws IOException {
		InputStream is=System.in;
		BufferedInputStream bis=new BufferedInputStream(is);
		
		byte[] data=new byte[20];
		System.out.print("문자입력:");
		int count=bis.read(data);
		String str=new String(data, 0, count-2);       // \r\n 제거
		System.out.println(str);
		
		byte[] suData=new byte[20];
		System.out.print("문자입력:");
		int cnt=bis.read(suData);
		String su=new String(suData, 0, cnt-2);
		int value=Integer.parseInt(su);
		System.out.println(++value);
	}
}
