package exercicio;


public class Bomba {

	private double litrosVendidos;
	private double preco;
	private double quantidade;
	
	public double getLitrosVendidos() {
		return litrosVendidos;
	}


	public void setLitrosVendidos(double litrosVendidos) {
		this.litrosVendidos = litrosVendidos;
	}


	public double getPreco() {
		return preco;
	}



	public void setPreco(double preco) {
		this.preco = preco;
	}



	public double getQuantidade() {
		return quantidade;
	}



	public void setQuantidade(double quantidade) {
		this.quantidade = quantidade;
	}
	
	
	public Bomba(double quantidade, double preco) {
		setQuantidade(quantidade);
		setPreco(preco);
	}
	
	

	public boolean abastecerPorLitro(double litros) {
		if(litrosVendidos >= litros) {
			litrosVendidos = litrosVendidos - litros;
			return true;
		}else {
			return false;
		}
	}
	
	private double valorParaLitros(double valor) {

		return valor;
	}
	
	public boolean abastecerPorValor(double preco) {
		double litros = (double)preco / valorParaLitros(preco);
		return abastecerPorLitro(litros);
	}
	
	public double faturamento(double preco, double litrosVendidos) {
		return (preco*litrosVendidos);
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Bomba [litrosVendidos=");
		builder.append(litrosVendidos);
		builder.append(", preco=");
		builder.append(preco);
		builder.append(", quantidade=");
		builder.append(quantidade);
		builder.append(", getLitrosVendidos()=");
		builder.append(getLitrosVendidos());
		builder.append(", getPreco()=");
		builder.append(getPreco());
		builder.append(", getQuantidade()=");
		builder.append(getQuantidade());
		builder.append("]");
		return builder.toString();
	}






	
}