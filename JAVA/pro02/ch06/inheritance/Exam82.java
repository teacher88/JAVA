package ch06.inheritance;

/**
 * @Data : 
 * @Author : 강사
 * @Description :  상속 
 */ 

class Man{
	protected String name;			// 사원이름
	public void empName(){
		System.out.println("이름" + name);
	}
}

class BusinessMan extends Man{
	private String company;			// 회사이름
	private String position;				// 직급
	
	public BusinessMan() { }
	
	public BusinessMan(String name, String company, String posistion){
		super.name=name;
		this.company=company;
		this.position=posistion;
	}
	
	public void info(){
		super.empName();
		System.out.println("회사이름:" + company);
		System.out.println("직급:" + position);
	}
}

public class Exam82 {
	public static void main(String[] args) {
		BusinessMan bm=new BusinessMan("홍길동", "우리IT", "개발자");
		bm.info();
	}
}
