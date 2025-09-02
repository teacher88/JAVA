package thread07.Synchronized;

public class Toilet {					// 공유클래스
	
	public void openDoor(String name){				// 임의 영역: 단 하나의 스레드만 실행
		synchronized(this){			
				System.out.println(name + "화장실 입장");
			
				for(int i=0;i<1000;i++){
					if(i==100) System.out.println(name + ": 끄으응~~~");
				}
				
				System.out.println(name + ": 아 ~~~ 시원해 \n");
			}
		}
}




