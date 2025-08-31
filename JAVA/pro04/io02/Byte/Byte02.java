package io02.Byte;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @Data : 
 * @Author : ����
 * @Description : abstract InputStream -- FileInputStream, BufferedInputStream, DataInputStream
 *                    FileInputStream - read() �Է� ��Ʈ������ ���� 1byte �а� 4byte int Ÿ���� �����Ѵ�..              
 */

public class Byte02 {
	public static void main(String[] args){
		try{
			File file=new File("C:/MyDir/a.txt");
			FileInputStream fis=new FileInputStream(file);
			
			// 1. ���
			/*byte[] byArr=new byte[65536];
			
			int count=fis.read(byArr);                
			System.out.println("count:" + count);
			
			for(int i=0;i<count;i++){
				System.out.print((char) byArr[i]);
			}*/
			
			// 2. ��� : �ѹ� ������ �ִ� by��, byte[2]
			/*byte[] data=new byte[2];
			
			while(true) {			
				int count=fis.read(data);
				System.out.print(count + ":");
				
				if(count==-1) break;
				
				for(int i=0;i<count;i++){
					System.out.print((char) data[i]);
				}
				
				System.out.println();
			}*/
			
			// 3. ���
			while(true){
				int ch=fis.read();												    // ���ϵ� 4byte �� ���� 1byte���� �����Ͱ� ���´�.
				
				if(ch==-1) break;											    // �� �̻� ���� ���ٸ� -1�� ����
				System.out.println(ch + "\t" + (char) ch);														
			} 
			
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
