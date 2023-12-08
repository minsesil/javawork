package com.addinedu.run;

import com.addinedu.model.vo.Product;

public class ProductTest {

	public static void main(String[] args) {

//product 객체생성
		Product p1 = new Product();
		//Product p1 = new Product("애플","iphone6","현백",1000,100);
		
//호출
		System.out.println(p1.productId());
		System.out.println(p1.productName());
		System.out.println(p1.productArea());
		System.out.println(p1.price());
		System.out.println(p1.tax());
		
	}

}
