package ch08.exception;

/**
 * @Data : 
 * @Author : ����
 * @Description :  �������� - throws
 */

class AA{											// ��������
	public void subA()throws Exception{
		/* RuntimeException ex=new RuntimeException("subA Function");
		throw ex; */
		
		try{
			Throwable ex=new Throwable("subA Function");
			throw ex;
		}catch(Throwable e){
			System.out.println("�����Դϴ�.");
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









 
