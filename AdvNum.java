import java.io.Console;
import java.util.Random;

public class AdvNum {
	public static void main (String[] args){
		Console c = System.console();
		Random gerador = new Random() ;
		int aux,aux1;
		System.out.println("Este Jogo consiste em advinhar um numero entre 1 e 1000");
		System.out.println(",a cada rodada o valor digitado sera comparado ao numero gerando uma dica," );
		System.out.println("se o valor digitado eh maior ou menor que o numero a ser descoberto");
		System.out.println("Digite o nome do jogador 1:");
		String p1 = c.readLine();
		aux=0;
		System.out.println("Digite o nome do jogador 2 :");
		String p2 = c.readLine();
		aux=1;
		String jogadorVez;
		int x = gerador.nextInt(1000);
		int vez = gerador.nextInt(2);
	    
		if(vez == 0){
			System.out.println("Jogador "+p1+ " inicia o jogo!!");
			jogadorVez =  p1 ;
		}
		else{
			System.out.println("Jogador "+p2+ " inicia o jogo!!");
			jogadorVez =  p2 ;
		}
		
		int tentativa = -1;
		while (tentativa != x){
			System.out.println("Jogador, " +jogadorVez+ " digite um numero:");
			String aux0 = c.readLine();
			tentativa = Integer.parseInt(aux0);
		  if(tentativa != x ){
			  if(tentativa > x){
				 System.out.println("Voce Errou, o valor digitado eh maior que o valor a ser descoberto ");	 	  
			    }
			  else{
				 System.out.println("Voce Errou, o valor digitado eh menor que o valor a ser descoberto ");	
			    }	
				  
			  if(jogadorVez.equals(p1)){
				  jogadorVez = p2;
			    }	
			  else{
				  jogadorVez = p1;
			    }
		    }
		  else{
			  System.out.println("Parabens "+jogadorVez+ " ,voce ganhouu!!!!!!");
		    }			
		}
	}
}