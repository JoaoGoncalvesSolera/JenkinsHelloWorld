package sampleproject;

public class TestClass {
	int number;
	
	
	//test 
	
	public void sampleMethod() {
		
	}
	
	
	public static void main(String... args) {
		Calculator calc1 = new Calculator(5);
		Calculator calc2 = new Calculator(150);
		
		System.out.println("Created 2 calculators with factor of 5");
		System.out.println("-------------------------");
		
		int calc1ResSum = calc1.sum(4, 5);
		int calc1ResFactor = calc1.factor(3);
		
		
		System.out.println("The result of summing 4 + 5 is " + calc1ResSum);
		System.out.println("The factor result of Calculator 1 with input 3 is " + calc1ResFactor);
		
		
		int calc2ResSum = calc2.sum(4, 5);
		int calc2ResFactor = calc2.factor(3);
		
		
		System.out.println("The result of summing 4 + 5 is " + calc2ResSum);
		System.out.println("The factor result of Calculator 2 with input 3 is " + calc2ResFactor);
		
		
		
		System.out.println("Hello world!");
	}

}

class Calculator{
	private int factor;
	
	public Calculator (int factor) {
		this.factor = factor;
	}
	
	
	public int sum(int a, int b) {
		return a + b;
	}
	
	public int factor(int x) {
		int result = 1;
		
		for(int i = 0; i < factor; i++) {
			result = result * x;
		}
		
		return result;
	}
}
