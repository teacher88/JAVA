package ch08.exception;

/**
 * @Data : 
 * @Author : ����
 * @Description :  ���� ���� ��� - getMessage(), printStackTrace()
 */

import java.util.Scanner;

public class Ex11 {
	public static void main(String[] ar){
		Scanner sc=new Scanner(System.in);
		
		try{
			System.out.print("x:");
			int x=sc.nextInt();
			
			System.out.print("y:");
			int y=sc.nextInt();
			
			int div=x/y;
			System.out.println("div:" + div);
				
		 }catch(Exception e){		
			System.out.println("�߸��Է��ϼ̽��ϴ�. \n");			// ����ڸ� ���ؼ�
			System.out.println(e.getMessage() + "\n");				// �����ڸ� ���ؼ� printStackTrace ���� �� ������ �޽����� ��� ���� ����
			e.printStackTrace();  	// Ʈ���̽�					  	// �����ڸ� ���ؼ� Ʈ���̽� ���� �߻� �ڵ带 ������ ������ ��� �ֿܼ� ����Ѵ�
		 }
		sc.close();
	}
}

// Concreate  Method - ���� Ŭ�������� ������ ���� �ʾƾ� �ϴ� ���� final
