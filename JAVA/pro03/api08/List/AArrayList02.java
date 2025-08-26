package api08.List;

/**
 * @Data : 
 * @Author : °­»ç
 * @Description :  List - ArrayList
 */

import java.util.ArrayList;

public class AArrayList02 {
	public static void main(String[] args) {
		Data a=new Data(10, 20);
		Data b=new Data(30, 40);
		Data c=new Data(50, 60);

		ArrayList<Data> list=new ArrayList<Data>();
        list.add(a);
        list.add(b);
        list.add(c);
        
        for(int i=0;i<list.size();i++){
            Data ab=list.get(i);
            ab.yonsan();
            ab.disp();
       }
       System.out.println("\n\n");
        
        list.add(new Data(1, 2));
        System.out.println(list.toString());
        
        list.add(2, new Data(3, 4));
        list.set(0, new Data(5, 6));
        list.remove(0);        
        for(int i=0;i<list.size();i++){
            Data ab=list.get(i);
            ab.yonsan();
            ab.disp();
       }
	}
}
