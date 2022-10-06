package Questao6;

public class Pontencial {
	int base;
	int expoente;
	
	public Pontencial(int k, int n) {
	
		this.base = k;
		this.expoente = n;
	}

	public Pontencial() {
	}

	public int getBase() {
		return base;
	}

	public void setBase(int k) {
		this.base = k;
	}

	public int getExpoente() {
		return expoente;
	}

	public void setExpoente(int n) {
		this.expoente = n;
	}
	
	
	public int calculoPontencia(int base, int expoente ) {
		if(expoente == 0) {
			return 1;
		}else {
			
			return base*calculoPontencia(base, expoente-1);
		}
		
	}
	
	
	
	

}
