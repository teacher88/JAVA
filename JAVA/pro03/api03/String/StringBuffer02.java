package api03.String;

/**
 * @Data : 
 * @Author : ����
 * @Description :  StringBuilder Ŭ���� 
 */

public class StringBuffer02 {
	public static void main(String[] args){
		StringBuffer str=new StringBuffer("** JAVA");
		System.out.println("str:" + str + "\n");
		
		str.insert(3, "Good");
		System.out.println("���ڿ� ����:" + str );						// ** GoodJAVA
		
		str.setCharAt(1, '#');
		System.out.println("���� ġȯ:" +str + "\n");					// *# GoodJAVA
		
		str.replace(3, 7, "Love");											// 3��° ���ؽ� ���� ~ 7��° ���ؽ� �� ���� (�� 6��������)
		System.out.println("���ڿ� ġȯ:" +str + "\n");				// *# LoveJAVA
		
		str.delete(7, 11);													// 7��° ���ؽ� ���� ~ 11�� ���ؽ� ������
		System.out.println("���ڿ� ����:" + str);         				// *# Love
		
		str.deleteCharAt(1);
		System.out.println("���� ����:" + str + "\n\n");				// * Love
				
		str.reverse();
		System.out.println("�������:" + str); 					   		// evoL *
	}
}
