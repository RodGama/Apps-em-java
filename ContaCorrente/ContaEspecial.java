package br.com.contacorrente;

public class ContaEspecial extends Conta {
	int id;
	double saldo,limite;
	Cliente cli,clis;
	
	public ContaEspecial(int novo_id, Cliente cli1, int limite) {
		cli=cli1;
		id=novo_id;
		this.limite=limite;
	}

	public boolean sacar(int valor) {
		double saque = (saldo-valor);
		if(valor < 0){return false;}
		else if(saque < 0 ){
			saque = saque *(-1);
		}
		if(saque < limite){
			saldo = saldo -valor;
			return true;
		}
		return false;
	}
	
	public void setClienteSecundario(Cliente cli){
		clis = cli;
	}
	
	public Cliente getClienteSecundario(){
		return clis;
	}
	
	public double getLimite(){
		return limite;
	}
	
}
