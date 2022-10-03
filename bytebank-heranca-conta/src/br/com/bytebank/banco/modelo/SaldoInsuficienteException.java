package br.com.bytebank.banco.modelo;

public class SaldoInsuficienteException extends RuntimeException {

	public SaldoInsuficienteException(String msg) {
		super(msg);
	}
}
