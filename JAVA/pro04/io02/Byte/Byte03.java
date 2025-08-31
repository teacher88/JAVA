package io02.Byte;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @Data : 
 * @Author : ����
 * @Description :  FileOutputStream - write(byte[] b) ��½�Ʈ������ �־��� 
 *                                             �迭b�� ��� ����Ʈ�� ������.      
 */

public class Byte03 {
	public static void main(String[] args) {
		try{
			File file=new File("C:\\MyDir\\b.txt");
			FileOutputStream fos=new FileOutputStream(file);     
			
			String str="�ȳ��ϼ���";
			byte[] data=str.getBytes();
			fos.write(data);	 
			
			fos.flush();
			fos.close();		
			
			System.out.println("���� ��¿Ϸ�");
			
		}catch(FileNotFoundException e){
			System.out.println("������ ã�� ���Ͽ����ϴ�.");
			e.printStackTrace();
		}catch(IOException e){
			System.out.println("���� ����½� ������ �߻��Ͽ����ϴ�.");
			e.printStackTrace();
		}
	}
}
