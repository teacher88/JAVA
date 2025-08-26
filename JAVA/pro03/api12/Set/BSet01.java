package api12.Set;

import java.util.ArrayList;

/**
 * @Data : 
 * @Author : 강사
 * @Description :  Set - HashSet : 수학에서 집합 (중복값 처리 안함, 저장 순서 유지 않됨)
 */

import java.util.HashSet;
import java.util.Iterator;

public class BSet01 {
	public static void main(String[] ar){
		
		HashSet<String> set=new HashSet<String>();
		set.add("apple");					// 추가
		set.add("banana");
		set.add("strawberry");
		set.add("apple");			
		System.out.println(set.toString() + "\n");
		
		set.remove("apple");					// 삭제, 전체삭제 (clear)
		System.out.println("삭제 객체 후 전체사이즈:" + set.size() + "\n");
		
		set.clear();
		if(set.isEmpty()){
			System.out.println("비워짐 \n");
		}
		
		HashSet<Object> objSet=new HashSet<Object>();
		objSet.add(10);
		objSet.add(24.5f);
		objSet.add("apple");
		
		Iterator<Object> iter=objSet.iterator();     			// 반복자, 데이터 순차접근(객체를 리터하는 메소드)
		while(iter.hasNext()){
			System.out.print(iter.next() + "\t");			  		 // 마지막에 읽은 데이터의 위치를 기억하고 있다가 다음번에 사용
		}
		System.out.println("\n\n");
		
		ArrayList<String> list=new ArrayList<String>();
		list.add("apple");
		list.add("banana");
		list.add("melon");
		
		Iterator<String> t=list.iterator();  
		while(t.hasNext()){
			System.out.print(t.next() + "\t");			  		 // 마지막에 읽은 데이터의 위치를 기억하고 있다가 다음번에 사용
		}
	}
}








