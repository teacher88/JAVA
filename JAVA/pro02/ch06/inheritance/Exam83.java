package ch06.inheritance;

/**
 * @Data : 
 * @Author : ����
 * @Description :  ��� 
 */

class Tv{
	protected boolean power;			// ��������, Television 
	protected int channel;				   // ä��
	
	public void power(boolean power){
		this.power=power;
	}
	
	public void channelUP(){
		++channel;
	}
	
	public void channelDown(){
		--channel;
	}
}

class CaptionTv extends Tv{
	private boolean caption;
	
	public CaptionTv(){ }
	
	public CaptionTv(boolean power, int channel, boolean caption){
		super.power=power;
		super.channel=channel;
		this.caption=caption;
	}
	
	public void display(String text){
		if(power && caption){
			System.out.println(channel + "\t" + text);
		}else{
			System.out.println("power �Ǵ� caption�� �Ѽ���" );
		}
	}
}

public class Exam83 {
	public static void main(String[] args) {
		CaptionTv ct=new CaptionTv(true, 10, true);
		ct.channelUP();
		ct.display("ĸ���� �����ݴϴ�.");
		
		CaptionTv cta=new CaptionTv(true, 10, false);
		cta.channelDown();
		cta.display("ĸ���� �����ݴϴ�.");
		
	}
}
