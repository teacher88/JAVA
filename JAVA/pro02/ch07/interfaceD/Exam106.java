package ch07.interfaceD;

/**
 * @Data : 
 * @Author : ����
 * @Description : ��� - ��ü�� �ʵ�� ���
 */

import ch07.interfaceA.RemoteControl;
import ch07.interfaceA.Audio;
import ch07.interfaceA.Television;

class Testing{
	private RemoteControl rc;	
	
	public Testing(RemoteControl rc){     // Television, Audio
		this.rc=rc;
	}
	
	public void method(){
		if(rc instanceof Television){
			rc.setVolum(5);
		}else if(rc instanceof Audio){
			rc.setVolum(10);
		}
	}
	
	public void function(){
		rc.setVolum(10);
	}
}

public class Exam106 {
	public static void main(String[] args) {
		
		Testing tv=new Testing(new Television());
		tv.method();
		
		Testing audio=new Testing(new Audio());
		audio.function();
	}
}
