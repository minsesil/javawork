package ex13;

public class Snippet {
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member member = (Member)obj;
			return (member.age == age) && (member.name.equals(name));
		}
		return false;
	}
}

