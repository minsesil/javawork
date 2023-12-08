package set_map02;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMap04 {

	public static void main(String[] args) {
		//키는 중복불가, 값은 중복가능
		Map<Integer,String> map = new HashMap<Integer,String>();

		map.put(1,"홍길동");
		map.put(2,"아무개");
		map.put(2,"이길동"); //같은키에 넣으면 값변경
		System.out.println(map);	//출력:{1=홍길동, 2=이길동}
		
		Map<String,Double> map2 = new HashMap<String,Double>();
		map2.put("java", 34.55);
		map2.put("oracle", 87.697);
		map2.put("html", 14.892);
		System.out.println(map2);	//출력:{java=34.55, oracle=87.697, html=14.892}
		System.out.println(map2.get("html"));  //출력:14.892
		//html삭제
		System.out.println(map2.remove("html")); //출력:{java=34.55, oracle=87.697}
		System.out.println(map2);
		System.out.println("--------------------------------");
		mapPrint(map);
	}
		
	//메소드로	
		static void mapPrint(Map<Integer, String> map) {
		Set<Integer> ketset = map.keySet();
		Iterator<Integer> keyIterator = ketset.iterator();
		while(keyIterator.hasNext()) {
			int key = keyIterator.next();
			String value = map.get(key);
			System.out.println(key+":"+value);
			
			
		}
	 }
	
	


}
