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
			System.out.print("이름:");
			String name=sc.next();
			
			System.out.print("전화번호:");
			String phone=sc.next();
			
			map.put(name,phone);
			
			System.out.println();
		}
		
		System.out.print("전화번호를 검색할 이름을 입력하세요:");
		String key=sc.next();
		if(key !=null){			
			Set<String> set=map.keySet();
			Iterator<String> iter=set.iterator();
			while(iter.hasNext()){		
				if(key.equals(iter.next())){
					System.out.println(key + "의 전화번호는" + map.get(key) + "입니다.");
					return ;
				}
			}
			
			System.out.println("존재하지 않습니다.");
		}
	}
}
