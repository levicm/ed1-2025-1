package a02_lista_p06_remove;

public class TesteRemove {

	public static void main(String[] args) {
		Lista lista = new Lista();
		System.out.println(lista);
		
		lista.adiciona(new Aluno("Pedro", "pedro@gmail.com"));
		lista.adiciona(new Aluno("Maria", "maria@gmail.com"));
		lista.adiciona(new Aluno("Joana", "joana@gmail.com"));
		lista.adiciona(new Aluno("Cacilda", "cacilda@gmail.com"));
		System.out.println(lista);

		System.out.println(lista.tamanho() == 4);
		lista.remove(0);
		System.out.println(lista);
		
		System.out.println(lista.tamanho() == 3);
		System.out.println(lista.pega(0).getNome().equals("Maria"));

		lista.remove(2); // último
		System.out.println(lista.tamanho() == 2);
		System.out.println(lista);
	}

}
