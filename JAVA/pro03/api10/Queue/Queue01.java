package api10.Queue;

/**
 * @Data : 
 * @Author : ����
 * @Description :  Stack LIFO �ڷΰ��� �����ΰ���, LinkedList(Queue) FIFO �����ͱ�
 */

import java.util.LinkedList;
import java.util.Queue;

public class Queue01 {
	public static void main(String[] args){
		Queue<Integer> queue=new LinkedList<Integer>();	 		     // Queue interface
		queue.offer(10);
		queue.offer(20);
		queue.offer(30);
		
		while(!queue.isEmpty()){												      // 
			System.out.println(queue.poll() + "\t" + queue.size());		  //  peek(�������� �ʰ� �����´�)
		}
		System.out.println();
	}
}
