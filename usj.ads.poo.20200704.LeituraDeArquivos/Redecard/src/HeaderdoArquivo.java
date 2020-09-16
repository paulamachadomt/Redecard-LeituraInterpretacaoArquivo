
public class HeaderdoArquivo {
	
	private String tipoRegistro;
	private String dataEmissao;
	private String operadora;
	private String extratoMovimentacao;
	private String nomeComercial;
	private String sequenciaMovimento;
	private String numeroPontoVenda;
	private String tipoProcessamento;
	private String versaoArquivo;
	
	public HeaderdoArquivo() {
		
	}

	public String getTipoRegistro() {
		return tipoRegistro;
	}

	public void setTipoRegistro(String tipoRegistro) {
		this.tipoRegistro = tipoRegistro;
	}

	public String getDataEmissao() {
		return dataEmissao;
	}

	public void setDataEmissao(String dataEmissao) {
		this.dataEmissao = dataEmissao;
	}

	public String getOperadora() {
		return operadora;
	}

	public void setOperadora(String operadora) {
		this.operadora = operadora;
	}

	public String getExtratoMovimentacao() {
		return extratoMovimentacao;
	}

	public void setExtratoMovimentacao(String extratoMovimentacao) {
		this.extratoMovimentacao = extratoMovimentacao;
	}

	public String getNomeComercial() {
		return nomeComercial;
	}

	public void setNomeComercial(String nomeComercial) {
		this.nomeComercial = nomeComercial;
	}

	public String getSequenciaMovimento() {
		return sequenciaMovimento;
	}

	public void setSequenciaMovimento(String sequenciaMovimento) {
		this.sequenciaMovimento = sequenciaMovimento;
	}

	public String getNumeroPontoVenda() {
		return numeroPontoVenda;
	}

	public void setNumeroPontoVenda(String numeroPontoVenda) {
		this.numeroPontoVenda = numeroPontoVenda;
	}

	public String getTipoProcessamento() {
		return tipoProcessamento;
	}

	public void setTipoProcessamento(String tipoProcessamento) {
		this.tipoProcessamento = tipoProcessamento;
	}

	public String getVersaoArquivo() {
		return versaoArquivo;
	}

	public void setVersaoArquivo(String versaoArquivo) {
		this.versaoArquivo = versaoArquivo;
	}

	@Override
	public String toString() {
		return "HeaderdoArquivo [tipoRegistro=" + tipoRegistro + ", dataEmissao=" + dataEmissao + ", operadora="
				+ operadora + ", extratoMovimentacao=" + extratoMovimentacao + ", nomeComercial=" + nomeComercial
				+ ", sequenciaMovimento=" + sequenciaMovimento + ", numeroPontoVenda=" + numeroPontoVenda
				+ ", tipoProcessamento=" + tipoProcessamento + ", versaoArquivo=" + versaoArquivo + "]";
	}

}
