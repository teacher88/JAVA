package api13.Quiz;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Quiz20_2 {
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
			Set<String> set=map.keySet();
			Iterator<String> iter=set.iterator();
			while(iter.hasNext()){		
				if(key.equals(iter.next())){
					System.out.println(key + "�� ��ȭ��ȣ��" + map.get(key) + "�Դϴ�.");
					return ;
				}
			}
			
			System.out.println("�������� �ʽ��ϴ�.");
		}
	}
}
