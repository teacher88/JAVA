package ch05.object;

import java.util.Scanner;

/**
 * @Data : 
 * @Author : 강사
 * @Description :  클래스
 *                     알아두기) 두개 이상의 클래스가 선언된 소스 파일을 컴파일하면 바이트 코드 파일(.class) 클래스 
 *                     선언한 개수 만큼 생긴다. bin폴더에서 확인 가능
 */

class Sung{				
	public String name;
	public int kor, eng, mat, tot;
	public float avg;
	
	public void total(){
		tot=kor+eng+mat;
	}
	public void average(){
		avg=(float)tot/3;
	}
	
	public void disp(){
		System.out.println("name:" + name);
		System.out.println("kor:" + kor);
		System.out.println("eng:" + eng);
		System.out.println("mat:" + mat);
		System.out.println("tot:" + tot);
		System.out.println("avg:" + avg);
		System.out.println();
	}
}
  
public class Exam64 {
	public static void main(String[] ar){
		Scanner sc=new Scanner(System.in);
		
		Sung a=new Sung();
		
		System.out.print("이름:");
		a.name=sc.next();
		
		System.out.print("국어:");
		a.kor=sc.nextInt();
		
		System.out.print("영어:");
		a.eng=sc.nextInt();
		
		System.out.print("수학:");
		a.mat=sc.nextInt();
		
		a.total();
		a.average();
		a.disp();
		
		sc.close();
	}
}

