package pOO;

public class automovel {

	private String nomeProprietario;
	private String modelo;
	private String placa;
	private int ano;

	// m?todo especial construtor

	public automovel(String nomeProprietario, String modelo, String placa, int ano) {
		this.nomeProprietario = nomeProprietario;
		this.modelo = modelo;
		this.placa = placa;
		this.ano = ano;

	}

	// Declara??o dos demais m?todos da classe;

	public void imprimirInfo() {
		System.out.println("\n" + nomeProprietario + " possui um(a) " + 
				modelo + " com placa: "+ placa + " e ano: "+ ano);
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

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

}
