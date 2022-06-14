package model;

public class Imposto {

	private double valor;
	
	private TipoImposto tipoImposto;

	
	
	private AplicarImposto aplicarImposto;
	
	public Imposto(String tipoimposto, AplicarImposto aplicarImposto) {
		this.tipoImposto = TipoImposto.valueOf(tipoimposto);
		this.aplicarImposto = aplicarImposto;
	}
	
	public void setValor(double valor){
		this.valor = this.aplicarImposto.aplicar(valor);
	}

	public double getValor() {
		return this.valor;
	}

	public void setTipoImposto(TipoImposto tipoimposto) {
		this.tipoImposto = tipoimposto;
	}

	public TipoImposto getTipoImposto() {
		return this.tipoImposto;
	}

}
