package ch07.quiz;

interface Action{
	void work();
}

public class Quiz10 {
	public static void main(String[] args) {
		Action action=new Action(){
			@Override
			public void work() {
				System.out.println("������ �����մϴ�.");
				
			}		
		};
		
		action.work();
	}
}
