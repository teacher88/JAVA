package ch05.quiz02; 

/**
 * @Data : 
 * @Author : ����
 * @Description :  Ŭ����2- �ǽ����� 25) ������
 */

class Song{
	private String str;
	
	public Song(String str){
		this.str=str;
	}
	
	public String getTitle(){
		return str;
	}
}

public class Quiz25 {
	public static void main(String[] args) {
		Song mySong=new Song("Let it go");
		Song yourSong=new Song("������Ÿ��");
		System.out.println("�� �뷡�� " + mySong.getTitle());
		System.out.println("�� �뷡�� " + yourSong.getTitle());
	}
}
