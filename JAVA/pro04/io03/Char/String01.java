package io03.Char;

/**
 * @Data : 
 * @Author : 강사
 * @Description : FileWriter - write(String str) 출력스트림으로 주어진 문자열을 전부보낸다.       
 */

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class String01 {
	public static void main(String[] args) {
			FileWriter fw=null;
			BufferedWriter bw=null;
			Scanner sc=null;
			
			try{
				fw=new FileWriter("C:/Temp/char/c.txt");
				bw=new BufferedWriter(fw, 1024);
				
				System.out.println("문자열을 입력하세요:");
				sc=new Scanner(System.in);
				
				while(true){
					String msg=sc.nextLine();
					
					if(msg.equalsIgnoreCase("q")) break;
					
					bw.write(msg +"\r\n");			
					bw.flush();
				}
				
				System.out.println("출력되었습니다.");
				
			}catch(IOException e){
				System.out.println("파일 입출력시 에러가 발생하였습니다.");
				e.printStackTrace();
			}finally{
				try{
					if(sc !=null) sc.close();
					if(bw !=null) bw.close();
					if(fw !=null) fw.close();
				}catch(Exception e){
					System.out.println("Close Error");
					e.printStackTrace();
				}
			}
	}
}
