package pOO;

public class aviao {

		private String nomeProprietario;
		private String modelo;
		private String companhia;
		private int numPassageiros;
		
		//construtores
		
		public  aviao (String nomeProprietario, String modelo, String companhia, int numPassageiros) {
			this.nomeProprietario = nomeProprietario;
			this.modelo = modelo;
			this.companhia= companhia;
			this.numPassageiros = numPassageiros;	
		}
		
		//m�todos
		
		public void imprimir() {
			System.out.print("\nNome do propriet�rio do avi�o: " + nomeProprietario);
			System.out.print("\nModelo do avi�o: "+ modelo);
			System.out.print("\nCompanhia �erea: " + companhia);
			System.out.print("\nComporta: " + numPassageiros + " Passageiros");
		}
		
		
		//get and set
		public String getNomeProprietario() {
			return nomeProprietario;
		}

		public void setNomeProprietario(String nomeProprietario) {
			this.nomeProprietario = nomeProprietario;
		}

		public String getModelo() {
			return modelo;
		}

		public void setModelo(String modelo) {
			this.modelo = modelo;
		}

		public String getCompanhia() {
			return companhia;
		}

		public void setCompanhia(String companhia) {
			this.companhia = companhia;
		}

		public int getNumPassageiros() {
			return numPassageiros;
		}

		public void setNumPassageiros(int numPassageiros) {
			this.numPassageiros = numPassageiros;
		}
		
}

