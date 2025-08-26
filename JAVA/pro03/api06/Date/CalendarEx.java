package api06.Date;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @Data : 
 * @Author : 강사
 * @Description :  2) Calendar 클래스 
 */

public class CalendarEx {
	public static void main(String[] args) {
		Calendar today=Calendar.getInstance();			// 추상 클래스
		
		int year=today.get(Calendar.YEAR);
		int month=today.get(Calendar.MONTH) + 1;
		int date=today.get(Calendar.DAY_OF_MONTH);
		
		int amPm=today.get(Calendar.AM_PM);
		int hour=today.get(Calendar.HOUR);
		int minute=today.get(Calendar.MINUTE);
		int second=today.get(Calendar.SECOND);
		
		System.out.print(year + "년도 ");
		System.out.print(month + "월 ");
		System.out.print(date + "일\t");
		System.out.print((amPm==0 ? "오전 " : "오후 "));
		System.out.print(hour + "시 ");
		System.out.print(minute + "분 ");
		System.out.print(second + "초 ");
		
		int week=today.get(Calendar.DAY_OF_WEEK);
		String strWeek=null;
		switch(week){
			case Calendar.MONDAY: strWeek="월"; break;
			case Calendar.TUESDAY: strWeek="화"; break;
			case Calendar.WEDNESDAY: strWeek="수"; break;
			case Calendar.THURSDAY: strWeek="목"; break;
			case Calendar.FRIDAY: strWeek="금"; break;
			case Calendar.SATURDAY: strWeek="토"; break;
			case Calendar.SUNDAY: strWeek="일"; break;
		}
		System.out.println(strWeek + "요일 \n");
		
		System.out.println(today + "\n");
		Date data=today.getTime();  				// format은 date만 사용할 수 있다.
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss a");
		System.out.println(sdf.format(data));  
	}
}




