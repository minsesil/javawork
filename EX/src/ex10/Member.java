package ex10;

public class Member {
	
	String name;
	int age;
    char gender;
	
	Member(){}
	Member(String name,int age,char gender){
		this.name = name;	
		this.age = age;
		this.gender = gender;
	}
	
	//getter setter
	public String getName() {
		return name;
	}
	public void setTitle(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public char publigendersher() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}	
	
   
	@Override
	public String toString() {
		return "이름:"+name+"나이:"+age+"성별:"+gender;

   }

}