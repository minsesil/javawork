package interface05;

public class OracleDao implements DataAccessObject{

	@Override
	public void select() {
		System.out.println("oracle db에 검색");
	}
	@Override
	public void insert() {
		System.out.println("oracle db에 삽입");
	}	
	@Override
	public void update() {
		System.out.println("oracle db에 수정");
	}	
	@Override
	public void delete() {
		System.out.println("oracle db에 삭제");
	}	
}
