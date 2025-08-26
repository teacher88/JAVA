package api08.List;

/**
 * @Data : 
 * @Author : 강사
 * @Description :  List - Vector
 *                      ArrayList와 Vector 차이점은 ArryList가 속도가 좀 빠르며
 *                      스레드 동기화(synchronization)가 되어 있기 때문에 복수의 스레드가 동시에
 *     					Vector에 접근해서 객체를 추가, 삭제하더라도 안전(thread safe)하다.
 */

import java.util.Vector;

public class AVector {
	public static void main(String[] ar){		
		Vector<Integer> vec=new Vector<Integer>();
		vec.add(10);
		vec.add(20);
		vec.add(30);
		
		System.out.println("2번째 인덱스 객체 얻어오기:" + vec.get(2) + "\n");
		
		for(int i=0;i<vec.size();i++){
			System.out.print(vec.get(i) + "\t");
		}
		System.out.println("\n");
		
		vec.add(55);			// 추가
		vec.add(2, 77);			// 해당 인덱스에 추가
		vec.set(1, 99);			// 교체
		vec.remove(2);			// 삭제
		
		for(Integer su:vec){
			System.out.print(su + "\t");
		}
	}
}

