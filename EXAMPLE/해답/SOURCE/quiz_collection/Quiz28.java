package api13.Quiz;

import java.util.ArrayList;
import java.util.List;

class Board{
	private String title;
	private String content;
	
	public Board(String title, String content){
		this.title=title;
		this.content=content;
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getContent() {
		return content;
	}	
}

class BoardDao{
	public List<Board> getBoardList(){
		List<Board> list=new ArrayList<Board>();
		list.add(new Board("力格1", "郴侩1"));
		list.add(new Board("力格2", "郴侩2"));
		list.add(new Board("力格3", "郴侩3"));
		return list;
	}
}

public class Quiz28 {
	public static void main(String[] args) {
		BoardDao dao=new BoardDao();
		
		List<Board> list=dao.getBoardList();
		
		for(int i=0;i<list.size();i++){
			Board board=list.get(i);
			System.out.println(board.getTitle() + "\t" + board.getContent());
		}
	}
}


