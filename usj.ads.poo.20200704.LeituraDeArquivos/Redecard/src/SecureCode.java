
public class SecureCode {
	
	private String tipoRegistro;
	private String numPV;
	private String qtdConsultasPeriodo;
	private String valorTotalConsultasPeriodo;
	private String inicioPeriodoConsulta;
	private String fimPeriodoConsulta;
	private String valorConsultasPeriodo;
	
	public SecureCode() {
		
	}

	public String getTipoRegistro() {
		return tipoRegistro;
	}

	public void setTipoRegistro(String tipoRegistro) {
		this.tipoRegistro = tipoRegistro;
	}

	public String getNumPV() {
		return numPV;
	}

	public void setNumPV(String numPV) {
		this.numPV = numPV;
	}

	public String getQtdConsultasPeriodo() {
		return qtdConsultasPeriodo;
	}

	public void setQtdConsultasPeriodo(String qtdConsultasPeriodo) {
		this.qtdConsultasPeriodo = qtdConsultasPeriodo;
	}

	public String getValorTotalConsultasPeriodo() {
		return valorTotalConsultasPeriodo;
	}

	public void setValorTotalConsultasPeriodo(String valorTotalConsultasPeriodo) {
		this.valorTotalConsultasPeriodo = valorTotalConsultasPeriodo;
	}

	public String getInicioPeriodoConsulta() {
		return inicioPeriodoConsulta;
	}

	public void setInicioPeriodoConsulta(String inicioPeriodoConsulta) {
		this.inicioPeriodoConsulta = inicioPeriodoConsulta;
	}

	public String getFimPeriodoConsulta() {
		return fimPeriodoConsulta;
	}

	public void setFimPeriodoConsulta(String fimPeriodoConsulta) {
		this.fimPeriodoConsulta = fimPeriodoConsulta;
	}

	public String getValorConsultasPeriodo() {
		return valorConsultasPeriodo;
	}

	public void setValorConsultasPeriodo(String valorConsultasPeriodo) {
		this.valorConsultasPeriodo = valorConsultasPeriodo;
	}

	@Override
	public String toString() {
		return "SecureCode [tipoRegistro=" + tipoRegistro + ", numPV=" + numPV + ", qtdConsultasPeriodo="
				+ qtdConsultasPeriodo + ", valorTotalConsultasPeriodo=" + valorTotalConsultasPeriodo
				+ ", inicioPeriodoConsulta=" + inicioPeriodoConsulta + ", fimPeriodoConsulta=" + fimPeriodoConsulta
				+ ", valorConsultasPeriodo=" + valorConsultasPeriodo + "]";
	}
	
}
