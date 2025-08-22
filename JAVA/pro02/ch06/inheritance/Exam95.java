package ch06.inheritance;

/**
 * @Data : 
 * @Author : ����
 * @Description : ��� - �߻�Ŭ����, �߻��Լ� 
 *                    ���� ����) ch06.robotAbstract - Robot, SuperRobot, StandardRobot, LowRobot, RobotMain
 */

abstract class Animal{
	public String kind;
	
	public void breathe(){     				 
		System.out.println("���� ���ϴ�.");
	}
	
	public abstract void sound();
}

class Dog extends Animal{
	public Dog(){
		this.kind="������";
	}

	@Override
	public void sound() {
		System.out.println("�۸�");
	}
}

class Cat extends Animal{
	public Cat(){
		this.kind="������";
	}

	@Override
	public void sound() {
		System.out.println("�߿�");
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
