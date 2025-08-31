package io02.Byte;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @Data : 
 * @Author : 강사
 * @Description : abstract InputStream -- FileInputStream, BufferedInputStream, DataInputStream
 *                    FileInputStream - read() 입력 스트림으로 부터 1byte 읽고 4byte int 타입을 리턴한다..              
 */

public class Byte02 {
	public static void main(String[] args){
		try{
			File file=new File("C:/MyDir/a.txt");
			FileInputStream fis=new FileInputStream(file);
			
			// 1. 방식
			/*byte[] byArr=new byte[65536];
			
			int count=fis.read(byArr);                
			System.out.println("count:" + count);
			
			for(int i=0;i<count;i++){
				System.out.print((char) byArr[i]);
			}*/
			
			// 2. 방식 : 한번 읽을수 있는 by수, byte[2]
			/*byte[] data=new byte[2];
			
			while(true) {			
				int count=fis.read(data);
				System.out.print(count + ":");
				
				if(count==-1) break;
				
				for(int i=0;i<count;i++){
					System.out.print((char) data[i]);
				}
				
				System.out.println();
			}*/
			
			// 3. 방식
			while(true){
				int ch=fis.read();												    // 리턴된 4byte 중 끝의 1byte에만 데이터가 들어온다.
				
				if(ch==-1) break;											    // 더 이상 읽을 없다면 -1을 리턴
				System.out.println(ch + "\t" + (char) ch);														
			} 
			
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
