package pOO;

public class operarioHeranca extends pessoaHeranca {

	private double valorProducao;
	private double comissao;
	
	public operarioHeranca(String nome, String endereco, String cpf, int telefone, int idade,
			int codigoSetor, double valorProducao, double comissao) {
		
		super(nome, endereco, cpf, telefone, idade);
		this.valorProducao = valorProducao;
		this.comissao = comissao;
	}
	
	
	//metods
	public void imprimirInfo( ) {
		System.out.println("\nNome do oper�rio: "+getNome()+"\nCPF: "+getCpf()
							+"\nIdade: "+getIdade()+"\nTelefone: "+getTelefone()+"\nEndereco: "+getEndereco()
							+"\nValor monet�rio dos artigos produzidos: "+valorProducao
							+"\nPorcentagem (sem %) deste artigo: "+comissao);
	}
	
	public void calcularArtigo() {
		double valor_total = valorProducao + (valorProducao * (comissao / 100));
		System.out.println("\nO valor total a ser recebido pelo oper�rio: "+getNome()
		+" � igual a: "+valor_total);
	}
	
	//get and set
	
	public double getValorProducao() {
		return valorProducao;
	}

	public void setValorProducao(double valorProducao) {
		this.valorProducao = valorProducao;
	}

	public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}
	
}
