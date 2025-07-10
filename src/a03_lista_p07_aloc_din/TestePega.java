package a03_lista_p07_aloc_din;

public class TestePega {

	public static void main(String[] args) {
		Lista lista = new Lista();
		System.out.println(lista.tamanho() == 0);
		
		System.out.println(lista.pega(1) == null);

		lista.adiciona(new Aluno("Pedro", "pedro@gmail.com"));
		System.out.println(lista.pega(0) != null);
		System.out.println(lista.pega(0) != null && lista.pega(0).getNome().equals("Pedro"));

		System.out.println(lista.pega(1) == null);

		lista.adiciona(new Aluno("Maria", "maria@gmail.com"));
		lista.adiciona(new Aluno("Joana", "joana@gmail.com"));
		lista.adiciona(new Aluno("Cacilda", "cacilda@gmail.com"));
		
		System.out.println(lista.pega(3) != null);
		System.out.println(lista.pega(4) == null);
		System.out.println(lista.pega(2) != null && lista.pega(2).getNome().equals("Joana"));
	}

}
