package Model;

public class Cliente {
	public String Nome;
	public int QuantidadePescas;
	public float ValorPescas;
	public Cliente(String Nome, int QuantidadePescas, float ValorPescas) {
		this.Nome = Nome;
		this.QuantidadePescas = QuantidadePescas;
		this.ValorPescas = ValorPescas;
	}
	public Cliente() {
		this("", 0 , 0);	
		
	}
}
