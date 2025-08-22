package ch06.inheritance;

/**
 * @Data : 
 * @Author : 강사
 * @Description :  상속 - 하나의 객체로 배열관리
 */

import java.util.Scanner;

public class MyPoint{
	protected Scanner sc;
	protected int x, y;

	public void input(){ 
		System.out.println("데이타를 입력합니다."); 	
	}
	
	public void output(){ 
		System.out.println("데이타를 출력합니다."); 
	}
}
