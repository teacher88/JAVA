package api03.String;

/**
 * @Data : 
 * @Author : 강사
 * @Description :  StringBuilder 클래스 
 */

public class StringBuffer02 {
	public static void main(String[] args){
		StringBuffer str=new StringBuffer("** JAVA");
		System.out.println("str:" + str + "\n");
		
		str.insert(3, "Good");
		System.out.println("문자열 삽입:" + str );						// ** GoodJAVA
		
		str.setCharAt(1, '#');
		System.out.println("문자 치환:" +str + "\n");					// *# GoodJAVA
		
		str.replace(3, 7, "Love");											// 3번째 인텍스 부터 ~ 7번째 인텍스 전 까지 (즉 6번지까지)
		System.out.println("문자열 치환:" +str + "\n");				// *# LoveJAVA
		
		str.delete(7, 11);													// 7번째 인텍스 부터 ~ 11번 인텍스 전까지
		System.out.println("문자열 삭제:" + str);         				// *# Love
		
		str.deleteCharAt(1);
		System.out.println("문자 삭제:" + str + "\n\n");				// * Love
				
		str.reverse();
		System.out.println("역순출력:" + str); 					   		// evoL *
	}
}
