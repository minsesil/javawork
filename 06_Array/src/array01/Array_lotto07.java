package array01;

public class Array_lotto07 {

	public static void main(String[] args) {

// 로또
		int lotto[] = new int[45];	
		
		for(int i=0; i<lotto.length; i++) {
			lotto[i] = i+1;
		}
		int index = 0;
		for(int i=0; i<6; i++) {
			index = (int)(Math.random()*45);           //0~44
			//System.out.print(index);
			int tmp = lotto[0];
			lotto[0] = lotto[index];
			lotto[index] = tmp;
			System.out.print(lotto[i] + ",");
		}
		
		
	}

}
