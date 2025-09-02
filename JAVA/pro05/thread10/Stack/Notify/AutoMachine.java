package thread10.Stack.Notify;

import java.util.Stack;

public class AutoMachine {										 		// 공유객체
	private Stack<String> store=new Stack<String>();	
	
	public synchronized void setDrink(String drink){			  // 마냥 기달린다. 그래서 깨운다.
		if(!store.isEmpty()){ 
			notify(); 
		}
		
		store.push(drink);
	}	
	
	public synchronized String getDrink(){							
		while(store.isEmpty()){								    	
			try {
				wait();													//  임계영역 : 빈워져 있으면, 기달려라
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		return store.pop();
	}
}
