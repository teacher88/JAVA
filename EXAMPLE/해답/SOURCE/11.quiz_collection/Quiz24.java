package api13.Quiz;

import java.util.Scanner;
import java.util.Vector;

public class Quiz24 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Vector<Float> vec=new Vector<Float>();
		float max=0;
		
		for(int i=0;i<5;i++){
			System.out.print((i+1) + "��° ���� �Է��ϼ���:");
			float su=sc.nextFloat();
			vec.add(su);
		}
		System.out.println();
		
		for(int i=0;i<vec.size();i++){
			if(vec.get(i) > max){
				max=vec.get(i);
			}
		}
		
		System.out.println("����ū����:" + max);
		sc.close();
	}
}




