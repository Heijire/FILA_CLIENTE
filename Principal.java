package View;
import Controller.OperacaoController;
import Model.Cliente;
import br.edu.fateczl.fila.Fila;
public class Principal {
	public static void main(String[] args) {
		Fila<Cliente> f = new Fila<>();
		int QuantidadePecas;
		float ValorPesca;
		int Cliente = 0;
		do {
			QuantidadePecas = (int)(Math.random()*30)+20;	
			ValorPesca = (float)(Math.random()*95)+5;
			Cliente++;
			Cliente c = new Cliente(("Cliente " + Cliente), QuantidadePecas,ValorPesca );
			f.insert(c);
		}while (Cliente < 20);
		OperacaoController c = new OperacaoController();
		c.caixa(f);
	}
}
