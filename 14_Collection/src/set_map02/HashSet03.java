/*(예제2)로또
 * random -> 1~45
 * set에 넣기
 * 6개가 되면 빠져나오기
 */

package set_map02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSet03 {

	public static void main(String[] args) {
		/*예전*/
		int lotto[] = new int[45];
				
				for(int i=0; i<lotto.length; i++) {
					lotto[i]=i+1;
				}
				int index=0;
				for(int i=0; i<100; i++) {
					index=(int)(Math.random()*45);
					int set=lotto[0];
					lotto[0]=lotto[index];
					lotto[index]=set;
				}
				
				for(int i=0; i<6; i++){
					System.out.print(lotto[i]+",");
				}
		
		System.out.println();
		
		//로또 Hashset으로 간단하게
		Set<Integer> set = new HashSet<>();

		while(set.size()<6) {
			set.add((int)(Math.random()*45)+1);
		}
		System.out.println(set);
		
		//로또 순서대로 출력
		//index없기 때문에 할수없음=>List로변경후 사용
		List list = new ArrayList(set);
		Collections.sort(list);
		System.out.println(list);
		
		
		
		
		
	}

}
