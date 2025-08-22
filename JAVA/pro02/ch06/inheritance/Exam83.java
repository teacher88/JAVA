package ch06.inheritance;

/**
 * @Data : 
 * @Author : 강사
 * @Description :  상속 
 */

class Tv{
	protected boolean power;			// 전원상태, Television 
	protected int channel;				   // 채널
	
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
			System.out.println("power 또는 caption을 켜세요" );
		}
	}
}

public class Exam83 {
	public static void main(String[] args) {
		CaptionTv ct=new CaptionTv(true, 10, true);
		ct.channelUP();
		ct.display("캡션을 보여줍니다.");
		
		CaptionTv cta=new CaptionTv(true, 10, false);
		cta.channelDown();
		cta.display("캡션을 보여줍니다.");
		
	}
}
