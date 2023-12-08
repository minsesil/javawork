package ex10;

import java.util.ArrayList;

public class BookMain {

	public static void main(String[] args) {
		
		LibraryController lc = new LibraryController();
		lc.insertBook();
		ArrayList<Book> bList = lc.selectAll();
		for(int i=0;i<bList.size();i++) {
			System.out.println(bList.get(i));
		}
		
		Member mem = new Member("김수연",23,'남');
		lc.insertMember(mem);		
		lc.myInfo();
		
		Book searchBook = lc.searchBook("java");
			if(searchBook == null) {
				System.out.println("찾는책없음");
			}else {
				System.out.println(searchBook);
			}
		
		int index = lc.rentBook(1);
			if(index < bList.size()) {
				System.out.println("------------빌려주는책정보---------");
				System.out.println(bList.get(index));
				System.out.println("책대여중");
			}else {
				System.out.println("책없음");
			}
	}

}
