package ch08.exception;

/**
 * @Data : 
 * @Author : 강사
 * @Description :  예외 처리 - 다중 catch
 */

public class Ex07 {
	public static void main(String[] ar){		
		try{
			int su=Integer.parseInt(ar[0]);
			int value=Integer.parseInt(ar[1]);
			
			int div=su/value;
			System.out.println("div:" + div);
			
		}catch(NumberFormatException e){    			// 예외처리순서 설명
			System.out.println("숫자를 잘못 입력하셨습니다.");
		}catch(ArithmeticException e){
			System.out.println("0으로 나눌수없습니다.");
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("배열수의 수를 잘못 입력하셨습니다.");
		}finally{
			System.out.println("모든 예외처리를 끝냈었습니다.");
		}
		
		System.out.println("end!!");
	}
}


