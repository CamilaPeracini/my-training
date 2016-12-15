package Escola;

import java.util.Scanner;

public class TesteAluno {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Aluno aluno = new Aluno();
		
		System.out.println("Entre com o nome do Aluno: ");
		aluno.setNomeAluno(scan.next());
		
		System.out.println("Entre com a Matricula do Aluno: ");
		aluno.setMatriculaAluno(scan.nextInt());
		
		System.out.println("Entre com a Primeira Diciplina: ");
		aluno.setDiciplina1(scan.nextLine());
		
		System.out.println("Entre com a Segunda Diciplina: ");
		aluno.setDiciplina2(scan.nextLine());
		
		System.out.println("Entre com a Terceira Diciplina: ");
		aluno.setDiciplina3(scan.nextLine());
		
		System.out.println("Entre com a Primeira nota: ");
		aluno.setNota1(scan.nextInt());
		
		System.out.println("Entre com a Segunda nota: ");
		aluno.setNota2(scan.nextFloat());
		
		System.out.println("Entre com a Terceira Nota: ");
		aluno.setNota3(scan.nextFloat());
		
		//System.out.println(aluno.nomeAluno);
		//System.out.println(aluno.matriculaAluno);
		//System.out.println(aluno.diciplina1);
		//System.out.println(aluno.diciplina2);
		//System.out.println(aluno.diciplina3);
		//System.out.println(aluno.nota1);
		//System.out.println(aluno.nota2);
		//System.out.println(aluno.nota3);
		
		aluno.verificar();

	}

}
