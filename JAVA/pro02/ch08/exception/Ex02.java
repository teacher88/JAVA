package ch08.exception;

/**
 * @Data : 
 * @Author : 강사
 * @Description :  예외 처리 - NumberFormatException 
 */

public class Ex02 {
	public static void main(String[] args) {
		String su="100";
		String value="a200";
				
		try{
			int isu=Integer.parseInt(su);
			int ivalue=Integer.parseInt(value);
			
			int result=isu+ivalue;
			System.out.println("result:" + result);
		}catch(NumberFormatException e){
			System.out.println("숫자로 변환할 수 없는 값이 입력되었습니다.");
		}
	}
}




