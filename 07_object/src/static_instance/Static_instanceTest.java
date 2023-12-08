package static_instance;

class stin{
	//인스턴스 멤버 : 반드시 객체가 생성되어야만(객체에 저장공간 마련) 사용가능
	//인스턴스 멤버와 정적멤버 모두 사용가능
	int inNum = 10;
	int plus(int x) {
		return inNum + x;
	}
	
	//정적멤버 : 클래스가 올라올때 클래스에 저장공간 마련
	//인스턴스 멤버 사용불가 : 이유는 객체가 만들어졌다는 보장이 없기때문
	static int sNum = 30;
	static int plus() {
		int re  = sNum + 10;
		//int re  = inNum + 10;   //inNum을 사용하려면 받드시 객체가 만들어져야만 사용가능
		return re;
	}
}

public class Static_instanceTest {

	public static void main(String[] args) {
		System.out.println(Stin.sNum);
		System.out.println(Stin.plus());

		Stin st = new Stin();
		//System.out.println(Stin.inNum); //객체생성해서 가능
		st.plus(3);
	}

}

