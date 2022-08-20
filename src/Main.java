import java.math.BigDecimal;

import dominio.Cliente;
import dominio.OrdemDeServico;
import dominio.Servico;
import exportador.ExportadorConsole;
import exportador.ExportadorIMG;
import exportador.ExportadorPDF;

public class Main {

	public static void main(String[] args) {

		Cliente cliente = new Cliente("Manoel Flores", "5599999-9999");

		OrdemDeServico ordemDeServico = new OrdemDeServico(cliente);
		ordemDeServico.addServico(new Servico("Recarga de cartucho", new BigDecimal(10)));
		ordemDeServico.addServico(new Servico("Formatação de computadores", new BigDecimal(100)));
		ordemDeServico.addServico(new Servico("Troca de teclado de notebook", new BigDecimal(80)));
		
		ordemDeServico.removeServico(1);			
		
		ordemDeServico.exportar(new ExportadorConsole());
		ordemDeServico.exportar(new ExportadorPDF("arquivo.pdf"));
		ordemDeServico.exportar(new ExportadorIMG("arquivo.png"));


	}

}
