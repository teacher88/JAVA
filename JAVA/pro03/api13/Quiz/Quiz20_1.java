package api13.Quiz;

import java.util.HashMap;
import java.util.Scanner;

public class Quiz20_1 {
	public static void main(String[] ar){		
		HashMap<String, String> map=new HashMap<String, String>();
		Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<5;i++){
			System.out.print("�̸�:");
			String name=sc.next();
			
			System.out.print("��ȭ��ȣ:");
			String phone=sc.next();
			
			map.put(name,phone);
			
			System.out.println();
		}
		
		System.out.print("��ȭ��ȣ�� �˻��� �̸��� �Է��ϼ���:");
		String key=sc.next();
		if(key !=null){
			String value=(String) map.get(key);
			System.out.println(key + "�� ��ȭ��ȣ��" + value + "�Դϴ�.");
		}
		
		sc.close();
	}
}
