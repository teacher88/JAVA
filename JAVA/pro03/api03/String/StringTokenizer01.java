package api03.String;

/**
 * @Data : 
 * @Author : 강사
 * @Description :  StringTokenizer 클래스 - countTokens(), hasMoreTokens(), nextToken()
 */

import java.util.StringTokenizer;

public class StringTokenizer01 {
	public static void main(String[] args) {
		String strText="홍길동/이영자/조인성";
		StringTokenizer st=new StringTokenizer(strText, "/");
		System.out.println("count:"+ st.countTokens());		// 꺼내지 않고 남아 있는 토근의 수	
		
		while(st.hasMoreTokens()){								// 남아 있는 토근이 있는 여부
			String token=st.nextToken();							// 토근을 하나씩 꺼내옴
			System.out.println(st.countTokens() + "\t" + token);
		}
		System.out.println("\n\n");
		
		String strValue="홍길동/이영자*조인성";
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



