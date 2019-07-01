package Ordenacao;

import java.util.Arrays;

public class InsertionSort {

	public static RelatorioExecucao ordena(int[] vetor) {

		RelatorioExecucao relatorioExecucao = new RelatorioExecucao();
		relatorioExecucao.iniciarExecucao();

		int j;
		int key;
		int i;

		relatorioExecucao.adicionarAtribuicao();
		relatorioExecucao.adicionarComparacao();
		for (j = 1; j < vetor.length; j++) {
			key = vetor[j];
			relatorioExecucao.adicionarAtribuicao();

			relatorioExecucao.adicionarAtribuicaoRepeticao();
			relatorioExecucao.adicionarComparacaoRepeticao();
			for (i = j - 1; (i >= 0) && (vetor[i] > key); i--) {
				vetor[i + 1] = vetor[i];
				relatorioExecucao.adicionarAtribuicao();
				
				relatorioExecucao.adicionarAtribuicaoRepeticao();
				relatorioExecucao.adicionarComparacaoRepeticao();
			}

			vetor[i + 1] = key;
			relatorioExecucao.adicionarAtribuicao();

			relatorioExecucao.adicionarAtribuicaoRepeticao();
			relatorioExecucao.adicionarComparacaoRepeticao();
		}
		relatorioExecucao.finalizarExecucao();
		System.out.println(Arrays.toString(vetor));
		return relatorioExecucao;
	}
}
