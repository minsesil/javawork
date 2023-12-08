package inEx02;

public class SmartTv extends Tv{	//Tv로부터 상속받음


		//생성자
		String internet(String seacher) {
			return seacher + "를 검색하여 보여줍니다";
		}
		String netflix(String seacher) {
			return seacher + "를 보여줍니다";
		
	}

}
