public class Dado {
	private int numeroCara;

	public int getNumeroCara() {
		return this.numeroCara;
	}

	public void setNumeroCara(int numeroCara) {
		this.numeroCara = numeroCara;
	}

	public int tirarDado() {
		return (int) (Math.random()*6+1);
	}
}