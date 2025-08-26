package api11.Map;

/**
 * @Data : 
 * @Author : 강사
 * @Description :  Map - HashMap
 */

import java.util.HashMap;
import java.util.Iterator;

import api08.List.Data;

public class HashMap03 {
	public static void main(String[] args) {
		Data a=new Data(10, 20);
		Data b=new Data(30, 40);
		Data c=new Data(50, 60);
		
		HashMap<String, Data> map=new HashMap<String, Data>();
		map.put("one", a);
		map.put("two", b);
		map.put("three", c);
		
		Data data=map.get("one");
		data.yonsan();
		data.disp();
		System.out.println("\n");
		
		Iterator<String> iter=map.keySet().iterator();
		while(iter.hasNext()){
			Data obj=map.get(iter.next());
			obj.yonsan();
			obj.disp();
		}
		
		map.put("four", new Data(70, 80));				   // 추가
		map.replace("two", new Data(1, 2));			   // 교체
		map.remove("one");									   // 삭제
		System.out.println("\n" + map);
	}
}







