package ch05.object;

import java.util.Scanner;

/**
 * @Data : 
 * @Author : ����
 * @Description :  Ŭ����
 *                     �˾Ƶα�) �ΰ� �̻��� Ŭ������ ����� �ҽ� ������ �������ϸ� ����Ʈ �ڵ� ����(.class) Ŭ���� 
 *                     ������ ���� ��ŭ �����. bin�������� Ȯ�� ����
 */

class Sung{				
	public String name;
	public int kor, eng, mat, tot;
	public float avg;
	
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
  
public class Exam64 {
	public static void main(String[] ar){
		Scanner sc=new Scanner(System.in);
		
		Sung a=new Sung();
		
		System.out.print("�̸�:");
		a.name=sc.next();
		
		System.out.print("����:");
		a.kor=sc.nextInt();
		
		System.out.print("����:");
		a.eng=sc.nextInt();
		
		System.out.print("����:");
		a.mat=sc.nextInt();
		
		a.total();
		a.average();
		a.disp();
		
		sc.close();
	}
}

