package api03.String;

import java.util.Scanner;

/**
 * @Data : 
 * @Author : 강사
 * @Description :  String 클래스 - replace(char oldChar, char newChar)
 */

public class String03 {
	public static void main(String[] args) {
		String oldStr="자바는 객체지향 언어입니다.";
		String newStr=oldStr.replace("자바", "JAVA");
		System.out.println("문자열 치환 newStr:" + newStr);
		System.out.println("원본 데이터 oldStr:" + oldStr + "\n");
		
		String str="How are you?";
		System.out.println("문자열 잘라내기:" + str.substring(2));   		 			    //  2번지 부터 끝까지 
		System.out.println("문자열 잘라내기:" + str.substring(2, 9) + "\n");		    //  9번지 전까지, 즉 2번지 ~ 8번지
		
		String t="    자바   프로그래밍    ";
		System.out.println("앞뒤 공백문자 잘라내기:" + t.trim() + "\n");			    // 원본 데이터 영향안줌
		
		System.out.println("[문자열을 기본타입으로 변환");
		Scanner sc=new Scanner("10");
		int su=sc.nextInt();
		int value=Integer.parseInt("10");
		System.out.println("su:" + ++su);
		System.out.println("value:" + ++value);
		sc.close();
	
		System.out.println("[기본 타입의 값을 문자열로 변환]");
		String ivar=String.valueOf(10);
		String fvar=String.valueOf(10.5);
		String bvar=String.valueOf(true);
		System.out.println(ivar + fvar + bvar);
	}
}
