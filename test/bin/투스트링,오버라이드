package object01;

import java.util.Date;

class Card{
	String kind;
	int number;
	
	Card(){
		
	}
	Card(String kind, int number){
		this.kind=kind;
		this.number=number;
	}
	
	@Override
	public String toString() {
		return "toString-kind:"+kind+",number:"+number;
	}
}

public class ToString03 {
	public static void main(String[] args) {
		Card c1 = new Card();
		Card c2 = new Card("HEART",10);
		System.out.println(c1.toString());
		System.err.println(c2.toString());
		
		System.out.println("c1:"+c1);
		
		//String,Date클래스는 toString() 오버라이딩이 되어있다
		String str = new String("korea");		
		Date today = new Date();
		
		System.out.println(str);
		System.out.println(today);

	}

}
