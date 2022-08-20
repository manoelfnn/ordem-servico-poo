package dominio;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import exportador.ExportadorInterface;

public class OrdemDeServico {

	private Cliente cliente;
	private List<Servico> servicos;
	private LocalDate criacao;
	private SituacaoOrdem situacao;

	public SituacaoOrdem getSituacao() {
		return situacao;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public OrdemDeServico(Cliente cliente) {
		this.cliente = cliente;
		this.servicos = new ArrayList<>();
		this.criacao = LocalDate.now();
		this.situacao = SituacaoOrdem.ABERTA;
	}

	public void addServico(Servico servico) {
		this.servicos.add(servico);
	}

	public void removeServico(int indice) {
		if (indice < 0 || indice >= this.servicos.size()) {
			throw new RuntimeException("Índice deve ser maior que 0 e menor que " + this.servicos.size());
		}
		this.servicos.remove(indice);
	}

	public BigDecimal getTotal() {
		BigDecimal total = new BigDecimal(0);
		for (Servico servico : this.servicos) {
			total = total.add(servico.getValor());
		}
		return total;
	}

	public void exportar(ExportadorInterface exportador) {
		exportador.exportar(this);
	}

	public List<Servico> getServicos() {
		return Collections.unmodifiableList(this.servicos);
	}

}
