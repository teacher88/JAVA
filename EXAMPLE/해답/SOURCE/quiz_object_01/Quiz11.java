package ch05.quiz01;

import java.util.Scanner;

/**
 * @Data : 
 * @Author : ����
 * @Description :  Ŭ����1 - �ǽ����� 11)
 */

class Employee{
	public String name;			// �̸�
	public int number;			// ���
	public int age;				// ����
	public String title;			// ����
	public String dept;			// �ٹ��μ�
	public String grade;		// �λ���
	
	public void input(){
		Scanner sc=new Scanner(System.in);
		
		System.out.print("�̸�:");
		name=sc.next();
		
		System.out.print("���:");
		number=sc.nextInt();
		
		System.out.print("����:");
		age=sc.nextInt();
		
		System.out.print("����:");
		title=sc.next();
		
		System.out.print("�ٹ��μ�:");
		dept=sc.next();
		
		System.out.print("�λ���:");
		grade=sc.next();
		
		sc.close();
	}
	
	public void output(){
		System.out.println("\n" + name + "\t" + number + "\t" + age + "\t" + title + "\t" + dept + "\t" + grade);
	}
	
}
  
public class Quiz11 {
	public static void main(String[] ar){
		Employee emp=new Employee();
		emp.input();
		emp.output();
	}
}

