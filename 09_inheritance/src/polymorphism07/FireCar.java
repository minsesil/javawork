package polymorphism07;

//물뿌림


public class FireCar extends Car{
	FireCar(){}
	FireCar(String model, String color){
		super(model, color);
	}
	
	void water() {
		System.out.println("물을 뿌립니다.");
		
	}

}
