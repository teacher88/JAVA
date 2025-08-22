package ch08.exception;

/**
 * @Data : 
 * @Author : 강사
 * @Description :  예외 처리 - ArrayIndexOutOfBoundsException 
 */


public class Ex03 {							
	public static void main(String[] args){   // Run as - RunCofiguration 
		/* if(args.length !=2) {
			System.out.println("실행방법이 틀렸습니다.");
		}else{
			String su=args[0];
			String value=args[1];
			
			System.out.println("args[0]:" + su);
			System.out.println("args[0]:" + value);
		}*/
		
		try{
			String su=args[0];
			String value=args[1];
			
			System.out.println("args[0]:" + su);
			System.out.println("args[0]:" + value);
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("배열수를 제대로 입력하세요.");
		}
	}
}



