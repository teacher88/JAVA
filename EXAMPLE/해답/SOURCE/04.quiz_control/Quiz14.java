package ch02.quiz_control;

import java.util.Scanner;

/**
 * @Data : 
 * @Author : ����
 * @Description :  ��� �ǽ����� 14��
 *						�ǽ����� 14) 369������ �Ϻθ� �ۼ��غ���. 1~99������ ������ �Է¹ް� ���� 3,6,9�� 
 *										�ϳ��� �ִ� ��쿡�� ���ڼ�¦��, �� �� �ִ� ���� ���ڼ� ¦¦��, �ϳ��� ������ ���ڼ� �������� 
 *										����ϴ� ���α׷��� �ۼ��϶�. ���� ���, 13�� ��� ���ڼ�¦��, 36�� ��� ���ڼ� ¦¦��, 
 *										5�� ��� ���ڼ� �������� ����ϸ� �ȴ�.
 */

public class Quiz14 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("1~99 ������ ������ �Է��ϼ��� >>>");
		
		int num=sc.nextInt();
		int first=num/10;
		int second=num%10;
		System.out.println(first + "\t" + second);
		
		switch(first){
		case 3: case 6: case 9:
			if(second==3 || second==6 || second==9){
				System.out.println("�ڼ� ¦¦");
			}else{
				System.out.println("�ڼ� ¦");
			}
			break;
		default:
			if(second==3 || second==6 || second==9){
				System.out.println("�ڼ�¦");
			}else{
				System.out.println("�ڼ�����");
			}	
		}
		
		sc.close();
	}

}
