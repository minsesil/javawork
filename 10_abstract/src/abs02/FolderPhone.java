package abs02;

public class FolderPhone extends Phone{	 //phone으로부터 상속
	
	//생성자
	FolderPhone(String owner){
		super(owner);
	}
	
	@Override
	public void turnOn() {
		System.out.println("위로 뚜껑을 열러 전화를 받습니다");
	}
	
	@Override
	public void turnOff() {
		System.out.println("종료버튼을 눌러 전화를 끊습니다");
	}
	
	public void message(String msg) {
		System.out.print(msg+"문자를 받았습니다");
	}
}
