package io02.Byte;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @Data : 
 * @Author : 강사
 * @Description : FileInputStream - read(byte[] b, int off, int len) 
 *                                         매개값으로 주어진 바이트 배열b[off]부터 len개까지 저장한다.
 */

public class Byte05 {
	public static void main(String[] args) {
		try{
			File inFile=new File("C:\\Users\\sist\\Desktop\\AI\\news.txt");
			FileInputStream fis=new FileInputStream(inFile);
			
			File outFile=new File("C:\\Users\\sist\\Desktop\\AI\\new.txt");
			FileOutputStream fos=new FileOutputStream(outFile);   
	
			// 파일읽고, 쓰기
			/* while(true){ 
					int count=fis.read();  	 	
					if(count==-1) break;	
					fos.write(count);	 
				}
			}*/
			
			// 2. 파일로 읽고 콘솔출력 후 파일로 출력 
			byte[] data=new byte[1000];
			while(true) {
				int count=fis.read(data);
				if(count==-1) break;
				System.out.println(new String(data));
				
				fos.write(data);
			}
			
			fos.flush();
			fos.close();
			fis.close();	
			
			System.out.println("출력 완료");
			
		}catch(FileNotFoundException e){
			System.out.println("파일을 찾지 못하였습니다.");
			e.printStackTrace();
		}catch(IOException e){
			System.out.println("파일 입출력시 에러가 발생하였습니다.");
			e.printStackTrace();
		}
	}
}
