//2- Fa�a um programa que receba 6 n�meros inteiros e mostre: 
//� Os n�meros pares digitados;  
//� A soma dos n�meros pares digitados; 
//� Os n�meros �mpares digitados; 
//� A quantidade de n�meros �mpares digitados.


package Turma29;

import java.util.Scanner;

public class ExArray2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner (System.in);
		
		int v[] = new int[6];
		int x, sPares=0, cImpares=0;
		
		for(x=0; x<6; x++) {
			
			System.out.println("\nEntre com um n�mero: ");
			v[x] = leia.nextInt();
			
			if(v[x] % 2 ==0) {
				
				sPares += v[x];
				System.out.println("\nO n�mero par digitado foi:" +v[x]);
			}
			else {
				cImpares++;
				System.out.println("\nO n�mero impar digitado foi:" +v[x]);
				
			}
  		}
		
		System.out.println("\nA soma dos n�meros pares foram de:" +sPares);
		System.out.println("\nA soma dos n�meros �mpares foram de:" +cImpares);
	}

}
