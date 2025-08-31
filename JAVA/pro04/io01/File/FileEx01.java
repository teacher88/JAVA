package io01.File;


/**
* @Data : 
* @Author : ����
* @Description :  File Ŭ���� - ���丮 ���� ����
*/

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileEx01 {
	public static void main(String[] ar) throws Exception{
		File[] roots=File.listRoots();
		for(int i=0;i<roots.length;i++){
			System.out.println(i + ":" + roots[i]);
		}
		System.out.println("\n\n");	
		
		File file=new File("D:\\Education\\edu\\01_JAVA\\workspace\\pro01\\bin\\ch01\\dataType");     // \\, /	
		System.out.println("���丮 �����ϴ�?" + file.exists() + "\n\n");
		
		if(file.exists()){
			String[] str=file.list();
			for(int i=0;i<str.length;i++){
				System.out.println(str[i]);
			}
		}
		System.out.println("\n\n");
		
		File temp=new File(file, "Exam01.class");
		System.out.println("���丮 �Ǵ� ���� �����ϴ�?" + temp.exists() + "\n\n");
		System.out.println("���丮 �Ǵ� ���� �����ϴ�?" + temp.isFile() + "\n\n");
	
		if(temp.exists() && temp.isFile() ){
			System.out.println("���ϸ�:" + temp.getName());
			System.out.println("��θ�:" + temp.getParent());
			System.out.println("����, ���:" + temp.getAbsolutePath());		// �ڱ�͵� ����
			System.out.println("������:" + temp.canWrite());
			System.out.println("�б���:" + temp.canRead());
			System.out.println("����ũ��:" + temp.length() + "byte");
			
			SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd a HH:mm");
			System.out.println("��¥:" + sdf.format(new Date(temp.lastModified())));
			System.out.println("���丮�ΰ�?" +  temp.isDirectory());
			System.out.println("�����ΰ�?" +  temp.isFile());
		}	
		System.out.println("\n\n");
	}
}






