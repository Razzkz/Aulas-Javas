//8. O custo ao consumidor de um carro novo � a soma do custo de f�brica com a
//percentagem do distribuidor e dos impostos (aplicados ao custo de f�brica).
//Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%,
//escrever um sistema que leia o custo de f�brica de um carro e escreva o custo ao
//consumidor.

package Turma29;

import java.util.Scanner;

public class Exercicio8Java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double custof,custoc, porcentagemfabricante;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nEntre com o custo de f�brica do carro: ");
		custof = leia.nextDouble();
		
		custoc = custof+ (custof*0.73);
		System.out.printf("%.2f",custoc);
		
	}

}
