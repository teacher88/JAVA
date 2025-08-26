package api02.System;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Data :
 * @Author : ����
 * @Description :  System Ŭ���� 
 *                      currentTimeMillis(), nanoTime() : ����ð��� �и�������(1/1000��)��
 *                      ���뼼����(1/10(9��) ��) ������ long���� �����Ѵ�.                          
 */

public class BTime {
	public static void main(String[] args) {    // currentTimeMillis(); nanoTime
		long time=System.currentTimeMillis();
		System.out.println("����ð��� �ʴ�����:" + time);
		System.out.println("����ð��� �����ʴ�����:" + System.nanoTime() + "\n");
		
		Date date=new Date(time);
		System.out.println("����ð�:" + date);
		
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println("�������½ð�:" + sdf.format(date));
	}
}
