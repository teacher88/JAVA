package ch05.object;

/**
 * @Data : 
 * @Author : ����
 * @Description :  Ŭ����
 */

class Pay{
	public String name;
	public int bonbong;
	public int tex;
	public int silsu;
	
	public void input(String n, int b){
		name=n;
		bonbong=b;
	}
	
	public void yonsan(){
		tex=(int)(bonbong*0.045+0.5);
		silsu=bonbong-tex;
	}
	
	public void output(){
		System.out.print("name:" +  name + "\t");
		System.out.print("bonbong:" + bonbong + "\t");
		System.out.print("tex:" + tex + "\t");
		System.out.println("silsu:" + silsu + "\t");
	}
}
 
public class Exam66 {
	public static void main(String[] ar){
		Pay a=new Pay();
		a.input("�մ���", 2000000);
		a.yonsan();
		a.output();
		
		Pay b=new Pay();
		b.input("�Ʒι�", 1000000);
		b.yonsan();
		b.output();
		
		Pay c=new Pay();
		c.input("����", 1500000);
		c.yonsan();
		c.output();
	}
}

