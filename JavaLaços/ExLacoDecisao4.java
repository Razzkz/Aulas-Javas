//Fa�a um programa em que permita a entrada de um n�mero qualquer e exiba se este
//n�mero � par ou �mpar. Se for par exiba tamb�m a raiz quadrada do mesmo; se for
//�mpar exiba o n�mero elevado ao quadrado.


package Turma29;

import java.util.Scanner;

public class ExLacoDecisao4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numero; 
		double a, b;
		try(Scanner leia = new Scanner(System.in)) {
			
		System.out.println("\nEntre com qualquer n�mero: ");
		numero = leia.nextInt();
		
		if(numero %2==0){
		a=Math.sqrt(numero);
		System.out.println("\nSe � n�mero par:"+numero+" raiz dele = "+a);
		}
		
		else {
		b=Math.pow(numero, 2);
		System.out.println("\nSe � n�mero �mpar:"+numero+" pontencia dele = "+b);
		}
		
		}
	}

}
