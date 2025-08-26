package api03.String;

/**
 * @Data : 
 * @Author : ����
 * @Description :  StringBuilder, StringBuffer Ŭ���� 
 * 						  ����(buffer:�����͸� �ӽ÷� �����ϴ� �޸�)�� ���ڿ��� �����Ѵ�.
 *                        ���� ���ο��� �߰�, ����, ���� �۾��� �� �� �ִ�.
 *                        StringBuilder �ӵ� �� ����
 */

public class StringBuffer01 {
	public static void main(String[] args) {
		String s1="��õ��";
		String s2="���ѹα�";
		String s3=s1;
		System.out.println("s1 hash code:" + s1.hashCode());
		System.out.println("s2 hash code:" + s2.hashCode());
		System.out.println("s2 hash code:" + s3.hashCode());
		
		s1+=s2;
		System.out.println("s1 hash code:" + s1.hashCode());
		System.out.println(s1.toString() + "\n\n");
		
		StringBuffer sb1=new StringBuffer("�츮����");
		StringBuffer sb2=new StringBuffer("���ѹα�");
		System.out.println("sb1 hash code:" + sb1.hashCode());
		System.out.println("sb2 hash code:" + sb2.hashCode());
		
		sb1.append(sb2);
		sb1.append("��������");
		System.out.println("sb1 hash code:" + sb1.hashCode());
		System.out.println(sb1.toString()+ "\n\n");	
		
		StringBuffer str=new StringBuffer("apple");
		System.out.println("���ڿ� ����:" + str.length());     // 5
		System.out.println("���ڿ� �뷮(byte):" + str.capacity());   // 5+16=21
	}
}





