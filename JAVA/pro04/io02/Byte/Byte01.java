package io02.Byte;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @Data : 
 * @Author : ����
 * @Description : IO Package - ����Ʈ ��� ��Ʈ���� ���� ��� ��Ʈ��
 *                    ����Ʈ��ݽ�Ʈ�� : �׸�, ��Ƽ�̵��, ���ڸ� ��� ������ �����͸� �ް� ���� �� �ִ�.
 *                    abstract OutputStream -- FileOutputStream, PrintStream, BufferedOutputStream, DataOutputStream
 *                    FileOutputStream - write(int b) ��� ��Ʈ������ 1byte�� ������. (b�� �� 1����Ʈ)            
 */

public class Byte01 {
	public static void main(String[] args) {
		try{
			File file=new File("C:/MyDir/a.txt");                        // ��� ǥ�� ���� ������ pro04 ����
			FileOutputStream fos=new FileOutputStream(file);     // FileOutputStream fos=new FileOutputStream("C:/Temp/abc.txt");
			
			byte[] data=new byte[] {'a','p','p','l', 'e'};	
			fos.write(data);
			
			fos.flush();                                        				// ���ۿ� �ܷ��ϴ� ��� ����Ʈ�� ��� (���ۿ� �ܷ��ϴ� �����͸� ������ ���)
			fos.close();							           					// ����� �ý��� �ڿ��� �ݳ��ϰ� ��� ��Ʈ���� �ݴ´�.
			System.out.println("���� ��¿Ϸ�");      				    // close �� �� ��� ������ �սǿ� �� �� �ִ�.	
		}catch(FileNotFoundException e){
			System.out.println("������ ã�� ���Ͽ����ϴ�.");
			e.printStackTrace();
		}catch(IOException e){
			System.out.println("���� ����½� ������ �߻��Ͽ����ϴ�.");
			e.printStackTrace();
		}
	}
}
