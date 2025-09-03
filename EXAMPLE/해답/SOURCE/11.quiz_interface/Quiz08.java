package ch07.quiz;

interface Soundable{		
	public String sound();
}

class Cat implements Soundable{
	@Override
	public String sound() {	
		return ("�߿�");
	}
}

class Dog implements Soundable{
	@Override
	public String sound() {
		return ("�۸�");
	}	
}

public class Quiz08 {
	public static void main(String[] args) {
		printSound(new Cat());
		printSound(new Dog());
	}

	public static void printSound(Soundable soundable){
		System.out.println(soundable.sound());
	}
}
