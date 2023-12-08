//클래스캐스트
package exception01;

class Animal{
	
}
class Dog extends Animal{
	
}
class Cat extends Animal{
	
}

//메인시작
public class ClassCast05 {

		public static void main(String[] args) {
			try {
			Dog dog1 = new Dog();
			Animal ani = dog1;
			Dog dog2 = (Dog)ani;
			System.out.println("Dog형변환");
			
			Animal ani2 = new Animal();
			Cat cat = (Cat)ani2;	//animall객체를 cat으로 형변환
			System.out.println("Cat형변환");
			}catch(ClassCastException ce) {
				System.out.println("클래스형변환불가");
			}
		}
//메인끝

		public static void change(Animal ani) {
			if(ani instanceof Dog) {
				Dog dog= (Dog)ani;
			}else if(ani instanceof Cat) {
				Cat cat = (Cat)ani;
			}else {
				System.out.println("클래스형변환불가");
			}
		}


}