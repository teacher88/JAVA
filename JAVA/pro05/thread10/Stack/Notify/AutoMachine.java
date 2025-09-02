package thread10.Stack.Notify;

import java.util.Stack;

public class AutoMachine {										 		// ������ü
	private Stack<String> store=new Stack<String>();	
	
	public synchronized void setDrink(String drink){			  // ���� ��޸���. �׷��� �����.
		if(!store.isEmpty()){ 
			notify(); 
		}
		
		store.push(drink);
	}	
	
	public synchronized String getDrink(){							
		while(store.isEmpty()){								    	
			try {
				wait();													//  �Ӱ迵�� : ����� ������, ��޷���
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		return store.pop();
	}
}
