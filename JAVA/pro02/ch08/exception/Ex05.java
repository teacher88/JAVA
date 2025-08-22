package ch08.exception;

/**
 * @Data : 
 * @Author : 강사
 * @Description :    예외 처리 -  - ClassCastException 
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
			Dog dog=(Dog) animal;     				// Cat일 경우는 에러 발생
		}catch(ClassCastException e){
			System.out.println("클래스 형변환 에러 발생");
		}
		
	/* b=animal instanceof Dog;		
		System.out.println("b:" + b);
		
		if(animal instanceof Dog){			// 왼쪽에 있는 객체가 오른쪽 타입인가? 즉 Dog부터 생성된 인스턴스(객체)인가? 를 물어봄
			Dog dog=(Dog) animal;
		}else if(animal instanceof Cat){
			Cat cat=(Cat) animal; 
		} */
	}
}



