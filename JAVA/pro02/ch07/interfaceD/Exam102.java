package ch07.interfaceD;

/**
 * @Data : 
 * @Author : ����
 * @Description :  ��ü�� �ʵ�� ���
 */

class Melon{
	private int x, y;
	public Melon(int x, int y){
		this.x=x;
		this.y=y;
	}
	public void disp(){
		System.out.println(x  + "\t" + y);
	}
}

class WaterMelon{
	private Melon melon;
	public WaterMelon(Melon melon){
		this.melon=melon;
	}
	public Melon getData(){
		return melon;
	}
}

public class Exam102 {
	public static void main(String[] args) {
		Melon melon=new Melon(10, 20);
		WaterMelon warter=new WaterMelon(melon);
		
		Melon melonBa=warter.getData();
		melonBa.disp();
	}
}
