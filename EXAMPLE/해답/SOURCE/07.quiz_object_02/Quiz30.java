package ch05.quiz02;

import java.util.Scanner;

/**
 * @Data :
 * @Author : ����
 * @Description :  Ŭ����2- �ǽ����� 29) �ݼ���ǥ
 */

class SungJuk{
	private String name;
	private int kor, eng, mat, tot;
	private float avg;
	private Scanner sc;
	
	private static int banTot;
	private static float banAvg;
	private static int inwon;
	
	public SungJuk(){
		++inwon;
		
		sc=new Scanner(System.in);
		
		System.out.print("�̸�:");
		name=sc.next();
		
		System.out.print("����:");
		kor=sc.nextInt();
		
		System.out.print("����:");
		eng=sc.nextInt();
		
		System.out.print("����:");
		mat=sc.nextInt();
		
		System.out.println();
	}
	
	public void total(){
		tot=kor+eng+mat;
	}
	
	public void average(){
		avg=(float)tot/3;
	}
	
	public void banTotal(){
		banTot=banTot+tot;
	}
	
	public void banAverage(){
		banAvg=banTot/(inwon*3);
	}
	
	public void disp(){
		System.out.println(name + "\t" + kor + "\t" + eng + "\t" + mat + "\t" + tot + "\t" + avg);
	}
	
	public static void title(){
		System.out.println("�̸�\t" + "����\t" + "����\t" + "����\t" + "����\t"+ "���\t");
	}
	
	public static void banDisp(){
		System.out.println("====================");
		System.out.print("������:" + banTot + "\t");
		System.out.print("�����:" + banAvg + "\t");
		System.out.println("�ο���:" + inwon);
	}
}

public class Quiz30 {
	public static void main(String[] ar){
		Scanner sc=new Scanner(System.in);
		
		System.out.print("�ο��� �Է�:");
		int inwon=sc.nextInt();
		
		SungJuk[] array=new SungJuk[inwon];		
		for(int i=0;i<array.length;i++){
			array[i]=new SungJuk();
		}
		
		SungJuk.title();
		for(int i=0;i<array.length;i++){
			array[i].total();
			array[i].average();
			array[i].disp();
			array[i].banTotal();
			array[i].banAverage();
		}
		SungJuk.banDisp();
				
		sc.close();
	}
}
