package a09_lista_dupla_ligada_p01;

public class TesteAdicionaNaPosicao {

	public static void main(String[] args) {
		ListaDuplamenteLigada lista = new ListaDuplamenteLigada();
		
		lista.adiciona(new Aluno("Pedro", "pedro@gmail.com"));
		lista.adiciona(new Aluno("Maria", "maria@gmail.com"));
		lista.adiciona(new Aluno("Joana", "joana@gmail.com"));
		
		System.out.println(lista);

		lista.adiciona(new Aluno("Cacilda", "cacilda@gmail.com"), 3);
		System.out.println(lista.tamanho() == 4);
		System.out.println(((Aluno) lista.pega(3)).getNome().equals("Cacilda"));
		System.out.println(lista);
		
		lista.adiciona(new Aluno("Joao", "joao@gmail.com"), 1);
		System.out.println(lista.tamanho() == 5);
		System.out.println(((Aluno) lista.pega(1)).getNome().equals("Joao"));
		System.out.println(((Aluno) lista.pega(2)).getNome().equals("Maria"));
		System.out.println(lista);
	}

}
