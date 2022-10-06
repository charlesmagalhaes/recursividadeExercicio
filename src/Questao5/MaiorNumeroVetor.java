package Questao5;

public class MaiorNumeroVetor {
	
	public int maior(int[] vetor, int tam, int indice) {
		if(tam == 0) {
			return vetor[indice];
		}else if(vetor[tam - 1] > vetor[indice]) {
			return maior(vetor, tam - 1, tam - 1);
		}else {
			return maior(vetor, tam - 1, indice);
		}
	}

}
