package ch08.exception;

/**
 * @Data : 
 * @Author : 강사
 * @Description :   예외 처리 - - NullPointerException 
 */

public class Ex04 {
	public static void main(String[] args) {
		try{
			String data=null;								// 예외 발생
			System.out.println(data.toString());
		}catch(NullPointerException e){
			System.out.println("data 값이 넣어주세요.");
		}
	}
}



