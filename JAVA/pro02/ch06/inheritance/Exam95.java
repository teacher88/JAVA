package ch06.inheritance;

/**
 * @Data : 
 * @Author : 강사
 * @Description : 상속 - 추상클래스, 추상함수 
 *                    다음 문제) ch06.robotAbstract - Robot, SuperRobot, StandardRobot, LowRobot, RobotMain
 */

abstract class Animal{
	public String kind;
	
	public void breathe(){     				 
		System.out.println("숨을 쉽니다.");
	}
	
	public abstract void sound();
}

class Dog extends Animal{
	public Dog(){
		this.kind="포유류";
	}

	@Override
	public void sound() {
		System.out.println("멍멍");
	}
}

class Cat extends Animal{
	public Cat(){
		this.kind="포유류";
	}

	@Override
	public void sound() {
		System.out.println("야옹");
	}
}

public class Exam95 {
	public static void main(String[] args) {
		Dog dog=new Dog();
		Cat cat=new Cat();
		dog.sound();
		cat.sound();
		System.out.println("---------------- \n");
		
		Animal animal=null;
		animal=new Dog();
		animal.sound();
		animal=new Cat();
		animal.sound();
	}
}
