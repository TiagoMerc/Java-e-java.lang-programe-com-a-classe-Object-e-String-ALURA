package br.com.bytebank.banco.modelo;

public class ContaCorrente extends Conta implements Tributavel{

	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);
	}
//Taxa de R$ 0,20
	@Override
	public void saca(double valor) throws SaldoInsuficienteException {
		double valorASacar = valor + 0.2;
		super.saca(valorASacar);
	}
	
	@Override
	public void deposita(double valor) {
			super.saldo += valor;
	}
	
	@Override
	public double getValorImposto() {
		return super.saldo * 0.01;
	}
	
	@Override
	public String toString() {
		return "ContaCorrente: " + super.toString();
	}
}
