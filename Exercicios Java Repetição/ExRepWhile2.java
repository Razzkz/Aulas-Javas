//4Uma empresa desenvolveu uma pesquisa para saber as caracter�sticas
//psicol�gicas dos indiv�duos de uma regi�o. Para tanto, a cada uma das pessoas
//era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as op��es
//(1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era
//agressiva). Pede-se para elaborar um sistema que permita ler os dados de 150
//pessoas, calcule e mostre: (WHILE)


package Turma29;

import java.util.Scanner;

public class ExRepWhile2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

int idade,genero,fp,contpc=0,contmn=0,contha=0,contoc=0,contpn40=0,contpc18=0,np=1;
		
		Scanner leia = new Scanner(System.in);
		
		while(np<=5)
		{
			System.out.println("\nEntre com a sua idade: ");
			idade = leia.nextInt();
			System.out.println("\nG�nero: \n1-Masculino \n2-Feminino \n3-Outros");
			genero = leia.nextInt();
			System.out.println("\nFator psicol�gico: \n1- Calme \n2- Nervose \n3- Agressive");
			fp = leia.nextInt();
			
			if(fp == 1)
			{
				contpc++;
			}
			if(genero == 2 && fp == 2)
			{
				contmn++;
			}
			if(genero == 1 && fp == 3)
			{
				contha++;
			}
			if(genero == 3 && fp == 1)
			{
				contoc++;
			}
			if(fp == 2 && idade > 40)
			{
				contpn40++;
			}
			if(fp == 1 && idade < 18)
			{
				contpc18++;
			}
			np++;
		}
		
		System.out.println("\nPessoas calmas: "+contpc);
		System.out.println("\nMulheres nervosas: "+contmn);
		System.out.println("\nHomens agressivos: "+contha);
		System.out.println("\nOutros calmes: "+contoc);
		System.out.println("\nPessoas nervosas com mais de 40 anos: "+contpn40);
		System.out.println("\nPessoas calmas com menos de 18 anos: "+contpc18);
	
	
	}

}
