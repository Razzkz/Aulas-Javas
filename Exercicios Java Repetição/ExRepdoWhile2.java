package Turma29;

import java.util.Scanner;

public class ExRepdoWhile2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);

        int numero, somanumero = 0, contnumero = 0;
        float medianumero = 0;

        do {
            System.out.println("\nEntre com qualuqer valor: ");
            numero = leia.nextInt();

            if(numero % 3 ==0) {
                contnumero++;
                somanumero += numero;
            }


        }while(numero !=0);

        medianumero = somanumero/contnumero;

        System.out.printf("\nM�dia dos n�meros m�tiplos de 3 �: %2.2f ",medianumero);
    
	}

}
