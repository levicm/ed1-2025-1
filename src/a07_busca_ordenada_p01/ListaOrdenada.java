package a07_busca_ordenada_p01;

public class ListaOrdenada {

	Object[] elementos = new Object[20];
	private int tamanho = 0;

	public void adiciona(Comparable elemento) {
		garanteEspaco();
		if (tamanho == 0) {
			elementos[0] = elemento;
			tamanho++;
		} else {
			int posicao = tamanho;
			for (int i = 0; i < tamanho; ++i) {
				if (elemento.compareTo((Comparable) elementos[i]) <= 0) {
					posicao = i;
					break;
				}
			}
			adiciona(elemento, posicao);
		}
	}
	
	private void adiciona(Comparable aluno, int posicao) {
		garanteEspaco();
		if (posicao <= tamanho) {
			// desloca elementos posteriores à posição
			for (int i = tamanho; i > posicao; --i) {
				elementos[i] = elementos[i - 1];
			}
			elementos[posicao] = aluno;
			tamanho++;
		}
	}
	
	private void garanteEspaco() {
		// Testar se precisa aumentar o espaço
		if (tamanho == elementos.length) {
			// Aumentar o espaço (dobrar o tamanho do array)
			int novoTamnho = elementos.length * 2;
			System.out.println("Aumentando o tamanho do array para " + novoTamnho);
			Object[] novoArray = new Object[novoTamnho];
			for (int i = 0; i < elementos.length; ++i) {
				novoArray[i] = elementos[i];
			}
			this.elementos = novoArray;
		}
	}

	public int tamanho() {
		return this.tamanho;
	}
	
	public Object pega(int posicao) {
		// Testa se a posição é válida
		if (posicao < elementos.length) {
			return elementos[posicao];
		}
		return null;
	}
	
	public void remove(int posicao) {
		if (posicao < tamanho) {
			for (int i = posicao; i < tamanho; ++i) {
				elementos[i] = elementos[i + 1];
			}
		}
	}

	public int busca(Comparable elemento) {
		int resultado = -1;
		if (elemento != null) {
			for (int i = 0; i < tamanho; ++i) {
				System.out.println("Buscanco na posição " + i + " de " + tamanho);
				if (elemento.compareTo(this.elementos[i]) == 0) {
					resultado = i;
					break;
				} else if  (elemento.compareTo(elementos[i]) < 0) {
					break;
				}
			}
		}
		return resultado;
	}

	@Override
	public String toString() {
		String result = "[";
		// Componho a string com o conteúdo desejado
		for (int i = 0; i < elementos.length; ++i) {
			if (elementos[i] != null) {
				if (i > 0) {
					result += ", ";
				}
				result += elementos[i].toString();
			} else {
				break;
			}
		}
		result += "]";
		return result;
	}

}
