package api03.String;

/**
 * @Data : 
 * @Author : ����
 * @Description :  String Ŭ���� - split("����ǥ����") : ����ǥ������ �����ڷ� �ؼ� �κ� ���ڿ��� ������ ��, �迭�� �����ϰ� �����Ѵ�.
 */

public class String04 {
	public static void main(String[] args) {
		String str="ȫ�浿,�̼�ȫ,�ڿ���,���ڹ�,�ָ�ȣ";		
		String[] strArr=str.split(",");		
		for(int i=0;i<strArr.length;i++){
			System.out.println(strArr[i]);
		}
		System.out.println("\n\n");
		
		String text="ȫ�浿&�̼�ȫ,�ڿ���,���ڹ�-�ָ�ȣ";		
		String[] textArr=text.split("&|,|-");			// ����ȭ ���̿� ���� ���� �ȵ�
		for(int i=0;i<textArr.length;i++){
			System.out.println(textArr[i]);
		}
		System.out.println();
	}
}
