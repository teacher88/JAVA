package ch05.quiz02;

import java.util.Scanner;

/**
 * @Data : 
 * @Author : ����
 * @Description :  Ŭ����2- �ǽ����� 26) ��ȭ��ȣ�Է�
 */

class Phone{
	private String name, tel;
	private Scanner sc;
	public Phone(){
		sc=new Scanner(System.in);
		
		System.out.print("�̸� �Է� >>>");
		this.name=sc.next();
		
		System.out.print("��ȭ��ȣ �Է� >>>");
		this.tel=sc.next();
	}
	
	public String getName(){
		return name;
	}
	
	public String getTel(){
		return tel;
	}
	
}

public class Quiz26 {
	public static void main(String[] args) {
		Phone kim=new Phone();
		Phone lee=new Phone();
		System.out.println(kim.getName() + "\t" + kim.getTel());
		System.out.println(lee.getName() + "\t" + lee.getTel());
	}
}
