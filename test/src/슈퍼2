package inSuper04;


class Parent2{			//부모클래스
	int x =10;			//필드
	
	void display() {	//메소드생성
		System.out.println("부모클래스의 display() 메소드 x = " + x); //10
	}
}

class Child2 extends Parent2{	//자식클래스
	int y = 20;					//필드
	
	void display() {			//메소드생성
		System.out.println("자식클래스의 display() 메소드 y = " + y); //20
	}
	
	void method() {
		display();
		super.display();
		//int x = 30;
		System.out.println("child2클래스의 x=" + this.x); //10
		System.out.println("parents2클래스의 x=" + super.x);  //10

	}
}

public class SuperTest2 {

	public static void main(String[] args) {
		
		Child2 ch2 = new Child2();	//객체생성
		//메소드호출
		ch2.method();	//자식클래스의 display()			
		ch2.display();	//메소드 y=20
	}

}
