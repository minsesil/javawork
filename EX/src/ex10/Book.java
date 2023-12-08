package ex10;

public class Book {
	
	String title;
	String author;
	String publisher;
	
	Book(){}
	Book(String title,String author,String publisher){
		this.title = title;	
		this.author = author;
		this.publisher = publisher;
	}
	
	//getter setter
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.title = author;
	}
	
	public String publisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}	
	
	@Override
	public String toString() {
		return "제목:"+title+"저자:"+author+"출판사:"+publisher;

	}	

	
	
}
