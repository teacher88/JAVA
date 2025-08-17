package ch02.control;

/**
 * @Data : 
 * @Author : 강사
 * @Description :  제어문 - 조건문 (중첩 if ~ else문)
 */ 

public class Exam18 {
	public static void main(String[] args) {
		int score=84;
		String grade="";
		
		if(score >=90){
			if(score>=97){
				grade="A+";
			}else if(score <=96 && score >=94){
				grade="A0";
			}else if(score <=93){
				grade="A-";
			}
			
		}else if(score >=80){
			if(score>=87){
				grade="B+";
			}else if(score <=86 && score >=84){
				grade="B0";
			}else if(score <=83){
				grade="B-";
			}
			
		}else if(score >=70){
			if(score>=77){
				grade="C+";
			}else if(score <=76 && score >=74){
				grade="C0";
			}else if(score <=73){
				grade="C-";
			}
			
		}else if(score < 70){
			System.out.println("재수강!!!");
		}
		
		System.out.println("학점:" + score + "\t" + grade);
	}
}
