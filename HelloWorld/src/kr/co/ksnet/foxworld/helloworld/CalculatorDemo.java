package kr.co.ksnet.foxworld.helloworld;

class Calculator{
	int left, right;
	
	public Calculator(int left, int right) {
		this.left = left;
		this.right = right;
	}
	public int sum(){
		System.out.println("1실행결과:" + (this.left+this.right));
		return this.left+this.right;
	}
	public int avg() {
		System.out.println("1실행결과:" + ((this.left+this.right)/2));
		return (this.left+this.right)/2;
	}
}

class SubstractAbleCalculator extends Calculator {
	public SubstractAbleCalculator(int left, int right) {
		super(left, right);
	}

	public void substract() {
		System.out.println(this.left - this.right);
	}
}

class MultipleAbleCalculator extends Calculator {
	public MultipleAbleCalculator(int left, int right) {
		super(left, right);
		// TODO Auto-generated constructor stub
	}

	public void multiple() {
		System.out.println(this.left * this.right);
	}
}

class DivisionAbleCalculator extends Calculator {

	public DivisionAbleCalculator(int left, int right) {
		super(left, right);
		// TODO Auto-generated constructor stub
	}

	public void division() {
		System.out.println("3실행결과:" + (this.left / this.right));
	}
	
	public int sum(){
		System.out.println("3실행결과:" + (this.left+this.right));
		return this.left+this.right;
	}	

	public int avg(){
		int rtn = super.avg();
		System.out.println("3실행결과:" + rtn);
		return rtn;
	} 	

	public void sum(int third){
		System.out.println("3실행결과:" + ( super.sum()+third ));
	} 

}

public class CalculatorDemo {

	public static void main(String[] args) {
		SubstractAbleCalculator c1 = new SubstractAbleCalculator(40, 20);
		c1.sum();
		c1.avg();
		c1.substract();
		
		MultipleAbleCalculator c2 = new MultipleAbleCalculator(40, 20);
		c2.sum();
		c2.avg();
		c2.multiple();

		DivisionAbleCalculator c3 = new DivisionAbleCalculator(40, 20);
		c3.sum();
		c3.avg();
		c3.sum(40);
		c3.division();
	}
}
