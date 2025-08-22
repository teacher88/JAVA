package ch07.interfaceD;

/**
 * @Data : 2016. 7. 20.
 * @Author : 강사
 * @Description :  객체를 지역변수, 매개변수로 사용
 */

class Sungjuk{
	public String name;
	public int kor, eng, mat;
	
	public Sungjuk(){ }
	
	public Sungjuk(String name, int kor, int eng, int mat){
		this.name=name;
		this.kor=kor;
		this.eng=eng;
		this.mat=mat;
	}
}

class SungjukTotal{
	private int tot;
	
	public void total(){
		Sungjuk sungjuk=new Sungjuk("조인성", 100, 100, 100); 	// Dependency(의존관계)
		tot=sungjuk.kor + sungjuk.eng + sungjuk.mat;
	}
	
	public void setTotal(Sungjuk sungjuk){
		tot=sungjuk.kor + sungjuk.eng + sungjuk.mat;
	}
	
	public void disp(){
		System.out.println("총점:" + tot);
	}
}

public class Exam100 {
	public static void main(String[] args) {
		SungjukTotal total=new SungjukTotal();
		total.total();
		total.disp();
		
		Sungjuk kim=new Sungjuk("홍길동", 70, 80, 90);
		total.setTotal(kim);
		total.disp();
	}
}
