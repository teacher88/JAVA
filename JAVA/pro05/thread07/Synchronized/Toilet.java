package thread07.Synchronized;

public class Toilet {					// ����Ŭ����
	
	public void openDoor(String name){				// ���� ����: �� �ϳ��� �����常 ����
		synchronized(this){			
				System.out.println(name + "ȭ��� ����");
			
				for(int i=0;i<1000;i++){
					if(i==100) System.out.println(name + ": ������~~~");
				}
				
				System.out.println(name + ": �� ~~~ �ÿ��� \n");
			}
		}
}




