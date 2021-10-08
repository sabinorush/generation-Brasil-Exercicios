package pOO;

public class preguica extends animal {
	
	private String escalar;
	private String nome;
	private String som;
	
	public preguica(String nome, int idade, String correr, String som) {
		super(nome, idade);
		this.escalar = correr;

		this.som = som;
		this.nome = nome;
		}
	public void imprimirPreguica() {
		System.out.println("\nPreguica: "+getNome()+"\nIdade: "+getIdade()+"\nFoi "+escalar);
	}

	public String getEscalar() {
		return escalar;
	}

	public void setEscalar(String escalar) {
		this.escalar = escalar;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getSom() {
		return som;
	}

	public void setSom(String som) {
		this.som = som;
	}
}
