package ch04.function;

/**
 * @Data : 
 * @Author : ����
 * @Description :  ����(local),  final ���
 */

public class Exam61 {
	public static final int VALUE=99;
	
	public static void main(String[] ar){
		final int SU=77;
		System.out.println("SU:" + SU);
		System.out.println("VALUE:" + VALUE);
		
		sub();
	}
	
	public static void sub(){
		System.out.println("VALUE:" + VALUE);
	}
	
	public final void sub4(){	}
	public static final void sub5(){	}
}






