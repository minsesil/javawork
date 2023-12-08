package in01;

//클래스>필드생성
class D{
	int x;
	static int sx;
}

class E extends D{
	String x;
	static String sx;
}


public class InheritanceTest3 {

	public static void main(String[] args) {
		
	//클래스객체생성	
	E.sx = "마이비티스";
	D.sx = 123;
		
	E e = new E();
	e.x = "혼자 공부하는 자바";
	//e.x = 1234;	우선 객체가 생성된 필드부터 보고 있으면 그 필드사용
	//				만약 객체가 생성된 필드명이 없으면 상속받은 부모필드 살펴본다
	
	D d= new D();
	d.x = 9;
	System.out.println(d.x);
		

	}

}
