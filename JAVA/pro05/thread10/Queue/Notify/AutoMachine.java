package thread10.Queue.Notify;

import java.util.LinkedList;
import java.util.Queue;

public class AutoMachine {										 // 공유객체
	private Queue<String> store=new LinkedList<String>();	
	
	public synchronized void setDrink(String drink){			  // 마냥 기달린다. 그래서 깨운다.
		if(!store.isEmpty()){ 
			notify(); 
		}
		
		store.offer(drink);
	}	
	
	public synchronized String getDrink(){							
		while(store.isEmpty()){								    	
			try {
				wait();													//  임계영역 : 빈워져 있으면, 기달려라
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		return store.poll();
	}
}


