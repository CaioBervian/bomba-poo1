package exercicio;

public class BombaDiesel extends Bomba {

	private String tipo;
	


	public BombaDiesel(double quantidade, double preco, String tipo) {
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
		builder.append("BombaDiesel [tipo=");
		builder.append(tipo);
		builder.append("]");
		return builder.toString();
	}
	
	
}