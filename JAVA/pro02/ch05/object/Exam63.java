package ch05.object;

/**
 * @Data : 
 * @Author : 강사
 * @Description :  클래스 - 멤버함수
 */

class Person{
	public String name;
	public int age;
	public float ki;
	
	public void disp(){				// instance(member) function, method
		System.out.println("name:" + name);
		System.out.println("age:" + age);
		System.out.println("ki:" +  ki);
		System.out.println();
	}
}
 
public class Exam63 {
	public static void main(String[] ar){
		Person a=new Person();
		a.name="kim";
		a.age=23;
		a.ki=180.2f;
		a.disp();
	
		Person b=new Person();
		b.name="park";
		b.age=25;
		b.ki=170.5f;
		b.disp();
	}
}
