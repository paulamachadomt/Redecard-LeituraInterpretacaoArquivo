
public class AjustesaCredito {
	
	private String tipoRegistro;
	private String numPVcreditado;
	private String numResumoCredito;
	private String numDocumento;
	private String dataEmissao;
	private String dataCredito;
	private String valorCredito;
	private String cCredito;
	private String banco;
	private String agencia;
	private String contaCorrente;
	private String motivoCredito1;
	private String motivoCredito2;
	private String bandeira;
	
	public AjustesaCredito() {
		
	}

	public String getTipoRegistro() {
		return tipoRegistro;
	}

	public void setTipoRegistro(String tipoRegistro) {
		this.tipoRegistro = tipoRegistro;
	}

	public String getNumPVcreditado() {
		return numPVcreditado;
	}

	public void setNumPVcreditado(String numPVcreditado) {
		this.numPVcreditado = numPVcreditado;
	}

	public String getNumResumoCredito() {
		return numResumoCredito;
	}

	public void setNumResumoCredito(String numResumoCredito) {
		this.numResumoCredito = numResumoCredito;
	}

	public String getNumDocumento() {
		return numDocumento;
	}

	public void setNumDocumento(String numDocumento) {
		this.numDocumento = numDocumento;
	}

	public String getDataEmissao() {
		return dataEmissao;
	}

	public void setDataEmissao(String dataEmissao) {
		this.dataEmissao = dataEmissao;
	}

	public String getDataCredito() {
		return dataCredito;
	}

	public void setDataCredito(String dataCredito) {
		this.dataCredito = dataCredito;
	}

	public String getValorCredito() {
		return valorCredito;
	}

	public void setValorCredito(String valorCredito) {
		this.valorCredito = valorCredito;
	}

	public String getcCredito() {
		return cCredito;
	}

	public void setcCredito(String cCredito) {
		this.cCredito = cCredito;
	}

	public String getBanco() {
		return banco;
	}

	public void setBanco(String banco) {
		this.banco = banco;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public String getContaCorrente() {
		return contaCorrente;
	}

	public void setContaCorrente(String contaCorrente) {
		this.contaCorrente = contaCorrente;
	}

	public String getMotivoCredito1() {
		return motivoCredito1;
	}

	public void setMotivoCredito1(String motivoCredito1) {
		this.motivoCredito1 = motivoCredito1;
	}

	public String getMotivoCredito2() {
		return motivoCredito2;
	}

	public void setMotivoCredito2(String motivoCredito2) {
		this.motivoCredito2 = motivoCredito2;
	}

	public String getBandeira() {
		return bandeira;
	}

	public void setBandeira(String bandeira) {
		this.bandeira = bandeira;
	}

	@Override
	public String toString() {
		return "AjustesaCredito [tipoRegistro=" + tipoRegistro + ", numPVcreditado=" + numPVcreditado
				+ ", numResumoCredito=" + numResumoCredito + ", numDocumento=" + numDocumento + ", dataEmissao="
				+ dataEmissao + ", dataCredito=" + dataCredito + ", valorCredito=" + valorCredito + ", cCredito="
				+ cCredito + ", banco=" + banco + ", agencia=" + agencia + ", contaCorrente=" + contaCorrente
				+ ", motivoCredito1=" + motivoCredito1 + ", motivoCredito2=" + motivoCredito2 + ", bandeira=" + bandeira
				+ "]";
	}

}
