package Ordenacao;

public class RelatorioExecucao {

	private long numComparacao = 0;
	private long numAtribuicao = 0;
	private long numComparacaoRepeticao = 0;
	private long numAtribuicaoRepeticao = 0;
	private long inicioExecucao;
	private long tempoExecucao;

	public RelatorioExecucao() {

	}

	public long getNumComparacaoRepeticao() {
		return numComparacaoRepeticao;
	}

	public long getNumAtribuicaoRepeticao() {
		return numAtribuicaoRepeticao;
	}

	public long getNumComparacao() {
		return numComparacao;
	}

	public long getNumAtribuicao() {
		return numAtribuicao;
	}

	public long getTempoExecucao() {
		return tempoExecucao;
	}

	public void adicionarAtribuicao() {
		this.numAtribuicao++;
	}

	public void adicionarComparacao() {
		this.numComparacao++;
	}
	
	public void adicionarComparacaoRepeticao() {
		this.numComparacaoRepeticao++;
	}
	
	public void adicionarAtribuicaoRepeticao() {
		this.numAtribuicaoRepeticao++;
	}

	public void iniciarExecucao() {
		this.inicioExecucao = System.currentTimeMillis();
	}

	public void finalizarExecucao() {
		this.tempoExecucao = System.currentTimeMillis() - inicioExecucao;
	}
	
	@Override
	public String toString() {
		String string = ("<<<<<<<RELATORIO DE EXECU��O>>>>>>>");
		string = string.concat("\nN�mero de atribui��es: " + (numAtribuicao + numAtribuicaoRepeticao));
		string = string.concat("\nN�mero de compara��es: " + (numComparacao + numComparacaoRepeticao));
		string = string.concat("\nTempo de execu��o: " + tempoExecucao + " ms");
		return string;
	}
}
