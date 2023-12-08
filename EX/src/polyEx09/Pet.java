package polyEx09;

public class Pet {

	//필드
	String kind;
	String color;

	//생성자
	Pet(String kind, String color){
		this.kind = kind;
		this.color = color;
		}

	void sound() {
		System.out.println("울음소리");
	}
	void pattern() {
		System.out.println("특징");
	}
	
	//메소드 아래중 정한다
	//1.getter 메소드
	String getKind() {
		return kind;
	}
	void getColor() {
		System.out.println(color);
	}
	//2. toString()오버라이딩
	@Override
	public String toString() {	//public이 붙음 반드시 toString
		return "종류:" + kind + ",색상:"+color;
	}
	
	//3.별도의 메소드 정의 출력
	void infor() {
		System.out.println("종류:"+kind+",색상:"+color);
	}
	
	
	
}
