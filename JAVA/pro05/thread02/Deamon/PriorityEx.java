package thread02.Deamon;

import java.util.ArrayList;

/**
 * @Data : 
 * @Author : ����
 * @Description :  1. ���ü�(Concurrency) : �ϳ��� �ھ�� ��Ƽ �����尡 ������ ���� ����                 
 *                      2. ���ļ�(Parallelism) :  ���ļ��� ��Ƽ �۾��� ���� ��Ƽ �ھ�� ���� �����带 ���ÿ� ����
 *                          ����) ���� CPU�� �����ھ�
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
		// ���� �ھ��� ��� �����尡 ���ļ����� ����ɼ� �ֱ� ������ 4�� ������ �����带 ������ ���
		// �켱���� ����� ũ�� ������ ��ġ�� ���Ѵ�. �ּ��� 5�� �̻��� �����尡 ����Ǿ�� �켱���� ������ �޴´�.
		
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







