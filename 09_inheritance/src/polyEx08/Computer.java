package polyEx08;

public class Computer extends Product{
	
	//생성자:부모 생성자가 매개변수로 받는 생성자이면 반드시 자식에게도 생성자가 필요(부모의 매개변수로 전달할값)
	//Computer(int price){
	//	super(price);
	//}

//객체생성
//Computer c = new Computer(3000);  //반드시 값을 넣어서 부모에게 전달해 줘야한다.
//생성자호출 product.java
/*Product(int price){
	this.price = price;
	bonusPoint = price / /
}
*/
	Computer(){
		super(1000);
	}
	
	@Override
	public String toString() {
		return "computer";
	}


}