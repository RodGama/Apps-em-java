package br.com.CalcINSS;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		double salario;
		String nome;
		double inss;
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o nome do Funcionario:");
		nome = sc.next();
		System.out.println("Digite o salario do Funcionario:");
		salario = sc.nextDouble();
		Funcionario f1 = new Funcionario(nome,salario);
		f1.alocaFunc(f1);
		inss=f1.calcularInss();
		System.out.println(inss);
		
		System.out.println("Digite o nome do Funcionario:");
		nome = sc.next();
		System.out.println("Digite o salario do Funcionario:");
		salario = sc.nextDouble();
		Funcionario f2 = new Funcionario(nome,salario);
		f2.alocaFunc(f2);
		inss=f2.calcularInss();
		System.out.println(inss);
	
		System.out.println("Digite o nome do Funcionario:");
		nome = sc.next();
		System.out.println("Digite o salario do Funcionario:");
		salario = sc.nextDouble();
		Funcionario f3 = new Funcionario(nome,salario);
		f3.alocaFunc(f3);
		inss=f3.calcularInss();
		System.out.println(inss);
		
		System.out.println("Digite o nome do Funcionario:");
		nome = sc.next();
		System.out.println("Digite o salario do Funcionario:");
		salario = sc.nextDouble();
		Funcionario f4 = new Funcionario(nome,salario);
		f4.alocaFunc(f4);
		inss=f4.calcularInss();
		System.out.println(inss);
		
		System.out.println("Digite o nome do Funcionario:");
		nome = sc.next();
		System.out.println("Digite o salario do Funcionario:");
		salario = sc.nextDouble();
		Funcionario f5 = new Funcionario(nome,salario);
		f5.alocaFunc(f5);
		inss=f5.calcularInss();
		System.out.println(inss);
		
		System.out.println("Digite o nome do Funcionario:");
		nome = sc.next();
		System.out.println("Digite o salario do Funcionario:");
		salario = sc.nextDouble();
		Funcionario f6 = new Funcionario(nome,salario);
		f6.alocaFunc(f6);
		inss=f6.calcularInss();
		System.out.println(inss);
		
		System.out.println("Digite o nome do Funcionario:");
		nome = sc.next();
		System.out.println("Digite o salario do Funcionario:");
		salario = sc.nextDouble();
		Funcionario f7 = new Funcionario(nome,salario);
		f7.alocaFunc(f7);
		inss=f7.calcularInss();
		System.out.println(inss);
		
		System.out.println("Digite o nome do Funcionario:");
		nome = sc.next();
		System.out.println("Digite o salario do Funcionario:");
		salario = sc.nextDouble();
		Funcionario f8 = new Funcionario(nome,salario);
		f8.alocaFunc(f8);
		inss=f8.calcularInss();
		System.out.println(inss);
		
		System.out.println("Digite o nome do Funcionario:");
		nome = sc.next();
		System.out.println("Digite o salario do Funcionario:");
		salario = sc.nextDouble();
		Funcionario f9 = new Funcionario(nome,salario);
		f9.alocaFunc(f9);
		inss=f9.calcularInss();
		System.out.println(inss);
		
		System.out.println("Digite o nome do Funcionario:");
		nome = sc.next();
		System.out.println("Digite o salario do Funcionario:");
		salario = sc.nextDouble();
		Funcionario f10 = new Funcionario(nome,salario);
		f10.alocaFunc(f10);
		inss=f10.calcularInss();
		System.out.println(inss);
				
		sc.close();	
	}

}
