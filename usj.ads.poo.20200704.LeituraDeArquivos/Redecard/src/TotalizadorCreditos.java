
public class TotalizadorCreditos {
	
	private String tipoRegistro;
	private String numeroPV;
	private String brancos1;
	private String dataCredito;
	private String valorTotalCreditos;
	private String brancos2;
	private String numeroBanco;
	private String numeroAgencia;
	private String numeroContaCorrente;
	private String dataGeracaoArquivo;
	private String dataCreditoAntecipado;
	private String valorTotalCreditoAntecipado;
	
	public TotalizadorCreditos() {
		
	}

	public String getTipoRegistro() {
		return tipoRegistro;
	}

	public void setTipoRegistro(String tipoRegistro) {
		this.tipoRegistro = tipoRegistro;
	}

	public String getNumeroPV() {
		return numeroPV;
	}

	public void setNumeroPV(String numeroPV) {
		this.numeroPV = numeroPV;
	}

	public String getBrancos1() {
		return brancos1;
	}

	public void setBrancos1(String brancos1) {
		this.brancos1 = brancos1;
	}

	public String getDataCredito() {
		return dataCredito;
	}

	public void setDataCredito(String dataCredito) {
		this.dataCredito = dataCredito;
	}

	public String getValorTotalCreditos() {
		return valorTotalCreditos;
	}

	public void setValorTotalCreditos(String valorTotalCreditos) {
		this.valorTotalCreditos = valorTotalCreditos;
	}

	public String getBrancos2() {
		return brancos2;
	}

	public void setBrancos2(String brancos2) {
		this.brancos2 = brancos2;
	}

	public String getNumeroBanco() {
		return numeroBanco;
	}

	public void setNumeroBanco(String numeroBanco) {
		this.numeroBanco = numeroBanco;
	}

	public String getNumeroAgencia() {
		return numeroAgencia;
	}

	public void setNumeroAgencia(String numeroAgencia) {
		this.numeroAgencia = numeroAgencia;
	}

	public String getNumeroContaCorrente() {
		return numeroContaCorrente;
	}

	public void setNumeroContaCorrente(String numeroContaCorrente) {
		this.numeroContaCorrente = numeroContaCorrente;
	}

	public String getDataGeracaoArquivo() {
		return dataGeracaoArquivo;
	}

	public void setDataGeracaoArquivo(String dataGeracaoArquivo) {
		this.dataGeracaoArquivo = dataGeracaoArquivo;
	}

	public String getDataCreditoAntecipado() {
		return dataCreditoAntecipado;
	}

	public void setDataCreditoAntecipado(String dataCreditoAntecipado) {
		this.dataCreditoAntecipado = dataCreditoAntecipado;
	}

	public String getValorTotalCreditoAntecipado() {
		return valorTotalCreditoAntecipado;
	}

	public void setValorTotalCreditoAntecipado(String valorTotalCreditoAntecipado) {
		this.valorTotalCreditoAntecipado = valorTotalCreditoAntecipado;
	}

	@Override
	public String toString() {
		return "TotalizadorCreditos [tipoRegistro=" + tipoRegistro + ", numeroPV=" + numeroPV + ", brancos1=" + brancos1
				+ ", dataCredito=" + dataCredito + ", valorTotalCreditos=" + valorTotalCreditos + ", brancos2="
				+ brancos2 + ", numeroBanco=" + numeroBanco + ", numeroAgencia=" + numeroAgencia
				+ ", numeroContaCorrente=" + numeroContaCorrente + ", dataGeracaoArquivo=" + dataGeracaoArquivo
				+ ", dataCreditoAntecipado=" + dataCreditoAntecipado + ", valorTotalCreditoAntecipado="
				+ valorTotalCreditoAntecipado + "]";
	}
	

}
