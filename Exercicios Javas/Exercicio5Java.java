//Fa�a um sistema que leia as 3 notas de um aluno e calcule a m�dia final deste
//aluno. Considerar que a m�dia � ponderada e que o peso das notas �: 2,3 e 5,
//respectivamente.


package Turma29;

import java.util.Scanner;

public class Exercicio5Java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double nota1=2,nota2=3,nota3=5, media;
		Scanner leia = new Scanner(System.in);
		
		media = (nota1+nota2+nota3) / 3;
		System.out.printf("\nSua m�dia �: %2.2f  " ,media); 
		
	}

}
