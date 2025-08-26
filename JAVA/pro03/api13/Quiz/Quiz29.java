package api13.Quiz;

import java.util.TreeSet;

class Students implements Comparable<Students>{
	public String id;
	public int score;
	
	public Students(String id, int score){
		this.id=id;
		this.score=score;
	}

	@Override
	public int compareTo(Students o) {
		if(score < o.score) return -1;
		else if(score == o.score) return 0;
		return 1;
	}
}

public class Quiz29 {
	public static void main(String[] args) {
		TreeSet<Students> treeSet=new TreeSet<Students>();
		treeSet.add(new Students("blue", 96));
		treeSet.add(new Students("red", 86));
		treeSet.add(new Students("white", 92));
		
		Students student=treeSet.last();
		System.out.println("최고점수:" + student.score);
		System.out.println("최고점수를 받은 아이디:" + student.id);
	}
}
