package thread07.Synchronized;

/* 공유클래스 : 화장실
	스레드 : 가족 (객체 1개, 스레드 n개)
	임계영역 : synchronized는 한번에 하나의 스레드만 실행할 수 있다. */

public class Ex {
	public static void main(String[] args){
		Toilet toilet=new Toilet();
		
		Fater fater=new Fater(toilet);
		Mother mother=new Mother(toilet);
		Sister sister=new Sister(toilet);
		Brother brother=new Brother(toilet);
		Me me=new Me(toilet);
		
		
		Thread f=new Thread(fater, "아버지");
		Thread m=new Thread(mother, "어머니");
		Thread s=new Thread(sister, "누나");
		Thread b=new Thread(brother, "형");
		Thread mm=new Thread(me, "나");
		
		f.start();
		m.start();
		s.start();
		b.start();
		mm.start();
	}
}
