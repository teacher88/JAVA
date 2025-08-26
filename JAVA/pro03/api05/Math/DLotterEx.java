package api05.Math;

/**
 * @Data : 
 * @Author : 강사
 * @Description :  Math 클래스 
 */

public class DLotterEx {
	public static void main(String[] args) throws InterruptedException {
        int lotto[] = new int[6];
        
        for(int cnt=0;cnt<3;cnt++) {
        	
	        for(int i=0;i<lotto.length;i++) {
	        	lotto[i]=(int)(Math.random()*45)+1;
	   
		        for(int j=0;j<i;j++) {
		        	if(lotto[i]==lotto[j]) {
		        		i--;
		        		break;
		        	}
		        }
	        }
	        
	        for(int i=0;i<lotto.length;i++) {
	        	System.out.print(lotto[i] + " ");
	        }
	        
	        System.out.println();
        }
        
	}	
}







