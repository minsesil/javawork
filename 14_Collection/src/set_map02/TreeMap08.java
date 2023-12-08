package set_map02;

import java.security.KeyStore.Entry;
import java.util.*;


//클래스생성
class Snack{
	private String flavor;
	private int calory;
	
	public String getFlavor() {
		return flavor;
	}

	public void setFlavor(String flavor) {
		this.flavor = flavor;
	}

	public int getCalory() {
		return calory;
	}

	public void setCalory(int calory) {
		this.calory = calory;
	}

	@Override
	public String toString() {
		return "Snack [flavor=" + flavor + ", calory=" + calory + "]";
	}

	//생성자(자동)
	public Snack(String flavor, int calory) {
		super();
		this.flavor = flavor;
		this.calory = calory;
	}
}



public class TreeMap08 {

	public static void main(String[] args) {
		HashMap<String, Snack> map = new HashMap<>();
		//key:과자명, 값:Snack객체
		
		map.put("오예스", new Snack("초코맛",1500));
		map.put("새우깡", new Snack("매운맛",1000));
		map.put("프링글스", new Snack("양파맛",1300));
		map.put("포테이토칩", new Snack("감자맛",900));
		
		System.out.println(map);
		map.put("새우깡", new Snack("오리지널", 800));
		System.out.println(map);
		
		TreeMap<String, Integer> treeMap = new TreeMap<>();
		treeMap.put("forever",60);
		treeMap.put("baby", 2);
		treeMap.put("description", 90);
		treeMap.put("apple", 80);
		treeMap.put("cat", 70);
		treeMap.put("event", 10);
		treeMap.put("guess", 30);
		
		NavigableMap ns = (NavigableMap)treeMap.subMap("c", "g");
		System.out.println(ns);
		System.out.println(treeMap.subMap("c", "g"));	//상동
		
		//예제
		TreeMap<Integer, String> tMap = new TreeMap<>();
		tMap.put(89, "홍길동");
		tMap.put(57, "이길동");
		tMap.put(73, "박길동");
		tMap.put(97, "김길동");
		tMap.put(68, "나길동");

		//Entry<Integer, String> entry = tMap.firstEntry();	//왜에러?
		Entry entry = (Entry)tMap.firstEntry();
		
		System.out.println("가장낮은점수:"+entry);
						//key만 얻어올때:entry.getkey(),값만얻어올때:entry.getValue()
		System.out.println("가장높은점수:"+tMap.lastEntry());
		
		System.out.println("100점 아래점수:" + tMap.lowerEntry(100));
		System.out.println("73점 보다 위의 점수:" + tMap.higherEntry(73));

		System.out.println("73점과 동일한 점수 없으면 바로 아래 점수:" + tMap.floorEntry(73));
		System.out.println("60점과 동일한 점수 없으면 바로 아래 점수:" + tMap.floorEntry(60));

		System.out.println("73점과 동일한 점수 없으면 바로 위의 점수:" + tMap.ceilingEntry(73));
		System.out.println("90점과 동일한 점수 없으면 바로 위의 점수:" + tMap.ceilingEntry(90));

		
		

	}

}
