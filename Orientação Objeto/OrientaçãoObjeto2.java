//2) Crie uma classe avi�o e apresente os atributos e m�todos referentes
//esta classe, em seguida crie um objeto avi�o, defina as instancias deste
//objeto e apresente as informa��es deste objeto no console.

package Turma29;

public class Orienta��oObjeto2 {

	private String boeing;
	private String motor;
	private String lugares;
	private String funcionarios;
	
	public Orienta��oObjeto2(String boeing, String motor, String lugares, String funcionarios){
	
		this.boeing = boeing;
		this.motor = motor; // inicializa os atributos da classe Automovel
		this.lugares = lugares;
		this.funcionarios = funcionarios;
		
	
	}

	public String getBoeing() {
		return boeing;
	}

	public void setBoeing(String boeing) {
		this.boeing = boeing;
	}

	public String getMotor() {
		return motor;
	}

	public void setMotor(String motor) {
		this.motor = motor;
	}

	public String getLugares() {
		return lugares;
	}

	public void setLugares(String lugares) {
		this.lugares = lugares;
	}

	public String getFuncionarios() {
		return funcionarios;
	}

	public void setFuncionarios(String funcionarios) {
		this.funcionarios = funcionarios;
	}



	public void imprimir() {
		
		System.out.println("\n Nome do avi�o:" +boeing);
		System.out.println("\n Modelo do motor:" +motor);
		System.out.println("\n Avi�o Boeing 737 com um total de lugares:" +lugares);
		System.out.println("\n O n�mero de colaboradores s�o:" +funcionarios);}
		
}