package ch07.interfaceB;

/**
 * @Data : 
 * @Author : ����
 * @Description :  ��� - interface
 * 	 					A���ڿ��� �پ��� ����Ʈ���� ����ϴ�. �𵨺� ������ �Ʒ��� ����.
 * 	 					��ǰ��				��ȭ��/����      4G&3G&LTE		TV������ ���
 * 	  						APhone				 ����				 3G				��ž��
 * 	  						BPhone	             ����             	 4G         		ž��
 * 	  						CPhone	             ����             	 4G         		��ž�� 
 */

public interface Phone {				
	public void callSend();
	public void canData();
	public void tvRemote();
}
