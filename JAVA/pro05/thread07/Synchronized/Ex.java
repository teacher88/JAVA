package thread07.Synchronized;

/* ����Ŭ���� : ȭ���
	������ : ���� (��ü 1��, ������ n��)
	�Ӱ迵�� : synchronized�� �ѹ��� �ϳ��� �����常 ������ �� �ִ�. */

public class Ex {
	public static void main(String[] args){
		Toilet toilet=new Toilet();
		
		Fater fater=new Fater(toilet);
		Mother mother=new Mother(toilet);
		Sister sister=new Sister(toilet);
		Brother brother=new Brother(toilet);
		Me me=new Me(toilet);
		
		
		Thread f=new Thread(fater, "�ƹ���");
		Thread m=new Thread(mother, "��Ӵ�");
		Thread s=new Thread(sister, "����");
		Thread b=new Thread(brother, "��");
		Thread mm=new Thread(me, "��");
		
		f.start();
		m.start();
		s.start();
		b.start();
		mm.start();
	}
}
