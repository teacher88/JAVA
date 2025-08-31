package io03.Char;

import java.io.BufferedReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @Data : 
 * @Author : 강사
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
			System.out.println("파일이 없습니다.");
			e.printStackTrace();
		}catch(IOException e){
			System.out.println("파일 입출력시 에러가 발생하였습니다.");
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
