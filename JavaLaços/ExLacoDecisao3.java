//3-Fa�a um programa que receba a idade de uma pessoa e mostre na sa�da em qual
//categoria ela se encontra:

package Turma29;

import java.util.Scanner;

public class ExLacoDecisao3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int idade;
		try(Scanner leia = new Scanner(System.in)) {
		
		System.out.println("\nQual o sua idade: ");
		idade = leia.nextInt();
		}

		if(idade>=10 && idade<=14){
		System.out.println("\nClasssica��o Infantil: ");
		}
		
		else if(idade>=15 && idade<=17){
		System.out.println("\nClassifica��o Juvenil: ");	
		}
		
		else if(idade>=18 && idade<=25) {
		System.out.println("\nClassifica��o Adulto: ");
		}
		
		else {
		System.out.println("\n Idade fora do Escopo de An�lise ");
		}
		
}

}