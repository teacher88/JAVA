package ch07.interfaceD;

/**
 * @Data : 
 * @Author : ����
 * @Description :  �̱���(Singleton)
 *                      1) ��ü ���α׷����� �� �ϳ��� ��ü�� ���鵵�� �����ؾ� �ϴ� ��� ���
 *                      2) �� �ϳ��� �����ȴٰ� �ؼ� �� ��ü�� �̱����̶�� �Ѵ�.
 *                      3) �̱����� ������� Ŭ���� �ܺο��� new �����ڷ� �����ڸ� ȣ���� �� ������ ���ƾ� �Ѵ�. 
 *                         (�����ڸ� ȣ���� ��ŭ ��ü�� �����Ǳ� ����)     
 *                      4) �����ڸ� �ܺο��� ȣ���� �� ������ �Ϸ��� ������ �տ� private ���� �����ڸ� �ٿ��ش�. 
 */

class Singleton{
	private static Singleton singleton=new Singleton();			// 5) �����ʵ带 �ϳ� �����ϰ� �ڽ��� ��ü�� ������ �ʱ�ȭ�Ѵ�.
	
	// private Singleton() { }
	
	 public Singleton() { }
	
	public static Singleton getInstance(){
		return singleton;
	}
	
	public void data(){
		System.out.println("�̱���.....");
	}
}
public class Exam107 {
	public static void main(String[] args) {
		Singleton a=Singleton.getInstance();
		Singleton b=Singleton.getInstance();

		if(a==b){
			System.out.println("���� �ּҸ� ����ħ");
		}else{
			System.out.println("�ٸ� �ּҸ� ����ħ");
		}
		
		Singleton c=new Singleton();
		Singleton d=new Singleton();
		if(c==d){
			System.out.println("���� �ּҸ� ����ħ");
		}else{
			System.out.println("�ٸ� �ּҸ� ����ħ");
		}
	}
}
