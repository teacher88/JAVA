package ch07.quiz;

interface AdderInterface{
	public int add(int x, int y);		// x�� y�� ��
	public int add(int x);				// 1���� n������ ���� �� ����, n�� 0���� ū ���� ����
}

class MyAddress implements AdderInterface{
	@Override
	public int add(int x, int y) {
		return x+y;
	}

	@Override
	public int add(int x) {
		int hap=0;
		
		if(x > 0){
			for(int i=1;i<=x;i++){
				hap+=i;
			}
		}
		return hap;
	}
}

public class Quiz07 {
	public static void main(String[] args) {
		MyAddress my=new MyAddress();
		System.out.println(my.add(5, 10));
		System.out.println(my.add(10));
	}
}
