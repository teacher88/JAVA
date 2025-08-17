package ch05.object;

/**
 * @Data : 
 * @Author : 강사
 * @Description :  클래스 - 생성자
 */

class BirthdayA{
	private int year;
	private int month;
	private int day;
	private String name;
	
	public BirthdayA(int year, int month, int day, String name){
		this.year=year;
		this.month=month;
		this.day=day;
		this.name=name;
	}
	
	public void disp(){
		System.out.println("name:" + name);
		System.out.println("month:" + month);
		System.out.println("day:" + day);
		System.out.println("year:" + year);
		System.out.println();
	}
}
 
public class Exam71 {
	public static void main(String[] ar){
		BirthdayA a=new BirthdayA(1980, 12,25,"kim");
		a.disp();
		
		BirthdayA b=new BirthdayA(1985, 8, 15, "lee");
		b.disp();
		
		BirthdayA c;
		c=new BirthdayA(1990, 7, 7, "조인성");
		c.disp();
	}
}
