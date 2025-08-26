package api10.Queue;

/**
 * @Data : 
 * @Author : 강사
 * @Description :  Stack LIFO 뒤로가기 앞으로가기, LinkedList(Queue) FIFO 프린터기
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
			System.out.println(queue.poll() + "\t" + queue.size());		  //  peek(삭제하지 않고 가져온다)
		}
		System.out.println();
	}
}
