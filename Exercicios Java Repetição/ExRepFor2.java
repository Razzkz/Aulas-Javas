//2- Ler 10 n�meros e imprimir quantos s�o pares 
//e quantos s�o �mpares. (FOR)


package Turma29;

import java.util.Scanner;

public class ExRepFor2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
        int num,contPar=0,contImpar=0;
        
        for(int i=1; i <= 10; i++){
            System.out.println("Digite um n�mero");
            num = leia.nextInt();
            
            if(num % 2 == 0){
                contPar++;
            }

            if(num % 2 == 1){
                contImpar++;
            }
            
        }
        
        System.out.println("\nForam digitados " +contPar+ " n�meros pares");
        System.out.println("\nE " +contImpar+ " n�meros �mpares");
        
	
    }
}