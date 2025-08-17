package ch05.object;

import java.util.Scanner;

/**
 * @Data : 
 * @Author : 강사
 * @Description :  클래스 - 배열
 */

class TestX{
	private String name;
	private int age;
	private Scanner sc;
	
	public TestX(){
		sc=new Scanner(System.in);
		
		System.out.print("name:");
		name=sc.next();
		
		System.out.print("age:");
		age=sc.nextInt();
		
		System.out.println();
	}
	
	public void disp(){
		System.out.print("name:" +  name + "\t");
		System.out.println("age:" + age);
	}
}
 
public class Exam76 {
	public static void main(String[] ar){
		Scanner sc=new Scanner(System.in);
		
		System.out.print("inwon su:");
		int inwon=sc.nextInt();
		
		TestX[] array=new TestX[inwon];
		
		for(int i=0;i<inwon;i++){
			array[i]=new TestX();
		}
		
		for(int i=0;i<inwon;i++){
			array[i].disp();
		}
		
		sc.close();
	}
}











