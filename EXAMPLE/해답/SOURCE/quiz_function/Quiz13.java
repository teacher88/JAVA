package ch04.quiz;

/**
 * @Data : 
 * @Author : ����
 * @Description :  �Լ� �ǽ����� 13
 *                     ���� 13) ���� ���� �Լ��� ��� ���� ���� ���α׷��� �ϼ��Ͻÿ�. (Call By Value)
 */

public class Quiz13 {
	public static void main(String[] args) {
		outChar('A');
		outDec(32767);
		outFloat(98.54f);
	}
	
	public static void outChar(char a){
		System.out.println(a);
	}
	
	public static void outDec(int b){
		System.out.println(b);
	}
	
	public static void outFloat(float c){
		System.out.println(c);
	}
}
