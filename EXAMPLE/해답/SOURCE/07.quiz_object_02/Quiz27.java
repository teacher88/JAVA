package ch05.quiz02;

import java.util.Scanner;

/**
 * @Data : 
 * @Author : ����
 * @Description :  Ŭ����2- �ǽ����� 27) ���簢�� ���� ���ϱ�
 */

class Rect{
	private int width, height;
	public Rect(int width,  int height){
		this.width=width;
		this.height=height;
	}
	
	public int getArea(){
		return width*height;
	}
}

public class Quiz27 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Rect[] array=new Rect[4];
		
		for(int i=0;i<array.length;i++){
			System.out.print("�ʺ�� ����>>");
			int width=sc.nextInt();
			int height=sc.nextInt();
			
			array[i]=new Rect(width, height);
		}

		for(int i=0;i<array.length;i++){
			System.out.println((i+1) + "��° ���簢���� ���̴� " + array[i].getArea() + "�Դϴ�");
		}
		sc.close();
	}
}
