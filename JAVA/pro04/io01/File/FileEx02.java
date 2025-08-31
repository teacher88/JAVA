package io01.File;

/**
* @Data :
* @Author : 강사
* @Description :  File 클래스 - 디렉토리 파일 생성, 삭제
*/

import java.io.File;
import java.io.IOException;

public class FileEx02 {
	public static void main(String[] args) throws IOException {
		File dir=new File("C:/MyDir");
		System.out.println("현재디렉토리가 존재하는가? " + dir.exists());
		if(dir.exists()==false){
			dir.mkdirs();
			System.out.println("디렉토리가 만들어졌습니다.");
		}
		
		File file=new File(dir, "abc.txt");
		if(dir.exists()==true && file.isFile()==false){
			file.createNewFile();
			System.out.println("파일이 만들어졌습니다.");
		}
		
		if(dir.exists() && file.isFile()){	
			file.delete();
			System.out.println("파일 삭제");
			
			dir.delete();
			System.out.println("\n\n디렉토리 삭제");
		}
	}
}
