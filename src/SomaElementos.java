
public class SomaElementos {
	private int n;

	public SomaElementos(int n) {
		this.n = n;
	}
	
	

	public SomaElementos() {
	}



	public void setN(int n) {
		this.n = n;
	}
	
	
	public int SomaNValores(int n) {
		if (n==1) {
			return 1;
		}else {
			return n+SomaNValores(n-1);
		}
	}
	
	
	

}
