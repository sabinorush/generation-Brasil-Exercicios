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
		
		//métodos
		
		public void imprimir() {
			System.out.print("\nNome do proprietário do avião: " + nomeProprietario);
			System.out.print("\nModelo do avião: "+ modelo);
			System.out.print("\nCompanhia áerea: " + companhia);
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

