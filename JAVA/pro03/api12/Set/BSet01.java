package api12.Set;

import java.util.ArrayList;

/**
 * @Data : 
 * @Author : ����
 * @Description :  Set - HashSet : ���п��� ���� (�ߺ��� ó�� ����, ���� ���� ���� �ʵ�)
 */

import java.util.HashSet;
import java.util.Iterator;

public class BSet01 {
	public static void main(String[] ar){
		
		HashSet<String> set=new HashSet<String>();
		set.add("apple");					// �߰�
		set.add("banana");
		set.add("strawberry");
		set.add("apple");			
		System.out.println(set.toString() + "\n");
		
		set.remove("apple");					// ����, ��ü���� (clear)
		System.out.println("���� ��ü �� ��ü������:" + set.size() + "\n");
		
		set.clear();
		if(set.isEmpty()){
			System.out.println("����� \n");
		}
		
		HashSet<Object> objSet=new HashSet<Object>();
		objSet.add(10);
		objSet.add(24.5f);
		objSet.add("apple");
		
		Iterator<Object> iter=objSet.iterator();     			// �ݺ���, ������ ��������(��ü�� �����ϴ� �޼ҵ�)
		while(iter.hasNext()){
			System.out.print(iter.next() + "\t");			  		 // �������� ���� �������� ��ġ�� ����ϰ� �ִٰ� �������� ���
		}
		System.out.println("\n\n");
		
		ArrayList<String> list=new ArrayList<String>();
		list.add("apple");
		list.add("banana");
		list.add("melon");
		
		Iterator<String> t=list.iterator();  
		while(t.hasNext()){
			System.out.print(t.next() + "\t");			  		 // �������� ���� �������� ��ġ�� ����ϰ� �ִٰ� �������� ���
		}
	}
}








