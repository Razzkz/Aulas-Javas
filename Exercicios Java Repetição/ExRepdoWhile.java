//5-Crie um programa que leia um n�mero do teclado at� que encontre um
//n�mero igual a zero. No final, mostre a soma dos n�meros
//digitados.(DO...WHILE)

package Turma29;

import java.util.Scanner;

public class ExRepdoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numero, soma=0;
		
		Scanner leia = new Scanner(System.in);
		
		do {
			System.out.printf("\nDigite o n�mero a ser somado (digite 0 para finalizar): ");
			numero = leia.nextInt();
			soma += numero;
			} 
		
		while(numero!=0);
		
		System.out.println("\nA soma dos n�meros digitados � igual a" +soma);
			
			
		}
	}


