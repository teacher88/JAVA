package api10.Queue;

/**
 * @Data : 
 * @Author : 강사
 * @Description :  Stack LIFO 뒤로가기 앞으로가기, LinkedList(Queue) FIFO 프린터기
 */

import java.util.LinkedList;
import java.util.Queue;

public class Queue02 {
	public static void main(String[] args){
		Queue<Message> messageQueue=new LinkedList<Message>();
		messageQueue.offer(new Message("sendMail", "홍길동"));
		messageQueue.offer(new Message("sendSMS", "조인성"));
		messageQueue.offer(new Message("sendKakaotalkl", "감자바"));
		
		while(!messageQueue.isEmpty()){
			Message message=messageQueue.poll();
			System.out.println(message.to + "님께 " + message.command + " 보냅니다.");
		}
	}
}







