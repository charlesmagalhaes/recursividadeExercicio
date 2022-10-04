package Questao2;

public class Aplicacao {

	public static void main(String[] args) {
		
		Fibonacci calculoFi = new Fibonacci();
		
		
		long tempoInicial1 = System.currentTimeMillis();
		System.out.println(tempoInicial1);
		System.out.println("Resultado: "+calculoFi.calculoFibonacciInterativo(100));
		long tempoFinal1 = System.currentTimeMillis();
		tempoFinal1 = System.currentTimeMillis();
		System.out.println(tempoFinal1);
		System.out.printf("%.4f ms%n", (tempoFinal1 - tempoInicial1) / 1000d);
		
		
		long tempoInicial = System.currentTimeMillis();
		System.out.println(tempoInicial);
		System.out.println("Resultado: "+calculoFi.calculoFibonacci(40));
		long tempoFinal = System.currentTimeMillis();
		System.out.println(tempoFinal);
		System.out.printf("%.4f ms%n", (tempoFinal - tempoInicial) / 1000d);
		
		System.out.println("----------------------------------------------------------");
		

	}

}
