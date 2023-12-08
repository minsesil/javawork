package inSuper04;
//this : 객체를 생성한 나 자신
//super : 상속받은 부모로를 의미

//클래스,필드
class Parent{
	int x =10;
}
class Child extends Parent{
	int y = 20;
	
	void method() {
		
		int x = 30;
		System.out.println("x=" + x);  //10
		System.out.println("this.x=" + this.x);  //10
		System.out.println("super.x=" + super.x);  //10

	}
}

public class SuperTest1 {

	public static void main(String[] args) {
		
		Child ch = new Child();	//객체생성
		ch.method();	//메소드호출
	}

}
