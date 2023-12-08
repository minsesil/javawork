package object01;

import java.util.Scanner;

public class System06 {

	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		long startNano = System.nanoTime();
		
		for(int i=1; i<100; i++) {
			System.out.println(i);
		}
		System.out.println();
		
		long endTime = System.currentTimeMillis();
		long endNano = System.currentTimeMillis();
		
		System.out.println(endTime-startTime);
		System.out.println(endNano-startNano);
		
		Scanner sc = new Scanner(System.in);

	}

}
