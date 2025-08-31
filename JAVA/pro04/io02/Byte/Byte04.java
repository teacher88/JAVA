package io02.Byte;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @Data : 
 * @Author : 강사
 * @Description : FileInputStream - read(byte[]) 입력 스트림으로부터 
 *                                         매개값으로 주어진 바이트 배열의 길이 만큼 읽고 배열에 저장                      
 */

public class Byte04 {
	public static void main(String[] args){
		try{
			File file=new File("C:\\MyDir\\b.txt");
			FileInputStream fis=new FileInputStream(file);
	
			byte[] msg=new byte[65536];
			int count=fis.read(msg);										 // 배열의 갯수(10byte) 반환
			System.out.println(new String(msg, 0, count)); 		 
		
			fis.close();			
		}catch(FileNotFoundException e){
			System.out.println("파일을 찾지 못하였습니다.");
			e.printStackTrace();
		}catch(IOException e){
			System.out.println("파일 입출력시 에러가 발생하였습니다.");
			e.printStackTrace();
		}
	}
}
