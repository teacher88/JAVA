package api11.Map;

import java.util.HashMap;
import java.util.Scanner;

/**
 * @Data : 
 * @Author : 강사
 * @Description :  Map - HashMap
 */

public class HashMap02 {
	public static void main(String[] args) {
		HashMap<String, Object> map=new HashMap<String, Object>();
		map.put("id", "abc");
		map.put("pass", 123);
		
		Scanner sc=new Scanner(System.in);
		
		while(true){
			System.out.print("아이디:");
			String id=sc.next();
			
			System.out.print("비밀번호:");
			int pass=sc.nextInt();
			System.out.println();
			
			String dataid=(String) map.get("id");
			int datapass=(Integer) map.get("pass");
			
			if(dataid.equals(id)){		
				if(datapass==pass){
					System.out.println("로그인 성공");
					sc.close();
					break;
					
				}else{
					System.out.println("비밀번호 확인하세요.");
				}	
			}else{
				System.out.println("아이디 확인하세요.");
			}
		}
	}
}







