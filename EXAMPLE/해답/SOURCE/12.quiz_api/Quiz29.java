package api06.Quiz;

/**
 * @Data : 
 * @Author : ����
 * @Description :  �ǽ����� 29) indexOf(), charAt()
 */

public class Quiz29 {
	public static void main(String[] args) {
		String str="1!2@3^4~5";
		String delStr="!@^~";
		
		StringBuffer sb=new StringBuffer();
		for(int i=0;i<str.length();i++){
			char strCh=str.charAt(i);
			if(delStr.indexOf(strCh)==-1){			// ���Ե��� ������ -1
				sb.append(strCh);
			}
		}
		
		System.out.println(sb.toString());
	}
}








