package exportador;

import dominio.OrdemDeServico;
import dominio.Servico;

public class ExportadorConsole implements ExportadorInterface {

	@Override
	public void exportar(OrdemDeServico ordemDeServico) {

		String r = "\n\nOrdem de Serviço\n\n";
		r += "Cliente: " + ordemDeServico.getCliente() + ")\n\n";
		r += "Situação: " + ordemDeServico.getSituacao().getDescricao() + ".\n\n";
		r += "-".repeat(20) + "\n";
		for (Servico servico : ordemDeServico.getServicos()) {
			r += servico.getNome() + " R$ " + servico.getValor() + "\n";
		}
		r += "-".repeat(20) + "\n";
		r += "Total: R$ " + ordemDeServico.getTotal().toString() + "\n";
		System.out.println(r);
	}

}
