package ch05.object;

import java.util.Scanner;

/**
 * @Data : 
 * @Author : ����
 * @Description :  Ŭ����
 */

class HakJum{
	public String name;      
	public int kor, eng, mat,tot;
	public float avg;

	public void input(){			
		Scanner  sc=new Scanner(System.in);
		
		System.out.print("�̸�:");
		name=sc.next();
		
		System.out.print("����:");
		kor=sc.nextInt();
		
		System.out.print("����:");
		eng=sc.nextInt();
		
		System.out.print("����:");
		mat=sc.nextInt();
		
		// sc.close();  error
	}
	
	public void total(){
		tot=kor+eng+mat;
	}
	
	public void average(){
		avg=(float)tot/3;
	}
	
	public void disp(){
		System.out.println("name:" + name);
		System.out.println("kor:" + kor);
		System.out.println("eng:" + eng);
		System.out.println("mat:" + mat);
		System.out.println("tot:" + tot);
		System.out.println("avg:" + avg);
		System.out.println();
	}
	
}

public class Exam65{
	public static void main(String[]ar){
		HakJum a=new HakJum();
		a.input();
		a.total();
		a.average();
		a.disp();
		
		HakJum b=new HakJum();
		b.input();
		b.total();
		b.average();
		b.disp();

	}
}
