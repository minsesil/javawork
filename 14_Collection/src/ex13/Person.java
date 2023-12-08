/*
 * 라이브러리
 * name:String
 * age:Int
 * phone:String
 * address:String
 * getter/setter()
 * toString:String
 */
package ex13;

public class Person {
	
	//필드
	String name;
	int age;
	String phone;
	String address;

	public Person(){		
	}
	public Person(String name,int age,String phone,String address){
		this.name = name;
		this.age = age;
		this.phone = phone;
		this.address = address;
	}
	
	//getter,setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}		
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	@Override	
	public String toString() {
		return "name:"+name+",phone:"+phone+",address:"+address;
	}
	
	
	
	
	
}
