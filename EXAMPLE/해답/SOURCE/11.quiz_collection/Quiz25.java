package api13.Quiz;

import java.util.ArrayList;

class Man{
	private String name;
	private int age;
	private String address;
	
	public Man(String name, int age, String address){
		this.name=name;
		this.age=age;
		this.address=address;
	}
	
	public void disp(){
		System.out.println("�̸�:" +  name);
		System.out.println("����:" + age);
		System.out.println("�ּ�:" +  address);
		System.out.println();
	}
}

public class Quiz25 {
	public static void main(String[] ar){
		Man a=new Man("ȫ�浿", 25, "����");
		Man b=new Man("�Ӳ���", 30, "����");
		Man c=new Man("�̼���", 23, "��õ");
		
		ArrayList<Man> list=new ArrayList<Man>();
		list.add(a);
		list.add(b);
		list.add(c);

		for(int i=0;i<list.size();i++){
			Man result=list.get(i);
			result.disp();
		}
	}
}

