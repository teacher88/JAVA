package ch02.control;

/**
 * @Data : 
 * @Author : ����
 * @Description :  ��� - �ݺ��� (���� for ��)
 */

public class Exam26{
	public static void main(String[] ar){
		System.out.println("\t\t\t ������");
		for(int i=2;i<=9;i++){
			System.out.print(i + "��" + "\t\t");
		}
		System.out.println();
		
		for(int i=1;i<=9;i++){
			for(int j=2;j<=9;j++){
				System.out.print(j + "*" + i + "=" + (j*i) + "\t\t");
			}
			System.out.println();
		}
	}
}









