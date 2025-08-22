package ch06.inheritance;

/**
 * @Data : 
 * @Author : ����
 * @Description :  ��� - �ϳ��� ��ü�� �迭����
 *                     ���������� MyPoint, MyCircle, MyRect, MyMain
 */

class FParents{
	public void disp(){
		System.out.println("ParentsF CLASS");
	}
}

class FSon extends FParents{
	public void disp(){
		System.out.println("SonF CLASS");
	}
}

class GSon extends FParents{
	public void disp(){
		System.out.println("SonG CLASS");
	}
}

public class Exam92 {
	public static void main(String[] args) {
		FParents[] array=new FParents[3];
		array[0]=new FParents();
		array[1]=new FSon();
		array[2]=new GSon();
		
		for(int i=0;i<array.length;i++){
			array[i].disp();
		}
	}
}


