package api06.Quiz;

/**
 * @Data : 
 * @Author : ����
 * @Description :  �ǽ����� 24) 
 */

import java.util.StringTokenizer;

public class Quiz24 {
	public static void main(String[] args) {
		String str="���̵�, �̸�, �н�����";
		
		// splict() �޼ҵ� �̿�
		String[] tokens=str.split(",");
		for(int i=0;i<tokens.length;i++){
			String token=tokens[i];
			System.out.println(token);
		}
		System.out.println();
		
		// StringTokenizer �̿�
		StringTokenizer st=new StringTokenizer("���̵�, �̸�, �н�����", ",");
		while(st.hasMoreTokens()){
			String token=st.nextToken();
			System.out.println(token);
		}
	}
}
