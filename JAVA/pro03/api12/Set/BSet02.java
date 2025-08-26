package api12.Set;

/**
 * @Data : 
 * @Author : °­»ç
 * @Description :  Set - HashSet
 */

import java.util.HashSet;
import java.util.Iterator;

import api08.List.Data;

public class BSet02 {
	public static void main(String[] args){
		Data a=new Data(10, 20);
		Data b=new Data(20, 30);
		Data c=new Data(40, 50);
		
		HashSet<Data> set=new HashSet<Data>();
		set.add(a);
		set.add(b);
		set.add(c);
		
		Iterator<Data> iter=set.iterator();
		while(iter.hasNext()){
			Data ab=iter.next();
			ab.yonsan();
			ab.disp();
		}
		
		set.remove(a);
		set.add(new Data(0, 0));
		System.out.println(set.toString());
	}
}
