package ch03.array;

/**
 * @Data : 
 * @Author : ����
 * @Description :  �迭����
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
		
		 // (����, �������۹�ȣ, ���纻, ���纻���۹�ȣ, �����Ұ���)
		System.arraycopy(oldArr, 0, newArr, 0, oldArr.length);     
		for(int i=0;i<newArr.length;i++){
			System.out.println(newArr[i]);
		}
	}
}

