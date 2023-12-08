package exercise;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Library lib = new Library();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("title입력>");
		String title = scan.nextLine();
		System.out.println(title);
		
		System.out.println(lib.getAuthor());
		

		
		
		
	}

}
