package ch07.interfaceB;

/**
 * @Data : 
 * @Author : ����
 * @Description :  ��� - interface
 */

public class BPhone implements Phone{

	@Override
	public void callSend() {
		System.out.println("�����մϴ�.");
	}

	@Override
	public void canData() {
		System.out.println("LTE �����մϴ�.");	
	}

	@Override
	public void tvRemote() {
		System.out.println("������ ž�� �Ǿ� �ֽ��ϴ�.");
	}
}
