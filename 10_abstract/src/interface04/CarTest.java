package interface04;

public class CarTest {

	public static void main(String[] args) {
		
		//객체생성
		Car mycar = new Car();
		mycar.run();
		System.out.println("--------------------");
		
		mycar.backLeftTire = new HankookTire();
		mycar.run();

	}

}
