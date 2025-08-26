package api03.String;

/**
 * @Data : 
 * @Author : 강사
 * @Description :  String 클래스 - split("정규표현식") : 정규표현식을 구분자로 해서 부분 문자열을 분히한 후, 배열에 저장하고 리턴한다.
 */

public class String04 {
	public static void main(String[] args) {
		String str="홍길동,이수홍,박연수,김자바,최명호";		
		String[] strArr=str.split(",");		
		for(int i=0;i<strArr.length;i++){
			System.out.println(strArr[i]);
		}
		System.out.println("\n\n");
		
		String text="홍길동&이수홍,박연수,김자바-최명호";		
		String[] textArr=text.split("&|,|-");			// 정규화 사이에 공백 들어가면 안됨
		for(int i=0;i<textArr.length;i++){
			System.out.println(textArr[i]);
		}
		System.out.println();
	}
}
