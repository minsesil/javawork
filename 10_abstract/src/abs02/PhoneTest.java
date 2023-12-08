package abs02;

public class PhoneTest {

	public static void main(String[] args) {
		
		Phone phone = new FolderPhone("홍길동");
		phone.turnOn();
		phone.turnOff();
		
		FolderPhone fp = new FolderPhone("아무개");
		fp.message("좋은하루");
		System.out.println();
		
		phone = new SmartPhone("김기남");
		phone.turnOn();
		phone.turnOff();
	}

}
