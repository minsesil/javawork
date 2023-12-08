package object01;

//클래스생성
class Value extends Object{		//자동으로 object(가장상위부모)붙는다
	int value;
	
	Value(int value){
		this.value = value;
	}
	
	@Override
	public boolean equals(Object o) {	//자식을 부모타입으로 형변화
		/*
		Value v = (Value)o;				//부모타입을 자식타입으로
		int num = v.value;	
		return value==num;
		*/
		
		//int num1 = ((Value)o).value;	//한줄로	
		return value == ((Value)o).value;
	}
	
}


public class Equals01 extends Object{

	public static void main(String[] args) {
		
		Value value1 = new Value(10);	//value1.value=10
		Value value2 = new Value(20);	//value2.value=20
		
		//오버라이딩 하기전에
		/*
		 if(value1.equals(value2))
			System.out.println("value1과 value2 주소가 같다");
		else
			System.out.println("value1과 value2 주소가 다르다");
		*/
		//오버라이딩 한후
		if(value1.equals(value2))
			System.out.println("value1과 value2 값이 같다");
		else
			System.out.println("value1과 value2 값이 다르다");

		if(value1 == value2)
			System.out.println("value1과 value2 주소가 같다");
		else
			System.out.println("value1과 value2 주소가 다르다");

		System.out.println("--------------------------");
		
		value1 = value2;
		
		if(value1.equals(value2))
			System.out.println("value1과 value2가 같다");
		else
			System.out.println("value1과 value2가 다르다");
		
	}

}
