package principal;

import java.util.Scanner;

import Moedas.Dolar;
import geometrias.Circulo;
//import empresa.Funcionario;
//import escola.Aluno;
import geometrias.Retangulo;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/*
		Funcionario func = new Funcionario();
		
		System.out.println("Nome: ");
		func.nome = sc.nextLine();
		System.out.println("Salário Bruto: ");
		func.salarioBruto = sc.nextDouble();
		System.out.println("Taxa: ");
		func.taxa = sc.nextDouble();
		
		System.out.println("Funcionário: " +  func.nome + " , R$ " + func.salarioLiquido());
		
		System.out.println("Qual percentual de aumento? ");
		
		double porcentagem = sc.nextDouble();
		func.aumentoSalarial(porcentagem);
		
		System.out.println("Dados atualizados: " + func.nome + " , R$ " + func.salarioLiquido());
		
		sc.close();
		*/
		
		
		/*
		Retangulo ret = new Retangulo();
		
		ret.altura = sc.nextDouble();
		ret.largura = sc.nextDouble();
		
		System.out.println("A área é: " + ret.area()  + "\n O perímetro é: " + ret.perimetro() + "\n A diagonal é: " + ret.diagonal());
		*/
		
		
		
		
		/*
		Aluno alun = new Aluno();
		
		System.out.println("Digite o seu nome: ");
		alun.nome = sc.nextLine();
		System.out.println("Digite a primeira nota: ");
		alun.nota1 = sc.nextDouble();
		System.out.println("Digite a segunda nota: ");
		alun.nota2 = sc.nextDouble();
		System.out.println("Digite a terceira nota: ");
		alun.nota3 = sc.nextDouble();
		
		System.out.println("Sua nota final é: " + alun.notaFinal());
		
		alun.status();
		*/
		
		
		
		/*
		Circulo circ = new Circulo();
		Circulo circ2 = new Circulo();
		
		
		System.out.println();
		
		System.out.println(Circulo.circunferencia(3.0));
		
		System.out.println(Circulo.volume(3.0));
		
		
		sc.close();
		*/
		
		
		
		
		Dolar input = new Dolar();
		
		System.out.println("Digite o valor do dolar: ");
		double dolar = sc.nextDouble();
		
		System.out.println("Digite a quantidade: ");
		double stock = sc.nextDouble();
		
		System.out.println(Dolar.convert(stock, dolar));
		
		
		sc.close();
		
		
		
		
		
		/*
		Dolar dol = new Dolar();
		
		System.out.println("Digite a cotação do dolar: ");
		dol.cotacaoDolar = sc.nextDouble();
		System.out.println("Digite quantos dólares quer comprar: ");
		dol.valorCompraDeDolares = sc.nextDouble();
		
		System.out.println("Você vai pagar R$ " + dol.conversorDeMoeda() + " por 500 dólares!");
		*/
		
	}

}
