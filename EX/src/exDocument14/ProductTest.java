package exDocument14;

class Product {

	//필드
	static int count;
	String serialNo;
	
	Product(){
		++count;
		serialNo = "AddinEdu" + count;
	}
	
}

public class ProductTest {

	public static void main(String[] args) {
		
		//객체생성
		Product p1 = new Product();
		Product p2 = new Product();
		Product p3 = new Product();
		
		System.out.println("p1제품번호 : " + p1.serialNo);
		System.out.println("p2제품번호 : " + p2.serialNo);
		System.out.println("p3제품번호 : " + p3.serialNo);
		System.out.println("생산된 제품 총갯수: " + Product.count);

	}

}
