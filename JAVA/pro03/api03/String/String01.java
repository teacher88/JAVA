package api03.String;


/**
 * @Data : 
 * @Author : ����
 * @Description :  String Ŭ���� - charAt(int index), length(), indeOf(String str)
 */

public class String01 {
	public static void main(String[] args) {
		// charAt() : �־��� ���ؽ��� ���ڸ� �����Ѵ�. (���ؽ� 0~-1)
		String subject="�ڹ����α׷���";		
		System.out.println("���� ����:"  + subject.charAt(5));   	// ��
		
		// length() : ���ڼ��� ����
		System.out.println("���ڿ� ����:" + subject.length());  	 // 7 
		
		// indeOf() : �־��� ���ڿ��� ���۵Ǵ� ���ؽ��� ����, �־��� ���ڿ��� ���� ���� ������ -1�� ����
		System.out.println("���ڿ� ��ġ:" + subject.indexOf("���α׷���"));   // 2
		System.out.println("\n\n");
		
		String juminBunho="123456-1234567"; 
		if(juminBunho.length() == 14){					// �ֹι�ȣ ����
			int location=juminBunho.indexOf("-");
			if(location != -1){								// - ���� : 7����
				char sex=juminBunho.charAt(location+1);
				System.out.println(sex);
				switch(sex){
				case '1' : case '3': case '5':
					System.out.println("���� �Դϴ�.");break;
				case '2' : case '4': case '6':
					System.out.println("���� �Դϴ�.");break;
				default:
					System.out.println("�߸��Է��ϼ̽��ϴ�");
				}
			}else{
				System.out.println("���ڰ� �������� �ʽ��ϴ�.");
			}
		}else{
			System.out.println("�ֹι�ȣ �ڸ��� Ʋ���ϴ�.");
		}
		
		System.out.println();
	}
}
