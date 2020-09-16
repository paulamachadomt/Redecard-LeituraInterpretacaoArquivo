
public class HeaderSolicitante {
	
	private String tipoRegistro;
	private String numeroPontoVenda;
	private String nomeComercial;
	
	public HeaderSolicitante() {
		
	}

	public String getTipoRegistro() {
		return tipoRegistro;
	}

	public void setTipoRegistro(String tipoRegistro) {
		this.tipoRegistro = tipoRegistro;
	}

	public String getNumeroPontoVenda() {
		return numeroPontoVenda;
	}

	public void setNumeroPontoVenda(String numeroPontoVenda) {
		this.numeroPontoVenda = numeroPontoVenda;
	}

	public String getNomeComercial() {
		return nomeComercial;
	}

	public void setNomeComercial(String nomeComercial) {
		this.nomeComercial = nomeComercial;
	}

	@Override
	public String toString() {
		return "HeaderSolicitante [tipoRegistro=" + tipoRegistro + ", numeroPontoVenda=" + numeroPontoVenda
				+ ", nomeComercial=" + nomeComercial + "]";
	}
	
		

}
