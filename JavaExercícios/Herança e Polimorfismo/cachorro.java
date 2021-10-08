package pOO;

public class cachorro extends animal {
	
	private String correr;
	private String nome;
	private String som;
	
	public cachorro(String nome, int idade, String correr, String som) {
		super(nome, idade);
		this.correr = correr;

		this.som = som;
		this.nome = nome;
		}
	
	public void imprimirCachorro() {
		System.out.println("\nCachorro: "+getNome()+"\nIdade: "+getIdade()+"\nSaiu "+correr);
	}

	public String getCorrer() {
		return correr;
	}

	public void setCorrer(String correr) {
		this.correr = correr;
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
