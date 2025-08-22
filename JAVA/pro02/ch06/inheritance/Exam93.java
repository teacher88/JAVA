package ch06.inheritance;

/**
 * @Data : 
 * @Author : 강사
 * @Description :  상속 - upcasting, downcasting
 */

class Person{
	protected String massage;
	public void setData(String massage){
		this.massage=massage;
	}
	public String getData(){
		return massage;
	}
}

class Student extends Person{
	public void setData(String massage){
		this.massage=massage;
		System.out.println("Student setData method...");
		System.out.println(massage);
	}
}

public class Exam93 {
	public static void main(String[] args) {
		Person p=new Student();		// upcasting  자식클래스가 부모클래스 타입으로 변환하는것
		p.setData("Hi");
		p.getData();
		
		// Student t=new Person();			error
		
		Student s=(Student) new Person();
		s.setData("aaa");
		
		
		// Person e=new Person();	
		// Student u=(Person) e;						error
		
//		Student s=(Student) p;			// downcasting 업캐스팅된 것을 다시 원래로 되돌리는것
//		s.setData("안녕");
//		s.getData();
	}
}
