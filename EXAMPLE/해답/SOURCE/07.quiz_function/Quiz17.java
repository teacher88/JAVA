package ch04.quiz;

/**
 * @Data : 
 * @Author : ����
 * @Description :  �Լ� �ǽ����� 17
 *                     ���� 17) ������ ���ð� ���α׷��� �ϼ��ϼ���.
 */

public class Quiz17 {
	public static void main(String[] args) {
		String[]  str=new String[] {"kim","park","lee"};
		sub(str);
	}

	public static void sub(String[] str){
		for(int i=0;i<str.length;i++){
			System.out.print(str[i] + "\t");
		}
	}
}
