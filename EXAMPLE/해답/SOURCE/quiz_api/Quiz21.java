package api06.Quiz;

/**
 * @Data : 
 * @Author : ����
 * @Description :  �ǽ����� 21) 
 */

import java.text.SimpleDateFormat;
import java.util.Date;

public class Quiz21 {
	public static void main(String[] args) {
		Date now=new Date();
		
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy�� MM�� dd�� E���� hh�� mm��");
		System.out.println(sdf.format(now));
	}
}
