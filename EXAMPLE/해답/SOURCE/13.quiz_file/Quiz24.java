package io05.Quiz;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Quiz24 {
	public static void main(String[] args){
		File file=null;
		FileReader fr=null;
		BufferedReader br=null;
		
		Scanner sc=new Scanner(System.in);
		System.out.print("���ڸ� �Է�:");
		String word=sc.next();
		
		try{
			file=new File("C:\\Temp\\quiz\\quiz22.txt");
			fr=new FileReader(file);
			br=new BufferedReader(fr, 1024);
			
			while(true){
				String str=br.readLine();
				if(str==null) break;
				if(word.equals(str)) {
					System.out.println("�����ѹ��ڿ� �����մϴ�.[" + str + "]");
				}else{
					System.out.println("�����ѹ��ڿ� �������� �ʽ��ϴ�.");
				}
			}

		}catch(FileNotFoundException e){
			System.out.println("������ �����ϴ�.");
			e.printStackTrace();
		}catch(IOException e){
			System.out.println("���� ����½� ������ �߻��Ͽ����ϴ�." );
			e.printStackTrace();
		}finally{
			try{
				if(br !=null) br.close();
				if(fr !=null) fr.close();
			}catch(Exception e){
				System.out.println("Close Error");
				e.printStackTrace();
			}
			
			sc.close();
		}
	}
}
