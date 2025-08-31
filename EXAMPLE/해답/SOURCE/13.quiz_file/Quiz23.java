package io05.Quiz;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Quiz23 {
	public static void main(String[] args){
		File file=null;
		FileInputStream fis=null;
		BufferedInputStream bis=null;
		
		try{
			file=new File("C:\\Temp\\quiz\\quiz23.txt");
			fis=new FileInputStream(file);
			bis=new BufferedInputStream(fis, 1024);
			
			while(true){
				int cnt=bis.read();
				if(cnt==-1) break;
				String str=String.valueOf((char) cnt);
				System.out.print(str.toUpperCase());
			}
			
		}catch(FileNotFoundException e){
			System.out.println("������ ã�� ���Ͽ����ϴ�.");
			e.printStackTrace();
		}catch(IOException e){
			System.out.println("���� ����½� ������ �߻��Ͽ����ϴ�.");
			e.printStackTrace();
		}finally{
			try{
				if(bis !=null) bis.close();
				if(fis !=null) fis.close();
			}catch(Exception e){
				System.out.println("Close Error");
				e.printStackTrace();
			}
		}
	}
}
