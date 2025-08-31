package io02.Byte;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @Data : 
 * @Author : 강사
 * @Description : 이미지 읽고, 쓰기
 */

public class Byte06 {
	public static void main(String[] args) {	
		try{
			File file=new File("C:\\Users\\Public\\Pictures\\Sample Pictures\\Koala.jpg");   // 모든 파일 다됨 Excel, PDF 등
			
			FileInputStream fis=new FileInputStream(file);
			FileOutputStream fos=new FileOutputStream("C:/MyDir/img.jpg");        // 확장자 반드시 써야함
	
			while(true){
				int count=fis.read();
				if(count == -1) break;
				fos.write(count);
			}
			
			fos.flush();
			fos.close();
			fis.close();
			
			System.out.println("파일 출력 완료");		
			
		}catch(FileNotFoundException e){
			System.out.println("파일을 찾지 못하였습니다.");
			e.printStackTrace();
		}catch(IOException e){
			System.out.println("파일 입출력시 에러가 발생하였습니다.");
			e.printStackTrace();	
		}
	}
}
