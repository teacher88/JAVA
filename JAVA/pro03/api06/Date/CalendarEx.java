package api06.Date;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @Data : 
 * @Author : ����
 * @Description :  2) Calendar Ŭ���� 
 */

public class CalendarEx {
	public static void main(String[] args) {
		Calendar today=Calendar.getInstance();			// �߻� Ŭ����
		
		int year=today.get(Calendar.YEAR);
		int month=today.get(Calendar.MONTH) + 1;
		int date=today.get(Calendar.DAY_OF_MONTH);
		
		int amPm=today.get(Calendar.AM_PM);
		int hour=today.get(Calendar.HOUR);
		int minute=today.get(Calendar.MINUTE);
		int second=today.get(Calendar.SECOND);
		
		System.out.print(year + "�⵵ ");
		System.out.print(month + "�� ");
		System.out.print(date + "��\t");
		System.out.print((amPm==0 ? "���� " : "���� "));
		System.out.print(hour + "�� ");
		System.out.print(minute + "�� ");
		System.out.print(second + "�� ");
		
		int week=today.get(Calendar.DAY_OF_WEEK);
		String strWeek=null;
		switch(week){
			case Calendar.MONDAY: strWeek="��"; break;
			case Calendar.TUESDAY: strWeek="ȭ"; break;
			case Calendar.WEDNESDAY: strWeek="��"; break;
			case Calendar.THURSDAY: strWeek="��"; break;
			case Calendar.FRIDAY: strWeek="��"; break;
			case Calendar.SATURDAY: strWeek="��"; break;
			case Calendar.SUNDAY: strWeek="��"; break;
		}
		System.out.println(strWeek + "���� \n");
		
		System.out.println(today + "\n");
		Date data=today.getTime();  				// format�� date�� ����� �� �ִ�.
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss a");
		System.out.println(sdf.format(data));  
	}
}




