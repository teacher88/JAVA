package ch05.quiz01;

/**
 * @Data : 
 * @Author : ����
 * @Description :  Ŭ����1 - �ǽ����� 10)
 */

class Member{
	private String name;
	private String id;
	private String password;
	private int age;
	
	public boolean login(String id, String password){
		boolean check=false;
		
		if(id=="hong" && password=="1234"){
			check=true;
		}
		
		return check;
	}
	
	public void logout(String id){
		System.out.println(id + "�� �α׾ƿ� �Ǿ����ϴ�.");
	}
}


public class Quiz10 {
	public static void main(String[] args) {
		Member m=new Member();
		boolean check=m.login("hong", "1234");
		if(check==true){
			m.logout("hong");
		}
	}
}
