package ch06.quiz;

class CDInfo{
	protected int managerNum;
	
	public int getManagerNum() {
		return managerNum;
	}
	public void setManagerNum(int managerNum) {
		this.managerNum = managerNum;
	}
}

class Music extends CDInfo{
	protected String artist;
	protected String[] song;
	
	public void setArtist(String artist) {
		this.artist = artist;
	}

	public void setSong(String[] song) {
		this.song = song;
	}
	
	public void disp(){
		System.out.println("������ ��ȣ:" + this.getManagerNum());
		System.out.println("����:" + artist);		
		for(int i=0;i<song.length;i++){
			System.out.println("��Ʈ��[" + (i+1) + "]:"+ song[i]);
		}
	}
}

public class Quiz30 {
	public static void main(String[] args){
		Music m=new Music();
		m.setManagerNum(123456);
		m.setArtist("�ö��� �� �� ��ī��");
		String[] song={"�ʸ��ʸ��ʸ�", "��ȭ���� ���ƿ�"};
		m.setSong(song);
		
		m.disp();
	}
}
