package a03_lista_p09_interface;

public class TesteAlocacaoDinamica {

	public static void main(String[] args) {
		Lista lista = new ListaArranjo();
		teste(lista);
	}

	private static void teste(Lista lista) {
		System.out.println(lista.tamanho() == 0);

		for (int i = 0; i < 120; ++i) {
			lista.adiciona(new Aluno("Aluno" + i, "aluno" + i + "@gmail.com"));
		}
		System.out.println(lista.tamanho() == 120);
		System.out.println(lista.tamanho());
	}

}
