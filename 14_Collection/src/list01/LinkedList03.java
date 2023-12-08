//ArrayList 사용방법과 비슷하다
package list01;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList03 {

	public static void main(String[] args) {
		
		LinkedList<Integer> list = new LinkedList<Integer>();		//<>는 객체(클래스)만 넣을수있다-대문자
		
		/*(출력)
		 * 1
		 * 3
		 * 5
		 * 7
		 */
		list.add(3);		 //맨끝에 추가
		list.add(1,5);	 	 //index 1에추가
		list.addFirst(1);    //맨앞에 추가
		list.add(7);		
		
		for(int i : list)
			System.out.println(i);
			System.out.println("-----------");
			
		/*(출력)
		 * 3
		 * 5
		 * 7
		 */
		list.remove(1);         //맨 앞노드 삭제
		//list.removeFirst();  //맨 앞노드 삭제(많이안쓴다)
		for(int i : list)  
			System.out.println(i);
		
		list.remove(1);
		list.removeLast();              //맨 끝노드 삭제
		//list.remove(list.size()-1);   //맨 끝노드 삭제
		
		System.out.println("-----------");
		/*(출력)
		 * 1
		 * 5
		 * 7
		 * 9
		 * 11
		 */
		list.add(5);
		list.add(7);
		list.add(9);
		list.add(11);
		Iterator<Integer> it = list.iterator();
		//hesNext() => 남아있는 객체가 있는가?
		//next() => 순회하면서 값 얻어오기
		
		while(it.hasNext()) {
			int num = it.next();
			System.out.println(num);
		}
		
		
	}

}
