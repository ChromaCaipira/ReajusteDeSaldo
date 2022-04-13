package modelagem;

public class Saldo {
	private double saldo;
	
	public Saldo(double saldo) {
		this.saldo = saldo;
	}
	
	public double reajuste() { //Retorna o saldo com o reajuste de 1% ou 1/100
		return this.saldo + (this.saldo * 1/100);
	}
}