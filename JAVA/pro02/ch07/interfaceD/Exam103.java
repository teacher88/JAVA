package ch07.interfaceD;

/**
 * @Data : 
 * @Author : 강사
 * @Description :  객체를 필드로 사용
 */


class Strawberry{
	private Grape grape;
	
	public Grape getGrape() {
		return grape;
	}

	public void setGrape(Grape grape) {
		System.out.println("Strawberry Method");
		this.grape = grape;
	}
}

class Grape{
	private Strawberry strawberry;
	
	public Strawberry getStrawberry() {
		return strawberry;
	}

	public void setStrawberry(Strawberry strawberry) {
		System.out.println("Grape Method");
		this.strawberry = strawberry;
	}
}

public class Exam103 {
	public static void main(String[] args) { 
		Strawberry strawberry=new Strawberry();
		Grape grape=new Grape();
		
		strawberry.setGrape(grape);
		grape.setStrawberry(strawberry);
		
		System.out.println();
		
		Grape g=strawberry.getGrape();
		g.setStrawberry(new Strawberry());
		
		Strawberry s=grape.getStrawberry();
		s.setGrape(new Grape());
	}
}
