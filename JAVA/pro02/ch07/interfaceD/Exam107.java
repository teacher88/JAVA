package ch07.interfaceD;

/**
 * @Data : 
 * @Author : 강사
 * @Description :  싱글톤(Singleton)
 *                      1) 전체 프로그램에서 단 하나의 객체만 만들도록 보장해야 하는 경우 사용
 *                      2) 단 하나만 생성된다고 해서 이 객체를 싱글톤이라고 한다.
 *                      3) 싱글톤을 만들려면 클래스 외부에서 new 연산자로 생성자를 호출할 수 없도록 막아야 한다. 
 *                         (생성자를 호출한 만큼 객체가 생성되기 때문)     
 *                      4) 생성자를 외부에서 호출할 수 없도록 하려면 생성자 앞에 private 접근 제한자를 붙여준다. 
 */

class Singleton{
	private static Singleton singleton=new Singleton();			// 5) 정적필드를 하나 선언하고 자신의 객체를 생성해 초기화한다.
	
	// private Singleton() { }
	
	 public Singleton() { }
	
	public static Singleton getInstance(){
		return singleton;
	}
	
	public void data(){
		System.out.println("싱글톤.....");
	}
}
public class Exam107 {
	public static void main(String[] args) {
		Singleton a=Singleton.getInstance();
		Singleton b=Singleton.getInstance();

		if(a==b){
			System.out.println("같은 주소를 가르침");
		}else{
			System.out.println("다른 주소를 가르침");
		}
		
		Singleton c=new Singleton();
		Singleton d=new Singleton();
		if(c==d){
			System.out.println("같은 주소를 가르침");
		}else{
			System.out.println("다른 주소를 가르침");
		}
	}
}
