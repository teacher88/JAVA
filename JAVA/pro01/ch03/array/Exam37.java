package ch03.array;

/**
 * @Data : 
 * @Author : �¹���
 * @Description :  �迭 - ������ �Ѱ��� �����͸� �����Ѵ�.  
 *                              �迭�� ���� Ÿ���� �����͸� ���ӵ� ������ ����
 *                              �� �����Ϳ� ���ؽ��� �ο��� ���� �ڷᱸ��
 */

public class Exam37 {
	public static void main(String[] ar){									
		char[] ch=new char[] {'A','B','C'};  
		
		System.out.println("ù��° �迭:" + ch[0]);
		System.out.println("�ι�° �迭:" + ch[1]);
		System.out.println("�¹�° �迭:" + ch[2]);
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
