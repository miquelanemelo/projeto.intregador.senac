package pi.senac;

import java.util.Arrays;
import java.util.Scanner;

public class Vetor {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Digite o tamanho do vetor: ");
		int n = s.nextInt();
		int[] array = preencherVetor(new int[n], s);
		int menor = menorValor(array);
		int maior = maiorValor(array);
		boolean ordenado = ehOrdenado(array);
		System.out.println("Menor Diferença: " + menor);
		System.out.println("Maior Diferença: " + maior);
		System.out.println("Está ordenado? " + ordenado);

	}

	public static int maiorValor(int[] array) {
		int maior = 0;
		for (int i = 0; i < array.length; i++) {
			int item = array[i];
			int proximo = 0;
			if (i < array.length - 1) {
				proximo = array[i + 1];
			} else {
				return maior;
			}
			int diferenca = proximo - item;
			if (i == 0) {
				maior = diferenca;
			} else {
				if (diferenca > maior) {
					maior = diferenca;
				}
			}
		}
		return maior;
	}

	public static int menorValor(int[] array) {
		int menor = 0;
		for (int i = 0; i < array.length; i++) {
			int item = array[i];
			int proximo = 0;
			if (i < array.length - 1) {
				proximo = array[i + 1];
			} else {
				return menor;
			}
			int diferenca = proximo - item;

			if (i == 0) {
				menor = diferenca;
			} else {
				if (diferenca < menor) {
					menor = diferenca;
				}
			}
		}
		return menor;
	}

	public static int[] preencherVetor(int[] a, Scanner s) {

		for (int i = 0; i < a.length; i++) {
			System.out.println("Digite o valor para posição " + i + " do vetor");
			a[i] = s.nextInt();
		}
		s.close();

		return a;
	}

	public static boolean ehOrdenado(int[] a) {
		int[] b = Arrays.copyOf(a, a.length);
		Arrays.sort(a);
		return Arrays.equals(b, a);
	}
}
