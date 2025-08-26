package api08.List;

/**
 * @Data : 
 * @Author : ����
 * @Description :  List - Vector
 *                      ArrayList�� Vector �������� ArryList�� �ӵ��� �� ������
 *                      ������ ����ȭ(synchronization)�� �Ǿ� �ֱ� ������ ������ �����尡 ���ÿ�
 *     					Vector�� �����ؼ� ��ü�� �߰�, �����ϴ��� ����(thread safe)�ϴ�.
 */

import java.util.Vector;

public class AVector {
	public static void main(String[] ar){		
		Vector<Integer> vec=new Vector<Integer>();
		vec.add(10);
		vec.add(20);
		vec.add(30);
		
		System.out.println("2��° �ε��� ��ü ������:" + vec.get(2) + "\n");
		
		for(int i=0;i<vec.size();i++){
			System.out.print(vec.get(i) + "\t");
		}
		System.out.println("\n");
		
		vec.add(55);			// �߰�
		vec.add(2, 77);			// �ش� �ε����� �߰�
		vec.set(1, 99);			// ��ü
		vec.remove(2);			// ����
		
		for(Integer su:vec){
			System.out.print(su + "\t");
		}
	}
}

