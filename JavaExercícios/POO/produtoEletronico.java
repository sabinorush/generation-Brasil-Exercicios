package pOO;

public class produtoEletronico {

	public String nomeProduto;
	public String estado;
	private String eMail;

	public produtoEletronico(String nomeProduto, String estado, String eMail) {
		this.nomeProduto = nomeProduto;
		this.estado = estado;
		this.eMail = eMail;

	}
	//get and set
	public String geteMail() {
		return eMail;
	}

	public void seteMail(String eMail) {
		this.eMail = eMail;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	//metodos
	public void imprimir() {
		System.out.println("\nPedido Recebido!");
		System.out.println("\nA cotação será enviada pelo e-mail informado em até 3 dias úteis.");
	}
}
