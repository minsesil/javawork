package exercise;

public class Library {

	private String title;
	private String author="저자";
	private int num;

	//객체생성
	public Library() {
		
	}
	
	public Library(String title, String author, int num) {
		this.title=title;
		this.author=author;
		this.num=num;
	}
	
	//getter,setter
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title=title;
	}
	
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author=author;
	}
	
}
