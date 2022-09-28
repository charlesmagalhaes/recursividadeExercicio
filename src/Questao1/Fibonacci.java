package Questao1;

public class Fibonacci {
	
	private int n;

	public void setN(int n) {
		this.n = n;
	}
	
	public int calculoFibonacci(int n) {
		if(n == 1) {
			return 0;
		}else if( n == 2){
			return 1;
		}else {
			System.out.println(calculoFibonacci(n-1)+" - "+ calculoFibonacci(n-2));
			return calculoFibonacci(n-1) + calculoFibonacci(n-2);
		}
	}

}
