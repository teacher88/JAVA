package thread01.Basic;

/**
* @Data : 2016. 8. 15.
* @Author : ����
* @Description : 1. ���μ���(Process) : �������� ���α׷� �Դϴ�. 
*                          ���α׷��� �����ϸ� OS�κ��� ���࿡ �ʿ��� �ڿ�(�޸�)�� �Ҵ� �޾� ���μ����� �ȴ�.
*                          ���μ����� ���α׷��� �����ϴµ� �ʿ��� �����Ϳ� �޸� ���� �ڿ� �׸��� ������� ����
*                          ��� ���μ������� �ּ��� �ϳ� �̻��� �����尡 �����Ѵ�. 
*                          �� �̻��� �����带 ���� ���μ����� ��Ƽ������ ���μ���(multi-threaded process)��� �Ѵ�.
*  
*  						2. ��Ƽ�½���(multi-tasking, �����۾�) : �������� ���μ����� ���ÿ� �ϴ°� (ex �����쳪 ���н� OS)
*  						3. ��Ƽ������ ���μ���(multi-threaded process) : �ϳ��� ���μ������� �������� �����尡 ���ÿ� �ϴ� �� (ex �޽���)
*/

class Alphabet01 extends Thread{					// �ڽĽ�����(�� ������)
	
	@Override
	public void run(){									// call back �޼ҵ� start()		
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
	public static void main(String[] ar){											// �θ𽺷���(�� ������)
		System.out.println(Thread.currentThread().getName() + "\n");	// main
		
		Digit01 digit=new Digit01();
		digit.setName("����Ŭ����");
		digit.start();
		
		Alphabet01 alphabet=new Alphabet01();		   					     // �����층���� ����Ǳ� ������ ����� �Ź� �ٸ���.
		alphabet.setName("���ĺ�Ŭ����");
		alphabet.start();  						
	}
}


