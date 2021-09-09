package pi.senac;

import java.util.Iterator;

public class MaiorMenorDiferencaArray {

	private final int array[];

	public MaiorMenorDiferencaArray(int[] array) {
		this.array = array;
	}
	public int maiorValor() {
		 int maior = 0;
		for (int i = 0; i < array.length; i++) {
			int item = array[i];
			int proximo = 0;
			if (i < array.length - 1) {
				proximo = array[i + 1];
			}else {
				return maior;
			}
			int diferenca = proximo - item;
			if(i==0) {
				maior = diferenca;
			}else {
				if (diferenca > maior) {
					maior = diferenca;
				}
			}
		}

		return maior;
	}

	public int menorValor() {

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
}
