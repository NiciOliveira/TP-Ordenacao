package Ordenacao;

import java.util.Arrays;

public class SelectionSort {

	public static RelatorioExecucao ordena(int[] vetor) {

		RelatorioExecucao relatorioExecucao = new RelatorioExecucao();
		relatorioExecucao.iniciarExecucao();

		relatorioExecucao.adicionarAtribuicaoRepeticao();
		relatorioExecucao.adicionarComparacaoRepeticao();
		for (int fixo = 0; fixo < vetor.length - 1; fixo++) {
			relatorioExecucao.adicionarAtribuicao();
			int menor = fixo;

			relatorioExecucao.adicionarAtribuicaoRepeticao();
			relatorioExecucao.adicionarComparacaoRepeticao();
			for (int i = menor + 1; i < vetor.length; i++) {
				relatorioExecucao.adicionarComparacao();
				if (vetor[i] < vetor[menor]) {
					relatorioExecucao.adicionarAtribuicao();
					menor = i;
				}
				relatorioExecucao.adicionarAtribuicaoRepeticao();
				relatorioExecucao.adicionarComparacaoRepeticao();
			}
			relatorioExecucao.adicionarComparacao();
			if (menor != fixo) {
				relatorioExecucao.adicionarAtribuicao();
				int t = vetor[fixo];
				relatorioExecucao.adicionarAtribuicao();
				vetor[fixo] = vetor[menor];
				relatorioExecucao.adicionarAtribuicao();
				vetor[menor] = t;
			}

			relatorioExecucao.adicionarAtribuicaoRepeticao();
			relatorioExecucao.adicionarComparacaoRepeticao();
		}
		relatorioExecucao.finalizarExecucao();
		System.out.println(Arrays.toString(vetor));
		return relatorioExecucao;
	}
}
