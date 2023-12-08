package test1107;

public class Grade extends Student{
	//필드
	private int kor;
	private int eng;
	private int com;
	private int math;
	
	//빈메소드
	public Grade() {
		super();
	}

	//메소드
	public Grade(int kor, int eng, int com, int math) {
		super();
		this.kor = kor;
		this.eng = eng;
		this.com = com;
		this.math = math;
	}

	//getter,setter
	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getCom() {
		return com;
	}

	public void setCom(int com) {
		this.com = com;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}
	
    //toString
	@Override
	public String toString() {
		return "Grade [kor=" + kor + ", eng=" + eng + ", com=" + com + ", math=" + math + "]";
	}

	
	
	
}
