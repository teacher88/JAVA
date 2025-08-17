package ch05.quiz02;

import java.util.Scanner;

/**
 * @Data : 
 * @Author : 좌민혜
 * @Description :  클래스2- 실습문제 30) 반성적표 등수
 */

class SungJukRank{
	private String name;
	private int kor, eng, mat, tot;
	private float avg;
	private Scanner sc;
	private int rank;
	
	private static int banTot;
	private static float banAvg;
	private static int inwon;
	
	public SungJukRank(){
		++inwon;
		
		sc=new Scanner(System.in);
		
		System.out.print("이름:");
		name=sc.next();
		
		System.out.print("국어:");
		kor=sc.nextInt();
		
		System.out.print("영어:");
		eng=sc.nextInt();
		
		System.out.print("수학:");
		mat=sc.nextInt();
		
		System.out.println();
	}
	
	public void total(){
		tot=kor+eng+mat;
	}
	
	public void average(){
		avg=(float)tot/3;
	}
	
	public void banTotal(){
		banTot=banTot+tot;
	}
	
	public void banAverage(){
		banAvg=banTot/(inwon*3);
	}
	
	public void disp(){
		System.out.println(name + "\t" + kor + "\t" + eng + "\t" + mat + "\t" 
			               + tot + "\t" + avg + "\t" + rank);
	}
	
	public static void title(){
		System.out.println("이름\t" + "국어\t" + "영어\t" + "수학\t" + "총점\t" 
				           + "평균\t" + "순위\t");
	}
	
	public static void banDisp(){
		System.out.println("====================");
		System.out.print("반총점:" + banTot + "\t");
		System.out.print("반평균:" + banAvg + "\t");
		System.out.println("인원수:" + inwon);
	}
	
	public static void banRank(SungJukRank[] array){
		for(int i=0;i<array.length;i++){
			array[i].rank=1;
		}
		
		for(int i=0;i<array.length;i++){
			System.out.println(array[i].tot);
			for(int j=0;j<array.length;j++){
				
				/*if(array[i].tot == array[j].tot){
					if(array[i].kor < array[j].kor)
					array[i].rank++;
				}*/
								
				if(array[i].tot < array[j].tot){
					array[i].rank++;
				}
			}	
		}
	}
}

public class Quiz30_Rank {
	public static void main(String[] ar){
		Scanner sc=new Scanner(System.in);
		
		System.out.print("인원수 입력:");
		int inwon=sc.nextInt();
		
		SungJukRank[] array=new SungJukRank[inwon];
		
		for(int i=0;i<array.length;i++){
			array[i]=new SungJukRank();
		}
		
		
		SungJukRank.title();
		for(int i=0;i<array.length;i++){
			array[i].total();
			array[i].average();
			array[i].banTotal();
			array[i].banAverage();
		}
		
		SungJukRank.banRank(array);
		
		for(int i=0;i<array.length;i++){
			array[i].disp();
		}
		SungJukRank.banDisp();
		
		sc.close();
	}
}
