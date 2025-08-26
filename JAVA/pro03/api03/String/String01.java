package api03.String;


/**
 * @Data : 
 * @Author : 강사
 * @Description :  String 클래스 - charAt(int index), length(), indeOf(String str)
 */

public class String01 {
	public static void main(String[] args) {
		// charAt() : 주어진 인텍스의 문자를 리턴한다. (인텍스 0~-1)
		String subject="자바프로그래밍";		
		System.out.println("문자 추출:"  + subject.charAt(5));   	// 래
		
		// length() : 문자수를 리턴
		System.out.println("문자열 길이:" + subject.length());  	 // 7 
		
		// indeOf() : 주어진 문자열이 시작되는 인텍스를 리턴, 주어진 문자열이 포함 되지 않으면 -1을 리턴
		System.out.println("문자열 위치:" + subject.indexOf("프로그래밍"));   // 2
		System.out.println("\n\n");
		
		String juminBunho="123456-1234567"; 
		if(juminBunho.length() == 14){					// 주민번호 길이
			int location=juminBunho.indexOf("-");
			if(location != -1){								// - 추출 : 7번지
				char sex=juminBunho.charAt(location+1);
				System.out.println(sex);
				switch(sex){
				case '1' : case '3': case '5':
					System.out.println("남자 입니다.");break;
				case '2' : case '4': case '6':
					System.out.println("여자 입니다.");break;
				default:
					System.out.println("잘못입력하셨습니다");
				}
			}else{
				System.out.println("문자가 존재하지 않습니다.");
			}
		}else{
			System.out.println("주민번호 자리가 틀립니다.");
		}
		
		System.out.println();
	}
}
