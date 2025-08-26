package api09.Stack;

/**
 * @Data : 
 * @Author : ����
 * @Description :  Stack LIFO �ڷΰ��� �����ΰ���, LinkedList(Queue) FIFO �����ͱ�
 */

import java.util.Stack;

public class Stack02 {
	public static void main(String[] args) {
		Stack<Coin> coinBox=new Stack<Coin>();
		coinBox.push(new Coin(100));
		coinBox.push(new Coin(50));
		coinBox.push(new Coin(500));
		coinBox.push(new Coin(10));
				
		while(!coinBox.isEmpty()){
			Coin coin=coinBox.pop();
			System.out.println("������ ����:" + coin.getValue() + "��");
		}
	}
}
