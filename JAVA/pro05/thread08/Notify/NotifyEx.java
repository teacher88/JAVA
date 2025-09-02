package thread08.Notify;



/**
 * @Data : 
 * @Author : ����
 * @Description :  wait()-notify()�� �ʿ��� ���
 *                     ���� �����ͷ� �� �� �̻��� �����尡 �����͸� �ְ� ���� ��
 *                      
 * 						����ȭ �޼ҵ�
 *                        -wait() : �Ͻ�����
 *						  -notify() : ������
 **/

public class NotifyEx {
	public static void main(String[] args) {
		WorkObject workObject=new WorkObject();
		
		A a=new A(workObject);
		a.setName("a");
		A b=new A(workObject);
		b.setName("b");
		
		B c=new B(workObject);
		c.setName("c");
		B d=new B(workObject);
		d.setName("d");
		
		a.start();
		b.start();
		c.start();
		d.start();
	}
}
