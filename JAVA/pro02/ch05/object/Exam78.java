package ch05.object;

/**
 * @Data : 
 * @Author : 강사
 * @Description :  클래스 - static변수, static함수
 */

import java.io.InputStream;
import java.util.Scanner;

class TestQ{
	public int x=10;
	public static int y=20;
	
	public void aa(){ }
	public static void bb() { }
	
	public void disp(){
		System.out.println("x:" + x);
		System.out.println("y:" + y);
		
		aa();
		bb();
	}
	
	public static void print(){
		// System.out.println("x:" + x);  
		System.out.println("y:" + y);
		
		// aa();
		bb();
	}
	
	public void display(){
		Exam78 a=new Exam78();
		System.out.println("[Exam77]-----------");
		System.out.println("x:" + a.x);
		System.out.println("y:" + Exam78.y);
	}
}

public class Exam78 {
	public int x=10;
	public static int y=20;
	
	public static void main(String[] args) {
		TestQ test=new TestQ();
		test.disp();
		TestQ.print();
		System.out.println();
		
		test.x=40;
		TestQ.y=70;
		test.disp();
		
		InputStream is=System.in;
		Scanner sc=new Scanner(is);
		sc.close();
	}
}
