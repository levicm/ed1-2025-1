package a08_lista_ligada_p01;

public class TesteAdicionaNoComeco {

	public static void main(String[] args) {
		ListaLigada lista = new ListaLigada();
		System.out.println(lista);

		lista.adicionaNoComeco(new Aluno("Pedro", "pedro@gmail.com", 8.5));
		lista.adicionaNoComeco(new Aluno("Maria", "maria@gmail.com", 7.1));
		lista.adicionaNoComeco(new Aluno("Joana", "joana@gmail.com", 7.5));
		System.out.println(lista);

		lista.adicionaNoComeco(new Aluno("Maria", "maria@gmail.com", 9.0));
		lista.adicionaNoComeco(new Aluno("Carlos", "carlos@gmail.com", 6.0));
		lista.adicionaNoComeco(new Aluno("Maria", "maria@gmail.com", 4.0));
		
		System.out.println(lista);
	}

}
