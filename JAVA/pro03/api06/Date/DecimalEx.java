package api06.Date;

import java.text.DecimalFormat;

/**
 * @Data :
 * @Author : 강사
 * @Description :  3) Decimal 클래스 
 */

public class DecimalEx {
	public static void main(String[] ar) throws Exception{		
		double x=1234567.89;
		
		DecimalFormat d1=new DecimalFormat("0"); 	
		DecimalFormat d2=new DecimalFormat("0.0");		
		DecimalFormat d3=new DecimalFormat("0.0000");	
		DecimalFormat d4=new DecimalFormat("000000000.0000");	
		System.out.println("d1:" + d1.format(x));
		System.out.println("d2:" + d2.format(x));
		System.out.println("d3:" + d3.format(x));
		System.out.println("d4:" + d4.format(x));
		System.out.println();
				
		DecimalFormat d6=new DecimalFormat("#");		
		DecimalFormat d7=new DecimalFormat("#.#");  	
		DecimalFormat d8=new DecimalFormat("#.####");	
		DecimalFormat d9=new DecimalFormat("#########.####");
		System.out.println("d6:" + d6.format(x));
		System.out.println("d7:" + d7.format(x));
		System.out.println("d8:" + d8.format(x));
		System.out.println("d9:" + d9.format(x));
		System.out.println(); 
		
		DecimalFormat d10=new DecimalFormat("+#.0");	
		DecimalFormat d11=new DecimalFormat("-#.0");	
		DecimalFormat d12=new DecimalFormat("#.#%");	
		System.out.println("d10:" + d10.format(x));
		System.out.println("d11:" + d11.format(x));
		System.out.println("d12:" + d12.format(x)); 
		System.out.println(); 
				
		int y=123456789;
		DecimalFormat d13=new DecimalFormat("#,###");	
		DecimalFormat d14=new DecimalFormat("#,####");	
		DecimalFormat d15=new DecimalFormat("#,#####");	
		DecimalFormat d16=new DecimalFormat("\u00A4 #, ###");
		System.out.println("d13:" + d13.format(y)); 	
		System.out.println("d14:" + d14.format(y)); 	
		System.out.println("d15:" + d15.format(y)); 
		System.out.println("d16:" + d16.format(y)); 
		System.out.println(); 
		
		String str="1,123,456";
		DecimalFormat df=new DecimalFormat("#,###");
		Number num=df.parse(str);			// 문자를 숫자로
		int su=num.intValue();
		System.out.println("su:" + su);
	}
}







