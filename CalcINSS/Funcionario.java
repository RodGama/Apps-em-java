package br.com.CalcINSS;

public class Funcionario {
	private int quant = 0;
	private	int matricula = 0;
	private String nome;
	private double salario;
	Funcionario[] func = new Funcionario[10]; 
	
	public Funcionario(String novo_nome,double novo_salario){
		if( novo_nome == null || novo_nome.equals("") ) {
			this.nome = "invalido";
		} else {
			this.nome = novo_nome;
		}
		salario = novo_salario;
		matricula = matricula++;
	}
	public void alocaFunc(Funcionario f){
		for(int i=0; i< quant; i++){
			if(func[i]==null){
				func[i]=f;
			}
		}
	}
	
	public double calcularInss(){
			double valorInss= 0.00;
			if(salario < 720.00){
				valorInss = salario*0.0765;
			}
			else if (salario < 1200.00){
				valorInss = salario*0.09;
			}
			else if (salario < 2400.00){
				valorInss = salario*0.11;
			}
			return valorInss;
	}	
		
	public String getNome(){
		return nome;
	}

}
