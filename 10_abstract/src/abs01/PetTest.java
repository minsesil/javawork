package abs01;

public class PetTest {

	public static void main(String[] args) {
		//추상클래스는 객체를 생성할수 없음
		//Pet pet = new Pet ("강아지", "흰색");
		Dog dog = new Dog("검정");
		
		//자식객체를 부모객체로 형변환가능
		Pet pet = new Dog("갈색");  
	}

}
