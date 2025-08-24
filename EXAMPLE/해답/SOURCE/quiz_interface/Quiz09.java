package ch07.quiz;

interface DataAcessObject{
	public void select();
	public void insert();
	public void update();
	public void delete();
}

class OracleDao implements DataAcessObject{

	@Override
	public void select() {
		System.out.println("OracleDao �˻�");
	}

	@Override
	public void insert() {
		System.out.println("OracleDao ����");
	}

	@Override
	public void update() {
		System.out.println("OracleDao ����");
	}

	@Override
	public void delete() {
		System.out.println("OracleDao ����");
	}	
}

class MySql implements DataAcessObject{

	@Override
	public void select() {
		System.out.println("MySqlDao �˻�");
		
	}

	@Override
	public void insert() {
		System.out.println("MySqlDao ����");
	}

	@Override
	public void update() {
		System.out.println("MySqlDao ����");
	}

	@Override
	public void delete() {
		System.out.println("MySqlDao ����");
	}
}

public class Quiz09 {
	public static void main(String[] args) {
		dbWork(new OracleDao());
		dbWork(new MySql());
	}
	
	public static void dbWork(DataAcessObject dao){
		dao.select();
		dao.insert();
		dao.update();
		dao.delete();
		System.out.println();
	}
}
