package treinamento;

import java.util.Scanner;

public class UsuarioSenha {

	public static void main(String[] args) {
		Scanner scanNome = new Scanner(System.in);
		Scanner scanSenha = new Scanner(System.in);
		
		System.out.println("Digite o Nome: ");
		String nome = scanNome.nextLine();

		System.out.println("Digite a Senha: ");
		String senha = scanSenha.nextLine();

		
		while (nome == senha){
			System.out.println("A senha não pode ser igual ao Nome! Favor, redigitar");
		}
	}

}
