package ch08.exception;

/**
 * @Data : 
 * @Author : ����
 * @Description :    ���� ó�� -  - ClassCastException 
 */

class Animal { }
class Dog extends Animal { }
class Cat extends Animal { }

public class Ex05 {
	public static void main(String[] args) {
		Dog dog=new Dog();
		changeDog(dog);
		
		Cat cat=new Cat();
		changeDog(cat);
	}
	
	public static void changeDog(Animal animal){
		try{
			Dog dog=(Dog) animal;     				// Cat�� ���� ���� �߻�
		}catch(ClassCastException e){
			System.out.println("Ŭ���� ����ȯ ���� �߻�");
		}
		
	/* b=animal instanceof Dog;		
		System.out.println("b:" + b);
		
		if(animal instanceof Dog){			// ���ʿ� �ִ� ��ü�� ������ Ÿ���ΰ�? �� Dog���� ������ �ν��Ͻ�(��ü)�ΰ�? �� ���
			Dog dog=(Dog) animal;
		}else if(animal instanceof Cat){
			Cat cat=(Cat) animal; 
		} */
	}
}



