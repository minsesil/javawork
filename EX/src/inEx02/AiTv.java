package inEx02;

public class AiTv extends SmartTv{
	//smarttv로부터 상속받음

	//필드
	String genre;
	
	//생성자
	String genre(String genre) {
		this.genre = genre;
		return this.genre + "를 보여줍니다";
	}

}
