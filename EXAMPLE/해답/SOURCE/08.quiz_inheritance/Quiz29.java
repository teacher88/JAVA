package ch06.quiz;

class Student{
	protected int hakbunho;
	protected String name;
	protected String major;
}

class StudentAddress extends Student{
	private String phone;
	private String addr;
	
	public StudentAddress(int hakbunho, String name,  String major, String phone, String addr){
		this.hakbunho=hakbunho;
		this.name=name;
		this.major=major;
		this.phone=phone;
		this.addr=addr;
	}
	
	public void disp(){
		System.out.println("�й�:" + hakbunho);
		System.out.println("�̸�:" + name);
		System.out.println("�а�:" + major);
		System.out.println("��ȭ��ȣ:" + phone);
		System.out.println("�ּ�:" + addr);
	}
}

public class Quiz29 {
	public static void main(String[] args){
		StudentAddress s=new StudentAddress(123456, "ȫ�浿", "����Ʈ����", "010-123-1234", "����ð�����");
		s.disp();
	}
}
