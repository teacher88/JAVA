package ch07.interfaceB;

/**
 * @Data : 
 * @Author : ����
 * @Description :  ��� - interface
 */

public class CPhone implements Phone{

	@Override
	public void callSend() {
		System.out.println("�����մϴ�.");
	}

	@Override
	public void canData() {
		System.out.println("LTE �Ұ����մϴ�. 4G�Դϴ�.");
	}

	@Override
	public void tvRemote() {
		System.out.println("������ ��ž�� �Ǿ����ϴ�.");
	}
}
