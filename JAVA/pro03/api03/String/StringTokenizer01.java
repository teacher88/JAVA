package api03.String;

/**
 * @Data : 
 * @Author : ����
 * @Description :  StringTokenizer Ŭ���� - countTokens(), hasMoreTokens(), nextToken()
 */

import java.util.StringTokenizer;

public class StringTokenizer01 {
	public static void main(String[] args) {
		String strText="ȫ�浿/�̿���/���μ�";
		StringTokenizer st=new StringTokenizer(strText, "/");
		System.out.println("count:"+ st.countTokens());		// ������ �ʰ� ���� �ִ� ����� ��	
		
		while(st.hasMoreTokens()){								// ���� �ִ� ����� �ִ� ����
			String token=st.nextToken();							// ����� �ϳ��� ������
			System.out.println(st.countTokens() + "\t" + token);
		}
		System.out.println("\n\n");
		
		String strValue="ȫ�浿/�̿���*���μ�";
		StringTokenizer stoken=new StringTokenizer(strValue, "/");		
		while(stoken.hasMoreTokens()){				
			String token=stoken.nextToken();	
			StringTokenizer ken=new StringTokenizer(token, "*");
			
			while(ken.hasMoreTokens()){		
				System.out.println(ken.nextToken());
			}
		}
	}
}



