package com.addinedu.model.vo;

public class Product {

//필드
	private String productId;
	private String productName;
	private String productArea;
	private int price;
	private double tax;
	
//생성자
	public Product(){		
	}
	public Product(String productId,String productName,String productArea,int price,double tax){
		this.productId = productId;
		this.productName = productName;
		this.productArea = productArea;
		this.price = price;
		this.tax = tax;
	}
	
//메소드
	public String productId() {
		this.productId = productId;
		return this.productId;
	}
	public String productName() {
		this.productName = productName;
		return this.productName;
	}
	public String productArea() {
		this.productArea = productArea;
		return this.productArea;
	}
	public int price() {
		this.price = price;
		return this.price;
	}
	public double tax() {
		this.tax = tax;
		return this.tax;
	}
	
//getter setter

	
}
