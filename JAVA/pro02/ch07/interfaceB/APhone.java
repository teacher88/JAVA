package ch07.interfaceB;

/**
 * @Data : 
 * @Author : ����
 * @Description :  ��� - interface
 */

public class APhone implements Phone{

	@Override
	public void callSend() {
		System.out.println("�����մϴ�.");
	}

	@Override
	public void canData() {
		System.out.println("LTE �Ұ����մϴ�. 3G�Դϴ�.");
	}

	@Override
	public void tvRemote() {
		System.out.println("������ ��ž�� �Ǿ����ϴ�.");
	}
}
