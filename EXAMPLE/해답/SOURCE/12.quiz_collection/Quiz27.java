package api13.Quiz;

import java.util.HashMap;
import java.util.Scanner;

class Student{
	private String name;
	private String deptName;
	private String number;
	private float average;

	public Student(){
		Scanner sc=new Scanner(System.in);
		
		System.out.print("�̸�:");
		name=sc.next();
		
		System.out.print("�а�:");
		deptName=sc.next();
		
		System.out.print("�й�:");
		number=sc.next();
		
		System.out.print("�������:");
		average=sc.nextFloat();
		System.out.println();
	}
	
	public void disp(){
		System.out.println(name + "\t" + deptName + "\t" + number + "\t" + average);
	}
	
	public String getNumber(){
		return number;
	}
}

public class Quiz27 {
	public static void main(String[] args) {	
		Student kim=new Student(); 
		Student park=new Student();
		Student lee=new Student();
		Student cho=new Student();
		Student hong=new Student();
		
		HashMap<String, Student> map=new HashMap<String, Student>();
		map.put(kim.getNumber(), kim);
		map.put(park.getNumber(), park);
	    map.put(lee.getNumber(), lee);
	    map.put(cho.getNumber(), cho);
	    map.put(hong.getNumber(), hong);
	    
	    Scanner sc=new Scanner(System.in);
	    System.out.print("�˻��� �й��� �Է��ϼ���:");
	    String number=sc.next();
	    
	    Student result=(Student) map.get(number);
	    result.disp();
	    sc.close();
	}
}







