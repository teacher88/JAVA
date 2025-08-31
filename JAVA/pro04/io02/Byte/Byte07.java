package io02.Byte;

import java.io.FileOutputStream;
import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @Data : 
 * @Author : 강사
 * @Description : 보조 스트림 (성능향상보조스트림)- 다른 스트림과 연결되어 여러 가지 편리한 기능을 제공해 주는 스트림
 *                    BufferedOuputStream - 전송한 데이터를 내부 버퍼에 쌓아 두었다가 버퍼가 꽉 차면 한꺼번에 보낸다.
 */

public class Byte07 {
	public static void main(String[] ar){
		FileOutputStream fos=null;
		BufferedOutputStream bos=null;		

		try{
			fos=new FileOutputStream("C:/Temp/byte/d.txt");
			bos=new BufferedOutputStream(fos, 1024);
			
			byte[] data=new byte[] {'a','p','p','l', 'e'};	
			bos.write(data);
			
			bos.flush();
			System.out.println("파일 출력완료");
			
		}catch(FileNotFoundException e){
			System.out.println("파일을 찾지 못했습니다.");
			e.printStackTrace();
		}catch(IOException e){
			System.out.println("파일입출력시 에러가 발생하였습니다.");
			e.printStackTrace();
		}finally{
			try{
				if(bos !=null) bos.close();
				if(fos !=null) fos.close();
			}catch(Exception e){
				System.out.println("Close Error");
				e.printStackTrace();
			}
		}
	}
}
