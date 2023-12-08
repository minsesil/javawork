package com.kh.practice.list.library.view;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.kh.practice.list.library.controller.BookController;
import com.kh.practice.list.library.model.vo.Book;

Scanner scan = new Scanner(System.in);
BookController bc = new BookController();


	//사용자가 직접 메인 메뉴를 선택할수있음.
	//종료 전까지 반복 실행. 각 메뉴를 누를 시 해당 메소드로 이동.
	public void mainMenu(){
		
		while(true) {
			System.out.println("==Welcome KH Library==");	
			System.out.println("1.새 도서 추가\n "
					+ "2. 도서 전체 조회\n "
					+ "3. 도서 검색 조회\n "
					+ "4. 도서 삭제\n "
					+ "5. 도서 명 오름차순 정렬\n "
					+ "9. 종료");
			
			Scanner scan = new Scanner(System.in);
			int selectNum = scan.nextInt();
			
			switch(selectNum) {
			case 1:
				insertBook(); //호출
			case 2 :
				selectList();
			case 3 :
				searchBook();
			case 4 :
				deleteBook();
			case 5 :
				ascBook();
			case 9 :
				System.out.println("프로그램을 종료합니다");
				return;
			default:
				System.out.println("잘못 입력하셨습니다. 다시 입력해 주세요");
			}
		}
	}
	//도서 추가를 위해 정보를 받는 메소드
	public void insertBook() {
		
		System.out.println("===== 새 도서 추가 =====");		
		System.out.println("책정보를 입력해주세요 >");
		System.out.println("도서명 >");
		String title = scan.nextLine();
		
		System.out.println("저자명>");
		String author = scan.nextLine();
		
		System.out.println("장르 입력(1.인문/2.자연과학/3.의료/4.기타) >");
		int category = scan.nextInt();
		
		System.out.println("가격 입력> ");
		int price = scan.nextInt();
		
		
		String category = null;
		switch(categoryNum) {
		case 1:
			category = "인문";
			break;
		case 2:
			category = "과학";
			break;
		case 3:
			category = "외국어";
			break;
		default:
			category = "기타";
	    }
		Boom insertBook = new Book(title,author,category,price);
		bc.insertBook(insertBook);
		
		bc.insertBook(new Book(title,author,category,price));
	}
	
	
	
	

	//전체 도서 목록 출력 성공을 알리는 메소드
	private void selectList() {
		System.out.println("===== 도서 전체 조회 =====");		
		ArrayList<Book> bookList = bc.selectList();
		
		if(bookList.isEmpty())[] {
			System.out.println("도서가 없습니다");

	    }	else {
			for(Book book : bookList) {
				System.out.println("\t" + book);
			}
	    }
	 }
	
	//특정 도서 검색 결과를 보여주는 메소드
	private void searchBook() {
		System.out.println("===== 도서 검색 =====");		
		System.out.println("검색 키워드 : ");		
		String search = scan.nextLine();

		ArrayList<Book> searchList = nc.searchBook(keyword);
		for(int i=0; i<books.length; i++) {
			if(books[i].getTitle().equals(search))
				System.out.println("검색 결과가 없습니다");
		}else {
			for(Book book : searchList) {
				System.out.println("\t" + book);
			}

		}
	}
	
	
	//책 명 오름차순 정렬 성공을 알리는 메소드
	private void ascBook() {
		int num=bc.ascBook();
		if(num==1) {
			System.out.println("정렬에 성공");
		}else {
			System.out.println("정렬에 성공못함");
		}
	}
	
	
	//특정 도서 삭제 성공을 알리는 메소드
	private void deleteBook(String title,String author) {
		System.out.println("===== 도서 삭제 =====");		
		System.out.println("삭제할 도서명 : ");	
		String title = scan.nextLine();
		
		System.out.println("삭제할 저자명 : ");	
		String author = scan.nextLine();
		
		Book book = bc.deleteBook(title, author);
		
	
	
	
	
	
	
	
	}
	
	
	
	
	
	
	
	

	
		
	
	
	



	
	
	
	
	
	
}
