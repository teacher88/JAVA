package api03.String;

/**
 * @Data : 
 * @Author : 강사
 * @Description :  String 클래스 - equals(Object anObject), equalsIgnoreCase(Object anObject), toLowerCase(), toUpperCase()
 */

public class String02 {
	public static void main(String[] args) {
		String a="apple";
		String b="apple";
		System.out.println("주소값 비교:" + (a==b));
		System.out.println("데이터 비교:" + a.equals(b));
		
		String x=new String("hi");
		String y=new String("hi");
		System.out.println("주소값 비교:" + (x==y));
		System.out.println("데이터 비교:" + x.equals(y));
		
		String sVar=new String("banana");
		String tVar=new String("BANANA");
		System.out.println("대소문자구분안함:" + sVar.equalsIgnoreCase(tVar));  
		System.out.println();
		
		String orginal="Java Programming";
		String lowerCase=orginal.toLowerCase();			    // 소문자변경
		String upperCase=orginal.toUpperCase();			// 대문자로변경
		System.out.println("소문자:" + lowerCase);
		System.out.println("대문자:" + upperCase);
		System.out.println("원본데이타:" + orginal);			// 원본데이타 변경없는 이유는,  새로운 데이타 객체가 생성된다. 
	}
}







