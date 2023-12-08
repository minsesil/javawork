package objectArray;

import java.util.ArrayList;
import java.util.Scanner;
//import java.util.*; (한줄로)

public class BookArrayListTest {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		ArrayList<Book> a1 = new ArrayList<Book>();
		
		System.out.print("도서명 입력 : ");
		String title = scan.nextLine();
		
		System.out.println("저자 입력 :");
		String author = scan.nextLine();
		
		System.out.println("가격 입력 : ");
		int price = scan.nextInt();
		
		System.out.println("출판사 입력 : ");
		String publisher = scan.nextLine();
		
		Book b1 = new Book(title, author, price, publisher);
		
		a1.add(b1);

	}

}
