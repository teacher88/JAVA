package ch02.control;

/**
 * @Data : 
 * @Author : ����
 * @Description :  ��� - ���ǹ� (���� if ~ else��)
 */

public class Exam16 {
	public static void main(String[] ar){
		String name="ȫ�浿";
		int kor=70;
		int eng=80;
		int mat=90;
		
		int tot=kor+eng+mat;
		float avg=(float)tot/3;
		
		char hakjum=0;
		if(avg>=90)
			hakjum='��';
		else if(avg >=80)
			hakjum='��';
		else if(avg >=70)
			hakjum='��';
		else if(avg >=60)
			hakjum='��';
		else if(avg < 60)
			hakjum='��';
		
		System.out.println("�̸�:" + name);
		System.out.println("���:" + (int)(avg*10+0.5)/10.0 + "\t" + "��:" + hakjum);
	}
}



