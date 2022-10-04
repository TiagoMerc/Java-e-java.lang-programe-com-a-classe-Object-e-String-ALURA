package br.com.bytebank.banco.modelo;

/**
 * Classe representa a moldura de uma conta
 * 
 * @author Tiago Mercês
 * @version 0.1
 */
public abstract class Conta {
    protected double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;
    private static int total = 0; //"static" atributo da classe
    
    /**
     * Construtor para inicializar o objeto Conta a partir da agência e número.
     * 
     * @param agencia
     * @param numero
     */
    
    public Conta(int agencia, int numero) {
    	Conta.total++;
    	//System.out.println("o toal de contas é " +  Conta.total);
    	this.agencia = agencia;
    	this.numero = numero;
    	//this.saldo = 100;
    	//System.out.println("estou criando uma conta " + this.numero);
    }
   
   //Método abstrato
   public abstract void deposita(double valor);
   
   /**
    * Valor precisa ser maior do que o saldo.
    * @param valor
    * @throws SaldoInsuficienteException
    */
   public void saca(double valor) throws SaldoInsuficienteException {
	   if(this.saldo < valor) {
		   throw new SaldoInsuficienteException("Saldo: " + this.saldo + ", Valor: " + valor); 
	   }
	   this.saldo -= valor;
   }
   
   public void transfere(double valor, Conta destino) throws SaldoInsuficienteException{
	  this.saca(valor);
	  destino.deposita(valor);
   }
   
   public double getSaldo() {
	   return this.saldo;
   }
   
   public int getNumero() {
	   return this.numero;
   }
   
   public void setNumero(int numero) {
	   if(numero <= 0) {
		   System.out.println("não pode valor <= 0");
		   return;
	   }
	   this.numero = numero;
   }
   
   public int getAgencia() {
	   return this.agencia;
   }
   
   public void setAgencia(int agencia) {
	   if(agencia <= 0) {
		   System.out.println("não pode valor menor igual a 0");
		   return;
	   }
	   this.agencia = agencia;
   }
   
   public void setTitular(Cliente titular) {
	   this.titular = titular;
   }
   
   public Cliente getTitular() {
	   return titular;
   }
   
   public static int getTotal() {
	   return Conta.total;
   }
   
	@Override
	public String toString() {
		return "Numero: " + this.numero + ", Agencia: " + this.agencia;
	}
}


