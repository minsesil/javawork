package set_map02;

import java.util.*; //

public class HashMap05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		HashMap map = new HashMap();
		
		map.put("myId", "pw1234");
		map.put("20230001", "pw0001");
		map.put("2023002", "pw002");
				
		System.out.println("id와 pw 입력: ");
		String id = sc.next();
		String pw = sc.next();
		
		if(map.containsKey(id)) {	//만약 키값이 들어있으면
			String value = (String)map.get(id);
			if(value.equals(pw)) {
				System.out.println("로그인 하였습니다");
			}else {
				System.out.println("pw가 틀리립니다");
			}
			
		}else {
			System.out.println("id가 일치하지않습니다");
		}

		
		
		
		
	}

}
