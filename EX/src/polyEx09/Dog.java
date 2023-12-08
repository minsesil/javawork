package polyEx09;

public class Dog extends Pet{
	
	Dog(){
		super("강아지", "점박이");
	}

	Dog(String color){
		super("강아지", color);
	}
	
	@Override
	void sound() {
		System.out.println("울음소리");
	}
	
	@Override
	void pattern() {
		System.out.println("특징");
	}
	
	
}
