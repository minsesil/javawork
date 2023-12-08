package com.kh.practice.list.library.model.vo;

import java.util.Objects;

public class Book implements Comparable<Book>{

	private String title;
	private String author;
	private String category;
	private int price;
	
	////////////////
	
	
	
	/////////////

    //기본생성자 - Book() 
	public Book() {
	}
	
	//매개변수가 있는 생성자 - Book(title:String,author:String,category:String,price:int)
	public Book(String title, String author, String category, int price) {
		this.title = title;
		this.author = author;
		this.category = category;
		this.price = price;
	}


	//객체의 정보를 리턴하는 메소드 - toString():String
	@Override
	public String toString() {
		return "[title=" + title + ", author=" + author + ", category=" + category + ", price=" + price + "]";
	}


	//해시코드를 리턴하는 메소드 - hashCode():int
	@Override
	public int hashCode() {
		return Objects.hash(author, category, price, title);
	}


	//객체가 같은지 여부를 리턴하는 메소드 - equals():boolean
	public boolean equals(Object obj) {
		if (!(obj instanceof Book))
			return false;
		
		Book b = (Book)obj;
		return this.title.equals(b.title)&& this.author.equals(b.author);
	}
	
//정렬 기준을가지고 있는 메소드 - compareTo(o:Object):int
/*
 * 특정필드를 기준으로 정수값 반환
 * - 정수일때
 * 		this.price < o.price => -1
 * 		this.price == o.price => 0
 * 		this.price > o.price => 1
 * - 문자열일때
 * 		문자가 같을때 => 0
 * 		다르면 => 음수 또는 양수
 */
	
	@Override
	public int compareTo(Book o) {
		//숫자일때
		//return this.getPrice() - o.price;	//직접필드사용보다 get메소드사용해야좋다
		
		//문자열 비교할때
		return this.getTitle().compareTo(o.getTitle());
	
	}

	public void title(String nextLine) {
	}

	public void author(String nextLine) {
	}

	public void category(int nextInt) {
	}

	public void price(int nextInt) {
	}


}
