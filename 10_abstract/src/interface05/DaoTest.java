package interface05;

public class DaoTest {

	public static void main(String[] args) {
		dbwork(new OracleDao());
		
		System.out.println();
		
		dbwork(new MysqlDao());
		
	}
	public static void dbwork(DataAccessObject dao) {
		dao.select();
		dao.insert();
		dao.update();
		dao.delete();
	}
		
}
