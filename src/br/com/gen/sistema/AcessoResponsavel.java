package br.com.gen.sistema;

import java.util.Scanner;

public class AcessoResponsavel {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		Responsavel R1 = new Responsavel(); 
		
		System.out.println("Digite o nome do responsável: ");
		String nome = leia.next(); 
		R1.setName(nome);
		System.out.println(R1.getName);
	}

}
