package api06.Quiz;

/**
 * @Data : 
 * @Author : ����
 * @Description :  �ǽ����� 22) 
 */

class Member{
	private String id;
	private String name;
	
	public Member(String id, String name){
		this.id=id;
		this.name=name;
	}
	
	@Override
	public String toString() {
		return id + ":" + name;
	}
}

public class Quiz22 {
	public static void main(String[] args) {
		Member member=new Member("blue", "���Ķ�");
		System.out.println(member.toString());
	}
}
