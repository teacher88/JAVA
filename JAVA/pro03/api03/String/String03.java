package api03.String;

import java.util.Scanner;

/**
 * @Data : 
 * @Author : ����
 * @Description :  String Ŭ���� - replace(char oldChar, char newChar)
 */

public class String03 {
	public static void main(String[] args) {
		String oldStr="�ڹٴ� ��ü���� ����Դϴ�.";
		String newStr=oldStr.replace("�ڹ�", "JAVA");
		System.out.println("���ڿ� ġȯ newStr:" + newStr);
		System.out.println("���� ������ oldStr:" + oldStr + "\n");
		
		String str="How are you?";
		System.out.println("���ڿ� �߶󳻱�:" + str.substring(2));   		 			    //  2���� ���� ������ 
		System.out.println("���ڿ� �߶󳻱�:" + str.substring(2, 9) + "\n");		    //  9���� ������, �� 2���� ~ 8����
		
		String t="    �ڹ�   ���α׷���    ";
		System.out.println("�յ� ���鹮�� �߶󳻱�:" + t.trim() + "\n");			    // ���� ������ �������
		
		System.out.println("[���ڿ��� �⺻Ÿ������ ��ȯ");
		Scanner sc=new Scanner("10");
		int su=sc.nextInt();
		int value=Integer.parseInt("10");
		System.out.println("su:" + ++su);
		System.out.println("value:" + ++value);
		sc.close();
	
		System.out.println("[�⺻ Ÿ���� ���� ���ڿ��� ��ȯ]");
		String ivar=String.valueOf(10);
		String fvar=String.valueOf(10.5);
		String bvar=String.valueOf(true);
		System.out.println(ivar + fvar + bvar);
	}
}
