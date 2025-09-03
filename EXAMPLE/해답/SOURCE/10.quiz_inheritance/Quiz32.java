package ch06.quiz;

class Employee{
	protected String name, dept, grade;
	protected int number, age;
	
	public Employee(String name, String dept, String grade, int number, int age){
		this.name=name;
		this.dept=dept;
		this.grade=grade;
		this.number=number;
		this.age=age;
	}
	
	public void disp(){
		System.out.println("�ѻ���� �̸���" + name +"�̰� ���̴�" + age);
	}
}

class Manager extends Employee{
	public Manager(String name, String dept, String grade, int number, int age){
		super(name, dept, grade, number, age);
	}
	
	public void disp(){
		System.out.println("�ѻ���� �̸���" + name + "�̰� �μ���" + dept);
	}
}

public class Quiz32 {
	public static void main(String[] args) {
		Manager a=new Manager("ȫ�浿", "���ߺμ�", "�븮", 1234, 27);
		a.disp();
	}
}
