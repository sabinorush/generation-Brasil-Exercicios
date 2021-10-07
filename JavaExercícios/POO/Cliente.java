package pOO;

public class Cliente {
	
	public String nome;
	private String eMail;
	private String cpf; 
	
	public Cliente(String nome, String eMail, String cpf) {
		this.nome = nome;
		this.eMail = eMail;
		this.cpf = cpf;

			
	}
	
	public void imprimir() {
		System.out.println("\nCliente: "+nome+"\nE-mail: "+eMail+ "\nCPF: " + cpf);
	}

	
	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String geteMail() {
		return eMail;
	}

	public void seteMail(String eMail) {
		this.eMail = eMail;
	}



}
