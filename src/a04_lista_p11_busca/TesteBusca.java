package a04_lista_p11_busca;

public class TesteBusca {

	public static void main(String[] args) {
		teste(new ListaArranjo());
	}

	private static void teste(Lista lista) {
		System.out.println("Testando lista...");
		lista.adiciona(new Aluno("Pedro", "pedro@gmail.com"));
		lista.adiciona(new Aluno("Maria", "maria@gmail.com"));
		lista.adiciona(new Aluno("Joana", "joana@gmail.com"));
		lista.adiciona(new Aluno("Maria", "maria@gmail.com"));
		lista.adiciona(new Aluno("Carlos", "carlos@gmail.com"));
		lista.adiciona(new Aluno("Maria", "maria@gmail.com"));
		
		System.out.println(lista);
		int posicao = lista.busca(new Aluno("Pedro", "pedro@gmail.com"));
		System.out.println(posicao == 0);

		posicao = lista.busca(new Aluno("Maria", "maria@gmail.com"));
		System.out.println(posicao == 1);

		posicao = lista.busca(new Aluno("Joao", "joao@gmail.com"));
		System.out.println(posicao == -1);
	}

}
