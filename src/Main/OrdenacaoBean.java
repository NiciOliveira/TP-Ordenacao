package Main;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import Ordenacao.BubbleSort;
import Ordenacao.InsertionSort;
import Ordenacao.QuickSort;
import Ordenacao.SelectionSort;
import Ordenacao.ShellSort;

public class OrdenacaoBean {
	/**
	 * Metodo estático responsável pela criação de vetores ordenados.
	 * 
	 * @param tamanhoVetor
	 * @return vetOrdenado
	 */
	public static int[] criarVetorOrdenado(int tamanhoVetor) {
		int[] vetOrdenado = new int[tamanhoVetor];

		for (int i = 0; i < tamanhoVetor; i++) {
			vetOrdenado[i] = i + 1;
		}
		return vetOrdenado;
	}

	/**
	 * Metodo estático responsavel pela criação de vetores inversamente ordenados.
	 * 
	 * @param tamanhoVetor, parâmetro do tamanho do vetor
	 * @return vetInverso, retorna o vetor inverso.
	 */

	public static int[] criarVetorInverso(int tamanhoVetor) {
		int[] vetInverso = new int[tamanhoVetor];

		for (int i = tamanhoVetor; i > 0; i--) {
			vetInverso[tamanhoVetor - i] = i;
		}
		return vetInverso;
	}

	/**
	 * Metodo estático responsavel pela criação de vetores quase ordenados.
	 * 
	 * @param tamanhoVetor, parâmetro do tamanho do vetor.
	 * @return vetSemiOrdenado, retorna o vetor quase ordenado.
	 */

	public static int[] criarVetorSemiOrdenado(int tamanhoVetor) {
		// Encontra a metade do tamanho
		int metade = tamanhoVetor / 2;
		// Cria um vetor que será ordenado, com metade do tamanho total
		Integer[] vetOrdenado = new Integer[metade];
		// Econtra o tamanho do restante do vator, que será aleatório
		int tamVetAleatorio = tamanhoVetor - metade;
		// Cria um vetor que será aleatório, com o restante do tamanho do vetor
		Integer[] vetAleatorio = new Integer[tamVetAleatorio];

		// Cria os valores do vetor ordenado, usando o indice do loop como base
		for (int i = 0; i < metade; i++) {
			vetOrdenado[i] = i + 1;
		}
		// Cria os valores do vetor aleatório, que, por enquanto, ainda é ordenado
		for (int i = 0; i < tamVetAleatorio; i++) {
			int valorBase = metade + 1;
			vetAleatorio[i] = i + valorBase;
		}
		// Embaralha os itens do vetor aleatório
		List<Integer> listaAleatoria = Arrays.asList(vetAleatorio);
		Collections.shuffle(listaAleatoria);

		int[] vetSemiOrdenado = new int[tamanhoVetor];

		for (int i = 0; i < tamanhoVetor; i++) {
			if (i >= metade) {
				int indiceVetAleatorio = i - metade;
				vetSemiOrdenado[i] = vetAleatorio[indiceVetAleatorio];
			} else {
				vetSemiOrdenado[i] = vetOrdenado[i];
			}
		}
		return vetSemiOrdenado;
	}

	/**
	 * Metodo estático responsavel pela criação de vetores de itens aleatorios.
	 * 
	 * @param tamanhoVetor, parâmetro do tamanho do vetor.
	 * @return vetAleatorio, retorna o vetor.
	 */

	public static int[] criarVetorAleatorio(int tamanhoVetor) {
		Integer[] vetAleatorio = new Integer[tamanhoVetor];

		for (int i = 0; i < tamanhoVetor; i++) {
			vetAleatorio[i] = i + 1;
		}

		List<Integer> listaVetor = Arrays.asList(vetAleatorio);
		Collections.shuffle(listaVetor);

		int[] vetAleatorioInt = new int[tamanhoVetor];

		for (int i = 0; i < tamanhoVetor; i++) {
			vetAleatorioInt[i] = vetAleatorio[i];
		}
		return vetAleatorioInt;
	}

	public static int definirTamanhoVetor() {
		String escolheTamanhoVetor;
		Scanner lerTamanhoVetor = new Scanner(System.in);
		do {
			System.out.println(
					" 1 - 10 \n 2 - 100 \n 3 - 1000 \n 4 - 10000 \n 5 - 100000 \n 6 - 1000000 \n Escolha um tamanho para o vetor: ");
			escolheTamanhoVetor = lerTamanhoVetor.next();
			switch (escolheTamanhoVetor) {
			case "1":
				return 10;
			case "2":
				return 100;
			case "3":
				return 1000;
			case "4":
				return 10000;
			case "5":
				return 100000;
			case "6":
				return 1000000;
			default:
				break;
			}
		} while (true);
	}

	public static int[] criarVetor(int tamanhoVetor) {
		String escolheTamanhoVetor;
		Scanner lerTamanhoVetor = new Scanner(System.in);
		do {
			System.out.println(
					" 1 - Ordenado \n 2 - Invensamente Ordenado \n 3 - Semi Ordenado \n 4 - Aleatorio \n Escolha o tipo de vetor: ");
			escolheTamanhoVetor = lerTamanhoVetor.next();
			switch (escolheTamanhoVetor) {
			case "1":
				return criarVetorOrdenado(tamanhoVetor);
			case "2":
				return criarVetorInverso(tamanhoVetor);
			case "3":
				return criarVetorSemiOrdenado(tamanhoVetor);
			case "4":
				return criarVetorAleatorio(tamanhoVetor);
			default:
				break;
			}
		} while (true);
	}

	public static void main(String[] args) {
		int[] nomeAleatorio = criarVetorOrdenado(1000);
		String escolhaMenu;
		Scanner lerEscolhaMenu = new Scanner(System.in);

		do {
			System.out.println("\n****TRABALHO PRATICO 2 - MÉTODOS DE ORDENAÇÃO****");
			System.out.println("\nIntegrantes: \n Itaici Oliveira \n Maria Izabel Vieira \n Rafael Souza Rosa \n");
			int[] vetor = criarVetor(definirTamanhoVetor());
			System.out.println("\n\n ****MENU ORDENAÇÃO****");
			System.out.println(
					" 1 - BubbleSort \n 2 - InsertionSort \n 3 - QuickSort \n 4 - SelectionSort \n 5 - ShellSort \n Escolha um algoritmo de ordenação: ");
			escolhaMenu = lerEscolhaMenu.next();

			int tamanhoVetor;
			try {
				switch (escolhaMenu) {
				case "1":
					System.out.println(BubbleSort.ordenar(vetor).toString());
					break;

				case "2":
					System.out.println(InsertionSort.ordena(vetor).toString());
					break;

				case "3":
					System.out.println(QuickSort.iniciarOrdenacao(vetor).toString());
					break;

				case "4":
					System.out.println(SelectionSort.ordena(vetor).toString());
					break;

				case "5":
					System.out.println(ShellSort.ordena(vetor).toString());
					break;
				}
			} catch (StackOverflowError erro) {
				System.out.println("Tamanho e/ou tipo de vetor não suportado para esse tipo de ordenação. DEU RUIM!!!");
			}

		} while (escolhaMenu != null && !escolhaMenu.equals("0"));

		lerEscolhaMenu.close();
	}
}
