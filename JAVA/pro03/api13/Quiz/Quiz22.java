package api13.Quiz;

import java.util.ArrayList;
import java.util.Scanner;

public class Quiz22 {
	public static void main(String[] ar){
		Scanner sc=new Scanner(System.in);
		ArrayList<Character> array=new ArrayList<Character>();
		
		for(int i=0;i<5;i++){
			System.out.print((i+1)+"��° ���� �Է�:");
			char ch=sc.next().charAt(0);
			array.add(ch);
		}
		System.out.println();
		
		for(int i=0;i<array.size();i++){
			char grade=array.get(i);
			System.out.print((i+1) + "��° ����:");
			switch(grade){
			case 'A':System.out.println("A=4.0");break;
			case 'B':System.out.println("B=3.0");break;
			case 'C':System.out.println("C=2.0");break;
			case 'D':System.out.println("D=1.0");break;
			case 'F':System.out.println("F=0");break;
			default:System.out.println("������ �߸� �Է��ϼ̽��ϴ�.");
			}
		}
		sc.close();
	}
}
