package ch08.exception;

/**
 * @Data : 
 * @Author : ����
 * @Description :  ���� ó�� - ArrayIndexOutOfBoundsException 
 */


public class Ex03 {							
	public static void main(String[] args){   // Run as - RunCofiguration 
		/* if(args.length !=2) {
			System.out.println("�������� Ʋ�Ƚ��ϴ�.");
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
			System.out.println("�迭���� ����� �Է��ϼ���.");
		}
	}
}



