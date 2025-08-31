package io02.Byte;

import java.io.FileInputStream;
import java.io.BufferedInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @Data : 
 * @Author : 강사
 * @Description : 보조 스트림 (성능향상보조스트림) - 다른 스트림과 연결되어 여러 가지 편리한 기능을 제공해 주는 스트림
 *                    BufferedInputStream - 전송한 데이터를 내부 버퍼에 쌓아 두었다가 버퍼가 꽉 차면 한꺼번에 읽는다.
 */

public class Byte08 {
	public static void main(String[] ar){
		FileInputStream fis=null;
		BufferedInputStream bis=null;
		
		try{
			fis=new FileInputStream("C:/MyDir/a.txt");
			bis=new BufferedInputStream(fis, 1024);
			
			byte[] byArr=new byte[65536];
			int count=bis.read(byArr);                
			System.out.println("count:" + count);
			
			for(int i=0;i<count;i++){
				System.out.print((char) byArr[i]);
			}

		}catch(FileNotFoundException e){
			System.out.println("파일을 찾지 못했습니다.");
			e.printStackTrace();
		}catch(IOException e){
			System.out.println("파일입출력시 에러가 발생하였습니다.");
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
