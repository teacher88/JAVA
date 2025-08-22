package ch08.exception;

/**
 * @Data : 
 * @Author : 강사
 * @Description :  예외전가 - throws
 */

class AA{											// 예외전가
	public void subA()throws Exception{
		/* RuntimeException ex=new RuntimeException("subA Function");
		throw ex; */
		
		try{
			Throwable ex=new Throwable("subA Function");
			throw ex;
		}catch(Throwable e){
			System.out.println("에러입니다.");
			e.printStackTrace();
		}
	}
	
	public void subB()throws Exception{
		System.out.println("subB Function");
		subA();
	}
}
 
public class Ex10 {
	public static void main(String[] ar)throws Exception{
		AA a=new AA();
		a.subB();
		
		System.in.read();
	}
}









 
