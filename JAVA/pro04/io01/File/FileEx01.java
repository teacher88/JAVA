package io01.File;


/**
* @Data : 
* @Author : 강사
* @Description :  File 클래스 - 디렉토리 파일 정보
*/

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileEx01 {
	public static void main(String[] ar) throws Exception{
		File[] roots=File.listRoots();
		for(int i=0;i<roots.length;i++){
			System.out.println(i + ":" + roots[i]);
		}
		System.out.println("\n\n");	
		
		File file=new File("D:\\Education\\edu\\01_JAVA\\workspace\\pro01\\bin\\ch01\\dataType");     // \\, /	
		System.out.println("디렉토리 존재하는?" + file.exists() + "\n\n");
		
		if(file.exists()){
			String[] str=file.list();
			for(int i=0;i<str.length;i++){
				System.out.println(str[i]);
			}
		}
		System.out.println("\n\n");
		
		File temp=new File(file, "Exam01.class");
		System.out.println("디렉토리 또는 파일 존재하는?" + temp.exists() + "\n\n");
		System.out.println("디렉토리 또는 파일 존재하는?" + temp.isFile() + "\n\n");
	
		if(temp.exists() && temp.isFile() ){
			System.out.println("파일명:" + temp.getName());
			System.out.println("경로명:" + temp.getParent());
			System.out.println("파일, 경로:" + temp.getAbsolutePath());		// 자기것도 나옴
			System.out.println("쓰기기능:" + temp.canWrite());
			System.out.println("읽기기능:" + temp.canRead());
			System.out.println("파일크기:" + temp.length() + "byte");
			
			SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd a HH:mm");
			System.out.println("날짜:" + sdf.format(new Date(temp.lastModified())));
			System.out.println("디렉토리인가?" +  temp.isDirectory());
			System.out.println("파일인가?" +  temp.isFile());
		}	
		System.out.println("\n\n");
	}
}






