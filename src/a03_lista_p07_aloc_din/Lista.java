package a03_lista_p07_aloc_din;

public class Lista {

	Aluno[] alunos = new Aluno[20];

	public void adiciona(Aluno aluno) {
		garanteEspaco();
		for (int i = 0; i < this.alunos.length; ++i) {
			if (this.alunos[i] == null) {
				this.alunos[i] = aluno;
				break;
			}
		}
	}
	
	public void adiciona(Aluno aluno, int posicao) {
		garanteEspaco();
		int tamanho = tamanho();
		if (posicao <= tamanho) {
			// desloca elementos posteriores à posição
			for (int i = tamanho; i > posicao; --i) {
				alunos[i] = alunos[i - 1];
			}
			alunos[posicao] = aluno;
		}
	}
	
	private void garanteEspaco() {
		// Testar se precisa aumentar o espaço
		if (tamanho() == alunos.length) {
			// Aumentar o espaço (dobrar o tamanho do array)
			int novoTamnho = alunos.length * 2;
			System.out.println("Aumentando o tamanho do array para " + novoTamnho);
			Aluno[] novoArray = new Aluno[novoTamnho];
			for (int i = 0; i < alunos.length; ++i) {
				novoArray[i] = alunos[i];
			}
			this.alunos = novoArray;
		}
	}

	public int tamanho() {
		for (int i = 0; i < this.alunos.length; ++i) {
			if (this.alunos[i] == null) {
				return i;
			}
		}
		return this.alunos.length;
	}
	
	public Aluno pega(int posicao) {
		// Testa se a posição é válida
		if (posicao < alunos.length) {
			return alunos[posicao];
		}
		return null;
	}
	
	public void remove(int posicao) {
		int tamanho = tamanho();
		if (posicao < tamanho) {
			for (int i = posicao; i < tamanho; ++i) {
				alunos[i] = alunos[i + 1];
			}
		}
	}

	@Override
	public String toString() {
		String result = "[";
		// Componho a string com o conteúdo desejado
		for (int i = 0; i < alunos.length; ++i) {
			if (alunos[i] != null) {
				if (i > 0) {
					result += ", ";
				}
				result += alunos[i].toString();
			} else {
				break;
			}
		}
		result += "]";
		return result;
	}

}
