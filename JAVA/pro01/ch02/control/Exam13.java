package ch02.control;

/**
 * @Data :
 * @Author : ����
 * @Description :  ��� - ���ǹ� (if ~ else��)
 */

public class Exam13 {
	public static void main(String[] args) {
		int score=50;
		if(score >=50){
			System.out.println("�հ��Դϴ�. ������" + score + "�Դϴ�.");
		}else{
			System.out.println("���հ��Դϴ�. ������" + score + "�Դϴ�.");
		}
		System.out.println();
		
		String name="ȫ�浿";
		int age=27;
		if(age>=20 && age<30){
			System.out.println("����" + name + "�Դϴ�." + age + "��� �ູ�մϴ�.");
		}else{
			System.out.println("20�밡 �ƴմϴ�.");
		}
		
	}
}
