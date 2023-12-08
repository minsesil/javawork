package ex231027;

public class Ex231027 {
	//필드
	int num1 = 30;
	int num2 = 20;
	String name;
	boolean flag;
	double numDou;
	
	//생성자
		//public Ex231027(int num1,int num2,String name,boolean flag,double numDou){
		public Ex231027(){
	        this.num1 = num1;
			this.num2 = num2;
			this.name = name;
			this.flag = flag;	
			this.numDou = numDou;		
	}
	

	//getter setter 메소드생성
	public int getNum1() {
			return num1;
		}
		public void setNum1(int num1) {
			this.num1 = num1;
		}
		public int getNum2() {
			return num2;
		}
		public void setNum2(int num2) {
			this.num2 = num2;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}		
		public boolean getFlag() {
			return flag;
		}
		public void setFlag(boolean flag) {
			this.flag = flag;
		}				
		public double getNumDou() {
			return numDou;
		}
		public void setNumDou(double numDou) {
			this.numDou = numDou;
	    }
	
		
}
