
public class Totalizador {
	
	private String tipoRegistro;
	private String numPVmatriz;
	private String quantidadeTotalResumosMatriz;
	private String valorTotalCreditos;
	private String quantidadeCreditosAntecipados;
	private String valorTotalAntecipado;
	private String quantidadeAjustesCredito;
	private String valorTotalAjustesCredito;
	private String quantidadeAjustesDebito;
	private String valorTotalAjustesDebito;
	
	public Totalizador() {
		
	}

	public String getTipoRegistro() {
		return tipoRegistro;
	}

	public void setTipoRegistro(String tipoRegistro) {
		this.tipoRegistro = tipoRegistro;
	}

	public String getNumPVmatriz() {
		return numPVmatriz;
	}

	public void setNumPVmatriz(String numPVmatriz) {
		this.numPVmatriz = numPVmatriz;
	}

	public String getQuantidadeTotalResumosMatriz() {
		return quantidadeTotalResumosMatriz;
	}

	public void setQuantidadeTotalResumosMatriz(String quantidadeTotalResumosMatriz) {
		this.quantidadeTotalResumosMatriz = quantidadeTotalResumosMatriz;
	}

	public String getValorTotalCreditos() {
		return valorTotalCreditos;
	}

	public void setValorTotalCreditos(String valorTotalCreditos) {
		this.valorTotalCreditos = valorTotalCreditos;
	}

	public String getQuantidadeCreditosAntecipados() {
		return quantidadeCreditosAntecipados;
	}

	public void setQuantidadeCreditosAntecipados(String quantidadeCreditosAntecipados) {
		this.quantidadeCreditosAntecipados = quantidadeCreditosAntecipados;
	}

	public String getValorTotalAntecipado() {
		return valorTotalAntecipado;
	}

	public void setValorTotalAntecipado(String valorTotalAntecipado) {
		this.valorTotalAntecipado = valorTotalAntecipado;
	}

	public String getQuantidadeAjustesCredito() {
		return quantidadeAjustesCredito;
	}

	public void setQuantidadeAjustesCredito(String quantidadeAjustesCredito) {
		this.quantidadeAjustesCredito = quantidadeAjustesCredito;
	}

	public String getValorTotalAjustesCredito() {
		return valorTotalAjustesCredito;
	}

	public void setValorTotalAjustesCredito(String valorTotalAjustesCredito) {
		this.valorTotalAjustesCredito = valorTotalAjustesCredito;
	}

	public String getQuantidadeAjustesDebito() {
		return quantidadeAjustesDebito;
	}

	public void setQuantidadeAjustesDebito(String quantidadeAjustesDebito) {
		this.quantidadeAjustesDebito = quantidadeAjustesDebito;
	}

	public String getValorTotalAjustesDebito() {
		return valorTotalAjustesDebito;
	}

	public void setValorTotalAjustesDebito(String valorTotalAjustesDebito) {
		this.valorTotalAjustesDebito = valorTotalAjustesDebito;
	}

	@Override
	public String toString() {
		return "Totalizador [tipoRegistro=" + tipoRegistro + ", numPVmatriz=" + numPVmatriz
				+ ", quantidadeTotalResumosMatriz=" + quantidadeTotalResumosMatriz + ", valorTotalCreditos="
				+ valorTotalCreditos + ", quantidadeCreditosAntecipados=" + quantidadeCreditosAntecipados
				+ ", valorTotalAntecipado=" + valorTotalAntecipado + ", quantidadeAjustesCredito="
				+ quantidadeAjustesCredito + ", valorTotalAjustesCredito=" + valorTotalAjustesCredito
				+ ", quantidadeAjustesDebito=" + quantidadeAjustesDebito + ", valorTotalAjustesDebito="
				+ valorTotalAjustesDebito + "]";
	}
	

}
