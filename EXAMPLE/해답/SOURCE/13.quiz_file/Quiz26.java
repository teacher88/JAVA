package io05.Quiz;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Quiz26 {
	public static void main(String[] args) {
		File file=null;
		FileWriter fw=null;
		BufferedWriter bw=null;
		Scanner sc=null;
		
		try{
			file=new File("C:/Temp/quiz/quiz26.txt");
			fw=new FileWriter(file);
            bw=new BufferedWriter(fw, 1024);

            sc=new Scanner(System.in);
            System.out.println("�����͸� �Է��� �ּ���. (����: Q)");
            while(true){
            	String str=sc.nextLine();
            	if(str.equalsIgnoreCase("Q")) break;
            	bw.write(str + "\r\n");
            }
            
            System.out.println("����Ǿ����ϴ�.");
            bw.flush();
		}catch(FileNotFoundException e){
			System.out.println("������ �����ϴ�.");
			e.printStackTrace();
		}catch(IOException e){
			System.out.println("���� ����½� ������ �߻��Ͽ����ϴ�.");
			e.printStackTrace();
		}finally{
			try{
				if(sc !=null) sc.close();
				if(fw !=null) fw.close();
				if(bw !=null) bw.close();
			}catch(Exception e){
				System.out.println("Cloase Error");
				e.printStackTrace();
			}
		}
	}
}
