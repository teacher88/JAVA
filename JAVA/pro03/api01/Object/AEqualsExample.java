package api01.Object;


/**
 * @Data : 
 * @Author : ����
 * @Description :  Object Ŭ����
 *                      equals(Object obj) : �⺻������ == �����ڿ� ������ ����� ����(���� ��)
 *                      ���� ������ ���� �������̵� �ʿ�(���� ���� ���� ��ü�̰� ������� ��ü�� �����ϰ� �ִ� �����Ͱ� ����)
 */

public class AEqualsExample {
	public static void main(String[] args) {
		String name=new String("apple");
		String irum=new String("apple");
		
		String a="hi";
		String b="hi";
		
		System.out.println("String �ּҰ� ��:" + (name==irum));
		System.out.println("String �ּҰ� ��:" + (a==b));
		System.out.println("String ����Ÿ�� ��:" + (name.equals(irum)) + "\n\n");  // String Ŭ�������� Object Ŭ������ equals �Լ��� ������ ����
		
		System.out.println("�ּҰ� ��1:" + (a=="hi"));
		System.out.println("�ּҰ� ��2:" + (name=="apple") + "\n\n");
	}
}











