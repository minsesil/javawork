package in01;

//클래스>필드 생성
	class AA{
		int i;
		int j;
		
		void setIJ(int x, int y) {
			i=x;
			j=y;
		}
	}
	
	class BB extends AA{
		int total;
		
		void sum() {	//반환값없음
			total = i + j;
		}
	}
	
	
public class inheritanceTest2 {

	public static void main(String[] args) {

	//B클래스객체생성	
		BB b = new BB();
		b.setIJ(10,20);
		b.sum();//반환값없어서 출력할게 없어서 출력문쓰지않는다
		System.out.println(b.total);  //이렇게출력 total로
		
		
	}

}
