package br.com.contacorrente;

public abstract class Conta {
	int id;
	Cliente cli,clis;
	double saldo;
	
	public void depositar(int valor){
		if(valor < 0){
			valor=1;
		}
		saldo=saldo+valor;
	}
	
	public abstract boolean sacar(int valor);
}
