package exercicio;


public class BombaEtanol extends Bomba {
	
	private String fonte;
	
	public BombaEtanol(double quantidade, double preco, String fonte) {
		super(quantidade, preco);
		setFonte(fonte);
		// TODO Auto-generated constructor stub
	}

	public String getFonte() {
		return fonte;
	}

	public void setFonte(String fonte) {
		this.fonte = fonte;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("BombaEtanol [fonte=");
		builder.append(fonte);
		builder.append("]");
		return builder.toString();
	}
	
	
	
}