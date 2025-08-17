package ch03.array;

/**
 * @Data : 
 * @Author : 강사
 * @Description :  배열복사
 */

public class Exam45 {
	public static void main(String[] args) {	
		int[] oldArr={1, 2, 3};
		int[] newArr=new int[5];
		for(int i=0;i<oldArr.length;i++){
			newArr[i]=oldArr[i];
		}
		
		for(int i=0;i<newArr.length;i++){
			System.out.println(newArr[i]);
		}
		System.out.println("\n");
		
		 // (원본, 원본시작번호, 복사본, 복사본시작번호, 복사할개수)
		System.arraycopy(oldArr, 0, newArr, 0, oldArr.length);     
		for(int i=0;i<newArr.length;i++){
			System.out.println(newArr[i]);
		}
	}
}

