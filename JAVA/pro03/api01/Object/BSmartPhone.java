package api01.Object;

/**
 * @Data : 
 * @Author : ����
 * @Description :  Object Ŭ����
 */

public class BSmartPhone {
	private String company;
	private String os;
	
	public BSmartPhone(String company, String os){
		this.company=company;
		this.os=os;
	}
	
	@Override
	public String toString() {
		return company + "," + os;
	}	
}
