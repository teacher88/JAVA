package ch05.object;

/**
 * @Data : 
 * @Author : ����
 * @Description :  Ŭ���� 
 *                     �˾Ƶα�) Ŭ���� 3�� Ư¡ ����ȭ(ĸ��ȭ), ������, ��Ӽ�
 *                     ����ȭ ���� ��� TV�� �߿��� ��ǰ�� �ٱ����� ����Ǿ� �ִٸ�, ������� �Ǽ��� ���� ���峯 ���� �ִ�.
 *                     �̷� �߿��� ��ǰ�� TV �������� ĸ��ȭ �Ͽ� ���ܵξ�� �Ѵ�.            
 */

class Saram{
	public String name;
	public String address;
	public String phoneNumber;
	private String juminBunho;			
	public int age;
	
	public void setJuminBunho(String j){
		juminBunho=j;
	}
	
	public void disp(){
		System.out.println("�̸�:" + name);
		System.out.println("�ּ�:" + address);
		System.out.println("��ȭ��ȣ:" + phoneNumber);
		System.out.println("�ֹι�ȣ:" + juminBunho);
		System.out.println("����:" + age);
	}
}
 
public class Exam68 {
	public static void main(String[] ar){
		Saram a=new Saram();

		a.name="ȫ�浿";
		a.address="����� ������ ���ﵿ";
		a.phoneNumber="010-1234-1234";
		a.age=23;

		a.disp();
	}
}
 
