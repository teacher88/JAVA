package io02.Byte;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @Data : 
 * @Author : ����
 * @Description : FileInputStream - read(byte[] b, int off, int len) 
 *                                         �Ű������� �־��� ����Ʈ �迭b[off]���� len������ �����Ѵ�.
 */

public class Byte05 {
	public static void main(String[] args) {
		try{
			File inFile=new File("C:\\Users\\sist\\Desktop\\AI\\news.txt");
			FileInputStream fis=new FileInputStream(inFile);
			
			File outFile=new File("C:\\Users\\sist\\Desktop\\AI\\new.txt");
			FileOutputStream fos=new FileOutputStream(outFile);   
	
			// �����а�, ����
			/* while(true){ 
					int count=fis.read();  	 	
					if(count==-1) break;	
					fos.write(count);	 
				}
			}*/
			
			// 2. ���Ϸ� �а� �ܼ���� �� ���Ϸ� ��� 
			byte[] data=new byte[1000];
			while(true) {
				int count=fis.read(data);
				if(count==-1) break;
				System.out.println(new String(data));
				
				fos.write(data);
			}
			
			fos.flush();
			fos.close();
			fis.close();	
			
			System.out.println("��� �Ϸ�");
			
		}catch(FileNotFoundException e){
			System.out.println("������ ã�� ���Ͽ����ϴ�.");
			e.printStackTrace();
		}catch(IOException e){
			System.out.println("���� ����½� ������ �߻��Ͽ����ϴ�.");
			e.printStackTrace();
		}
	}
}
