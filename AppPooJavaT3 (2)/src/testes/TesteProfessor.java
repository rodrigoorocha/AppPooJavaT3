package testes;

import java.util.Scanner;

import Negocio.Professor;

public class TesteProfessor {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		Professor professor = new Professor();


		System.out.printf("Informe o seu nome: ");		
		professor.nome = ler.nextLine();		


		System.out.printf("Informe a sua matr�cula: ");		
		professor.matricula = ler.nextInt();		


		System.out.printf("Informe o seu sal�rio: ");		
		professor.salario = ler.nextFloat();		


		System.out.printf("Informe se � um professor tempor�rio: ");		
		professor.temporario = ler.nextBoolean();


		System.out.println("meses trabalhados");
		professor.meses =ler.nextInt();


		System.out.printf(" bonus : ");		
		professor.bonus = ler.nextFloat();


		System.out.printf(" gratific : ");		
		professor.gratific = ler.nextFloat();


		System.out.printf(" desconto : ");		
		professor.desconto = ler.nextFloat();


		System.out.println(" numero de diciplinas :");
		professor.ndiciplinas =ler.nextInt();


		final float VL_EXPERIENCIA = 50;
		final float VL_DISCIPLINA = 100;

		professor.salariobruto = ( professor.salario+ professor.bonus+ professor.gratific- professor.desconto);
		professor.salariobruto=  professor.salariobruto +( professor.meses* VL_EXPERIENCIA);
		professor.salariobruto =  professor.salariobruto + ( professor.ndiciplinas * VL_DISCIPLINA);





		System.out.println("Nome: " +  professor.nome);
		System.out.println("Matr�cula: " +  professor.matricula);
		System.out.println("Sal�rio: " +  professor.salario);
		System.out.println("Tempor�rio? " + ( professor.temporario ? "Sim" : "N�o"));
		System.out.println("salariobruto :" +  professor.salariobruto);
		System.out.printf("o professor %s %d �  %s, pois ganha R$%.2f\n",
				professor.nome,
				professor.matricula,
				( professor.salariobruto >= 10000 ? "rico" : "pobre"),
				professor.salariobruto);


	}

}
