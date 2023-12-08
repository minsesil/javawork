package ex10;

import java.util.ArrayList;
import java.util.Scanner;

public class LibraryController {
	
	private Member mem = new Member();
	private Book book = new Book();
	
	//bList : ArrayList
	private ArrayList<Book> bList = new ArrayList<Book>();
	//private ArrayList<Book> mList = new ArrayList<Member>();

	public void insertMember(Member m) {
		this.mem = m;
	}
	
	public void myInfo() {
		System.out.println(mem);
	}
	
	public void insertBook() {
		bList.add(new Book("java","신용권","한빛미디어"));
		bList.add(new Book("oracle","마무개","DBi"));
		bList.add(new Book("spring","홍길동","스프링"));
	}
	
	public ArrayList<Book> selectAll(){
		return bList;
	}
	
	public Book searchBook(String keyword) {
		Book book = null;
		
		for(int i=0; i<bList.size(); i++) {
			if(bList.isEmpty()) {
				System.out.println("책이 없습니다");
				break;
			} else if(keyword.equals(bList.get(i).getTitle())) {
				book = bList.get(i);
				break;
			}
		}	
		return book;
	}

	//rent
	public int rentBook(int index) {
		return index;
	}
	
	
	/*
	//insertMember(mem:Member) : void	
	public void insertMember() {
		Scanner sc = new Scanner(System.in);
		
			System.out.println("추가할 멤버의 이름,나이,성별 입력:");
			String name1 = sc.next();
			int age1 = sc.nextInt();
			char gender1 = sc.next().charAt(0);
			//String gender1 = sc.next();
	
			mem.setName(name1);
			mem.setAge(age1);
			mem.setGender(gender1);
			mList.add(m);			
	}
	*/
}
