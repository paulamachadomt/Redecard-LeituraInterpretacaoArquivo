
public class DebitosLiquidados {
	
	private String tipoRegistro;
	private String numPV;
	private String numOrdemDeb;
	private String dataod;
	private String valorod;
	private String motivoAjuste1;
	private String motivoAjuste2;
	private String numCartao;
	private String numNSU;
	private String datacvOriginal;
	private String numAutorizacao;
	private String valorTransacaoOrig;
	private String numRVOrig;
	private String dataRVorig;
	private String numPVorig;
	private String numRefCarta;
	private String dataCarta;
	private String numProcessoChargeback;
	private String mesRef;
	private String valorLiquidacao;
	private String dataLiquidacao;
	private String numProcessoRetencao;
	private String meioCompensacao1;
	private String meioCompensacao2;
	
	public DebitosLiquidados() {
		
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

	public String getNumOrdemDeb() {
		return numOrdemDeb;
	}

	public void setNumOrdemDeb(String numOrdemDeb) {
		this.numOrdemDeb = numOrdemDeb;
	}

	public String getDataod() {
		return dataod;
	}

	public void setDataod(String dataod) {
		this.dataod = dataod;
	}

	public String getValorod() {
		return valorod;
	}

	public void setValorod(String valorod) {
		this.valorod = valorod;
	}

	public String getMotivoAjuste1() {
		return motivoAjuste1;
	}

	public void setMotivoAjuste1(String motivoAjuste1) {
		this.motivoAjuste1 = motivoAjuste1;
	}

	public String getMotivoAjuste2() {
		return motivoAjuste2;
	}

	public void setMotivoAjuste2(String motivoAjuste2) {
		this.motivoAjuste2 = motivoAjuste2;
	}

	public String getNumCartao() {
		return numCartao;
	}

	public void setNumCartao(String numCartao) {
		this.numCartao = numCartao;
	}

	public String getNumNSU() {
		return numNSU;
	}

	public void setNumNSU(String numNSU) {
		this.numNSU = numNSU;
	}

	public String getDatacvOriginal() {
		return datacvOriginal;
	}

	public void setDatacvOriginal(String datacvOriginal) {
		this.datacvOriginal = datacvOriginal;
	}

	public String getNumAutorizacao() {
		return numAutorizacao;
	}

	public void setNumAutorizacao(String numAutorizacao) {
		this.numAutorizacao = numAutorizacao;
	}

	public String getValorTransacaoOrig() {
		return valorTransacaoOrig;
	}

	public void setValorTransacaoOrig(String valorTransacaoOrig) {
		this.valorTransacaoOrig = valorTransacaoOrig;
	}

	public String getNumRVOrig() {
		return numRVOrig;
	}

	public void setNumRVOrig(String numRVOrig) {
		this.numRVOrig = numRVOrig;
	}

	public String getDataRVorig() {
		return dataRVorig;
	}

	public void setDataRVorig(String dataRVorig) {
		this.dataRVorig = dataRVorig;
	}

	public String getNumPVorig() {
		return numPVorig;
	}

	public void setNumPVorig(String numPVorig) {
		this.numPVorig = numPVorig;
	}

	public String getNumRefCarta() {
		return numRefCarta;
	}

	public void setNumRefCarta(String numRefCarta) {
		this.numRefCarta = numRefCarta;
	}

	public String getDataCarta() {
		return dataCarta;
	}

	public void setDataCarta(String dataCarta) {
		this.dataCarta = dataCarta;
	}

	public String getNumProcessoChargeback() {
		return numProcessoChargeback;
	}

	public void setNumProcessoChargeback(String numProcessoChargeback) {
		this.numProcessoChargeback = numProcessoChargeback;
	}

	public String getMesRef() {
		return mesRef;
	}

	public void setMesRef(String mesRef) {
		this.mesRef = mesRef;
	}

	public String getValorLiquidacao() {
		return valorLiquidacao;
	}

	public void setValorLiquidacao(String valorLiquidacao) {
		this.valorLiquidacao = valorLiquidacao;
	}

	public String getDataLiquidacao() {
		return dataLiquidacao;
	}

	public void setDataLiquidacao(String dataLiquidacao) {
		this.dataLiquidacao = dataLiquidacao;
	}

	public String getNumProcessoRetencao() {
		return numProcessoRetencao;
	}

	public void setNumProcessoRetencao(String numProcessoRetencao) {
		this.numProcessoRetencao = numProcessoRetencao;
	}

	public String getMeioCompensacao1() {
		return meioCompensacao1;
	}

	public void setMeioCompensacao1(String meioCompensacao1) {
		this.meioCompensacao1 = meioCompensacao1;
	}

	public String getMeioCompensacao2() {
		return meioCompensacao2;
	}

	public void setMeioCompensacao2(String meioCompensacao2) {
		this.meioCompensacao2 = meioCompensacao2;
	}

	@Override
	public String toString() {
		return "DebitosLiquidados [tipoRegistro=" + tipoRegistro + ", numPV=" + numPV + ", numOrdemDeb=" + numOrdemDeb
				+ ", dataod=" + dataod + ", valorod=" + valorod + ", motivoAjuste1=" + motivoAjuste1
				+ ", motivoAjuste2=" + motivoAjuste2 + ", numCartao=" + numCartao + ", numNSU=" + numNSU
				+ ", datacvOriginal=" + datacvOriginal + ", numAutorizacao=" + numAutorizacao + ", valorTransacaoOrig="
				+ valorTransacaoOrig + ", numRVOrig=" + numRVOrig + ", dataRVorig=" + dataRVorig + ", numPVorig="
				+ numPVorig + ", numRefCarta=" + numRefCarta + ", dataCarta=" + dataCarta + ", numProcessoChargeback="
				+ numProcessoChargeback + ", mesRef=" + mesRef + ", valorLiquidacao=" + valorLiquidacao
				+ ", dataLiquidacao=" + dataLiquidacao + ", numProcessoRetencao=" + numProcessoRetencao
				+ ", meioCompensacao1=" + meioCompensacao1 + ", meioCompensacao2=" + meioCompensacao2 + "]";
	}

}
