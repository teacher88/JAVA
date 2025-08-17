package ch03.array;

/**
 * @Data : 
 * @Author : 좌민혜
 * @Description :  배열 - 변수는 한개의 데이터만 저장한다.  
 *                              배열은 같은 타입의 데이터를 연속된 공간에 나열
 *                              각 데이터에 인텍스를 부여해 놓은 자료구조
 */

public class Exam37 {
	public static void main(String[] ar){									
		char[] ch=new char[] {'A','B','C'};  
		
		System.out.println("첫번째 배열:" + ch[0]);
		System.out.println("두번째 배열:" + ch[1]);
		System.out.println("셋번째 배열:" + ch[2]);
		System.out.println();
				
		for(int i=0;i<3;i++){
			System.out.print(ch[i] + "\t");
		}
		System.out.println();
		
		int[] array=new int[] {10,20,30,40,50};
		for(int i=0;i<array.length;i++){
			System.out.println("array" + "[" + i + "]:" + array[i]);
		}
		System.out.println();
		
		String[] str=new String[]{"apple", "hi", "love", "like"};
		for(int i=0;i<str.length;i++){
			System.out.println("array" + "[" + i + "]:"  + str[i]);
		}
	}
}
