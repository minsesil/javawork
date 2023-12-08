package list01;

import java.util.ArrayList;
import java.util.List;

public class ArrayList01 {

	public static void main(String[] args) {
		/*
		ArrayList<>
		<제네릭> => 자료형이 무엇이 들어올지 모른다
				  사용할때 자료형을 넣는다
		    - 갯수를 지정하지 않으면(기본10개)
		*/
		//갯수지정 가능
		ArrayList<String> alist = new ArrayList<>(15);
		
		//부모형으로 변환하여 사용
		List<String> list = new ArrayList<>();
		list.add("java");
		list.add("oracle");
		list.add("HTML5");
		list.add("JSP");
		
		//사이즈
		int size = list.size();
		System.out.println("총 객체수 : "+size);				//출력)총 객체수 4
		
		//객체 얻어옴
		String list_21 = list.get(2);
		System.out.println(list_21);						//출력)HTML
		//삽입
		list.add(2,"Spring");		
		System.out.println("총 객체수 " + list.size());		//출력:5
		System.out.println(list.get(2));
		System.out.println("--------------------------");
		//기존객체 변경
		list.add(2,"Spring");		
		System.out.println("총 객체수 " + list.size());		//출력:6
		System.out.println(list.get(2));					//출력:Spring
		System.out.println("--------------------------");

		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));	//출력:java
			
		//삭제 remove(index), remove(객체명)
		String removeStr = list.remove(0);
		System.out.println(removeStr);	//출력:java
		System.out.println();
		
		/* (출력)
		 * oracle
		 * Spring
		 * spring
		 * HTML5
		 * JSP
		 */
		for(int i1=0; i1<list.size(); i1++) {
			System.out.println(list.get(i1));    
		}
			System.out.println();
			
		boolean re = list.remove("HTML5");
		System.out.println(re);
		
		list.clear();
		System.out.println("총객체수:"+list.size());					//출력)총객체수:0
		System.out.println("ArrayList가 비었는가"+list.isEmpty());		//출력)ArrayList가 비었는가true
		
		//매개변수에 모든 객체를 받을때<Object>
		ArrayList alist2 = new ArrayList();
		
		alist2.add(1);
		alist2.add(3.1415);
		alist2.add("56");
		alist2.add(new String("88"));
		
		Object obj1 = alist2.get(0);
		int num = (int)obj1;
		double douNum = (double)alist2.get(1);
		String str = (String)alist2.get(2);
		int strNum1 = Integer.parseInt((String)alist2.get(2));
		int strNum2 = Integer.parseInt((String)alist2.get(3));
		System.out.println(num+douNum+strNum1+strNum2);   			   //출력:148.1415
			
			
			
		}
	

	}

}
