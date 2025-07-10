package a05_lista_revisao;

public class ListaArranjo<T> implements Lista<T> {

	private Object[] elementos = new Object[20];
	private int quantidade = 0;

	public void adiciona(T elemento) {
		garanteEspaco();
		this.elementos[quantidade] = elemento;
		this.quantidade++;
	}
	
	public void adiciona(T aluno, int posicao) {
		garanteEspaco();
		int tamanho = tamanho();
		if (posicao <= tamanho) {
			// desloca elementos posteriores à posição
			for (int i = tamanho; i > posicao; --i) {
				elementos[i] = elementos[i - 1];
			}
			elementos[posicao] = aluno;
		}
	}
	
	private void garanteEspaco() {
		// Testar se precisa aumentar o espaço
		if (tamanho() == elementos.length) {
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
		for (int i = 0; i < this.elementos.length; ++i) {
			if (this.elementos[i] == null) {
				return i;
			}
		}
		return this.elementos.length;
	}
	
	public T pega(int posicao) {
		// Testa se a posição é válida
		if (posicao < elementos.length) {
			return (T) elementos[posicao];
		}
		return null;
	}
	
	public void remove(int posicao) {
		int tamanho = tamanho();
		if (posicao < tamanho) {
			for (int i = posicao; i < tamanho; ++i) {
				elementos[i] = elementos[i + 1];
			}
		}
	}

	@Override
	public int busca(T elemento) {
		int tamanho = tamanho();
		if (elemento != null) {
			for (int i = 0; i < tamanho; ++i) {
				if (elemento.equals(this.elementos[i])) {
					return i;
				}
			}
		}
		return -1;
//		int resultado = -1;
//		int tamanho = tamanho();
//		for (int i = 0; i < tamanho; ++i) {
//			if (this.elementos[i] == elemento) {
//				resultado = i;
//				break;
//			}
//		}
//		return resultado;
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
