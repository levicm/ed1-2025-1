package a02_lista_p05_ad_pos;

public class Lista {

	Aluno[] alunos = new Aluno[100];

	public void adiciona(Aluno aluno) {
		for (int i = 0; i < this.alunos.length; ++i) {
			if (this.alunos[i] == null) {
				this.alunos[i] = aluno;
				break;
			}
		}
	}
	
	public void adiciona(Aluno aluno, int posicao) {
		int tamanho = tamanho();
		if (posicao <= tamanho) {
			// desloca elementos posteriores à posição
			for (int i = tamanho; i > posicao; --i) {
				alunos[i] = alunos[i - 1];
			}
			alunos[posicao] = aluno;
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
		if (posicao < tamanho()) {
			
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
