package Turma29;

public class TesteAnimalPOO {

	public static void main(String[] args) {
		
		RacaCachorro golden = new RacaCachorro ("Nina", 8, true, "Golden Retriever", true);
		PorteCavalo mangaLarga = new PorteCavalo ("Sabrina", 12, true, "�gua", true);
		EspeciePregui�a sid = new EspeciePregui�a ("Sid", 8, true, true);
		
		golden.imprimirinfo();
		mangaLarga.imprimirinfo();
		sid.imprimirinfo();
	}

}
