package thread10.Queue.Notify;

import java.util.LinkedList;
import java.util.Queue;

public class AutoMachine {										 // ������ü
	private Queue<String> store=new LinkedList<String>();	
	
	public synchronized void setDrink(String drink){			  // ���� ��޸���. �׷��� �����.
		if(!store.isEmpty()){ 
			notify(); 
		}
		
		store.offer(drink);
	}	
	
	public synchronized String getDrink(){							
		while(store.isEmpty()){								    	
			try {
				wait();													//  �Ӱ迵�� : ����� ������, ��޷���
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		return store.poll();
	}
}


