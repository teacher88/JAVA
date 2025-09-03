package ch05.quiz01;

/**
 * @Data : 
 * @Author : 강사
 * @Description :  클래스1 - 실습문제 10)
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
		System.out.println(id + "님 로그아웃 되었습니다.");
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
