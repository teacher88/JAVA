package api06.Date;

/**
 * @Data : 
 * @Author : 강사
 * @Description :  1) Data 클래스 
 */

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx {
	public static void main(String[] args) throws ParseException {
		Date today=new Date();
		System.out.println("오늘 날짜:" + today.toString());
		
		System.out.print(today.getYear() + "년도");
		System.out.print(today.getMonth()+ 1 + "월");
		System.out.print(today.getDate() + "일");
		System.out.print(today.getHours() + "시");
		System.out.print(today.getMinutes() + "분");
		System.out.println(today.getSeconds() + "초" + "\n");
		
		
		Date now=new Date();
		SimpleDateFormat sdf1=new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(sdf1.format(now));
		
		SimpleDateFormat sdf2=new SimpleDateFormat("yy년 MM월 dd일 E요일");
		System.out.println(sdf2.format(now));
		
		SimpleDateFormat sdf3=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss a");    // HH:mm:ss
		System.out.println(sdf3.format(now) + "\n");	
		
		SimpleDateFormat sdf4=new SimpleDateFormat("올해의 D번째 날"); 
		System.out.println(sdf4.format(now) + "\n");	
		
		String str="1980-12-25";
		Date strDate=sdf1.parse(str);			// 문자열을 Date변환
		System.out.println("strData:" + strDate.toString() + "\t[" + sdf2.format(strDate) + "]");
	}
}





