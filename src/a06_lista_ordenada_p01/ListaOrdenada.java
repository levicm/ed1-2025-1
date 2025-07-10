package a06_lista_ordenada_p01;

public class ListaOrdenada {

	Object[] elementos = new Object[20];

	public void adiciona(Comparable elemento) {
		garanteEspaco();
		// Encontra a posição correta para inserir o novo elemento

		// Deslocar elementos maiores que o novo elemento

		// Adiciona o novo elemento na posição correta
	}
	
	private void adiciona(Object aluno, int posicao) {
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
	
	public Object pega(int posicao) {
		// Testa se a posição é válida
		if (posicao < elementos.length) {
			return elementos[posicao];
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

	public int busca(Object elemento) {
		int tamanho = tamanho();
		if (elemento != null) {
			for (int i = 0; i < tamanho; ++i) {
				if (elemento.equals(this.elementos[i])) {
					return i;
				}
			}
		}
		return -1;
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
