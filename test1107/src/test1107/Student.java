package test1107;

import java.util.ArrayList;

public class Student {
	
	//필드
	private int id;
	private String name;
	private String password;
	private int age;
	
	//빈메소드
	public Student() {
	}
	//메소드
	public Student(int id, String name, String password, int age) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.age = age;
	}
	
	//getter,setter
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	//toString
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", password=" + password + ", age=" + age + "]";
	}
	public ArrayList<Student> selectList() {
		return null;
	}
	


	

}
