package ch03.quiz;

import java.util.Scanner;

/**
 * @Data : 
 * @Author : ����
 * @Description :  �迭 �ǽ����� 11��
 *                      ����11) �ο����� �Է� �޾� ����, ����� ���ϴ� ����ǥ�� �ۼ��ϼ���.
 */

public class Quiz11 {
	public static void main(String[] ar){
		Scanner sc=new Scanner(System.in);

		System.out.print("�ο����� �Է��ϼ���:");
		int inwon=sc.nextInt();
		
		String[] name=new String[inwon];
		int[] kor=new int[inwon];
		int[] eng=new int[inwon];
		int[] mat=new int[inwon];
		int[] tot=new int[inwon];
		float[] avg=new float[inwon];
		
		for(int i=0;i<inwon;i++){
			System.out.print("�̸�:");
			name[i]=sc.next();
			
			System.out.print("����:");
			kor[i]=sc.nextInt();
			
			System.out.print("����:");
			mat[i]=sc.nextInt();
			
			System.out.print("����:");
			eng[i]=sc.nextInt();
			System.out.println();
		}
		
		for(int i=0;i<inwon;i++){
			tot[i]=kor[i]+eng[i]+mat[i];
			avg[i]=(float)tot[i]/3;
		}
		
		System.out.println("�̸�\t" + "����\t" + "����\t" + "����\t" + "����\t" + "���\t");
		for(int i=0;i<inwon;i++){
			System.out.println(name[i] + "\t" + kor[i] + "\t" + mat[i] + "\t" + eng[i] 
			                    + "\t" + tot[i] + "\t" + avg[i]);
		}
		
		sc.close();
	}
}





