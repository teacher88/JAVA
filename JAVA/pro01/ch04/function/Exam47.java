package ch04.function;

/**
 * @Data : 
 * @Author : ����
 * @Description :  �Լ� - Call by Name
 */

public class Exam47 {
	public static void main(String[] ar){
		for(int i=1;i<=5;i++){
			sub();
		}
		System.out.println("end!!");
	}
	
	public static void sub(){
		System.out.println("�ȳ��ϼ���.");
	}
}

