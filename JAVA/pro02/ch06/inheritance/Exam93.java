package ch06.inheritance;

/**
 * @Data : 
 * @Author : ����
 * @Description :  ��� - upcasting, downcasting
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
		Person p=new Student();		// upcasting  �ڽ�Ŭ������ �θ�Ŭ���� Ÿ������ ��ȯ�ϴ°�
		p.setData("Hi");
		p.getData();
		
		// Student t=new Person();			error
		
		Student s=(Student) new Person();
		s.setData("aaa");
		
		
		// Person e=new Person();	
		// Student u=(Person) e;						error
		
//		Student s=(Student) p;			// downcasting ��ĳ���õ� ���� �ٽ� ������ �ǵ����°�
//		s.setData("�ȳ�");
//		s.getData();
	}
}
