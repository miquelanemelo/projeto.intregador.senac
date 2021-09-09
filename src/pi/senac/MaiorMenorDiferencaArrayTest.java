package pi.senac;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;

public class MaiorMenorDiferencaArrayTest {

	@Test
	public void deveRetornarMenorValor0() {
		int array[] = { 0, 0, 0 };
		MaiorMenorDiferencaArray diferenca = new MaiorMenorDiferencaArray(array);
		assertEquals(0, diferenca.menorValor());
	}

	@Test
	public void deveRetornarMenorValor2() {
		int array[] = { 1, 3, 5, 9 };
		MaiorMenorDiferencaArray diferenca = new MaiorMenorDiferencaArray(array);
		assertEquals(2, diferenca.menorValor());
	}

	@Test
	public void deveRetornarMenorValor4() {
		int array[] = { 3, 7, 13, 17 };
		MaiorMenorDiferencaArray diferenca = new MaiorMenorDiferencaArray(array);
		assertEquals(4, diferenca.menorValor());
	}

	@Test
	public void deveRetornarMenorValorArreyDecrescete() {
		int array[] = { 15, 12, 6, 2 };
		MaiorMenorDiferencaArray diferenca = new MaiorMenorDiferencaArray(array);
		assertEquals(-6, diferenca.menorValor());
	}

	@Test
	public void deveRetornarMaiorValor4() {
		int array[] = { 1, 3, 5, 9 };

		MaiorMenorDiferencaArray diferenca = new MaiorMenorDiferencaArray(array);
		assertEquals(4, diferenca.maiorValor());
	}
	
	
	
	@Test
	public void deveVerificarSeArrayEhOrdenado() {
			assertEquals(true, ehOrdenado(new int[] {1,2,3,4}));
	}
	
	@Test
	public void deveVerificarSeArrayNaoEhOrdenado() {
			assertEquals(false, ehOrdenado(new int[] {5,3,24,4}));
	}


	public static boolean ehOrdenado(int[] a) {
		int[] b = Arrays.copyOf(a, a.length);
		Arrays.sort(a);
		return Arrays.equals(b, a);
	}

}
