package api11.Map;

import java.util.HashMap;
import java.util.Scanner;

/**
 * @Data : 
 * @Author : ����
 * @Description :  Map - HashMap
 */

public class HashMap02 {
	public static void main(String[] args) {
		HashMap<String, Object> map=new HashMap<String, Object>();
		map.put("id", "abc");
		map.put("pass", 123);
		
		Scanner sc=new Scanner(System.in);
		
		while(true){
			System.out.print("���̵�:");
			String id=sc.next();
			
			System.out.print("��й�ȣ:");
			int pass=sc.nextInt();
			System.out.println();
			
			String dataid=(String) map.get("id");
			int datapass=(Integer) map.get("pass");
			
			if(dataid.equals(id)){		
				if(datapass==pass){
					System.out.println("�α��� ����");
					sc.close();
					break;
					
				}else{
					System.out.println("��й�ȣ Ȯ���ϼ���.");
				}	
			}else{
				System.out.println("���̵� Ȯ���ϼ���.");
			}
		}
	}
}







