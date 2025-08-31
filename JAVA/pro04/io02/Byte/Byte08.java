package io02.Byte;

import java.io.FileInputStream;
import java.io.BufferedInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @Data : 
 * @Author : ����
 * @Description : ���� ��Ʈ�� (�����������Ʈ��) - �ٸ� ��Ʈ���� ����Ǿ� ���� ���� ���� ����� ������ �ִ� ��Ʈ��
 *                    BufferedInputStream - ������ �����͸� ���� ���ۿ� �׾� �ξ��ٰ� ���۰� �� ���� �Ѳ����� �д´�.
 */

public class Byte08 {
	public static void main(String[] ar){
		FileInputStream fis=null;
		BufferedInputStream bis=null;
		
		try{
			fis=new FileInputStream("C:/MyDir/a.txt");
			bis=new BufferedInputStream(fis, 1024);
			
			byte[] byArr=new byte[65536];
			int count=bis.read(byArr);                
			System.out.println("count:" + count);
			
			for(int i=0;i<count;i++){
				System.out.print((char) byArr[i]);
			}

		}catch(FileNotFoundException e){
			System.out.println("������ ã�� ���߽��ϴ�.");
			e.printStackTrace();
		}catch(IOException e){
			System.out.println("��������½� ������ �߻��Ͽ����ϴ�.");
			e.printStackTrace();
		}finally{
			try{
				if(bis !=null) bis.close();
				if(fis !=null) fis.close();
			}catch(Exception e){
				System.out.println("Close Error");
				e.printStackTrace();
			}
		}
	}
}
