package a08_lista_ligada_p01;

public class TesteBusca {

	public static void main(String[] args) {
		ListaLigada lista = new ListaLigada();
		System.out.println(lista);

		lista.adiciona(new Aluno("Pedro", "pedro@gmail.com", 8.5));
		lista.adiciona(new Aluno("Maria", "maria@gmail.com", 7.1));
		lista.adiciona(new Aluno("Joana", "joana@gmail.com", 7.5));
		lista.adiciona(new Aluno("Maria", "maria@gmail.com", 9.0));
		lista.adiciona(new Aluno("Carlos", "carlos@gmail.com", 6.0));
		lista.adiciona(new Aluno("Maria", "maria@gmail.com", 4.0));
		System.out.println(lista);

		System.out.println(lista.busca(new Aluno("Maria", "maria@gmail.com", 7.1)));
		System.out.println(lista.busca(new Aluno("Maria", "maria@gmail.com", 3.0)));
		System.out.println(lista.busca(new Aluno("Maria", "maria@gmail.com", 7.0)));

		System.out.println(lista.busca(new Aluno("Maria", "maria@gmail.com", 9.5)));
	}

}
