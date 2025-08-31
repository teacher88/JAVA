package io02.Byte;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @Data : 
 * @Author : 강사
 * @Description :  FileOutputStream - write(byte[] b) 출력스트림으로 주어진 
 *                                             배열b의 모든 바이트를 보낸다.      
 */

public class Byte03 {
	public static void main(String[] args) {
		try{
			File file=new File("C:\\MyDir\\b.txt");
			FileOutputStream fos=new FileOutputStream(file);     
			
			String str="안녕하세요";
			byte[] data=str.getBytes();
			fos.write(data);	 
			
			fos.flush();
			fos.close();		
			
			System.out.println("파일 출력완료");
			
		}catch(FileNotFoundException e){
			System.out.println("파일을 찾지 못하였습니다.");
			e.printStackTrace();
		}catch(IOException e){
			System.out.println("파일 입출력시 에러가 발생하였습니다.");
			e.printStackTrace();
		}
	}
}
