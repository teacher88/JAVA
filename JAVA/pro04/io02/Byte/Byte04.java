package io02.Byte;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @Data : 
 * @Author : ����
 * @Description : FileInputStream - read(byte[]) �Է� ��Ʈ�����κ��� 
 *                                         �Ű������� �־��� ����Ʈ �迭�� ���� ��ŭ �а� �迭�� ����                      
 */

public class Byte04 {
	public static void main(String[] args){
		try{
			File file=new File("C:\\MyDir\\b.txt");
			FileInputStream fis=new FileInputStream(file);
	
			byte[] msg=new byte[65536];
			int count=fis.read(msg);										 // �迭�� ����(10byte) ��ȯ
			System.out.println(new String(msg, 0, count)); 		 
		
			fis.close();			
		}catch(FileNotFoundException e){
			System.out.println("������ ã�� ���Ͽ����ϴ�.");
			e.printStackTrace();
		}catch(IOException e){
			System.out.println("���� ����½� ������ �߻��Ͽ����ϴ�.");
			e.printStackTrace();
		}
	}
}
