package io02.Byte;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @Data : 
 * @Author : 강사
 * @Description : IO Package - 바이트 기반 스트림과 문자 기반 스트림
 *                    바이트기반스트림 : 그림, 멀티미디어, 문자를 모든 종류의 데이터를 받고 보낼 수 있다.
 *                    abstract OutputStream -- FileOutputStream, PrintStream, BufferedOutputStream, DataOutputStream
 *                    FileOutputStream - write(int b) 출력 스트림으로 1byte를 보낸다. (b의 끝 1바이트)            
 */

public class Byte01 {
	public static void main(String[] args) {
		try{
			File file=new File("C:/MyDir/a.txt");                        // 경로 표시 하지 않으면 pro04 저장
			FileOutputStream fos=new FileOutputStream(file);     // FileOutputStream fos=new FileOutputStream("C:/Temp/abc.txt");
			
			byte[] data=new byte[] {'a','p','p','l', 'e'};	
			fos.write(data);
			
			fos.flush();                                        				// 버퍼에 잔류하는 모든 바이트를 출력 (버퍼에 잔류하는 데이터를 강제로 출력)
			fos.close();							           					// 사용한 시스템 자원을 반납하고 출력 스트림을 닫는다.
			System.out.println("파일 출력완료");      				    // close 안 할 경우 데이터 손실에 될 수 있다.	
		}catch(FileNotFoundException e){
			System.out.println("파일을 찾지 못하였습니다.");
			e.printStackTrace();
		}catch(IOException e){
			System.out.println("파일 입출력시 에러가 발생하였습니다.");
			e.printStackTrace();
		}
	}
}
