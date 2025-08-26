package api04.Wapper;

/**
 * @Data : 
 * @Author : 강사
 * @Description :  Wrapper 클래스 - 문자열을 기본 타입 값으로 변환
 */

public class BFunction {
	public static void main(String[] args) {
		int max=Integer.MAX_VALUE;
		int min=Integer.MIN_VALUE;
		int byteSu=Integer.BYTES;
		int size=Integer.SIZE;
		
		System.out.println("max:" + max);
		System.out.println("min:" + min);
		System.out.println("byteSu:" + byteSu);
		System.out.println("size:" + size + "\n\n");
		
		String binary=Integer.toBinaryString(10);
		String octal=Integer.toOctalString(10);
		String hex=Integer.toHexString(10);
		
		System.out.println("binary" + binary);
		System.out.println("octal:" + octal);
		System.out.println("hex:" + hex.toUpperCase() + "\n\n");
		
		// 문자를 정수형으로
		Integer value1=new Integer("10");
		Integer.valueOf("10");
		int value2=Integer.parseInt("10");
		System.out.println("value1:" + value1);
		System.out.println("value2:" + value2 + "\n\n");
	
		double value3=Double.parseDouble("3.14");
		boolean value4=Boolean.parseBoolean("true");
		System.out.println("value3:" + value3);
		System.out.println("value4:" + value4 + "\n\n");
		
		// 정수형을 문자로
		String value5=String.valueOf(10);
		System.out.println("value5:" + value5);
	}
}
