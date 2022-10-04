package Questao2;

public class Fibonacci {
	
	private int n;

	public void setN(int n) {
		this.n = n;
	}
	
	public int calculoFibonacci(int n) {
		int resultado = 0;
		
		if(n == 1) {
			resultado =  0;
		}else if( n == 2){
			resultado = 1;
		}else {
			
			
			resultado = calculoFibonacci(n-1) + calculoFibonacci(n-2);
			
		}
		return resultado;
		
	}
	
	public int calculoFibonacciInterativo(int n) {
		
		int resultado = 0;
		int termoAntigo = 0;
		int termoAtual = 1;
		
		
		if( n == 1) {
			resultado = 0;
		}else if(n == 2) {
			resultado = 1;
		}else {
			for(int i=0;i<n-2;i++) {
				resultado = termoAntigo+termoAtual;
				termoAntigo = termoAtual;
				termoAtual = resultado;
			}	
			
		}
		return resultado;
	}

}
