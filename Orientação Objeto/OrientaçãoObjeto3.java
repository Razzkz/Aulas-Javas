//3) Crie uma classe produto eletr�nico e apresente os atributos e m�todos
//referentes esta classe, em seguida crie um objeto produto eletr�nico,
//defina as instancias deste objeto e apresente as informa��es deste objeto
//no console.

package Turma29;

public class Orienta��oObjeto3 {

	private String produto;
	private String eletroEletronicos;
	private String eletroDomesticos;
	
	public Orienta��oObjeto3(String produto, String eletroEletronicos, String eletroDomesticos){
		
		this.produto = produto;
		this.eletroEletronicos = eletroEletronicos; //Classifica��o de produtos de uso dom�stico...
		this.eletroDomesticos = eletroDomesticos;

				
	}

	public String getProduto() {
		return produto;
	}

	public void setProduto(String produto) {
		this.produto = produto;
	}

	public String getEletroEletronicos() {
		return eletroEletronicos;
	}

	public void setEletroEletronicos(String eletroEletronicos) {
		this.eletroEletronicos = eletroEletronicos;
	}

	public String getEletroDomesticos() {
		return eletroDomesticos;
	}

	public void setEletroDomesticos(String eletroDomesticos) {
		this.eletroDomesticos = eletroDomesticos;
	}


		public void imprimir () {
		
		System.out.println("\n"+produto);
		System.out.println("\n"+eletroEletronicos);
		System.out.println("\n"+eletroDomesticos);
		
		
		
	}
		
		
		
}	
