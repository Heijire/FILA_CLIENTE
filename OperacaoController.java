package Controller;
import Model.Cliente;
import br.edu.fateczl.fila.Fila;
public class OperacaoController {
	float total;
	public void caixa(Fila<Cliente> fila) {
		Cliente cliente = new Cliente();
		while (!fila.isEmpty()) {
			try {
				cliente = fila.remove();
			} catch (Exception e) {
				e.printStackTrace();
			}
			total = cliente.QuantidadePescas * cliente.ValorPescas;
			System.out.println(cliente.Nome + " compra total : " + total);
		}
	}
}
