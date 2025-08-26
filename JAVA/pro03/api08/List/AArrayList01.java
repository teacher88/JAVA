package api08.List;

/**
 * @Data : 
 * @Author : 강사
 * @Description :  abstract List - ArrayList
 */

import java.util.ArrayList;
import java.util.Collections;

public class AArrayList01 {
	public static void main(String[] ar){
		ArrayList<String> list=new ArrayList<String>();
        list.add("Java");
        list.add("Oracle");
        list.add("JSP");
        list.add("HTML");
        list.add("CSS");
        
        int size=list.size();
        System.out.println("저장된 총 객체 수:" + size + "\n");
        
        String subject=list.get(2);
        System.out.println("2번 인덱스의 객체 얻기:" + subject + "\n");
        
        System.out.println("[전체 출력]");    
        for(int i=0;i<list.size();i++){
        	String str=list.get(i); 
            System.out.println(str);
        }
        System.out.println();
      
        list.add("사과");							// 추가	   
        list.add(1, "바나나");					// 특정번지로 추가 
        System.out.println(list.toString() + "\n");
        
        list.set(3, "안녕하세요.");				// 교체
        System.out.println(list.toString() + "\n");

        list.remove(0);							// 삭제
        System.out.println(list.toString());
          
        // 오름차순
        Collections.sort(list);
        System.out.println("소트:" + list);
        
        // 내림차순
    	for(int i=(list.size()-1);i>=0;i--){
			System.out.print(list.get(i) + "\t");
		}
	}
}









