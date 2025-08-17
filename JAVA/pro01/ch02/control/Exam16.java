package ch02.control;

/**
 * @Data : 
 * @Author : 강사
 * @Description :  제어문 - 조건문 (다중 if ~ else문)
 */

public class Exam16 {
	public static void main(String[] ar){
		String name="홍길동";
		int kor=70;
		int eng=80;
		int mat=90;
		
		int tot=kor+eng+mat;
		float avg=(float)tot/3;
		
		char hakjum=0;
		if(avg>=90)
			hakjum='수';
		else if(avg >=80)
			hakjum='우';
		else if(avg >=70)
			hakjum='미';
		else if(avg >=60)
			hakjum='양';
		else if(avg < 60)
			hakjum='가';
		
		System.out.println("이름:" + name);
		System.out.println("평균:" + (int)(avg*10+0.5)/10.0 + "\t" + "평가:" + hakjum);
	}
}



