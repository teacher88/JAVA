package ch01.dataType;

/**
* @Data : 
* @Author : ����
* @Description :  ���� ������ : (cast) �Ǵ� (�ڷ���)
*/

public class Exam05 {
	public static void main(String[] ar){
		int kor=88;
		int eng=94;
		int mat=87;
		int tot=kor+eng+mat;
		float avg=(float) tot/3;		
		double favg=(double) tot/3;								// �ݿø� �ڷ����� ����
		System.out.println("���:" + avg + "\t" + favg);
		System.out.println();
		
		// �ݿø�
		double a=(avg*10+0.5)/ 10.0;
		System.out.println("a:" + a);
		// float error=(avg*10+0.5)/ 10.0f; 								  //  �ε��Ҽ��� float�� �Ҽ�6�ڸ�
		
		double result1=(int) (avg*10+0.5)/ 10.0;    			
		double result2=(int) (avg*100+0.5)/ (double) 100;            // (float) 100 �ε��Ҽ����� ���ؼ� ���ϴ� ������� �ȳ���
		double result3=(int) (avg*1000+0.5)/1000.0;
		
		System.out.println("��� 1:" + result1);
		System.out.println("��� 2:" + result2);
		System.out.println("��� 3:" + result3);		
		System.out.println();
				
		// ������ ����
	    double result7=(int)(avg*10)/10.0;
	    double result8=(int)(avg*100)/100.0;
	    double result9=(int)(avg*1000)/1000.0;
		System.out.println("��� 7:" + result7);
		System.out.println("��� 8:" + result8);
		System.out.println("��� 9:" + result9);
	}
}
