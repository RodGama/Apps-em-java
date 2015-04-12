package br.com.cavalinhodobozo;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String nome;
		int fim=60;
		int i=0; int j = 0; int k = 0;
		
		System.out.println("Digite o nome do seu cavalo "+" branquinho,"+" pretinho,"+" malhadinho:");
		nome = sc.next(); 
		Cavalo c1 = new Cavalo(nome);
		
		System.out.println("Digite o nome do seu cavalo "+" branquinho,"+" pretinho,"+" malhadinho:");
		nome = sc.next();
		Cavalo c2 = new Cavalo(nome);
		 
		
		System.out.println("Digite o nome do seu cavalo "+" branquinho,"+" pretinho,"+" malhadinho:");
		nome = sc.next();
		Cavalo c3 = new Cavalo(nome);
		 
		while( (i < fim)||(j < fim)||(k < fim) ){
			for(int a=0;a<26;a++){
				System.out.println();
			}
			if((i = c1.correr()) > fim){break;}
			if((j = c2.correr()) > fim){break;}
			if((k = c3.correr()) > fim){break;}
		}
		
		if(i > j){
			System.out.println(c1.nome + " ganhou");
		}
		else if (j > k){
			System.out.println(c2.nome + " ganhou");
		}
		else{
			System.out.println(c3.nome + " ganhou");
		}
		 
		sc.close();
	}

}
