package api06.Quiz;

/**
 * @Data : 
 * @Author : ����
 * @Description :  �ǽ����� 23) 
 */

import java.text.DecimalFormat;

public class Quiz23 {
	public static void main(String[] args) {
		int y=123456789;
		DecimalFormat d=new DecimalFormat("#,###");	
		System.out.println("��� ��:" + d.format(y)); 
	}
}
