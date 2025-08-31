package io05.Quiz;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Quiz22 {
	public static void main(String[] args) {
		File file=null;
		FileReader fr=null;
		BufferedReader br=null;
		
		try{
			file=new File("C:\\Temp\\quiz\\quiz22.txt");
			fr=new FileReader(file);
			br=new BufferedReader(fr, 1024);
			
			int count=0;
			while(true){
				String str=br.readLine();
				if(str==null) break;
				System.out.println(++count +"\t" + str);
			}
		}catch(FileNotFoundException e){
			System.out.println("������ �����ϴ�.");
			e.printStackTrace();
		}catch(IOException e){
			System.out.println("���� ����½� ������ �߻��Ͽ����ϴ�." );
			e.printStackTrace();
		}finally{
			try{
				if(br !=null) br.close();
				if(fr !=null) fr.close();
			}catch(Exception e){
				System.out.println("Close Error");
				e.printStackTrace();
			}
		}
	}
}
