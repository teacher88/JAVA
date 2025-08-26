package api05.Math;

/**
 * @Data : 
 * @Author : 강사
 * @Description :  Math 클래스 
 */

import java.util.Arrays;

public class BRandomEx {
	public static void main(String[] ar){
		System.out.println("20의 절대값:" + Math.abs(-20));
		System.out.println("최대값:" + Math.max(10, 30));
		System.out.println("최소값:" + Math.min(1.5, 1.3));
		System.out.println("2의3승:" + (int) Math.pow(2,3));
		System.out.println();	;
				
		int ran=(int) (Math.random() * 10);  
		System.out.println("[랜덤함수 0~9] : " + ran);
	
		String[] array=new String[] {"이영자", "조인성", "홍길동"};
		int dom=(int) (Math.random() * array.length);
		System.out.println("[랜덤함수 0~9] : " + array[dom]);
		System.out.println();	;
		
		int num=(int) (Math.random() * 6) +1;
		System.out.println("[주사위 눈 1~6] : " + num);
		System.out.println();	;
		
		int[] selectNumber=new int[6];
		System.out.print("[선택번호:");
		for(int i=0;i<selectNumber.length;i++){
			selectNumber[i]=(int) (Math.random() * 45) + 1;
		}
		Arrays.sort(selectNumber);
		System.out.println(Arrays.toString(selectNumber));
		
		int[] winnigNumber=new int[6];
		System.out.print("[당첨번호:");
		for(int i=0;i<winnigNumber.length;i++){
			winnigNumber[i]=(int) (Math.random() * 45) + 1;
		}
		Arrays.sort(winnigNumber);
		System.out.println(Arrays.toString(winnigNumber));
		
		boolean result=Arrays.equals(selectNumber, winnigNumber);
		if(result){
			System.out.println("당첨 되었습니다.");
		}else{
			System.out.println("당첨 되지않았습니다.");
		}  				
	}
}

