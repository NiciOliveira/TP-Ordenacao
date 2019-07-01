package Ordenacao;

import java.util.Arrays;

public class QuickSort {

	public static RelatorioExecucao iniciarOrdenacao(int[] vetor) {
		RelatorioExecucao relatorioExecucao = new RelatorioExecucao();
		relatorioExecucao.iniciarExecucao();

		ordena(vetor, 0, vetor.length - 1, relatorioExecucao);

		relatorioExecucao.finalizarExecucao();
		System.out.println(Arrays.toString(vetor));

		return relatorioExecucao;
	}

	private static void ordena(int[] vetor, int inicio, int fim, RelatorioExecucao relatorioExecucao) {

		relatorioExecucao.adicionarComparacao();
		if (inicio < fim) {
			relatorioExecucao.adicionarAtribuicao();
			int posicaoPivo = separar(vetor, inicio, fim, relatorioExecucao);
			ordena(vetor, inicio, posicaoPivo - 1, relatorioExecucao);
			ordena(vetor, posicaoPivo + 1, fim, relatorioExecucao);
		}
	}

	private static int separar(int[] vetor, int inicio, int fim, RelatorioExecucao relatorioExecucao) {
		relatorioExecucao.adicionarAtribuicao();
		int pivo = vetor[inicio];
		relatorioExecucao.adicionarAtribuicao();
		int i = inicio + 1, f = fim;

		relatorioExecucao.adicionarComparacaoRepeticao();
		while (i <= f) {
			relatorioExecucao.adicionarComparacao();
			if (vetor[i] <= pivo) {
				relatorioExecucao.adicionarAtribuicao();
				i++;
			} else if (pivo < vetor[f]) {
				relatorioExecucao.adicionarComparacao();

				relatorioExecucao.adicionarAtribuicao();
				f--;
			} else {
				relatorioExecucao.adicionarComparacao();
				relatorioExecucao.adicionarComparacao();

				relatorioExecucao.adicionarAtribuicao();
				int troca = vetor[i];
				relatorioExecucao.adicionarAtribuicao();
				vetor[i] = vetor[f];
				relatorioExecucao.adicionarAtribuicao();
				vetor[f] = troca;
				relatorioExecucao.adicionarAtribuicao();
				i++;
				relatorioExecucao.adicionarAtribuicao();
				f--;
			}
			relatorioExecucao.adicionarComparacaoRepeticao();
		}
		relatorioExecucao.adicionarAtribuicao();
		vetor[inicio] = vetor[f];
		relatorioExecucao.adicionarAtribuicao();
		vetor[f] = pivo;

		return f;
	}
}