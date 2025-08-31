package io03.Char;

import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.PrintWriter;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @Data : 
 * @Author : 강사
 * @Description :      
 */

public class String04 {
	public static void main(String[] ar){
		FileReader fr=null;
		BufferedReader br=null;
		
		FileWriter fw=null;
		BufferedWriter bw=null;
		PrintWriter pw=null;
		
		try{
			fr=new FileReader("C:/Temp/char/news.txt");                   // Byte08에서도 테스트
			br=new BufferedReader(fr, 1024);
			
			fw=new FileWriter(new File("C:/Temp/char/newsCopy.txt"));
			bw=new BufferedWriter(fw, 1024);
			pw=new PrintWriter(bw);
			
			while(true){
				String str=br.readLine();
				if(str==null) break;
				pw.println(str);
			}
			
			pw.flush();
			System.out.println("출력완료 되었습니다.");	
		}catch(FileNotFoundException e){
			System.out.println("파일이 없습니다.");
			e.printStackTrace();
		}catch(IOException e){
			System.out.println("파일 입출력시 에러가 발생하였습니다.");
			e.printStackTrace();
		}finally{
			try{
				if(br !=null) br.close();
				if(fr !=null) fr.close();
				
				if(pw !=null) pw.close();
				if(bw !=null) bw.close();
				if(fw !=null) fw.close();
			}catch(Exception e){
				System.out.println("Close Error");
				e.printStackTrace();
			}
		}
	}
}
