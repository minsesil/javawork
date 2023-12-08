package com.kh.practice.list.library.controller;

import java.util.ArrayList;
import java.util.List;

import com.kh.practice.list.library.model.vo.Book;

public class BookController {
	
	ArrayList<Book> bookList = new ArrayList<Book>();
	
	//ArrayList객체생성
	public BookController() {
		bookList.add(new Book("자바의 정석","남궁성","기타",20000));
		bookList.add(new Book("쉽게 배우는 알고리즘","문병로","기타",15000));
		bookList.add(new Book("대화의 기술","다니엘","인문",17500));
		bookList.add(new Book("암 정복기","박신우","의료",21000));
	}

	//전달 받은 bk를 bookList에추가
	public void insertBook(Book book) {
		bookList.add(book);
		
	//해당 bookList의 주소값 반환	
	public ArrayList<Book> selectList() {
		return bookList;
	}
	
		
	//검색결과 리스트를 담아줄 리스트(ArrayList searchList)선언 및 생성
	//반복문을 통해 list의 책중 책 명에 전달 받은 키워드가 포함되어있는 경우
	//searchList에 해당 책 추가하고 searchList반환
	public ArrayList<Book> searchBook(String keyword){
		ArrayList<Book> searchList = new ArrayList<Book>();
		for(Book book : bookList) {
			if(book.getTitle().contains(keyword))
				searchList.add(book);
		}
	}
	
	//삭제된 도서를 담을 Book객체(Book removeBook) 선언 및 null로 초기화
	//반복문을 통해 booklist의 책 중 책 명이 전달받은 title과 동일하고
	//저자 명이 전달받은 author와 동일한 경우 해당 인덱스 도서 삭제후 빠져나감
	//이때 해당 인덱스 도서를 removeBook에 대입 후 removeBook반환
	public Book deleteBook(String title, String author) {
		for(int i=0; i<bookList.size(); i++) {
			if(title.equals(bookList.get(i).getTitle())&& author.equals(bookList.get(i).getAuthor()){
				book = bookList.remove(i);
			}
		return book;
	}
	
	
	}
	
	

}
