package br.com.contacorrente;

public class ContaNormal extends Conta {
	int id;
	double saldo;
	Cliente cli,clis;
	
	public ContaNormal(int novo_id,Cliente cli1){
		cli=cli1;
		id=novo_id;
	}

	public boolean sacar(int valor) {
		if(saldo < valor){return false;}
		else{
			saldo= saldo - valor;
			return true;
			}
	}
	
	public void setClienteSecundario(Cliente cli){
		clis = cli;
	}
	
	
}
