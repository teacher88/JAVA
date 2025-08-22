package ch06.inheritance;

import java.util.Scanner;

/**
 * @Data : 
 * @Author : ����
 * @Description :  ��� - �ϳ��� ��ü�� �迭����
 *                              ���������� ch06.robotAbstract
 */

public class MyMain {
	public static void main(String[] ar){
		Scanner sc=new Scanner(System.in);
		
		MyPoint[] m=new MyPoint[10];
		
		for(int i=0;i<m.length;i++){
			System.out.print("1��   2.�簢��   3.��ü����  4.����:");
			int x=sc.nextInt();
			
			if(x==1){
				m[i]=new MyCircle();
				m[i].input();
			}else if(x==2){
				m[i]=new MyRect();
				m[i].input();
			}else if(x==3){
				for(int j=0;j<i;j++){
					m[j].output();
				}
				i--;
			}else if(x==4){
				System.exit(0);  // return 
			}else {
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
				i--;
			}
			System.out.println();
		}
		
		sc.close();
	}
}
