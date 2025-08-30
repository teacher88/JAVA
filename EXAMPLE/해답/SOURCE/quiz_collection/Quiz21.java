package api13.Quiz;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Scanner;

public class Quiz21 {
	public static void main(String[] args){	
		HashMap<String, Long> map=new HashMap<String, Long>();
		Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<10;i++){
			System.out.print("����:");
			String country=sc.next();
			
			System.out.print("�α�:");
			long population=sc.nextLong();
			
			map.put(country, population);
			
			System.out.println();
		}
		
		System.out.print("�˻��� ������ �̸��� �Է��ϼ���:");
		String key=sc.next();
		if(key !=null){
			Long value=(Long) map.get(key);
			DecimalFormat d=new DecimalFormat("#, ###");		
			System.out.println(key + "�� ������ �α���" + d.format(value) + "�� �Դϴ�.");
		}else{
			System.out.println("�Է��Ͻ� ���� �����ϴ�.");
		}
		
		sc.close();
	}
}
