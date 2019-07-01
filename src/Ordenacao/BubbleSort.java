package Ordenacao;

import java.util.Arrays;

public class BubbleSort {

	public static RelatorioExecucao ordenar(int[] vet) {
		RelatorioExecucao relatorioExecucao = new RelatorioExecucao();
		relatorioExecucao.iniciarExecucao();
		
		relatorioExecucao.adicionarAtribuicaoRepeticao();
		relatorioExecucao.adicionarComparacaoRepeticao();
		for (int i = 0; i < vet.length; i++ ) {
			relatorioExecucao.adicionarAtribuicaoRepeticao();
			relatorioExecucao.adicionarComparacaoRepeticao();
			for (int j = 1; j < (vet.length - 1); j++) {
				relatorioExecucao.adicionarComparacao();
				if (vet[j] > vet[j + 1]) {
					relatorioExecucao.adicionarAtribuicao();
					int aux = vet[j];
					relatorioExecucao.adicionarAtribuicao();
					vet[j] = vet[j + 1];
					relatorioExecucao.adicionarAtribuicao();
					vet[j + 1] = aux;
				}
				relatorioExecucao.adicionarAtribuicaoRepeticao();
				relatorioExecucao.adicionarComparacaoRepeticao();
			}
			relatorioExecucao.adicionarAtribuicaoRepeticao();
			relatorioExecucao.adicionarComparacaoRepeticao();
		}
		relatorioExecucao.finalizarExecucao();
		System.out.println(Arrays.toString(vet));
		
		return relatorioExecucao;
	}
}
