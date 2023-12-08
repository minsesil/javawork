package set_map02;

import java.util.Arrays;
import java.util.NavigableSet;
import java.util.TreeSet;

public class HeadSet07 {

	public static void main(String[] args) {

		int[] arrInt = {1,4,3,6,7,1,6,4,6,8};  //10개중 중복 4개
		
		TreeSet<Integer> ts = new TreeSet<>();
		for(Integer o : arrInt) {
			ts.add(o);
		}
		System.out.println(Arrays.toString(arrInt));
		System.out.println(ts);	//자동으로 오름차순 정렬로 출력(로또는 트리셋이 편하다)
		
		//내림차순 정렬 : descendingSet()
		NavigableSet<Integer> descend = ts.descendingSet();
		System.out.println(descend);
		
		
		
		
		
	}

}
