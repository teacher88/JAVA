package ch08.exception;

/**
 * @Data : 
 * @Author : 강사
 * @Description :  예외 정보 얻기 - getMessage(), printStackTrace()
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
			System.out.println("잘못입력하셨습니다. \n");			// 사용자를 위해서
			System.out.println(e.getMessage() + "\n");				// 개발자를 위해서 printStackTrace 보다 좀 간단한 메시지로 출력 에러 원인
			e.printStackTrace();  	// 트레이스					  	// 개발자를 위해서 트레이스 예외 발생 코드를 추적한 내용을 모든 콘솔에 출력한다
		 }
		sc.close();
	}
}

// Concreate  Method - 하위 클래스에서 재정의 하지 않아야 하는 연산 final
