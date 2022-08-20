package exportador;

import dominio.OrdemDeServico;

public class ExportadorPDF implements ExportadorInterface {

	private String arquivo;

	public ExportadorPDF(String arquivo) {
		this.arquivo = arquivo;
	}

	@Override
	public void exportar(OrdemDeServico ordemDeServico) {
		System.out.println("Exportando OS ("+ordemDeServico.getCliente().getNome()+") para PDF no arquivo \"" + this.arquivo + "\"");

	}

}
