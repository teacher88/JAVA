package api08.List;

/**
 * @Data : 
 * @Author : ����
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
        System.out.println("����� �� ��ü ��:" + size + "\n");
        
        String subject=list.get(2);
        System.out.println("2�� �ε����� ��ü ���:" + subject + "\n");
        
        System.out.println("[��ü ���]");    
        for(int i=0;i<list.size();i++){
        	String str=list.get(i); 
            System.out.println(str);
        }
        System.out.println();
      
        list.add("���");							// �߰�	   
        list.add(1, "�ٳ���");					// Ư�������� �߰� 
        System.out.println(list.toString() + "\n");
        
        list.set(3, "�ȳ��ϼ���.");				// ��ü
        System.out.println(list.toString() + "\n");

        list.remove(0);							// ����
        System.out.println(list.toString());
          
        // ��������
        Collections.sort(list);
        System.out.println("��Ʈ:" + list);
        
        // ��������
    	for(int i=(list.size()-1);i>=0;i--){
			System.out.print(list.get(i) + "\t");
		}
	}
}









