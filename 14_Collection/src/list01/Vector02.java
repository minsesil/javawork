//ArrayList와 사용방법이 같다
package list01;

import java.util.Vector;

public class Vector02 {

	public static void main(String[] args) {
		
		Vector<String> vlist = new Vector<>();
		vlist.add("Vector");
		//System.out.println(vlist.add("Vector"));  //출력:true
		vlist.add("ArrayList");
		//System.out.println("ArrayList");  //출력:ArrayList
		
		vlist.remove(0);
		vlist.add("ArrayList");

	}

}
