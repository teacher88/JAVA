package ch06.inheritance;

/**
 * @Data : 
 * @Author : 강사
 * @Description :  상속
 */


class Car{
	public String model;
	public String color;
	public void disp() {
		System.out.println("Car disp.....");
	}
}

class SportsCar extends Car{
	public int maxSpeed;
	public void output() {
		System.out.println(model + "\t" + "\t" + maxSpeed);
	}
}
public class Exam79 {
	public static void main(String[] ar){
		SportsCar sp=new SportsCar();
		sp.model="SM3";
		sp.color="흰색";
		sp.maxSpeed=181;
		sp.disp();
		sp.output();
	}
}


