package Questao5;

public class MaiorNumeroVetor {
	int tam;
	int indice = 0;
	
	
	
	public MaiorNumeroVetor(int tam) {
		this.tam = tam;
	}



	public int maior(int[] vetor) {
		if(tam == 0) {
			return vetor[indice];
		}else if(vetor[tam - 1] > vetor[indice]) {
			indice = tam -1;
			tam--;
			return maior(vetor);
		}else {
			tam--;
			return maior(vetor);
			
		}
	}

}
