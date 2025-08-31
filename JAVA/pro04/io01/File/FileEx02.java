package io01.File;

/**
* @Data :
* @Author : ����
* @Description :  File Ŭ���� - ���丮 ���� ����, ����
*/

import java.io.File;
import java.io.IOException;

public class FileEx02 {
	public static void main(String[] args) throws IOException {
		File dir=new File("C:/MyDir");
		System.out.println("������丮�� �����ϴ°�? " + dir.exists());
		if(dir.exists()==false){
			dir.mkdirs();
			System.out.println("���丮�� ����������ϴ�.");
		}
		
		File file=new File(dir, "abc.txt");
		if(dir.exists()==true && file.isFile()==false){
			file.createNewFile();
			System.out.println("������ ����������ϴ�.");
		}
		
		if(dir.exists() && file.isFile()){	
			file.delete();
			System.out.println("���� ����");
			
			dir.delete();
			System.out.println("\n\n���丮 ����");
		}
	}
}
