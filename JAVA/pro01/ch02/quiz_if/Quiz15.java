package ch02.quiz_if;

/**
 * @Data : 
 * @Author : 강사
 * @Description :  조건문 실습문제 15번
 */

public class Quiz15 {
	public static void main(String[] args){
		int su=50;
		int value=100;
		int big=0, diff=0;
		
		if(su>value){
			big=su;
		}else{
			big=value;
		}
		System.out.println("big:" + big);
		
		if(su < value){
			diff=su-value;
		}else{
			diff=value-su;
		}
		System.out.println("diff:" + diff);
	}
}
