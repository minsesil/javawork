package instanceOf08;

//클래스생성
class Parent{
	
}
class Child extends Parent{
	
}
//

public class InstanceOfTest {

	public static void main(String[] args) {
		/*
		 * instanceof
		 * 좌측의 객체가 우측의 타입으로 만들어졌냐를 검사
		 * 결과가 true : 우측타입으로 객체가 만들어졌다(즉, 강제형변환 가능)
		 *      false : 우측타입으로 객체가 만들어지지 않았다(즉, 강제형변환 불가)
		 *      
		 * 자동형변환
		 * 자식타입으로 만들어진 객체를 부모타입으로 형변환
		 * 
		 * 강제형변환
		 * 부모타입을 자식타입으로 형변환
		 * 주의점:처음 객체를 만들때 자식타입으로 객체가 생성되어야함
		 *      처음부터 부모객체로 만들어진 것은 형변환 불가
		 */
		
		//객체생성
		Parent p1 = new Parent();
		if(p1 instanceof Child) {
			Child c1 = (Child)p1;
			System.out.println("p1을 자식클래스로 강제형변환 성공");
		}else {
			System.out.println("p1은 강제형변환 불가");
		}
		
		Parent p2 = new Child();
		if(p2 instanceof Child) {
			Child c2 = (Child)p2;
			System.out.println("p2를 자식클래스 강제형변환 성공");
		}else {
			System.out.println("p2은 강제형변환 불가");
		}
		
		
	}

}
