package Questao5;

public class aplicacao {

	public static void main(String[] args) {
		MaiorNumeroVetor maiorNumero = new MaiorNumeroVetor();
		
		int[] vetor = {31, 14, 1, 55, 10, 21, 23, 45, 7, 3 };
		
		System.out.println("Maior numero: "+maiorNumero.maior(vetor, 10, 0));

	}

}
