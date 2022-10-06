package Questao5;

public class aplicacao {

	public static void main(String[] args) {
		MaiorNumeroVetor maiorNumero = new MaiorNumeroVetor(10);
		
		int[] vetor = {31, 14, 1, 55, 10, 21, 23, 45, 7, 8 };
		
		System.out.println("Maior numero: "+maiorNumero.maior(vetor));

	}

}
