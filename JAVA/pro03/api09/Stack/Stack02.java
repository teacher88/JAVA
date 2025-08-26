package api09.Stack;

/**
 * @Data : 
 * @Author : 강사
 * @Description :  Stack LIFO 뒤로가기 앞으로가기, LinkedList(Queue) FIFO 프린터기
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
			System.out.println("꺼내온 동전:" + coin.getValue() + "원");
		}
	}
}
