package br.com.contacorrente;

public class Cliente {
	private int cpf;
	private String nome;
	
	public Cliente(int novo_cpf, String novo_nome) {
		if(novo_nome==null||"".equals(novo_nome)){
			setNome("invalido");
		}
		else{setNome(novo_nome);}
		cpf=novo_cpf;
	}
	public int getCPF(){
		return this.cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String novo_nome) {
		if(novo_nome==null||"".equals(novo_nome)){
			nome="invalido";
		}
		else{nome = novo_nome;}
	}

}
