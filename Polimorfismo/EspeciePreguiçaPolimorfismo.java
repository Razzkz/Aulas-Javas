package Turma29;

public class EspeciePregui�aPolimorfismo extends AnimalPOO1Polimorfismo {

		private boolean sobeemArvore;

		public boolean issobeemArvore() {
			return sobeemArvore;
		}

		public void setsobeemArvore(boolean sobeemArvore) {
			this.sobeemArvore = sobeemArvore;
		}

		@Override
		public String deveEmitirSom() {

			return " A pregui�a " + super.getNome() + "!";

		}



	}