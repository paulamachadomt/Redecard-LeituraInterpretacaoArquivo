import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class LerArquivo {

	public void leitura(String localArquivo) throws IOException {

		File arquivo = new File(localArquivo);
		FileReader leitorArquivo = new FileReader(arquivo);
		BufferedReader bufferLeitor = new BufferedReader(leitorArquivo);

		while (bufferLeitor.ready()) {

			String linha = bufferLeitor.readLine();
			int tamanho = linha.length();

			if (linha.substring(0, 3).equals("030")) {
				String tipo = "Header do arquivo";
				String data = this.retornaData(linha.substring(3, 11));
				String operadora = linha.substring(11, 19);
				String extratoMovimentacao = linha.substring(19, 53);
				String nomeComercial = linha.substring(53, 75);
				String sequenciaMovimento = linha.substring(75, 81);
				String numPV = linha.substring(81, 90);
				String tipoProcessamento = linha.substring(90, 105);
				String versaoArquivo = linha.substring(105, 125);

				// novo objeto, atribuições, impressão
				HeaderdoArquivo headerArquivo = new HeaderdoArquivo();
				headerArquivo.setTipoRegistro(tipo);
				headerArquivo.setDataEmissao(data);
				headerArquivo.setOperadora(operadora);
				headerArquivo.setExtratoMovimentacao(extratoMovimentacao);
				headerArquivo.setNomeComercial(nomeComercial);
				headerArquivo.setSequenciaMovimento(sequenciaMovimento);
				headerArquivo.setNumeroPontoVenda(numPV);
				headerArquivo.setTipoProcessamento(tipoProcessamento);
				headerArquivo.setVersaoArquivo(versaoArquivo);
				System.out.println(headerArquivo.toString());
				System.out.println("");
			}

			if (linha.substring(0, 3).equals("032")) {
				String tipo = "Header solicitante";
				String numPV = linha.substring(3, 12);
				String nomeComercial = linha.substring(12, 34);
				
				HeaderSolicitante headerSolicitante = new HeaderSolicitante();
				headerSolicitante.setTipoRegistro(tipo);
				headerSolicitante.setNumeroPontoVenda(numPV);
				headerSolicitante.setNomeComercial(nomeComercial);
				System.out.println(headerSolicitante.toString());
				System.out.println("");
			}
			
			if (linha.substring(0, 3).equals("034")) {
				String tipo = "Créditos";
				String numPVcentral = linha.substring(3, 12);
				String numDoc = linha.substring(12, 23);
				String dataLancamento = this.retornaData(linha.substring(23, 31));
				String valorLancamento = linha.substring(31, 46);
				String credito = linha.substring(46, 47);
				String banco = linha.substring(47, 50);
				String agencia = linha.substring(50, 56);
				String contaCorrente = linha.substring(56, 67);
				String dataMovimento = this.retornaData(linha.substring(67, 75));
				String numRV = linha.substring(75, 84);
				String dataRV = this.retornaData(linha.substring(84, 92));
				String bandeira = linha.substring(92, 93);
				String tipoTransacao = linha.substring(93, 94);
				String valorBrutoRV = linha.substring(94, 109);
				String valorTaxaDesc = linha.substring(109, 124);
				String numParcela = linha.substring(124, 129);
				String statusCredito = linha.substring(129, 131);
				String numPVoriginal = linha.substring(131, 140);
				
				Creditos creditos = new Creditos();
				creditos.setTipoRegistro(tipo);
				creditos.setNumeroPontoVendaCentral(numPVcentral);
				creditos.setNumeroDocumento(numDoc);
				creditos.setDataLancamento(dataLancamento);
				creditos.setValorLancamento(valorLancamento);
				creditos.setcCredito(credito);
				creditos.setBanco(banco);
				creditos.setAgencia(agencia);
				creditos.setContaCorrente(contaCorrente);
				creditos.setDataMovimento(dataMovimento);
				creditos.setNumeroRV(numRV);
				creditos.setDataRV(dataRV);
				creditos.setBandeira(bandeira);
				creditos.setTipoTransacao(tipoTransacao);
				creditos.setValorBrutoRV(valorBrutoRV);
				creditos.setValorTaxaDesconto(valorTaxaDesc);
				creditos.setNumeroParcela(numParcela);
				creditos.setStatusCredito(statusCredito);
				creditos.setNumeroPontoVendaOriginal(numPVoriginal);
				System.out.println(creditos.toString());
				System.out.println("");			
			}
			
			if (linha.substring(0, 3).equals("035")) {
				String tipo = "Ajustes NET e desagendamentos";
				String numPVajustado = linha.substring(03, 12);
				String numRVajustado = linha.substring(12, 21);
				String dataAjuste = linha.substring(21, 29);
				String valorAjuste = linha.substring(29, 44);
				String debito = linha.substring(44, 45);
				String motivoAjuste1 = linha.substring(45, 47);
				String motivoAjuste2 = linha.substring(47, 75);
				String numCartao = linha.substring(75, 91);
				String dataTransacao = this.retornaData(linha.substring(91, 99));
				String numRVoriginal = linha.substring(99, 108);
				String numRefCarta = linha.substring(108, 123);
				String dataCarta = linha.substring(123, 131);
				String mesRef = linha.substring(131, 137);
				String numPVoriginal = linha.substring(137, 146);
				String dataRVoriginal = this.retornaData(linha.substring(146, 154));
				String valorTransacao = linha.substring(154, 169);
				String desagendamentoOuNet = linha.substring(169, 170);
				String dataCredito = this.retornaData(linha.substring(170, 178));
				String novoValorParcela = linha.substring(178, 193);
				String valorOriginalParcela = linha.substring(193, 208);
				String valorBrutoResumoVendaOrig = linha.substring(208, 223);
				String valorCancelamento = linha.substring(223, 238);
				String numNSU = linha.substring(238, 250);
				String numAutorizacao = linha.substring(250, 256);
				String tipoDebito = linha.substring(256, 257);
				String numOrdemDebito = linha.substring(257, 268);
				String valorDebitoTotal = linha.substring(268, 283);
				String valorPendente = linha.substring(283, 298);
				String bandeiraRVorigem = linha.substring(298, 299);
				String bandeiraRVajustado = linha.substring(299, 300);
				
				AjustesNetDesagendamentos ajustesNetDesagendamentos = new AjustesNetDesagendamentos();
				ajustesNetDesagendamentos.setTipoRegistro(tipo);
				ajustesNetDesagendamentos.setNumeroPontoVendaAjustado(numPVajustado);
				ajustesNetDesagendamentos.setNumeroRVajustado(numRVajustado);
				ajustesNetDesagendamentos.setDataAjuste(dataAjuste);
				ajustesNetDesagendamentos.setValorAjuste(valorAjuste);
				ajustesNetDesagendamentos.setdDebito(debito);
				ajustesNetDesagendamentos.setMotivoAjusteNum(motivoAjuste1);
				ajustesNetDesagendamentos.setMotivoAjusteStr(motivoAjuste2);
				ajustesNetDesagendamentos.setNumeroCartao(numCartao);
				ajustesNetDesagendamentos.setDataTransacao(dataTransacao);
				ajustesNetDesagendamentos.setNumeroRVoriginal(numRVoriginal);
				ajustesNetDesagendamentos.setNumeroReferencia(numRefCarta);
				ajustesNetDesagendamentos.setDataCarta(dataCarta);
				ajustesNetDesagendamentos.setMesReferencia(mesRef);
				ajustesNetDesagendamentos.setNumeroPontoVendaOriginal(numPVoriginal);
				ajustesNetDesagendamentos.setDataRVoriginal(dataRVoriginal);
				ajustesNetDesagendamentos.setValorTransacao(valorTransacao);
				ajustesNetDesagendamentos.setDesagendamentoOUnet(desagendamentoOuNet);
				ajustesNetDesagendamentos.setDataCredito(dataCredito);
				ajustesNetDesagendamentos.setNovoValorParcela(novoValorParcela);
				ajustesNetDesagendamentos.setValorOriginalParcela(valorOriginalParcela);
				ajustesNetDesagendamentos.setValorBrutoResumoVendaOriginal(valorBrutoResumoVendaOrig);
				ajustesNetDesagendamentos.setValorCancelamentoSolicitado(valorCancelamento);
				ajustesNetDesagendamentos.setNumeroNSU(numNSU);
				ajustesNetDesagendamentos.setNumeroAutorizacao(numAutorizacao);
				ajustesNetDesagendamentos.setTipoDebito(tipoDebito);
				ajustesNetDesagendamentos.setNumeroOrdemDebito(numOrdemDebito);
				ajustesNetDesagendamentos.setValorDebitoTotal(valorDebitoTotal);
				ajustesNetDesagendamentos.setValorPendente(valorPendente);
				ajustesNetDesagendamentos.setBandeiraRVorigem(bandeiraRVorigem);
				ajustesNetDesagendamentos.setBandeiraRVajustado(bandeiraRVajustado);
				System.out.println(ajustesNetDesagendamentos.toString());
				System.out.println("");	
			}
			if (linha.substring(0, 3).equals("036")) {
				String tipo = "Antecipações";
				String numPV = linha.substring(03, 12);
				String numDocumento = linha.substring(12, 23);
				String dataLancamento = this.retornaData(linha.substring(23, 31));
				String valorLancamento = linha.substring(31, 46);
				String credito = linha.substring(46, 47);
				String banco = linha.substring(47, 50);
				String agencia = linha.substring(50, 56);
				String contaCorrente = linha.substring(56, 67);
				String numRVcorrespondente = linha.substring(67, 76);
				String dataRVcorrespondente = this.retornaData(linha.substring(76, 84));
				String valorCreditoOriginal = linha.substring(84, 99);
				String dataVencimentoOriginal = this.retornaData(linha.substring(99, 107));
				String numParcela = linha.substring(107, 112);
				String valorBruto = linha.substring(112, 127);
				String valorTaxaDesconto = linha.substring(127, 142);
				String numPVoriginal = linha.substring(142, 151);
				String bandeira = linha.substring(151, tamanho);
				
				Antecipacoes antecipacoes = new Antecipacoes();
				antecipacoes.setTipoRegistro(tipo);
				antecipacoes.setNumeroPontoVenda(numPV);
				antecipacoes.setNumeroDocumento(numDocumento);
				antecipacoes.setDataLancamento(dataLancamento);
				antecipacoes.setValorLancamento(valorLancamento);
				antecipacoes.setcCredito(credito);
				antecipacoes.setBanco(banco);
				antecipacoes.setAgencia(agencia);
				antecipacoes.setContaCorrente(contaCorrente);
				antecipacoes.setNumeroRV(numRVcorrespondente);
				antecipacoes.setDataRV(dataRVcorrespondente);
				antecipacoes.setValorCreditoOriginal(valorCreditoOriginal);
				antecipacoes.setDataVencimentoOriginal(dataVencimentoOriginal);
				antecipacoes.setNumeroParcela(numParcela);
				antecipacoes.setValorBruto(valorBruto);
				antecipacoes.setValorTaxaDesconto(valorTaxaDesconto);
				antecipacoes.setNumeroPontoVendaOriginal(numPVoriginal);
				antecipacoes.setBandeira(bandeira);
								
				System.out.println(antecipacoes.toString());
				System.out.println("");
			}
			if (linha.substring(0, 3).equals("037")) {
				String tipo = "Totalizador de Créditos";
				String numPV = linha.substring(03, 12);
				String brancos1 = linha.substring(12, 19);
				String dataCredito = this.retornaData(linha.substring(19, 27));
				String valorTotalCreditos = linha.substring(27, 42);
				String brancos2 = linha.substring(42, 43);
				String numBanco = linha.substring(43, 46);
				String numAgencia = linha.substring(46, 52);
				String numContaCorrente = linha.substring(52, 63);
				String dataGeracaoArquivo = this.retornaData(linha.substring(63, 71));
				String dataCreditoAntecipado = this.retornaData(linha.substring(71, 79));
				String valorTotalCreditosAntecipados = linha.substring(79, tamanho);	
				
				TotalizadorCreditos totalizadorCreditos = new TotalizadorCreditos();
				totalizadorCreditos.setTipoRegistro(tipo);
				totalizadorCreditos.setNumeroPV(numPV);
				totalizadorCreditos.setBrancos1(brancos1);
				totalizadorCreditos.setDataCredito(dataCredito);
				totalizadorCreditos.setValorTotalCreditos(valorTotalCreditos);
				totalizadorCreditos.setBrancos2(brancos2);
				totalizadorCreditos.setNumeroBanco(numBanco);
				totalizadorCreditos.setNumeroAgencia(numAgencia);
				totalizadorCreditos.setNumeroContaCorrente(numContaCorrente);
				totalizadorCreditos.setDataGeracaoArquivo(dataGeracaoArquivo);
				totalizadorCreditos.setDataCreditoAntecipado(dataCreditoAntecipado);
				totalizadorCreditos.setValorTotalCreditoAntecipado(valorTotalCreditosAntecipados);
				System.out.println(totalizadorCreditos.toString());	
				System.out.println("");
			}
			if (linha.substring(0, 3).equals("038")) {
				String tipo = "Ajustes a Débito (via Banco)";
				String numPV = linha.substring(03, 12);
				String numDocumento = linha.substring(12, 23);
				String dataEmissao = this.retornaData(linha.substring(23, 31));
				String valorDebito = linha.substring(31, 46);
				String debito = linha.substring(46, 47);
				String banco = linha.substring(47, 50);
				String agencia = linha.substring(50, 56);
				String contaCorrente = linha.substring(56, 67);
				String numRVoriginal = linha.substring(67, 76);
				String dataRVoriginal = this.retornaData(linha.substring(76, 84));
				String valorCreditoOriginal = linha.substring(84, 99);
				String motivoDebito1 = linha.substring(99, 101);
				String motivoDebito2 = linha.substring(101, 129);
				String numCartao = linha.substring(129, 145);
				String numRefCarta = linha.substring(145, 160);
				String mesRef = linha.substring(160, 166);
				String dataCarta = this.retornaData(linha.substring(166, 174));
				String valorCancelamentoSolicitado = linha.substring(174, 189);
				String numProcesso = linha.substring(189, 204);
				String numPVoriginal = linha.substring(204, 213);
				String dataTransacao = this.retornaData(linha.substring(213, 221));
				String numNSU = linha.substring(221, 233);
				String numResumoDebito = linha.substring(233, 242);
				String dataDebito = this.retornaData(linha.substring(242, 250));
				String valorTransacaoOriginal = linha.substring(250, 265);
				String numAutorizacao = linha.substring(221, 271);
				String tipoDebito = linha.substring(265, 271);
				String valorDebitoTotal = linha.substring(271, 287);
				String valorPendente = linha.substring(287, 302);
				String bandeiraRVorigem = linha.substring(301, tamanho);
				
				AjustesaDebito ajustesaDebito = new AjustesaDebito();
				ajustesaDebito.setTipoRegistro(tipo);
				ajustesaDebito.setNumeroPV(numPV);
				ajustesaDebito.setNumeroDocumento(numDocumento);
				ajustesaDebito.setDataEmissao(dataEmissao);
				ajustesaDebito.setValorDebito(valorDebito);
				ajustesaDebito.setdDebito(debito);
				ajustesaDebito.setBanco(banco);
				ajustesaDebito.setAgencia(agencia);
				ajustesaDebito.setContaCorrente(contaCorrente);
				ajustesaDebito.setNumeroRVoriginal(numRVoriginal);
				ajustesaDebito.setDataRVoriginal(dataRVoriginal);
				ajustesaDebito.setValorCreditoOriginal(valorCreditoOriginal);
				ajustesaDebito.setMotivoDebito1(motivoDebito1);
				ajustesaDebito.setMotivoDebito2(motivoDebito2);
				ajustesaDebito.setNumeroCartao(numCartao);
				ajustesaDebito.setNumeroRefCarta(numRefCarta);
				ajustesaDebito.setMesRef(mesRef);
				ajustesaDebito.setDataCarta(dataCarta);
				ajustesaDebito.setValorCancelamento(valorCancelamentoSolicitado);
				ajustesaDebito.setNumProcesso(numProcesso);
				ajustesaDebito.setNumPVoriginal(numPVoriginal);
				ajustesaDebito.setDataTransacao(dataTransacao);
				ajustesaDebito.setNumNSU(numNSU);
				ajustesaDebito.setNumResumoDebito(numResumoDebito);
				ajustesaDebito.setDataDebito(dataDebito);
				ajustesaDebito.setValorTransacaoOriginal(valorTransacaoOriginal);
				ajustesaDebito.setNumAutorizacao(numAutorizacao);
				ajustesaDebito.setValorDebitoTotal(valorDebitoTotal);
				ajustesaDebito.setTipoDebito(tipoDebito);
				ajustesaDebito.setValorPendente(valorPendente);
				ajustesaDebito.setBandeiraRVorigem(bandeiraRVorigem);				
				
				System.out.println(ajustesaDebito.toString());
				System.out.println("");
			}
			if (linha.substring(0, 3).equals("040")) {
				String tipo = "Serasa";
				String numPV = linha.substring(03, 12);
				String qtdConsultasPeriodo = linha.substring(12, 17);
				String valorTotalConsultasPeriodo = linha.substring(17, 32);
				String inicioPeriodoConsulta = this.retornaData(linha.substring(32, 40));
				String fimPeriodoConsulta = this.retornaData(linha.substring(40, 48));
				String valorPorConsultaPeriodo = linha.substring(48, tamanho);
					
				Serasa serasa = new Serasa();
				serasa.setTipoRegistro(tipo);
				serasa.setNumPV(numPV);
				serasa.setQtdConsultasPeriodo(qtdConsultasPeriodo);
				serasa.setValorTotalConsultasPeriodo(valorTotalConsultasPeriodo);
				serasa.setInicioPeriodoConsulta(inicioPeriodoConsulta);
				serasa.setFimPeriodoConsulta(fimPeriodoConsulta);
				serasa.setValorConsultaPeriodo(valorPorConsultaPeriodo);
				
				System.out.println(serasa.toString());	
				System.out.println("");
			}
			if (linha.substring(0, 3).equals("041")) {
				String tipo = "AVS";
				String numPV = linha.substring(3, 12);
				String qtdConsultasPeriodo = linha.substring(12, 17);
				String valorTotalConsultasPeriodo = linha.substring(17, 32);
				String inicioPeriodoConsulta = this.retornaData(linha.substring(32, 40));
				String fimPeriodoConsulta = this.retornaData(linha.substring(40, 48));
				String valorPorConsultaPeriodo = linha.substring(48, tamanho);
				
				Avs avs = new Avs();
				avs.setTipoRegistro(tipo);
				avs.setNumPV(numPV);
				avs.setQtdConsultasPeriodo(qtdConsultasPeriodo);
				avs.setValorTotalConsultasPeriodo(valorTotalConsultasPeriodo);
				avs.setInicioPeriodoConsulta(inicioPeriodoConsulta);
				avs.setFimPeriodoConsulta(fimPeriodoConsulta);
				avs.setValorConsultaPeriodo(valorPorConsultaPeriodo);
				
				System.out.println(avs.toString());
				System.out.println("");
			}
			if (linha.substring(0, 3).equals("042")) {
				String tipo = "Securecode";
				String numPV = linha.substring(3, 12);
				String qtdConsultasPeriodo = linha.substring(12, 17);
				String valorTotalConsultasPeriodo = linha.substring(17, 32);
				String inicioPeriodoConsulta = this.retornaData(linha.substring(32, 40));
				String fimPeriodoConsulta = this.retornaData(linha.substring(40, 49));
				String valorPorConsultaPeriodo = linha.substring(49, tamanho);

				SecureCode secureCode = new SecureCode();
				secureCode.setTipoRegistro(tipo);
				secureCode.setNumPV(numPV);
				secureCode.setQtdConsultasPeriodo(qtdConsultasPeriodo);
				secureCode.setValorTotalConsultasPeriodo(valorTotalConsultasPeriodo);
				secureCode.setInicioPeriodoConsulta(inicioPeriodoConsulta);
				secureCode.setFimPeriodoConsulta(fimPeriodoConsulta);
				secureCode.setValorConsultasPeriodo(valorPorConsultaPeriodo);

				System.out.println(secureCode.toString());
				System.out.println("");	
			}
			if (linha.substring(0, 3).equals("043")) {
				String tipo = "Ajustes a Crédito (Movimento financeiro)";
				String numPVcreditado = linha.substring(03, 12);
				String numResumoCredito = linha.substring(12, 21);
				String numDoc = linha.substring(21, 32);
				String dataEmissao = this.retornaData(linha.substring(32, 40));
				String dataCredito = this.retornaData(linha.substring(40, 48));
				String valorCredito = linha.substring(48, 63);
				String credito = linha.substring(63, 64);
				String banco = linha.substring(64, 67);
				String agencia = linha.substring(67, 73);
				String contaCorrente = linha.substring(73, 84);
				String motivoCredito1 = linha.substring(84, 86);
				String motivoCredito2 = linha.substring(87, 114);
				String bandeira = linha.substring(114, tamanho);
					
				AjustesaCredito ajustesaCredito = new AjustesaCredito();
				ajustesaCredito.setTipoRegistro(tipo);
				ajustesaCredito.setNumPVcreditado(numPVcreditado);
				ajustesaCredito.setNumResumoCredito(numResumoCredito);
				ajustesaCredito.setNumDocumento(numDoc);
				ajustesaCredito.setDataEmissao(dataEmissao);
				ajustesaCredito.setDataCredito(dataCredito);
				ajustesaCredito.setValorCredito(valorCredito);
				ajustesaCredito.setcCredito(credito);
				ajustesaCredito.setBanco(banco);
				ajustesaCredito.setAgencia(agencia);
				ajustesaCredito.setContaCorrente(contaCorrente);
				ajustesaCredito.setMotivoCredito1(motivoCredito1);
				ajustesaCredito.setMotivoCredito2(motivoCredito2);
				ajustesaCredito.setBandeira(bandeira);
				
				System.out.println(ajustesaCredito.toString());
				System.out.println("");
			}
			if (linha.substring(0, 3).equals("044")) {
				String tipo = "Débitos Pendentes";
				String numPV = linha.substring(03, 12);
				String numOrdemDebito = linha.substring(12, 23);
				String dataOD = this.retornaData(linha.substring(23, 31));
				String valorOD = linha.substring(31, 46);
				String motivoAjuste1 = linha.substring(46, 48);
				String motivoAjuste2 = linha.substring(48, 76);
				String numCartao = linha.substring(76, 92);
				String numNSU = linha.substring(92, 104);
				String dataCVoriginalTransacao = this.retornaData(linha.substring(104, 112));
				String numAutorizacao = linha.substring(112, 118);
				String valorTransacaoOriginal = linha.substring(118, 133);
				String numRVoriginal = linha.substring(133, 142);
				String dataRVoriginal = this.retornaData(linha.substring(142, 150));
				String numPVoriginal = linha.substring(150, 159);
				String numRefCarta = linha.substring(159, 174);
				String dataCarta = this.retornaData(linha.substring(174, 182));
				String numProcessoChargeback = linha.substring(182, 197);
				String mesRef = linha.substring(197, 203);
				String valorCompensado = linha.substring(203, 218);
				String dataPagamento = this.retornaData(linha.substring(218, 226));
				//String valorPendenteDebito = linha.substring(226, 241);
				//String numProcessosRetencao = linha.substring(241, 256);
				//String meioCompensacao1 = linha.substring(256, 258);
				//String meioCompensacao2 = linha.substring(528, tamanho);
				
				DebitosPendentes debitosPendentes = new DebitosPendentes();
				debitosPendentes.setTipoRegistro(tipo);
				debitosPendentes.setNumPV(numPV);
				debitosPendentes.setNumOrdemDeb(numOrdemDebito);
				debitosPendentes.setDataOD(dataOD);
				debitosPendentes.setValorOD(valorOD);
				debitosPendentes.setMotivoAjuste1(motivoAjuste1);
				debitosPendentes.setMotivoAjuste2(motivoAjuste2);
				debitosPendentes.setNumCartao(numCartao);
				debitosPendentes.setNumNSU(numNSU);
				debitosPendentes.setDataCVoriginal(dataCVoriginalTransacao);
				debitosPendentes.setNumAutorizacao(numAutorizacao);
				debitosPendentes.setValorTransacaoOriginal(valorTransacaoOriginal);
				debitosPendentes.setNumRVoriginal(numRVoriginal);
				debitosPendentes.setDataRVoriginal(dataRVoriginal);
				debitosPendentes.setNumPVoriginal(numPVoriginal);
				debitosPendentes.setNumRefCarta(numRefCarta);
				debitosPendentes.setDataCarta(dataCarta);
				debitosPendentes.setNumProcessoChargeback(numProcessoChargeback);
				debitosPendentes.setMesRef(mesRef);
				debitosPendentes.setValorCompensado(valorCompensado);
				debitosPendentes.setDataPagamento(dataPagamento);
				//debitosPendentes.setValorPendenteDeb(valorPendenteDebito);
				//debitosPendentes.setNumProcessoRetencao(numProcessosRetencao);
				//debitosPendentes.setMeioCompensacao1(meioCompensacao1);
				//debitosPendentes.setMeioCompensacao2(meioCompensacao2);
				
				System.out.println(debitosPendentes.toString());
				System.out.println("");
			}
			if (linha.substring(0, 3).equals("045")) {
				String tipo = "Débitos Liquidados";
				String numPV = linha.substring(03, 12);
				String numOrdemDebito = linha.substring(12, 23);
				String dataOD = this.retornaData(linha.substring(23, 31));
				String valorOD = linha.substring(31, 46);
				String motivoAjuste1 = linha.substring(46, 48);
				String motivoAjuste2 = linha.substring(48, 76);
				String numCartao = linha.substring(76, 92);
				String numNSU = linha.substring(92, 104);
				String dataCVoriginalTransacao = this.retornaData(linha.substring(104, 112));
				String numAutorizacao = linha.substring(112, 118);
				String valorTransacaoOriginal = linha.substring(118, 133);
				String numRVoriginal = linha.substring(133, 142);
				String dataRVoriginal = this.retornaData(linha.substring(142, 150));
				String numPVoriginal = linha.substring(150, 159);
				String numRefCarta = linha.substring(159, 174);
				String dataCarta = this.retornaData(linha.substring(174, 182));
				String numProcessoChargeback = linha.substring(182, 197);
				String mesRef = linha.substring(197, 203);
				String valorLiquidado = linha.substring(203, 218);
				String dataLiquidacao = this.retornaData(linha.substring(218, 226));
				String numProcessoRetencao = linha.substring(226, 241);
				String meioCompensacao1 = linha.substring(241, 243);
				String meioCompensacao2 = linha.substring(243, tamanho);				
				
				DebitosLiquidados debitosLiquidados = new DebitosLiquidados();
				debitosLiquidados.setTipoRegistro(tipo);
				debitosLiquidados.setNumPV(numPV);
				debitosLiquidados.setNumOrdemDeb(numOrdemDebito);
				debitosLiquidados.setDataod(dataOD);
				debitosLiquidados.setValorod(valorOD);
				debitosLiquidados.setMotivoAjuste1(motivoAjuste1);
				debitosLiquidados.setMotivoAjuste2(motivoAjuste2);
				debitosLiquidados.setNumCartao(numCartao);
				debitosLiquidados.setNumNSU(numNSU);
				debitosLiquidados.setDatacvOriginal(dataCVoriginalTransacao);
				debitosLiquidados.setNumAutorizacao(numAutorizacao);
				debitosLiquidados.setValorTransacaoOrig(valorTransacaoOriginal);
				debitosLiquidados.setNumRVOrig(numRVoriginal);
				debitosLiquidados.setDataRVorig(dataRVoriginal);
				debitosLiquidados.setNumPVorig(numPVoriginal);
				debitosLiquidados.setNumRefCarta(numRefCarta);
				debitosLiquidados.setDataCarta(dataCarta);
				debitosLiquidados.setNumProcessoChargeback(numProcessoChargeback);
				debitosLiquidados.setMesRef(mesRef);
				debitosLiquidados.setValorLiquidacao(valorLiquidado);
				debitosLiquidados.setDataLiquidacao(dataLiquidacao);
				debitosLiquidados.setNumProcessoRetencao(numProcessoRetencao);
				debitosLiquidados.setMeioCompensacao1(meioCompensacao1);
				debitosLiquidados.setMeioCompensacao2(meioCompensacao2);
							
				System.out.println(debitosLiquidados.toString());
				System.out.println("");
			}
			if (linha.substring(0, 3).equals("049")) {
				String tipo = "Desagendamento de Parcelas";
				String numPVoriginal = linha.substring(03, 12);
				String numRVoriginal = linha.substring(12, 21);
				String numRef = linha.substring(21, 36);
				String dataCredito = this.retornaData(linha.substring(36, 44));
				String novoValorParcela = linha.substring(44, 59);
				String valorOriginalParcelaAlterada = linha.substring(59, 74);
				String valorAjuste = linha.substring(74, 89);
				String dataCancelamento = this.retornaData(linha.substring(89, 97));
				String valorRVoriginal = linha.substring(97, 112);
				String valorCancelamentoSolicitado = linha.substring(112, 127);
				String numCartao = linha.substring(127, 143);
				String dataTransacao = this.retornaData(linha.substring(143, 151));
				String nsu = linha.substring(151, 163);
				String tipoDebito = linha.substring(163, 164);
				String numParcela = linha.substring(164, 166);
				String bandeiraRVorigem = linha.substring(166, tamanho);
				
				DesagendamentoParcelas desagendamentoParcelas = new DesagendamentoParcelas();
				desagendamentoParcelas.setTipoRegistro(tipo);
				desagendamentoParcelas.setNumPVorig(numPVoriginal);
				desagendamentoParcelas.setNumRVorig(numRVoriginal);
				desagendamentoParcelas.setNumRef(numRef);
				desagendamentoParcelas.setDataCredito(dataCredito);
				desagendamentoParcelas.setNovoValorParcela(novoValorParcela);
				desagendamentoParcelas.setValorOriginalParcelaAlterada(valorOriginalParcelaAlterada);
				desagendamentoParcelas.setValorAjuste(valorAjuste);
				desagendamentoParcelas.setDataCancelamento(dataCancelamento);
				desagendamentoParcelas.setValorRVoriginal(valorRVoriginal);
				desagendamentoParcelas.setValorCancelamento(valorCancelamentoSolicitado);
				desagendamentoParcelas.setNumCartao(numCartao);
				desagendamentoParcelas.setDataTransacao(dataTransacao);
				desagendamentoParcelas.setNSU(nsu);
				desagendamentoParcelas.setTipoDeb(tipoDebito);
				desagendamentoParcelas.setNumParcela(numParcela);
				desagendamentoParcelas.setBandeiraRVorigem(bandeiraRVorigem);		
				
				System.out.println(desagendamentoParcelas.toString());
				System.out.println("");
			}
			if (linha.substring(0, 3).equals("050")) {
				String tipo = "Totalizador – Matriz";
				String numPVmatriz = linha.substring(03, 12);
				String qtdResumosMatriz = linha.substring(12, 18);
				String valorTotalCreditosNormais = linha.substring(18, 33);
				String qtdCreditosAntecipados = linha.substring(33, 39);
				String valorTotalAntecipado = linha.substring(39, 54);
				String qtdAjustesaCredito = linha.substring(54, 58);
				String valorTotalAjustesaCredito = linha.substring(58, 73);
				String qtdAjustesaDebito = linha.substring(73, 79);
				String valorTotalAjustesaDebito = linha.substring(79, tamanho);
				
				Totalizador totalizador = new Totalizador();
				totalizador.setTipoRegistro(tipo);
				totalizador.setNumPVmatriz(numPVmatriz);
				totalizador.setQuantidadeTotalResumosMatriz(qtdResumosMatriz);
				totalizador.setValorTotalCreditos(valorTotalCreditosNormais);
				totalizador.setQuantidadeCreditosAntecipados(qtdCreditosAntecipados);
				totalizador.setValorTotalAntecipado(valorTotalAntecipado);
				totalizador.setQuantidadeAjustesCredito(qtdAjustesaCredito);
				totalizador.setValorTotalAjustesCredito(valorTotalAjustesaCredito);
				totalizador.setQuantidadeAjustesDebito(qtdAjustesaDebito);
				totalizador.setValorTotalAjustesDebito(valorTotalAjustesaDebito);
				
				System.out.println(totalizador.toString());
				System.out.println("");
			}
			if (linha.substring(0, 3).equals("052")) {
				String tipo = "Trailler do arquivo";
				String qtdMatrizesArquivo = linha.substring(03, 07);
				String qtdRegistrosArquivo = linha.substring(07, 13);
				String numPVgrupo = linha.substring(13, 22);
				String qtdTotalResumosGrupo = linha.substring(22, 26);
				String valorTotalCreditosNormais = linha.substring(26, 41);
				String qtdCreditosAntecipados = linha.substring(41, 47);
				String valorTotalAntecipado = linha.substring(47, 62);
				String qtdAjustesaCredito = linha.substring(62, 66);
				String valorTotalAjustesaCredito = linha.substring(66, 81);
				String qtdAjustesaDebito = linha.substring(81, 85);
				String valorTotalAjustesaDebito = linha.substring(85, tamanho);
				
				TraillerArquivo traillerArquivo = new TraillerArquivo();
				traillerArquivo.setTipoRegistro(tipo);
				traillerArquivo.setQuantidadeMatrizesArquivo(qtdMatrizesArquivo);
				traillerArquivo.setQuantidadeRegistrosArquivo(qtdRegistrosArquivo);
				traillerArquivo.setNumPVgrupo(numPVgrupo);
				traillerArquivo.setQuantidadeTotalResumosGrupo(qtdTotalResumosGrupo);
				traillerArquivo.setValorTotalCreditosNormais(valorTotalCreditosNormais);
				traillerArquivo.setQuantidadeCreditosAntecipados(qtdCreditosAntecipados);
				traillerArquivo.setValorTotalAntecipado(valorTotalAntecipado);
				traillerArquivo.setQuantidadeAjustesCredito(qtdAjustesaCredito);
				traillerArquivo.setValorTotalAjustesCredito(valorTotalAjustesaCredito);
				traillerArquivo.setQuantidadeAjustesDebito(qtdAjustesaDebito);
				traillerArquivo.setValorTotalAjustesDebito(valorTotalAjustesaDebito);
				
				System.out.println(traillerArquivo.toString());
				System.out.println("");
			}
		}

		leitorArquivo.close();
		bufferLeitor.close();

	}

	public String retornaData(String data) {
		String dia = data.substring(0, 2);
		String mes = data.substring(2, 4);
		String ano = data.substring(4, 8);
		String mdata = dia + "/" + mes + "/" + ano;
		return mdata;
	}

}
