package Questao6;

import java.util.Scanner;

public class aplicacao {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		Pontencial calculo = new Pontencial();
		
		
		System.out.println("Cálculo de pontêcia"); 
		System.out.print("Digite a base para fazer o cálculo: ");
		int base = ler.nextInt();
		System.out.print("Digite o expoente para fazer o cálculo: ");
		int expoente = ler.nextInt();
		System.out.println("Resultado: "+calculo.calculoPontencia(base, expoente));
		
		
		
		ler.close();

	}

}
