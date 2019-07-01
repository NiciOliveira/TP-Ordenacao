package Ordenacao;

import java.util.Arrays;

public class ShellSort {

	public static RelatorioExecucao ordena(int[] vetor) {
		RelatorioExecucao relatorioExecucao = new RelatorioExecucao();
		relatorioExecucao.iniciarExecucao();
		
		int i;
		int j;
		relatorioExecucao.adicionarAtribuicao();
		int h = 1;
		int value;
		
		do {
			relatorioExecucao.adicionarAtribuicao();
			h = 3 * h + 1;
			relatorioExecucao.adicionarComparacaoRepeticao();
		} while (h < vetor.length);
		relatorioExecucao.adicionarComparacaoRepeticao();

		do {
			relatorioExecucao.adicionarAtribuicao();
			h = h / 3;

			relatorioExecucao.adicionarAtribuicaoRepeticao();
			relatorioExecucao.adicionarComparacaoRepeticao();
			for (i = h; i < vetor.length; i++) {
				relatorioExecucao.adicionarAtribuicao();
				value = vetor[i];
				relatorioExecucao.adicionarAtribuicao();
				j = i - h;

				relatorioExecucao.adicionarComparacaoRepeticao();
				while (j >= 0 && value < vetor[j]) {
					relatorioExecucao.adicionarAtribuicao();
					vetor[j + h] = vetor[j];
					relatorioExecucao.adicionarAtribuicao();
					j = j - h;
					
					relatorioExecucao.adicionarComparacaoRepeticao();
				}
				relatorioExecucao.adicionarAtribuicao();
				vetor[j + h] = value;

				relatorioExecucao.adicionarAtribuicaoRepeticao();
				relatorioExecucao.adicionarComparacaoRepeticao();
			}
			relatorioExecucao.adicionarComparacaoRepeticao();
		} while (h > 1);
		relatorioExecucao.adicionarComparacaoRepeticao();
		
		relatorioExecucao.finalizarExecucao();
		System.out.println(Arrays.toString(vetor));
		
		return relatorioExecucao;
	}
}
