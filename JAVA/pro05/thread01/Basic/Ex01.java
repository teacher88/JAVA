package thread01.Basic;

/**
* @Data : 2016. 8. 15.
* @Author : 강사
* @Description : 1. 프로세스(Process) : 실행중인 프로그램 입니다. 
*                          프로그램을 실행하면 OS로부터 실행에 필요한 자원(메모리)을 할당 받아 프로세스가 된다.
*                          프로세스는 프로그램을 수행하는데 필요한 데이터와 메모리 등의 자원 그리고 쓰레드로 구성
*                          모든 프로세스에는 최소한 하나 이상의 쓰레드가 존재한다. 
*                          둘 이상의 쓰레드를 가진 프로세스를 멀티쓰레드 프로세스(multi-threaded process)라고 한다.
*  
*  						2. 멀티태스팅(multi-tasking, 다중작업) : 여러개의 프로세스를 동시에 하는것 (ex 윈도우나 유닉스 OS)
*  						3. 멀티쓰레드 프로세스(multi-threaded process) : 하나의 프로세스에서 여러개의 쓰레드가 동시에 하는 것 (ex 메신저)
*/

class Alphabet01 extends Thread{					// 자식스레드(부 스레드)
	
	@Override
	public void run(){									// call back 메소드 start()		
		System.out.println("Alphabet01 : " + Thread.currentThread().getName() + "\n");	
		
		for(char i='A';i<='z';i++){
			System.out.print(i + "\t");
			if(i=='Z') System.out.println();
		}	
		
		System.out.println();
	}
}

class Digit01 extends Thread{
	
	@Override
	public void run(){	
		System.out.println("Digit01 : " + Thread.currentThread().getName() + "\n");
		
		for(int i=1;i<100;i++){
			System.out.print(i + "\t");
			if(i%10==0) System.out.println();
		}	
		
		System.out.println();
	}
}

public class Ex01 {
	public static void main(String[] ar){											// 부모스레드(주 스레드)
		System.out.println(Thread.currentThread().getName() + "\n");	// main
		
		Digit01 digit=new Digit01();
		digit.setName("숫자클래스");
		digit.start();
		
		Alphabet01 alphabet=new Alphabet01();		   					     // 스케쥴링으로 실행되기 때문에 결과는 매번 다르다.
		alphabet.setName("알파벳클래스");
		alphabet.start();  						
	}
}


