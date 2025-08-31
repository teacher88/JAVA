package io02.Byte;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @Data : 
 * @Author : ����
 * @Description : �̹��� �а�, ����
 */

public class Byte06 {
	public static void main(String[] args) {	
		try{
			File file=new File("C:\\Users\\Public\\Pictures\\Sample Pictures\\Koala.jpg");   // ��� ���� �ٵ� Excel, PDF ��
			
			FileInputStream fis=new FileInputStream(file);
			FileOutputStream fos=new FileOutputStream("C:/MyDir/img.jpg");        // Ȯ���� �ݵ�� �����
	
			while(true){
				int count=fis.read();
				if(count == -1) break;
				fos.write(count);
			}
			
			fos.flush();
			fos.close();
			fis.close();
			
			System.out.println("���� ��� �Ϸ�");		
			
		}catch(FileNotFoundException e){
			System.out.println("������ ã�� ���Ͽ����ϴ�.");
			e.printStackTrace();
		}catch(IOException e){
			System.out.println("���� ����½� ������ �߻��Ͽ����ϴ�.");
			e.printStackTrace();	
		}
	}
}
