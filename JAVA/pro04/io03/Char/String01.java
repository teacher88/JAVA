package io03.Char;

/**
 * @Data : 
 * @Author : ����
 * @Description : FileWriter - write(String str) ��½�Ʈ������ �־��� ���ڿ��� ���κ�����.       
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
				
				System.out.println("���ڿ��� �Է��ϼ���:");
				sc=new Scanner(System.in);
				
				while(true){
					String msg=sc.nextLine();
					
					if(msg.equalsIgnoreCase("q")) break;
					
					bw.write(msg +"\r\n");			
					bw.flush();
				}
				
				System.out.println("��µǾ����ϴ�.");
				
			}catch(IOException e){
				System.out.println("���� ����½� ������ �߻��Ͽ����ϴ�.");
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
