package api09.Stack;

/**
 * @Data : 
 * @Author : 강사
 * @Description :  Stack LIFO 뒤로가기 앞으로가기, LinkedList(Queue) FIFO 프린터기
 */

import java.util.Stack;
// import java.util.LinkedList;

public class Stack01 {
	public static void main(String[] ar){
		Stack<Integer> stack=new Stack<Integer>();    // FILO
		stack.push(10);
		stack.push(20);
		stack.push(30);
				
		while(!stack.isEmpty()){
			System.out.println(stack.pop() + "\t" + stack.size());        
		}
		System.out.println();
		
		/* 추가 삭제
		LinkedList<Float> fStack=new LinkedList<Float>();
		fStack.push(11.1f);
		fStack.push(12.2f);
		fStack.push(13.3f);
		System.out.println("마지막데이터:" + fStack.getLast());
		
		fStack.removeLast();
		fStack.addLast(77.7f);
		System.out.println("마지막데이터:" + fStack.getLast());
		
		fStack.removeFirst();
		fStack.addFirst(88.8f);
		while(!fStack.isEmpty()){
			System.out.print(fStack.pop() + "");         
		}
		System.out.println(); */
	}
}

