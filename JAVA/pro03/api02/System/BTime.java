package api02.System;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Data :
 * @Author : 강사
 * @Description :  System 클래스 
 *                      currentTimeMillis(), nanoTime() : 현재시간을 밀리세컨드(1/1000초)과
 *                      나노세컨드(1/10(9승) 초) 단위의 long값을 리턴한다.                          
 */

public class BTime {
	public static void main(String[] args) {    // currentTimeMillis(); nanoTime
		long time=System.currentTimeMillis();
		System.out.println("현재시간을 초단위로:" + time);
		System.out.println("현재시간을 나노초단위로:" + System.nanoTime() + "\n");
		
		Date date=new Date(time);
		System.out.println("현재시간:" + date);
		
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println("포맷형태시간:" + sdf.format(date));
	}
}
