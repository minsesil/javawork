package exDocument14;
//클래스 같이만듬

//클래스변수
class Document {
	
	//필드
	static int count;
	String name;
	
	
	//생성자
	Document(){
		this("제목없음" + ++count);
		
	}
	
	Document(String name){
		this.name = name;
		System.out.println("문서 " + this.name + "생성됨");
	}
	
}

public class DocumentTest {

	public static void main(String[] args) {
		
		//객체생성
		Document d1 = new Document();
		Document d2 = new Document("자바.java");
		Document d3 = new Document();
		Document d4 = new Document();

	}

}
