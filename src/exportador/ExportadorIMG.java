package exportador;

import dominio.OrdemDeServico;

public class ExportadorIMG implements ExportadorInterface {
	
	private String arquivo;

	public ExportadorIMG(String arquivo) {
		this.arquivo = arquivo;
	}

	@Override
	public void exportar(OrdemDeServico ordemDeServico) {
		System.out.println("Exportando OS ("+ordemDeServico.getCliente().getNome()+") para PNG no arquivo \"" + this.arquivo + "\"");

	}

}
