package api01.Object;


/**
 * @Data :
 * @Author : ����
 * @Description : Object Ŭ����
 *                     toString() : ��ü�� ���� ������ ���� �Ѵ�.
 */

public class BToStringExample {
	public static void main(String[] args) {
		Integer a=new Integer(10);
		System.out.println("�������� ���ڿ��� ���:" + a.toString());
		System.out.println(a + "\n");				// ��ü�� ��½� ���������� toString() ȣ���� �ش�.
		
		BSmartPhone andriod=new BSmartPhone("����", "�ȵ���̵�");		
		 // toString() �������̵� ���� ������ ch08_object.ToString@15db974
		System.out.println(andriod.toString());  
		System.out.println(andriod);
	}
}
