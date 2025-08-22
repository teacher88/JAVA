package ch07.interfaceD;


/**
 * @Data : 
 * @Author : ����
 * @Description :  ��ü�� �ʵ�� ���
 */

class Apple{
	private int su;
	private int value;
	
	public void setData(int su, int value){
		this.su=su;
		this.value=value;
	}
	
	public int getData(){
		return su+value;
	}
}

class Banana{
	private Apple apple;
	
	public void setData(Apple apple){
		this.apple=apple;
	}
	
	public void disp(){
		System.out.println("�����:" + apple.getData());
	}
}

public class Exam101 {
	public static void main(String[] args) {
		Apple apple=new Apple();
		apple.setData(10, 20);
		
		Banana banana=new Banana();
		banana.setData(apple);
		banana.disp();
	}
}
