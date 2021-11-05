package exercicio;


public class BombaGasolina extends Bomba {
	private String tipo;
	
	public BombaGasolina(double quantidade, double preco, String tipo) {
		super(quantidade, preco);
		setTipo(tipo);
		// TODO Auto-generated constructor stub
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("BombaGasolina [tipo=");
		builder.append(tipo);
		builder.append("]");
		return builder.toString();
	}


	
	
	
}