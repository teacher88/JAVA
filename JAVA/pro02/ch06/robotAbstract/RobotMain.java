package ch06.robotAbstract;

public class RobotMain {
	public static void main(String[] args) {
		Robot[] robotArray=new Robot[3];
		robotArray[0]=new SuperRobot("SuperRobot");
		robotArray[1]=new StandardRobot("StandardRobot");
		robotArray[2]=new LowRobot("LowRobot");	
		
		for(int i=0;i<robotArray.length;i++){
			robotArray[i].shape();
			robotArray[i].actionWalk();
			robotArray[i].actionRun();
			robotArray[i].actionFly();
			robotArray[i].actionKinfe();
			robotArray[i].actionMisail();
			System.out.println();
		}
	}
}
