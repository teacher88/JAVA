package api10.Queue;

/**
 * @Data : 
 * @Author : ����
 * @Description :  Stack LIFO �ڷΰ��� �����ΰ���, LinkedList(Queue) FIFO �����ͱ�
 */

import java.util.LinkedList;
import java.util.Queue;

public class Queue02 {
	public static void main(String[] args){
		Queue<Message> messageQueue=new LinkedList<Message>();
		messageQueue.offer(new Message("sendMail", "ȫ�浿"));
		messageQueue.offer(new Message("sendSMS", "���μ�"));
		messageQueue.offer(new Message("sendKakaotalkl", "���ڹ�"));
		
		while(!messageQueue.isEmpty()){
			Message message=messageQueue.poll();
			System.out.println(message.to + "�Բ� " + message.command + " �����ϴ�.");
		}
	}
}







