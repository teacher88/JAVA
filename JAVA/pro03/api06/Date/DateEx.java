package api06.Date;

/**
 * @Data : 
 * @Author : ����
 * @Description :  1) Data Ŭ���� 
 */

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx {
	public static void main(String[] args) throws ParseException {
		Date today=new Date();
		System.out.println("���� ��¥:" + today.toString());
		
		System.out.print(today.getYear() + "�⵵");
		System.out.print(today.getMonth()+ 1 + "��");
		System.out.print(today.getDate() + "��");
		System.out.print(today.getHours() + "��");
		System.out.print(today.getMinutes() + "��");
		System.out.println(today.getSeconds() + "��" + "\n");
		
		
		Date now=new Date();
		SimpleDateFormat sdf1=new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(sdf1.format(now));
		
		SimpleDateFormat sdf2=new SimpleDateFormat("yy�� MM�� dd�� E����");
		System.out.println(sdf2.format(now));
		
		SimpleDateFormat sdf3=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss a");    // HH:mm:ss
		System.out.println(sdf3.format(now) + "\n");	
		
		SimpleDateFormat sdf4=new SimpleDateFormat("������ D��° ��"); 
		System.out.println(sdf4.format(now) + "\n");	
		
		String str="1980-12-25";
		Date strDate=sdf1.parse(str);			// ���ڿ��� Date��ȯ
		System.out.println("strData:" + strDate.toString() + "\t[" + sdf2.format(strDate) + "]");
	}
}





