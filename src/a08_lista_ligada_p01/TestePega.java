package a08_lista_ligada_p01;

public class TestePega {

	public static void main(String[] args) {
		ListaLigada lista = new ListaLigada();
		System.out.println(lista.tamanho() == 0);
		
		System.out.println(lista.pega(1) == null);

		lista.adiciona(new Aluno("Pedro", "pedro@gmail.com"));
		System.out.println(lista.pega(0) != null);
		System.out.println(lista.pega(0) != null && ((Aluno) lista.pega(0)).getNome().equals("Pedro"));

		System.out.println(lista.pega(1) == null);

		lista.adiciona(new Aluno("Maria", "maria@gmail.com"));
		lista.adiciona(new Aluno("Joana", "joana@gmail.com"));
		lista.adiciona(new Aluno("Cacilda", "cacilda@gmail.com"));
		
		System.out.println(lista.pega(3) != null);
		System.out.println(lista.pega(4) == null);
		System.out.println(lista.pega(2) != null && ((Aluno) lista.pega(2)).getNome().equals("Joana"));
	}

}
