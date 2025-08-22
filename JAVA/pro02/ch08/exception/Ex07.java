package ch08.exception;

/**
 * @Data : 
 * @Author : ����
 * @Description :  ���� ó�� - ���� catch
 */

public class Ex07 {
	public static void main(String[] ar){		
		try{
			int su=Integer.parseInt(ar[0]);
			int value=Integer.parseInt(ar[1]);
			
			int div=su/value;
			System.out.println("div:" + div);
			
		}catch(NumberFormatException e){    			// ����ó������ ����
			System.out.println("���ڸ� �߸� �Է��ϼ̽��ϴ�.");
		}catch(ArithmeticException e){
			System.out.println("0���� �����������ϴ�.");
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("�迭���� ���� �߸� �Է��ϼ̽��ϴ�.");
		}finally{
			System.out.println("��� ����ó���� ���¾����ϴ�.");
		}
		
		System.out.println("end!!");
	}
}


