package api13.Quiz;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Quiz19 {
	public static void main(String[] args){
		HashSet<String> set=new HashSet<String>();
		Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<3;i++){
			System.out.print("�����ϴ� Ŀ�Ǹ� 3�����Է��ϼ���:");
			String str=sc.next();
			set.add(str);
		}
		
		System.out.println("\n\n�Է��Ͻ� Ŀ�Ǵ�:" + set.size());
		Iterator<String> iterator=set.iterator();
		while(iterator.hasNext()){
			String str=iterator.next();
			System.out.println(str);
		}
		sc.close();
	}
}
