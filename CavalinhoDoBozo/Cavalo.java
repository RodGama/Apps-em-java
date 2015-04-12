package br.com.cavalinhodobozo;

import java.util.Random;

public class Cavalo {
	String nome;
	private String avatar;
	 int distancia;
	
	public Cavalo(String novo_nome){
		if(novo_nome.equals("branquinho")){
			nome=novo_nome;
			avatar= "B>";
		}
		else if(novo_nome.equals("pretinho")){
			nome=novo_nome;
			avatar= "P>";
		}
		else{
			nome=novo_nome;
			avatar = "M>";
		}
		distancia = 0;
	}
	public int correr(){
		int n;
		Random gerador = new Random();
		n = gerador.nextInt(2);
		this.distancia = this.distancia+ n;
		mostrar(this.distancia);
		return this.distancia;
	}

	private void mostrar(int d) {
		System.out.printf("%s:",nome);
		for(int i = 0; i < d; i++)
		{
		       System.out.print(" ");
		}
		System.out.println(this.distancia + this.avatar);
	}
	
}
