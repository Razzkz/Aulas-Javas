package Turma29;

public class EspeciePregui�a extends AnimalPOO {


	private boolean sobeemArvore;
	
	public EspeciePregui�a (String nome, int idade, boolean deveEmitirSom, boolean sobeemArvore) {
		
		super(nome, idade, deveEmitirSom);
		this.sobeemArvore = sobeemArvore;
	
	}
	

	public boolean isSobeemArvore() {
		return sobeemArvore;
	}

	public void setSobeemArvore(boolean sobeemArvore) {
		this.sobeemArvore = sobeemArvore;
	}
	public void imprimirinfo() {
		System.out.println("\nNome "+getNome()+"\nIdade "+getIdade()+"\nEmitir som "+isDeveEmitirSom()+"\nSubir em �rvore "+sobeemArvore);
	}
}