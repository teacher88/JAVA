package api03.String;

/**
 * @Data : 
 * @Author : 강사
 * @Description :  StringBuilder, StringBuffer 클래스 
 * 						  버퍼(buffer:데이터를 임시로 저장하는 메모리)에 문자열을 저장한다.
 *                        버퍼 내부에서 추가, 수정, 삭제 작업을 할 수 있다.
 *                        StringBuilder 속도 좀 빠름
 */

public class StringBuffer01 {
	public static void main(String[] args) {
		String s1="새천년";
		String s2="대한민국";
		String s3=s1;
		System.out.println("s1 hash code:" + s1.hashCode());
		System.out.println("s2 hash code:" + s2.hashCode());
		System.out.println("s2 hash code:" + s3.hashCode());
		
		s1+=s2;
		System.out.println("s1 hash code:" + s1.hashCode());
		System.out.println(s1.toString() + "\n\n");
		
		StringBuffer sb1=new StringBuffer("우리나라");
		StringBuffer sb2=new StringBuffer("대한민국");
		System.out.println("sb1 hash code:" + sb1.hashCode());
		System.out.println("sb2 hash code:" + sb2.hashCode());
		
		sb1.append(sb2);
		sb1.append("좋은나라");
		System.out.println("sb1 hash code:" + sb1.hashCode());
		System.out.println(sb1.toString()+ "\n\n");	
		
		StringBuffer str=new StringBuffer("apple");
		System.out.println("문자열 길이:" + str.length());     // 5
		System.out.println("문자열 용량(byte):" + str.capacity());   // 5+16=21
	}
}





