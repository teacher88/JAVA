package ch08.exception;

/**
 * @Data : 
 * @Author : ����
 * @Description :   ���� ó�� - - NullPointerException 
 */

public class Ex04 {
	public static void main(String[] args) {
		try{
			String data=null;								// ���� �߻�
			System.out.println(data.toString());
		}catch(NullPointerException e){
			System.out.println("data ���� �־��ּ���.");
		}
	}
}



