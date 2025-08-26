package api05.Math;

/**
 * @Data :
 * @Author : 강사
 * @Description :  Math 클래스 
 */

public class ARoundEx {
	public static void main(String[] ar){		
		double x=123.5672; 
		double y=456.4672; 

		int a=(int) Math.round(x);
		System.out.println("반올림:" + a);					// 124

		int b=(int) Math.ceil(y);
		System.out.println("무조건 올림:" + b);			   // 124
		
		int c=(int) Math.floor(x);
		System.out.println("무조건 내림:" + c);			    // 123
		System.out.println("\n");
		
		double temp=x*10;									// 1235.672
		int imsi=(int) Math.round(temp);					// 1236	
		double r=imsi/10.0;									// 123.6
		System.out.println("둘째자리 반올림, 첫째자리 출력:" + temp + "\t" + imsi + "\t" + r);
		
		double o=Math.round(x*100)/100.0;
		System.out.println("셋째자리 반올림, 둘째자리 출력:" + o);
		System.out.println("\n");
			
		double ce=Math.ceil(x*1000)/1000.0;
		System.out.println("네째자리 올림, 셋째자리 출력:" + ce);	

		double f=Math.floor(x*100)/100.0;
		System.out.println("셋째자리 버림, 둘째자리 출력:" + f);
		System.out.println("\n");
		
		System.out.println("PI:" + Math.PI);	
		double pi=Math.floor(Math.PI *1000000)/1000000;
		System.out.println("소수여섯짜리 버림:" + pi);
	}
}

