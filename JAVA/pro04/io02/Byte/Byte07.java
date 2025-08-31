package io02.Byte;

import java.io.FileOutputStream;
import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @Data : 
 * @Author : ����
 * @Description : ���� ��Ʈ�� (�����������Ʈ��)- �ٸ� ��Ʈ���� ����Ǿ� ���� ���� ���� ����� ������ �ִ� ��Ʈ��
 *                    BufferedOuputStream - ������ �����͸� ���� ���ۿ� �׾� �ξ��ٰ� ���۰� �� ���� �Ѳ����� ������.
 */

public class Byte07 {
	public static void main(String[] ar){
		FileOutputStream fos=null;
		BufferedOutputStream bos=null;		

		try{
			fos=new FileOutputStream("C:/Temp/byte/d.txt");
			bos=new BufferedOutputStream(fos, 1024);
			
			byte[] data=new byte[] {'a','p','p','l', 'e'};	
			bos.write(data);
			
			bos.flush();
			System.out.println("���� ��¿Ϸ�");
			
		}catch(FileNotFoundException e){
			System.out.println("������ ã�� ���߽��ϴ�.");
			e.printStackTrace();
		}catch(IOException e){
			System.out.println("��������½� ������ �߻��Ͽ����ϴ�.");
			e.printStackTrace();
		}finally{
			try{
				if(bos !=null) bos.close();
				if(fos !=null) fos.close();
			}catch(Exception e){
				System.out.println("Close Error");
				e.printStackTrace();
			}
		}
	}
}
