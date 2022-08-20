package dominio;

public enum SituacaoOrdem {
	ABERTA(1, "Aberta"),
	EM_ANDAMENTO(10, "Em andamento"), 
	AGUARDANDO_PECA(20, "Aguardando peças"),
	AGUARDANDO_CLIENTE(30, "Aguardando resposta do cliente"), 
	FECHADA(50, "Encerrada");

	private int valor;
	private String descricao;
	
	SituacaoOrdem(int valor, String descricao) {
		this.valor = valor;
		this.descricao = descricao;
	}	

	public final int getValor() {
		return valor;
	}

	public final String getDescricao() {
		return descricao;
	}

}
