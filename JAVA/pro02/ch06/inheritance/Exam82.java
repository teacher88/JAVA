package ch06.inheritance;

/**
 * @Data : 
 * @Author : ����
 * @Description :  ��� 
 */ 

class Man{
	protected String name;			// ����̸�
	public void empName(){
		System.out.println("�̸�" + name);
	}
}

class BusinessMan extends Man{
	private String company;			// ȸ���̸�
	private String position;				// ����
	
	public BusinessMan() { }
	
	public BusinessMan(String name, String company, String posistion){
		super.name=name;
		this.company=company;
		this.position=posistion;
	}
	
	public void info(){
		super.empName();
		System.out.println("ȸ���̸�:" + company);
		System.out.println("����:" + position);
	}
}

public class Exam82 {
	public static void main(String[] args) {
		BusinessMan bm=new BusinessMan("ȫ�浿", "�츮IT", "������");
		bm.info();
	}
}
