package ch04.quiz;

/**
 * @Data : 
 * @Author : ����
 * @Description :  �Լ� �ǽ����� 16
 *                     ���� 16) login() �Լ��� logout() �Լ��� �����մϴ�. login()�Լ��� ȣ���� ������ �Ű�������
 *                                id�� password�� �����ϰ�, logout()�Լ��� id�� �Ű������� �����մϴ�.
 */

public class Quiz16 {
	public static void main(String[] args) {
		boolean result=login("hong", "1234");
		
		if(result){
			System.out.println("�α��� �Ǿ����ϴ�.");
			logout("hong");
		}else{;
			System.out.println("id�� password�� �ùٸ��� �ʽ��ϴ�");
		}
	}
	
	public static boolean login(String id, String password){
		boolean check=false;
		
		if(id=="hong" && password=="1234"){
			check=true;
		}
		
		return check;
	}

	public static void logout(String id){
		System.out.println("�α׾ƿ� �Ǿ����ϴ�.");
	}
}
