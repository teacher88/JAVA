package api03.String;

/**
 * @Data : 
 * @Author : ����
 * @Description :  String Ŭ���� - equals(Object anObject), equalsIgnoreCase(Object anObject), toLowerCase(), toUpperCase()
 */

public class String02 {
	public static void main(String[] args) {
		String a="apple";
		String b="apple";
		System.out.println("�ּҰ� ��:" + (a==b));
		System.out.println("������ ��:" + a.equals(b));
		
		String x=new String("hi");
		String y=new String("hi");
		System.out.println("�ּҰ� ��:" + (x==y));
		System.out.println("������ ��:" + x.equals(y));
		
		String sVar=new String("banana");
		String tVar=new String("BANANA");
		System.out.println("��ҹ��ڱ��о���:" + sVar.equalsIgnoreCase(tVar));  
		System.out.println();
		
		String orginal="Java Programming";
		String lowerCase=orginal.toLowerCase();			    // �ҹ��ں���
		String upperCase=orginal.toUpperCase();			// �빮�ڷκ���
		System.out.println("�ҹ���:" + lowerCase);
		System.out.println("�빮��:" + upperCase);
		System.out.println("��������Ÿ:" + orginal);			// ��������Ÿ ������� ������,  ���ο� ����Ÿ ��ü�� �����ȴ�. 
	}
}







