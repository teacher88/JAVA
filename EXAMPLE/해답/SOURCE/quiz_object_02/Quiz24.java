package ch05.quiz02;

/**
 * @Data : 
 * @Author : ����
 * @Description :  Ŭ����2- �ǽ����� 24) ������
 */

class Test{
	private int x;
	private char y;
	
	public Test(int x){
		this.x=x;
	}
	
	public Test(char y){
		this.y=y;
	}
}

public class Quiz24 {
	public static void main(String[] args){
		Test t=new Test(10);
		Test e=new Test('A');
	}
}
