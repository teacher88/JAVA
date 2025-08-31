package io03.Char;

import java.io.BufferedReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @Data : 
 * @Author : ����
 * @Description :      
 */

public class String03 {
	public static void main(String[] args) {	
		FileReader fr=null;
		BufferedReader br=null;
		
		try{
			fr=new FileReader("C:/Temp/char/c.txt");
			br=new BufferedReader(fr, 1024);
			
			while(true){
				String str=br.readLine();
				if(str==null) break;
				System.out.println(str);
			}
			
		}catch(FileNotFoundException e){
			System.out.println("������ �����ϴ�.");
			e.printStackTrace();
		}catch(IOException e){
			System.out.println("���� ����½� ������ �߻��Ͽ����ϴ�.");
			e.printStackTrace();
		}finally{
			try{
				if(fr !=null) fr.close();
				if(br !=null) br.close();
			}catch(Exception e){
				System.out.println("Close Error");
				e.printStackTrace();
			}
		}
	}
}
