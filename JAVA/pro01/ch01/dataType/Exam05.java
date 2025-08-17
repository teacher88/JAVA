package ch01.dataType;

/**
* @Data : 
* @Author : 강사
* @Description :  단항 연산자 : (cast) 또는 (자료형)
*/

public class Exam05 {
	public static void main(String[] ar){
		int kor=88;
		int eng=94;
		int mat=87;
		int tot=kor+eng+mat;
		float avg=(float) tot/3;		
		double favg=(double) tot/3;								// 반올림 자료형과 관련
		System.out.println("평균:" + avg + "\t" + favg);
		System.out.println();
		
		// 반올림
		double a=(avg*10+0.5)/ 10.0;
		System.out.println("a:" + a);
		// float error=(avg*10+0.5)/ 10.0f; 								  //  부동소수점 float의 소수6자리
		
		double result1=(int) (avg*10+0.5)/ 10.0;    			
		double result2=(int) (avg*100+0.5)/ (double) 100;            // (float) 100 부동소수점에 의해서 원하는 결과값이 안나옴
		double result3=(int) (avg*1000+0.5)/1000.0;
		
		System.out.println("결과 1:" + result1);
		System.out.println("결과 2:" + result2);
		System.out.println("결과 3:" + result3);		
		System.out.println();
				
		// 무조건 버림
	    double result7=(int)(avg*10)/10.0;
	    double result8=(int)(avg*100)/100.0;
	    double result9=(int)(avg*1000)/1000.0;
		System.out.println("결과 7:" + result7);
		System.out.println("결과 8:" + result8);
		System.out.println("결과 9:" + result9);
	}
}
