package ch05.quiz01;

/**
 * @Data : 
 * @Author : ����
 * @Description :  Ŭ����1 - �ǽ����� 14)
 */

class Plus{
	private int x, y;
	
	public void setX(int x){
		this.x=x;
	}
	
	public void setY(int y){
		this.y=y;
	}
	
	public int getX(){
		return ++x;
	}
	
	public int getY(){
		return ++y;
	}
}

public class Quiz14 {
	public static void main(String[] args) {
		Plus p=new Plus();
		p.setX(10);
		p.setY(20);
		
		System.out.println(p.getX() + "," +  p.getY());
	}
}
