package thread02.Deamon;

import java.util.ArrayList;

/**
 * @Data : 
 * @Author : 강사
 * @Description :  1. 동시성(Concurrency) : 하나의 코어에서 멀티 스레드가 번갈아 가며 실행                 
 *                      2. 병렬성(Parallelism) :  병렬성은 멀티 작업을 위해 멀티 코어에서 개별 스레드를 동시에 실행
 *                          참조) 현재 CPU는 쿼드코어
 */

class Example extends Thread{
	
	@Override
	public void run() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
			
		System.out.println(getName());
	}
}

public class PriorityEx {
	public static void main(String[] args) throws InterruptedException {
		// 쿼드 코어일 경우 스레드가 병렬성으로 실행될수 있기 때문에 4개 이하의 스레드를 실행할 경우
		// 우선순위 방식이 크게 영향을 미치지 못한다. 최소한 5개 이상의 스레드가 실행되어야 우선순위 영향을 받는다.
		
		ArrayList<Example> list=new ArrayList<Example>();
		for(int i=0;i<=100;i++){
			Example example=new Example();
			list.add(example);
		}
		
		list.get(20).setPriority(Thread.MAX_PRIORITY);   // 10
		list.get(5).setPriority(Thread.MIN_PRIORITY);    //  1
		list.get(30).setPriority(5);
		
		for(int i=0;i<=100;i++){
			Example example=list.get(i);
			example.start();
		}
	}
}







