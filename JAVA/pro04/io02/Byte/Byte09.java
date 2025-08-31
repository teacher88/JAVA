package io02.Byte;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @Data : 
 * @Author : ����
 * @Description : �̹��� �а�, ����
 */

public class Byte09 {
	public static void main(String[] args) {	
		FileInputStream fis=null;
		BufferedInputStream bis=null;
		
		FileOutputStream fos=null;
		BufferedOutputStream bos=null;
		
		try{
			fis=new FileInputStream("C:\\MyDir\\pengsu.jpg");   // ����, �׼�, txt ���� �ٵ�																							
			bis=new BufferedInputStream(fis, 1024);
			
		    fos=new FileOutputStream("C:\\MyDir\\pengsuout3.jpg");         
		    bos=new BufferedOutputStream (fos, 1024);
			
			while(true){
				int count=bis.read();
				if(count==-1) break;		
				bos.write(count);
			}
			
			bos.flush();
			System.out.println("���� ��� �Ϸ�");		
			
		}catch(FileNotFoundException e){
			System.out.println("������ ã�� ���Ͽ����ϴ�.");
			e.printStackTrace();
		}catch(IOException e){
			System.out.println("���� ����½� ������ �߻��Ͽ����ϴ�.");
			e.printStackTrace();	
		}finally{
			try{
				if(bos !=null) bos.close();
				if(fos !=null) fos.close();
				if(bis !=null) bis.close();
				if(fis !=null) fis.close();
			}catch(Exception e){
				System.out.println("Close Error");
				e.printStackTrace();	
			}
		}
	}
}
