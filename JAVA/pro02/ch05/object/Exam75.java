package ch05.object;

/**
 * @Data : 
 * @Author : 강사
 * @Description :  클래스 - 배열
 */

class TestD{
	private int x, y;
	
	public TestD(int x, int y){
		this.x=x;
		this.y=y;
	}
	
	public void disp(){
		System.out.println(x + "\t" + y);
	}
}
 
public class Exam75 {
	public static void main(String[] ar){
		TestD[] array=new TestD[3];
		array[0]=new TestD(10,20);
		array[1]=new TestD(50,60);
		array[2]=new TestD(80,90);
		for(int i=0;i<array.length;i++){
			array[i].disp();
		}
		System.out.println();
		
		TestD aObj=new TestD(1, 2);
		TestD bObj=new TestD(3, 4);
		TestD cObj=new TestD(5, 6);	
		TestD[] arr={aObj, bObj, cObj};
		for(int i=0;i<arr.length;i++){
			arr[i].disp();
		}
		
		String a="apple";
		String b="apple";
		if(a==b){
			System.out.println("T");
		}else{
			System.out.println("F");
		}
	}
}
