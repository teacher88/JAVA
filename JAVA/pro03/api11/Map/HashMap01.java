package api11.Map;

/**
 * @Data : 
 * @Author : ����
 * @Description :  Map - HashMap
 */

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
//import java.util.Collection;

public class HashMap01 {
	public static void main(String[] args) {
		HashMap<String, String> map=new HashMap<String, String>();
		map.put("spring", "��");
		map.put("summer", "����");
		map.put("fall", "����");
		map.put("winter", "�ܿ�");
		System.out.println("key������ ���: "+ map.get("winter") + "\n");
	
		Set<String> set=map.keySet();
		Iterator<String> iter=set.iterator();
		while(iter.hasNext()){
			String value=map.get(iter.next());
			System.out.print(value + "\t");
		}
		System.out.println("\n");
		
		
		HashMap<Integer, Double> hashMap=new HashMap<Integer, Double>();
		hashMap.put(10, 63.8);
		hashMap.put(20, 68.5);
		hashMap.put(30, 66.5);	
		
		Iterator<Integer> iterator=hashMap.keySet().iterator();
		while(iterator.hasNext()){
			System.out.print(hashMap.get(iterator.next()) + "\t");
		}
		System.out.println("\n\n");
		
		hashMap.put(40, 77.8);			// �߰�
		hashMap.replace(30, 99.9);		// ��ü   hashMap.put(40, 88.8);
		hashMap.remove(10);		    // ����
		iterator=hashMap.keySet().iterator();
		while(iterator.hasNext()){
			System.out.print(hashMap.get(iterator.next()) + "\t");
		}
	}
}










