package ch06.inheritance;

import java.util.Scanner;

/**
 * @Data : 
 * @Author : 강사
 * @Description :  상속 - 하나의 객체로 배열관리
 *                              다음예제는 ch06.robotAbstract
 */

public class MyMain {
	public static void main(String[] ar){
		Scanner sc=new Scanner(System.in);
		
		MyPoint[] m=new MyPoint[10];
		
		for(int i=0;i<m.length;i++){
			System.out.print("1원   2.사각형   3.전체보기  4.종료:");
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
				System.out.println("잘못 입력하셨습니다.");
				i--;
			}
			System.out.println();
		}
		
		sc.close();
	}
}
